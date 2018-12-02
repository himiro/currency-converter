import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.JSONException;

class LiveRates
{
    protected static final String key = "42abe21e0e1ebd2226b215a01de11eca";
    protected static final String baseUrl = "http://apilayer.net/api/live";
    protected String fileName;
    protected CloseableHttpClient httpClient;

    LiveRates()
    {
        this.fileName = "rates.json";
    }
    
    public void getLiveRates()
    {
        HttpGet get = new HttpGet(baseUrl + "?access_key=" + key);
        this.httpClient = HttpClients.createDefault();

        try {
            CloseableHttpResponse response =  httpClient.execute(get);
            HttpEntity entity = response.getEntity();

            JSONObject exchangeRates = new JSONObject(EntityUtils.toString(entity));

            FileWriter file = new FileWriter(this.fileName);
            String tmp = exchangeRates.toString();
            file.write(tmp);
            file.flush();

            response.close();
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        catch (JSONException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.*;
import java.io.*;
import java.math.BigDecimal;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class Parser
{
  //LiveRates liveRates;
  protected List<Currency> rates = new ArrayList<Currency>();
  protected String fileName;
  protected JSONObject jsonObject;
  protected JSONArray jsonArray;

  Parser()
  {
    this.fileName = "./rates.json";
    this.jsonObject = new JSONObject();
    //liveRates = new LiveRates();
  }

  Parser(String fileName)
  {
    this.fileName = fileName;
    this.jsonObject = new JSONObject();
    //liveRates = new LiveRates();
  }

  public void setRates(List<Currency> rates)
  {
    this.rates = rates;
  }

  public List<Currency> getRates()
  {
    return this.rates;
  }

  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }

  public String getFileName()
  {
    return (this.fileName);
  }

  public void setJsonObject(JSONObject jsonObject)
  {
    this.jsonObject = jsonObject;
  }

  public JSONObject getJsonObject()
  {
    return this.jsonObject;
  }

  public void openFile() throws NoSuchFileException
  {
    File file = new File(this.fileName);

    if (!file.exists() || !file.isFile())
    {
      throw new NoSuchFileException("This file doesn't exist or it's a directory.");
    }
    this.parseJson();
  }

  public void parseJson()
  {
    JSONParser parser = new JSONParser();

    try
    {
      FileReader rd = new FileReader(this.fileName);
      Object obj = parser.parse(rd);

      this.jsonObject = (JSONObject)obj;
      this.jsonObject = (JSONObject)this.jsonObject.get("quotes");
      for (Object key : jsonObject.keySet()) {
        String keyStr = (String)key;
        Object keyvalue = jsonObject.get(keyStr);

        this.rates.add(new Currency(keyStr, keyvalue));
        System.out.println("key: "+ keyStr + " value: " + keyvalue);
      }
      for (int i = 0; i < this.rates.size(); i++)
      {
        System.out.println(this.rates.get(i).getName() + " / " + this.rates.get(i).getRate());
      }
    }
    catch (FileNotFoundException err)
    {
      System.out.println(err.getMessage());
    }
    catch (IOException err)
    {
      System.out.println(err.getMessage());
    }
    catch (ParseException err)
    {
      System.out.println(err.getMessage());
    }
  }
}

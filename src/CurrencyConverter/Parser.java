import java.util.*;
import java.io.File;
import org.json.simple.*;

class Parser
{
  //LiveRates liveRates;
  protected List<Currency> rates = new ArrayList<>();
  protected String fileName;
  protected JSONObject jsonObject;

  Parser()
  {
    this.fileName = "./rates.json";
    //this.jsonObject = new JSONObject();
    //liveRates = new LiveRates();
  }

  Parser(String fileName)
  {
    this.fileName = fileName;
    //this.jsonObject = new JSONObject();
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

  /*public void setJsonObject(JSONObject jsonObject)
  {
    this.jsonObject = jsonObject;
  }

  public JSONObject getJsonObject()
  {
    return this.jsonObject;
  }*/

  public void openFile() throws NoSuchFileException
  {
    File file = new File(this.fileName);

    if (!file.exists() || !file.isFile())
    {
      throw new NoSuchFileException("This file doesn't exist or it's a directory.");
    }
    //this.parseJson();
  }

  /*public void parseJson()
  {
    JSONParser parser = parser.parse(new FileReader(this.fileName));
  }*/
}

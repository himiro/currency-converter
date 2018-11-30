import java.util.*;

class CurrencyConverter
{
  public static void main(String[] argv)
  {
    List<Currency> rates = new ArrayList<>();
    Parser parser = new Parser();
    try{
      parser.openFile();
      rates = parser.parseJson();
    }
    catch (NoSuchFileException err)
    {
      System.out.println(err.getMessage());
    }
    Window win = new Window("Converter", 600, 400, rates);
  }
}

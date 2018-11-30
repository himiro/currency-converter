class CurrencyConverter
{
  public static void main(String[] argv)
  {
    Window win = new Window("Calculator", 600, 400);
    Parser parser = new Parser();
    try{
      parser.openFile();
    }
    catch (NoSuchFileException err)
    {
      System.out.println(err.getMessage());
    }
  }
}

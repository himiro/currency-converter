class Currency
{
  protected String name;
  protected double rate;

  Currency(String name, double rate)
  {
    this.name = name;
    this.rate = rate;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setRate(double rate)
  {
    this.rate = rate;
  }

  public double getRate()
  {
    return this.rate;
  }
}

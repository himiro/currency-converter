class Currency
{
  protected String name;
  protected Object rate;

  Currency(String name, Object rate)
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

  public void setRate(Object rate)
  {
    this.rate = rate;
  }

  public Object getRate()
  {
    return this.rate;
  }
}

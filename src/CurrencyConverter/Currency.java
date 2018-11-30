import java.math.BigDecimal;

class Currency
{
  protected String name;
  protected BigDecimal rate;

Currency()
{
    this.name = "USD";
    this.rate = new BigDecimal("1");
}

  Currency(String name, BigDecimal rate)
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

  public void setRate(BigDecimal rate)
  {
    this.rate = rate;
  }

  public BigDecimal getRate()
  {
    return this.rate;
  }
}

import java.math.BigDecimal;

class Converter
{
  protected BigDecimal nb;
  protected Currency source;
  protected Currency dest;

  Converter(BigDecimal nb, Currency source, Currency dest)
  {
    this.nb = nb;
    this.source = source;
    this.dest = dest;
  }

  public void setNb(BigDecimal nb)
  {
    this.nb = nb;
  }

  public BigDecimal getNb()
  {
    return this.nb;
  }

  public void setSource(Currency source)
  {
    this.source = source;
  }

  public Currency getSource()
  {
    return this.source;
  }

  public void setDest(Currency dest)
  {
    this.dest = dest;
  }

  public Currency getDest()
  {
    return this.dest;
  }

  public BigDecimal convert()
  {
    // Basic conversion like 100$ to ?€
    if (this.source.getName().equals("USD"))
    {
      return (this.nb.multiply(this.dest.getRate()));
    }
    else if (this.dest.getName().equals("USD"))
    {
      return ((BigDecimal)this.nb);
    }
    //Conversion from $ to £
    // Or conversion € -> £ = € -> $ -> £
    else
    {
      return ((BigDecimal)this.nb.divide((BigDecimal)this.source.getRate().multiply((BigDecimal)this.dest.getRate())));
    }
  }
}

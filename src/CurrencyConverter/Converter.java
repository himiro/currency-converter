import java.math.BigDecimal;
import java.math.RoundingMode;

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
    //Conversion from $ to £
    // Or conversion € -> £ = € -> $ -> £
    System.out.println(this.source.getRate());
    System.out.println(this.dest.getRate());
    return (this.nb.divide(this.source.getRate().multiply((BigDecimal)this.dest.getRate()), 5, RoundingMode.HALF_UP));
  }
}

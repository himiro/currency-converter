class Converter
{
  protected Object nb;
  protected Currency source;
  protected Currency dest;

  Converter(Double nb, Currency source, Currency dest)
  {
    this.nb = nb;
    this.source = source;
    this.dest = dest;
  }

  public void setNb(Object nb)
  {
    this.nb = nb;
  }

  public Object getNb()
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

  public Double convert()
  {
    // Basic conversion like 100$ to ?€
    if (this.source.getName().equals("USD"))
    {
      return ((Double)this.nb * (Double)this.dest.getRate());
    }
    else if (this.dest.getName().equals("USD"))
    {
      return ((Double)this.nb);
    }
    //Conversion from $ to £
    // Or conversion € -> £ = € -> $ -> £
    else
    {
      return ((Double)this.nb / (Double)this.source.getRate() * (Double)this.dest.getRate());
    }
  }
}

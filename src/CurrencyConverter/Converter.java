class Converter
{
  protected double nb;
  protected Currency source;
  protected Currency dest;

  Converter(double nb, Currency source, Currency dest)
  {
    this.nb = nb;
    this.source = source;
    this.dest = dest;
  }

  public void setNb(double nb)
  {
    this.nb = nb;
  }

  public double getNb()
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

  public double convert()
  {
    // Basic conversion like 100$ to ?€
    if (this.source.getName().equals("USD"))
    {
      return (this.nb * this.dest.getRate());
    }
    else if (this.dest.getName().equals("USD"))
    {
      return (this.nb);
    }
    //Conversion from $ to £
    // € -> $ -> £
    else
    {
      return (this.nb / this.source.getRate() * this.dest.getRate());
    }
  }
}

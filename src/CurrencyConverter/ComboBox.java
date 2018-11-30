import javax.swing.JComboBox;

class ComboBox extends JComboBox
{
  static final long serialVersionUID = -1234567890123456789L;
  protected String name;
  protected int xPos;
  protected int yPos;
  protected JComboBox box;

  ComboBox(String name, int xPos, int yPos, String[] moneyList)
  {
    this.name = name;
    this.xPos = xPos;
    this.yPos = yPos;
    box = new JComboBox(moneyList);
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setXPos(int xPos)
  {
    this.xPos = xPos;
  }

  public int getXPos()
  {
    return this.xPos;
  }

  public void setYPos(int yPos)
  {
    this.yPos = yPos;
  }

  public int getYPos()
  {
    return this.yPos;
  }

  public JComboBox getComboBox()
  {
    return this.box;
  }

  public void setComboBox(JComboBox box)
  {
    this.box = box;
  }
}

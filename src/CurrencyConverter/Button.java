import javax.swing.JButton;

class Button extends JButton
{
    static final long serialVersionUID = -1234567890123456789L;
    protected String name;
    protected int xPos;
    protected int yPos;
    protected JButton button;

    Button(String name, int xPos, int yPos)
    {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        button = new JButton(name);
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

    public JButton getButton()
    {
        return this.button;
    }

    public void setButton(JButton button)
    {
        this.button = button;
    }
}

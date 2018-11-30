import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;

class Window extends JFrame implements ActionListener
{
  static final long serialVersionUID = -1234567890123456789L;
  protected String title;
  protected int height;
  protected int width;
  protected JFrame frame;
  protected JPanel buttonPanel;
  protected JPanel boxPanel;
  protected JLabel label;
  protected Button[] buttons = new Button[13];
  protected Button conv;
  protected ComboBox money1, money2;

  Window(String title, int height, int width)
  {
    this.title = title;
    this.height = height;
    this.width = width;
    this.frame = new JFrame();
    this.label = new JLabel("0");
    this.createWindow();
    this.displayButton();
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return this.title;
  }

  public void setWidth(int width)
  {
    this.width = width;
  }

  public int getWidth()
  {
    return this.width;
  }

  public void setHeight(int height)
  {
    this.height = height;
  }

  public int getHeight()
  {
    return this.height;
  }

  public void createWindow()
  {
    this.frame.setTitle(this.title);
    this.frame.setSize(this.width, this.height);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setVisible(true);
    this.frame.setLocationRelativeTo(null);
  }

  public void displaySelector()
  {
      String[] moneyList = {"USD", "EUR", "POU"};

      this.boxPanel = new JPanel();
      this.boxPanel.setLayout(new GridLayout(1,3));
      this.money1 = new ComboBox("currency",1,1, moneyList);
      this.money1.addActionListener(this);
      this.boxPanel.add(money1.getComboBox());
      this.conv = new Button("Convert",1,1);
      this.conv.getButton().addActionListener(this);
      this.boxPanel.add(conv.getButton());
      this.money2 = new ComboBox("currency",1,1, moneyList);
      this.money2.addActionListener(this);
      this.boxPanel.add(money2.getComboBox());
      this.frame.add(boxPanel, BorderLayout.SOUTH);
      this.frame.show();
  }

  public void displayButton()
  {
      String[] buttonName = {"7", "8", "9",
      "4", "5", "6",
      "1", "2", "3",
      "C", "0", "."};

    this.label.setHorizontalAlignment(JLabel.RIGHT);
    this.frame.add(this.label, BorderLayout.NORTH);
    this.buttonPanel = new JPanel();
    this.buttonPanel.setLayout(new GridLayout(4,3));
    for (int i = 0; i < (this.buttons.length -1); i++) {
      this.buttons[i] = new Button(buttonName[i], 1, 1);
      this.buttons[i].getButton().addActionListener(this);
      this.buttonPanel.add(this.buttons[i].getButton());
    }
    this.frame.add(buttonPanel, BorderLayout.CENTER);
    displaySelector();
  }

  public void actionPerformed(ActionEvent e)
  {
    String value = e.getActionCommand();


    switch(value)
    {
      case "C":
      this.label.setText("0");
      break;
      case "Convert":
      
      break;
      default:
      if (this.label.getText() != "0" || value == ".")
      {
        this.label.setText(this.label.getText() + value);
      }
      else
      {
        this.label.setText(value);
      }
      break;
    }
  }

}

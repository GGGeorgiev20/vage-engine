package mainpackage;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Label extends JLabel
{
    private String Name;

    public Label(String Name)
    {
        this.SetName(Name);
        this.SetText(Name);
        this.SetPosition(new int[] { 0, 0 });
        this.SetSize(new int[] { 100, 100 });
        
        this.setHorizontalAlignment(JLabel.LEFT);
        this.setVerticalAlignment(JLabel.TOP);

        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);

        this.setOpaque(false);

        Window.GetInstance().add(this);
        ComponentManager.GetInstance().Labels.add(this);

        System.out.println("INFO: Created label");
    }

    public void SetName(String Name)
    {
        this.Name = Name;
    }

    public String GetName()
    {
        return this.Name;
    }

    public void SetText(String Text)
    {
        this.setText(Text);
    }

    public void SetPosition(int[] Position)
    {
        this.setBounds(Position[0], Position[1], this.getWidth(), this.getHeight());
    }

    public int[] GetPosition()
    {
        return new int[] { this.getX(), this.getY() };
    }

    public void SetSize(int[] Size)
    {
        this.setBounds(this.getX(), this.getY(), Size[0], Size[1]);
    }

    public int[] GetSize()
    {
        return new int[] { this.getWidth(), this.getHeight() };
    }

    // public void SetImage(ImageIcon Image)
    // {
    //     this.setIcon(Image);
    // }

    public void SetFont(Font Font)
    {
        this.setFont(Font);
    }

    public void SetColor(Color Color)
    {
        this.setForeground(Color);
    }

    public void SetBackground(Color dColor)
    {
        this.setBackground(dColor);
    }

    public void SetBorder(Color Color, int Width)
    {
        this.setBorder(javax.swing.BorderFactory.createLineBorder(Color, Width));
    }
}
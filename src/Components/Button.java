package mainpackage;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Button extends JButton
{
    private String Name;

    public Button(String Name)
    {
        this.SetName(Name);
        this.SetText(Name);
        this.SetPosition(new int[] { 0, 0 });
        this.SetSize(new int[] { 100, 100 });
        
        this.setHorizontalAlignment(JButton.LEFT);
        this.setVerticalAlignment(JButton.TOP);

        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        
        this.setFocusable(false);
        this.setOpaque(true);

        Window.GetInstance().add(this);
        ComponentManager.GetInstance().Buttons.add(this);
        
        this.addActionListener(ActionManager.GetInstance());
        
        System.out.println("INFO: Created button");
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

    public void SetState(boolean State)
    {
        this.setEnabled(State);
    }
}
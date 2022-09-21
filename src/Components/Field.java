package mainpackage;
import javax.swing.JTextField;
import java.awt.Dimension;

public class Field extends JTextField
{
    private String Name;

    public Field(String Name)
    {
        this.SetName(Name);

        // this.SetText(Name);
        this.SetPosition(new int[] { 0, 0 });
        this.SetSize(new int[] { 50, 20 });
        
        // this.setHorizontalAlignment(JTextField.LEFT);
        // this.setVerticalAlignment(JTextField.TOP);
        
        // this.setFocusable(false);
        this.setOpaque(true);

        Window.GetInstance().add(this);
        ComponentManager.GetInstance().Fields.add(this);
        
        // this.addActionListener(ActionManager.GetInstance());
        
        System.out.println("INFO: Created field");
    }
    
    public void SetName(String Name)
    {
        this.Name = Name;
    }

    public String GetName()
    {
        return this.Name;
    }

    public void SetPosition(int[] Position)
    {
        this.setBounds(Position[0], Position[1], this.getWidth(), this.getHeight());
    }

    public void SetSize(int[] Size)
    {
        this.setPreferredSize(new Dimension(Size[0], Size[1]));
    }
}
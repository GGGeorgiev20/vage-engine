package mainpackage;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyManager implements KeyListener
{
    private static KeyManager instance = new KeyManager();

    private ComponentManager MainComponentManager = ComponentManager.GetInstance();

    private ArrayList<Button> ButtonList = MainComponentManager.Buttons;
    private ArrayList<Label> LabelList = MainComponentManager.Labels;
    private ArrayList<Field> FieldList = MainComponentManager.Fields;

    @Override
    public void keyTyped(KeyEvent e)
    {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
    
    public static KeyManager GetInstance()
    {
        return instance;
    }
}
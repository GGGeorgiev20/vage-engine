package mainpackage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class ActionManager implements ActionListener
{
    private static ActionManager instance = new ActionManager();

    private ComponentManager MainComponentManager = ComponentManager.GetInstance();

    private ArrayList<Button> ButtonList = MainComponentManager.Buttons;
    private ArrayList<Label> LabelList = MainComponentManager.Labels;
    private ArrayList<Field> FieldList = MainComponentManager.Fields;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }

    public static ActionManager GetInstance()
    {
        return instance;
    }
}
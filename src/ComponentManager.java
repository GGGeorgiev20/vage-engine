package mainpackage;
import java.util.ArrayList;

public class ComponentManager
{
    private static ComponentManager instance = new ComponentManager();

    public ArrayList<Button> Buttons = new ArrayList<Button>();
    public ArrayList<Label> Labels = new ArrayList<Label>();
    public ArrayList<Field> Fields = new ArrayList<Field>();

    public Label GetLabelByName(String Name)
    {
        for (var Label : Labels)
        {
            if (Label.GetName() == Name)
            {
                return Label;
            }
        }

        return null;
    }

    public static ComponentManager GetInstance()
    {
        return instance;
    }
}
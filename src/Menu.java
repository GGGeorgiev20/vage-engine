package mainpackage;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Menu
{
    private static Menu instance = new Menu();

    public void Initialize()
    {
        DisplayMenu();
        
        System.out.println("INFO: Menu initialized succesfully");
    }

    public void Update()
    {
        
    }

    private void DisplayMenu()
    {
        
    }

    public static Menu GetInstance()
    {
        return instance;
    }
}
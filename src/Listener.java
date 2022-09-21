package mainpackage;

public class Listener 
{
    private static Listener instance = new Listener();

    private Window MainWindow = Window.GetInstance();
    private Menu MainMenu = Menu.GetInstance();

    private boolean ShouldQuit = false;

    public void Initialize()
    {
        MainWindow.Initialize();
        MainMenu.Initialize();
    }

    public void Update()
    {
        MainMenu.Update();
    }

    public boolean ShouldQuit()
    {
        return ShouldQuit;
    }

    public void Quit()
    {
        MainWindow.dispose();
    }

    public static Listener GetInstance()
    {
        return instance;
    }
}
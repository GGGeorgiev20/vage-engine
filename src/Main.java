package mainpackage;

public class Main
{
    public static void main(String[] args)
    {
        Listener MainListener = Listener.GetInstance();

        MainListener.Initialize();

        while (!MainListener.ShouldQuit())
        {
            MainListener.Update();
        }

        MainListener.Quit();
    }
}
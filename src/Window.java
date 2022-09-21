package mainpackage;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Window extends JFrame
{
    private static Window instance = new Window();

    private String WindowTitle = "JFrame";
    private int[] WindowSize = { 640, 480 };

    public void Initialize()
    {
        this.setTitle(WindowTitle);
        this.setSize(WindowSize[0], WindowSize[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.addKeyListener(KeyManager.GetInstance());
        this.setLayout(null);

        System.out.println("INFO: Window initialized succesfully");
    }

    public void SetTitle(String Title)
    {
        WindowTitle = Title;
    }

    public String GetTitle()
    {
        return WindowTitle;
    }

    public void SetSize(int[] Size)
    {
        WindowSize = Size;
    }

    public int[] GetSize()
    {
        return WindowSize;
    }

    public static Window GetInstance()
    {
        return instance;
    }
}
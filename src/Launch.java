import javax.swing.*;
import java.awt.*;

public class Launch extends JFrame
{
    // has-a launchButton
    private JButton launchButton;

    // Purpose: Create launch
    public Launch()
    {
        // set title
        setTitle("Launch Screen");
        // set size
        setSize(1000, 600);
        // Create border layout
        BorderLayout launchLayout = new BorderLayout();
        // create launch panel
        JPanel launchPanel = new JPanel();
        // make side launch icon
        Icon launchSides = new ImageIcon("img/launchSides.jpg");
        // create launch button
        JButton launchButton = new JButton("Launch");
        // create create first side label
        JLabel launchSideLabel = new JLabel();
        launchSideLabel.setIcon(launchSides);
        // create create second side label
        JLabel launchSideLabel2 = new JLabel();
        launchSideLabel2.setIcon(launchSides);

        // Add border layout to panel
        launchPanel.setLayout(launchLayout);
        // add launch sides to launch panel
        launchPanel.add(launchSideLabel, BorderLayout.WEST);
        launchPanel.add(launchSideLabel2, BorderLayout.EAST);
        // add launch button to launch panel
        launchPanel.add(launchButton, BorderLayout.CENTER);
        // add panel to window
        add(launchPanel);
        // make Launch screen visible
        setVisible(true);
    }

    // Purpose: Create a CreateGamer page
    public void makeGamer()
    {
        CreateGamer createGamer = new CreateGamer();
        createGamer.main();
    }

    public static void main(String[] arg)
    {
        Launch launch = new Launch();
    }
}

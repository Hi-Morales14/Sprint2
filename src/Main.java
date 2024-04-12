import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Main class represents the entry point of the application and implements
 * the ActionListener interface to handle button clicks.
 */
public class Main implements ActionListener {

    /**
     * The main method is the entry point of the application.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create a new instance of MyFrame
        MyFrame loginFrame = new MyFrame();

        // Create and configure a label
        JLabel label = new JLabel("ACME INC");
        label.setBounds(0,0,500,50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        loginFrame.add(label);

        // Create and configure a login button
        JButton loginButton = new JButton();
        loginButton.setText("LOGIN");
        loginButton.setBounds(200,100,100,25);
        loginFrame.add(loginButton);
    }

    /**
     * Invoked when an action occurs.
     * This method creates a new instance of the Home class when the action is performed.
     *
     * @param e The ActionEvent that occurred.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Create a new instance of the Home class
        new Home();
    }
}
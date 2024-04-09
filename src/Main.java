import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class Main extends JFrame{
    private JPanel LoginPanel;
    private JLabel ACME;
    private JTextField Username;
    private JPasswordField Password;


    public Main (){

        setContentPane(LoginPanel);
        setTitle("ACME INC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        ACME.setText("ACME INC");
        



    }

    public static void main(String[] args) {
        new Main();
    }
}
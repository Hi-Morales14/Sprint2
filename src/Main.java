import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main extends JFrame{
    private JPanel LoginPanel;
    private JLabel ACME;
    private  JTextField Username;
    private JPasswordField Password;
    private JButton LoginButton;


    public Main (){

        setContentPane(LoginPanel);
        setTitle("ACME INC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        ACME.setText("ACME INC");
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                checkLogin();
            }
    });
    }
public void checkLogin(){
    if(Objects.equals(Username.getText(), "Test") && Objects.equals(Password.getText(), "Test")){
        System.out.println("Pass");
    }
}
    public static void main(String[] args) {
        new Main();
    }

}
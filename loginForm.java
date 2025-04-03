import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class loginForm {
    public static void main(String[] args) {

        JFrame form = new JFrame("Login Form");
        form.setLayout(null);

        // jlabel1

        JLabel userloginjlabel = new JLabel("login");
        userloginjlabel.setBounds(290, 90, 130, 20);
        form.add(userloginjlabel);

        // jlabel username
        JLabel jlabelusername = new JLabel("username");
        jlabelusername.setBounds(290, 110, 130, 20);
        form.add(jlabelusername);

        // textfield
        JTextArea usertextarea = new JTextArea();
        usertextarea.setBounds(350, 110, 130, 20);
        form.add(usertextarea);

        // jlabel password
        JLabel jlabelpassword = new JLabel("password");
        jlabelpassword.setBounds(290, 150, 130, 20);
        form.add(jlabelpassword);

        JPasswordField userpass = new JPasswordField();
        userpass.setBounds(350, 150, 130, 20);
        form.add(userpass);

        // Jbutton creation
        JButton loginbutton = new JButton("login");
        loginbutton.setBounds(320, 200, 130, 20);
        form.add(loginbutton);
        


        form.setVisible(true);

    }
}

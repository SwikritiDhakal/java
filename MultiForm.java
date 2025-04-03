import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MultiForm {
    public static void main(String[] args) {
        JFrame form = new JFrame("Multiple Components");
        form.setSize(1000, 70);

        // form.setLocationRelative(null)
        form.setLayout(null);

        // create jlabel
        JLabel jl = new JLabel("welcome");
        jl.setBounds(300, 50, 120, 20);
        // jl.setSize(120,20);
        form.add(jl);

        // Jlabel2
        JLabel jl2 = new JLabel("User login");
        jl2.setBounds(290, 90, 130, 20);
        form.add(jl2);

        // create jbutton
        JButton jb = new JButton("hello");
        jb.setSize(130, 30);

        form.setVisible(true);
    }
}
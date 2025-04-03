
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice {
    public static void main(String[] args) {

        JFrame form = new JFrame("test");
        form.setVisible(true);
        form.setSize(100, 100);

        // jlabel 
        JLabel jl = new JLabel();
        jl.setText("practice test");
        form.add(jl);

        
    }
}

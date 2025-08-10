/*
 * create project goto src rightclick javaClass TestForm
 */

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
    public static void main(String[] args) {
        JFrame form = new JFrame("Test Form");
        form.setVisible(true);
        form.setSize(800, 100);
        // form.setTitle(" Test Form");

        // create jlabel

        JLabel jl = new JLabel("Orchid College");
        //jlabel is used for labelling
        jl.setSize(
                100, 20);
form.add(jl);
    }
}
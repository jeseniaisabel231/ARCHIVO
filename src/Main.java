import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static JFrame frame = new JFrame("primera pantalla");
    public static void main(String[] args) {
        frame.setContentPane(new form1().pant1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(850,420);
        frame.setVisible(true);
    }

}
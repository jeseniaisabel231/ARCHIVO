import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class form1 {
    public JPanel pant1;
    private JLabel bienvenido;
    private JButton CONTINUARButton;
    static JFrame frame = new JFrame("segunda pantalla");
    private JButton SALIRButton;



    public form1() {

        CONTINUARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cerrar la ventana actual (Pantalla1)
                Main.frame.dispose();
                form3.frame.dispose();
                // Ventana 2 (Pantalla2)
                frame.setContentPane(new form3().pant4);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(850,420);
                frame.setVisible(true);
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Cerrar la ventana actual (Pantalla1)
                Main.frame.dispose();
            }
        });
    }
}

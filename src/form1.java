import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel pant1;
    private JLabel bienvenido;
    private JButton CONTINUARButton;
    private JButton SALIRButton;

    public form1() {
        CONTINUARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cerrar la ventana actual (Pantalla1)

                // Abrir la nueva ventana (Pantalla2)
                form2 pantalla2 = new form2();
                pantalla2.mostrarPantalla2();
            }
        });
    }
}

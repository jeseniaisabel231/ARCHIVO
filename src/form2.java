import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel panel2;
    private JButton subirArchivoButton;
    private JButton agregarArchivoButton;
    private JButton cerrarButton;
    private JButton inicioButton;

    public form2() {
        agregarArchivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cerrar la ventana actual (Pantalla1)

                // Abrir la nueva ventana (Pantalla2)
                form3 pantalla3 = new form3();
                pantalla3.mostrarPantalla3();
            }
        });



    }

    public void mostrarPantalla2() {
        JFrame aplicacion = new JFrame("Pantalla 2");
        aplicacion.setContentPane(new form2().panel2);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600,480);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}

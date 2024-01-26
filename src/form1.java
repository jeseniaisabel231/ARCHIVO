//Importar librerias
import javax.swing.*;//crear interfaz grafica de usuario
import java.awt.event.ActionEvent;//crear eventos para los botones
import java.awt.event.ActionListener;
import java.io.File;//leer archivos csv

public class form1 {
    //declarar atributos de la clase
    public JPanel pant1;
    private JLabel bienvenido;
    private JButton CONTINUARButton;
    //Declarar variable estatica de tipo JFrame para poder cerrar la ventana desde otra clase
    static JFrame frame = new JFrame("segunda pantalla");
    private JButton SALIRButton;



    public form1() {

        CONTINUARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cerrar la ventana actual (Pantalla1)
                Main.frame.dispose();
                //opcion, regresar(cierra ventana)
                form3.frame.dispose();

                // Ventana 2 (Pantalla2)
                //establece el contenido de la ventana
                frame.setContentPane(new form3().pant4);
                //establece la operacion por defecto cuando la ventana se cierra
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
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

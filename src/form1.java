//Importar librerias
import javax.swing.*;//crear interfaz grafica de usuario
import java.awt.event.ActionEvent;//crear eventos para los botones
import java.awt.event.ActionListener;

public class form1 {
    //declarar atributos de la clase
    public JPanel pant1;
    private JLabel bienvenido;
    private JButton CONTINUARButton;
    //Declarar variable estatica de tipo JFrame para poder cerrar la ventana desde otra clase
    static JFrame frame = new JFrame("segunda pantalla");
    private JButton SALIRButton;
    private JPasswordField passwordField1;
    private JTextField userField1;
    private JLabel password;
    private JLabel user;
    private JLabel error_texto;


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
                form3.frame.dispose();
            }
        });

        CONTINUARButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String  usuario= "admin" ;
                String clave = "password";
                String usuario_ingresado=userField1.getText();
                String password_ingresado=passwordField1.getText();

                if (usuario_ingresado.equals(usuario) && password_ingresado.equals(clave)){
                    JFrame ventana_uno = new JFrame();
                    fo.setContentPane(new form3().pant4);
                    ventana_uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ventana_uno.setVisible(true);
                    ventana_uno.setSize(600,400);
                    Main.frame.dispose();

                }else{
                    error_texto.setText("Usuario o contaseña erronesos");

                }

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

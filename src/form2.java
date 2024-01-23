import javax.swing.*;

public class form2 {
    public JPanel panel2;
    private JButton subirArchivoButton;
    private JButton agregarArchivoButton;
    private JButton cerrarButton;
    private JButton inicioButton;

    public void mostrarPantalla2() {
        JFrame aplicacion = new JFrame("Pantalla 2");
        aplicacion.setContentPane(new form2().panel2);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600,480);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}

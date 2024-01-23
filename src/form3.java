import javax.swing.*;

public class form3 {
    public JPanel lol;
    private JButton subirArchivoButton;
    private JButton agregarArchivoButton;
    private JButton cerrarButton;
    private JButton inicioButton;
    private JButton tareaButton;
    private JButton completadaButton;
     JPanel panel3;
    public void mostrarPantalla3() {
        JFrame aplicacion = new JFrame("Pantalla 2");
        aplicacion.setContentPane(new form3().panel3);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600,480);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}

import javax.swing.*;

public class form3 {
    public JPanel lol;
    private JButton subirArchivoButton2;
    private JButton agregarArchivoButton2;
    private JButton cerrarButton2;
    private JButton inicioButton2;
    private JButton CompletadaB;
    private JButton TareaB;
    JPanel panel3;

    public void mostrarPantalla3() {
        JFrame aplicacion = new JFrame("Pantalla 3");
        aplicacion.setContentPane(new form3().panel3);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(850,420);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}

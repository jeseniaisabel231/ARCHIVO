import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class form3 {
    private JTable table1;
    private JCheckBox si;
    private JCheckBox no;
    public JPanel pant4;
    private JFormattedTextField formattedTextField1;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem subir;
    private JMenuItem exportar;
    private JMenuItem salir;
    private JButton button1;

    public form3() {
        table1 = new JTable(); // Inicializar la tabla
        JScrollPane scrollPane = new JScrollPane(table1); // Crear un JScrollPane y agregar la tabla a él
        pant4.add(scrollPane); // Agregar el JScrollPane al panel principal

        subir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                File selectedFile = null;
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                }
                String file = selectedFile.getAbsolutePath();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    DefaultTableModel model = new DefaultTableModel(0, 3);
                    String line = "";
                    while ((line = reader.readLine()) != null) {
                        String[] row = line.split(",");
                        model.addRow(row);
                    }
                    table1.setModel(model);

                } catch (IOException exception) {
                    System.out.println("Error al leer el archivo");
                }

            }
        });
    }
}

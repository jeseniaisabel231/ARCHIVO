import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
    private JMenuItem regresar;
    static JFrame frame = new JFrame("primera pantalla");

    public form3() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/pablo/OneDrive/Escritorio/spotify-2023.csv"));
            DefaultTableModel model = null;
            String line = "";
            String[] row1, rows;
            int columns = 0;
            while ((line = reader.readLine()) != null) {
                row1 = line.split(",");
                model = new DefaultTableModel(row1, 0);
                break;
            }
            while ((line = reader.readLine()) != null){
                rows = line.split(",");
                model.addRow(rows);
            }

            table1.setModel(model);
        } catch (Exception exception) {
            System.out.println("Error al leer el archivo");
        }
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
                System.out.println(file);
                try {

                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    DefaultTableModel model = null;
                    String line = "";
                    String[] row1, rows;
                    int columns = 0;
                    while ((line = reader.readLine()) != null) {
                        row1 = line.split(",");
                        model = new DefaultTableModel(row1, 0);
                        break;
                    }
                    while ((line = reader.readLine()) != null){
                        rows = line.split(",");
                        model.addRow(rows);
                    }

                    table1.setModel(model);
                } catch (Exception exception) {
                    System.out.println("Error al leer el archivo");
                }
            }
        });
        si.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table1.getSelectedRow() >= 0 && si.isSelected() && !(no.isSelected())){
                    table1.getModel().setValueAt("Completa",table1.getSelectedRow(), 1);
                    if(no.isSelected()){
                        no.setSelected(false);
                    }
                } else if (table1.getSelectedRow() >= 0) {
                    table1.getModel().setValueAt("",table1.getSelectedRow(), 1);
                } else {
                    return;
                }
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table1.getSelectedRow() >= 0 && no.isSelected()){
                    table1.getModel().setValueAt("Incompleta",table1.getSelectedRow(), 1);
                    if(si.isSelected()){
                        si.setSelected(false);
                    }
                } else if (table1.getSelectedRow() >= 0) {
                    table1.getModel().setValueAt("",table1.getSelectedRow(), 1);
                } else {
                    return;
                }
            }
        });
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cerrar la ventana actual (Pantalla1)
                form1.frame.dispose();

                frame.setContentPane(new form1().pant1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(850,420);
                frame.setVisible(true);
            }
        });

        exportar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}

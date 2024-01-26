//importar librerias necesarias para el funcionamiento de la clase
import java.util.Date;//almacenar fecha actual
import javax.swing.*;//crea interfaz grafica de usuario
import javax.swing.table.DefaultTableModel;//crear tabla para mostrar datos del archivo csv
import java.awt.event.ActionEvent;//crear eventos para los botones
import java.awt.event.ActionListener;//crear eventos para los botones
import java.io.BufferedReader;//leer archivos csv
import java.io.*;//realiza operaciones de entrada y salida de datos
import java.text.SimpleDateFormat;//almacenar fecha actual en formato dd/mm/yyyy

public class form3 {
    //declarar los atributos de la clase
    private JTable table1;
    private JCheckBox si;
    private JCheckBox no;
    public JPanel pant4;
    private JFormattedTextField formTextField;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem subir;
    private JMenuItem acerca;
    private JMenuItem regresar;
    private JLabel entLabel;
    private JScrollPane scrollPane;
    //inicializar el atributo frame, para poder cerrar la ventana de otra clase
    static JFrame frame = new JFrame("primera pantalla");

    public form3() {

        try {
            //leer el archivo csv y mostrarlo en la tabla de la interfaz grafica de usuario
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/pablo/OneDrive/Escritorio/spotify-2023.csv"));

            //declarar variables necesarias para el funcionamiento del programa
            DefaultTableModel model = null;
            String line = "";
            //declarar arreglos para almacenar los datos del archivo csv
            String[] row1, rows;
            //declarar variables para almacenar el numero de columnas y filas
            int columns = 0;
            //leer el archivo csv y mostrarlo en la tabla de la interfaz grafica de usuario
            while ((line = reader.readLine()) != null) {
                //almacenar los datos del archivo csv en el arreglo row1
                row1 = line.split(",");
                //almacenar el numero de columnas del archivo csv
                model = new DefaultTableModel(row1, 0);
                break;
            }
            //leer el archivo csv y mostrarlo en la tabla
            while ((line = reader.readLine()) != null){
                //almacenar los datos del archivo csv en el arreglo rows
                rows = line.split(",");
                //almacenar el numero de filas del archivo csv
                model.addRow(rows);
            }
            //mostrar los datos del archivo csv en la tabla
            table1.setModel(model);

        //en caso de que no se pueda leer el archivo csv, mostrar un mensaje de error
        } catch (Exception exception) {
            System.out.println("Error al leer el archivo");
        }
        //declarar variables para almacenar los datos del archivo csv
        subir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //abrir el explorador de archivos para seleccionar el archivo csv
                JFileChooser fileChooser = new JFileChooser();
                //almacenar el archivo seleccionado en la variable selectedFile
                int returnValue = fileChooser.showOpenDialog(null);
                //declarar variable para almacenar la ruta del archivo seleccionado
                File selectedFile = null;
                //en caso de que el archivo seleccionado sea valido, almacenar la ruta del archivo seleccionado en la variable selectedFile
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                }
                //declarar variable para almacenar la ruta del archivo
                String file = selectedFile.getAbsolutePath();
                System.out.println(file);
                try {
                    //leer el archivo csv y mostrarlo en la tabla
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    DefaultTableModel model = null;
                    //declarar variables para almacenar los datos del archivo csv
                    String line = "";

                    String[] row1, rows;
                    int columns = 0;
                    //leer el archivo csv y mostrarlo en la tabla
                    while ((line = reader.readLine()) != null) {
                        //almacenar los datos del archivo csv en el arreglo row1
                        row1 = line.split(",");
                        //almacenar el numero de columnas del archivo csv
                        model = new DefaultTableModel(row1, 0);
                        break;
                    }
                    //leer el archivo csv y mostrarlo en la tabla
                    while ((line = reader.readLine()) != null){
                        //almacenar los datos del archivo csv en el arreglo rows
                        rows = line.split(",");
                        //almacenar el numero de filas del archivo csv
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
                //en caso de que se seleccione la opcion si, mostrar el mensaje completa en la columna 1 de la fila seleccionada.
                if (table1.getSelectedRow() >= 0 && si.isSelected() && !(no.isSelected())){
                    //salida del mensaje "completa"
                    table1.getModel().setValueAt("Completa",table1.getSelectedRow(), 1);
                    //en caso de que la opcion no este seleccionada seleccionarla
                    if (no.isSelected()) no.doClick();
                    //en caso de que la opcion si este seleccionada deseleccionarla
                } else if (table1.getSelectedRow() >= 0) {

                    table1.getModel().setValueAt("",table1.getSelectedRow(), 1);
                    //en caso de que la opcion no este seleccionada seleccionarla
                    if (no.isSelected()) no.doClick();
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
                    if(si.isSelected()) si.doClick();
                } else if (table1.getSelectedRow() >= 0) {
                    table1.getModel().setValueAt("",table1.getSelectedRow(), 1);
                    if(si.isSelected()) si.doClick();
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
                //cerrar ventana
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //mostrar ventana
                frame.pack();
                frame.setSize(850,420);
                frame.setVisible(true);



            }
        });

        acerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mostrar mensaje con informacion del programa
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                //almacenar fecha actual
                Date date = new Date();
                formTextField.setValue(formatter.format(date));
            }
        });


    }


}

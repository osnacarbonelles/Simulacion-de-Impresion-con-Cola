package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Metodos {

    private static Cola<String> Datos = new Cola<>();

    public static String getPrimero() {
        return Datos.primero();
    }

    public static void CargarDatos(JTable jTdatos) {
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda.
            FileReader fr = new FileReader("spool.txt");
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model_tabla = new DefaultTableModel();
            model_tabla.addColumn("");
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                Datos.enqueue(linea);
                model_tabla.addRow(new String[]{linea});
//                System.out.println(linea);
            }
//            System.out.println("cola toString: " + Datos.toString());
            jTdatos.setModel(model_tabla);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static int sizecola() {
        return Datos.size();
    }

    public static void deleteFirtsCola() {
        Datos.dequeue();
    }

    public static boolean Atender() {
        if (Datos.isEmpty()) {
            return false;
        }
        return true;
    }

}

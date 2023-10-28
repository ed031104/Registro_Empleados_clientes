
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class FicheroCliente {

    
    public void crearFichero(Clientes cliente) {
        FileWriter fl = null;
        
        try {
            fl = new FileWriter("clientes.txt", true);
            BufferedWriter bw = new BufferedWriter(fl);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print( cliente.getNombre()+",");
            pw.print( cliente.getSegundoNombre()+",");
            pw.print( cliente.getApellidoPaterno()+",");
            pw.print( cliente.getApellidoMaterno()+",");
            pw.print( cliente.getDireccion()+",");
            pw.print( cliente.getCuidad()+",");
            pw.print( cliente.getPais()+"\n");
            pw.close();
            
        } catch (Exception e) {
        }
        
    }

    public ArrayList<Clientes> ExtraerDatos() throws IOException {
    ArrayList<Clientes> listaClientes = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader("clientes.txt"));
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 7) {
            String primernombre = datos[0];
            String segundonombre = datos[1];
            String primerApellido = datos[2];
            String segundoApellido = datos[3];
            String Direccion = datos[4];
            String cuidad = datos[5];
            String pais = datos[6];

            Clientes cliente = new Clientes(primernombre, segundonombre, primerApellido, segundoApellido, Direccion, cuidad, pais);
            listaClientes.add(cliente);
        }
    }

    // Devuelve la lista de clientes
    return listaClientes;
   }
   
    public DefaultTableModel mostrarDatosTabla() throws IOException {
    ArrayList<Clientes> cliente = ExtraerDatos();
    
    if (cliente == null) {
        // Manejar el caso en el que la lista de clientes sea nula (por ejemplo, lanzar una excepción).
        throw new RuntimeException("No se pudieron extraer los datos de clientes.");
    }
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    modeloTabla.addColumn("Primer Nombre");
    modeloTabla.addColumn("Segundo Nombre");
    modeloTabla.addColumn("Primer Apellido");
    modeloTabla.addColumn("Segundo Apellido");
    modeloTabla.addColumn("Dirección");
    modeloTabla.addColumn("Ciudad");
    modeloTabla.addColumn("País");

    // Agregar datos al modelo de tabla
    for (Clientes clientes : cliente) {
        Object[] fila = {clientes.getNombre(), clientes.getSegundoNombre(), clientes.getApellidoPaterno(), clientes.getApellidoMaterno()
        , clientes.getDireccion(), clientes.getCuidad(), clientes.getPais()};
        modeloTabla.addRow(fila);
    }
    
    return modeloTabla;
}
    
}

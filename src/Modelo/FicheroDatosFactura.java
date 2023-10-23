
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicheroDatosFactura {
    
    public void imprimir(Factura factura){
        FileWriter fl =  null;
        try {
            fl = new FileWriter("datosFactura.txt", true);
            BufferedWriter bw = new BufferedWriter(fl);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print(factura.getCliente()+",");
            pw.print(factura.getOficinaCobro()+",");
            pw.print(factura.getFechaEntrega()+",");
            pw.print(factura.getCircuito()+",");
            pw.print(factura.getMedidor()+",");
            pw.print(factura.getFacturaNumero()+",");
            pw.print(factura.getMesFactura()+",");
            pw.print(factura.getConsumo()+",");
            pw.print(factura.getFechaEmision()+",");
            pw.print(factura.getFechaVencimiento()+",");
            pw.print(factura.getTipoConsumo()+",");
            pw.print(factura.getNumeroMedidor()+",");
            pw.print(factura.getNumeroNis()+",");
            pw.print(factura.getReferenciaCobro()+",");
            pw.print(factura.getDiasFacturados()+",");
            pw.print(factura.getLecturaAnterior()+",");
            pw.print(factura.getLecturaActual()+",");
            pw.print(factura.getMultip()+",");
            pw.print(factura.getConsumoKWH()+",");
            pw.print(factura.getOrdenlectura()+"\n");
            
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
    
}

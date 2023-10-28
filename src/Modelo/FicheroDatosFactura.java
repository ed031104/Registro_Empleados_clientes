
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class FicheroDatosFactura {
    
    
    
    public void imprimir(Factura factura){
        
        factura.CalculokWh();
        factura.alumbradoPublico();
        factura.Comercializacion();
        factura.subsidio();
        factura.INE();
        factura.Total();
        
        
        FileWriter fl =  null;
        try {
            fl = new FileWriter("datosFactura.txt", true);
            BufferedWriter bw = new BufferedWriter(fl);
            PrintWriter pw = new PrintWriter(bw);
            
            
            pw.print(factura.getCliente().nombre+",");
            pw.print(factura.getCliente().segundoNombre+",");
            pw.print(factura.getCliente().apellidoPaterno+",");
            pw.print(factura.getCliente().apellidoMaterno+",");
            pw.print(factura.getCliente().direccion+",");
            pw.print(factura.getCliente().cuidad+",");
            pw.print(factura.getCliente().pais +",");
            
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
            pw.print(factura.getOrdenlectura()+",");
            
            pw.print(factura.getConsumoCosto()+",");
            pw.print(factura.getAlumbradopublico()+",");
            pw.print(factura.getSubcidio()+",");
            pw.print(factura.getComercializacion()+",");
            pw.print(factura.getINE()+",");
            pw.print(factura.getTotaldeuda()+"\n");
            
            
            
            pw.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Factura> extraerDatosFacturaFicheros() throws IOException, ParseException{
        
    ArrayList<Factura> listaClientes = new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("datosFactura.txt"));
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 32) {
            String primernombre = datos[0];
            String segundonombre = datos[1];
            String primerApellido = datos[2];
            String segundoApellido = datos[3];
            String Direccion = datos[4];
            String cuidad = datos[5];
            String pais = datos[6];
            
            String oficinaCobro = datos[7];
            String fechaEntrega = datos[8];
            String circuito = datos[9];
            String medidor = datos[10];
            String facturaNumero = datos[11];
            String mesFactura = datos[12];
            String consumo = datos[13];
            String fechaEmision = datos[14];
            String fechaVencimiento = datos[15];
            String tipoConsumo = datos[16];
            String numeroMedidor = datos[17];
            String numeroNis = datos[18];
            String refereciaCobro = datos[19];
            int diasFacturados = Integer.parseInt(datos[20]);
            String lecturaAnterior = datos[21];
            String lecturaActual = datos[22];
            int multip = Integer.parseInt(datos[23]);
            int consumoKWK = Integer.parseInt(datos[24]);
            String ordenLectura = datos[25];
            
            double consumoCosto = Double.parseDouble(datos[26]);
            double alumbradoPublico = Double.parseDouble(datos[27]);
            double subcidio = Double.parseDouble(datos[28]);
            double comercializacion = Double.parseDouble(datos[29]);
            double ine = Double.parseDouble(datos[30]);
            double totalDeuda = Double.parseDouble(datos[31]);
            
            
            Clientes cliente = new Clientes(primernombre, segundonombre, primerApellido, segundoApellido, Direccion, cuidad, pais);
            
            Factura factura = new Factura(cliente, oficinaCobro, fechaEntrega, circuito, medidor, facturaNumero, mesFactura, consumo, fechaEmision, 
                    fechaVencimiento, tipoConsumo, numeroMedidor, numeroNis, refereciaCobro, diasFacturados, lecturaAnterior, lecturaActual, multip, consumoKWK, 
                    ordenLectura, consumoCosto, alumbradoPublico, subcidio, comercializacion, ine, totalDeuda);
            
            listaClientes.add(factura);
        }
    }

    // Devuelve la lista de clientes
    return listaClientes;
    }
    
    public DefaultListModel <Factura> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Factura> flm = new DefaultListModel<>();
        
        
        for(Modelo.Factura factura : extraerDatosFacturaFicheros()){
            flm.addElement(factura);
        }
        return flm;
    }
    
}

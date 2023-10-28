
package Modelo;

import Controlador.ControladorDatosFactura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicheroDatosFactura {
    
    
    public void imprimir(Factura factura, ControladorDatosFactura cdt){
        FileWriter fl =  null;
        
        cdt.CalculokWh(factura);
        cdt.alumbradoPublico(factura);
        cdt.Comercializacion(factura);
        cdt.subsidio(factura);
        cdt.INE(factura);
        cdt.Total(factura);
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
    
    public Empleados LeerFicheroEmpleados(String empleado){
        
        try{
            
        FileReader fr = new FileReader("nominas.txt");
        
        BufferedReader bf = new BufferedReader(fr);
        
        String cadena;
        while ((cadena = bf.readLine()) != null) {
            
            String[] dato = cadena.split(",");
        if (dato.length == 26) {
        
        }
    } 
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}

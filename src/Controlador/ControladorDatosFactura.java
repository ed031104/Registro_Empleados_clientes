
package Controlador;

import Modelo.Clientes;
import Modelo.Factura;
import Modelo.FicheroCliente;
import Modelo.FicheroDatosFactura;
import Vista.DatosFactura;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorDatosFactura implements ActionListener{
    
    FicheroDatosFactura fichero;
    DatosFactura vista;
    
    FicheroCliente ficherocliente = new FicheroCliente();
    
    ControladorFactura controladorFactura;
    
    public ControladorDatosFactura(){
    }
    
    public ControladorDatosFactura(FicheroDatosFactura fichero, DatosFactura vista, ControladorFactura controladorFactura) throws IOException{
    this.fichero=fichero;
    this.vista=vista;
    this.vista.guardar.addActionListener(this);
    
    this.vista.Cliente.setModel(ficherocliente.llenarComboBox());
    
    this.controladorFactura = controladorFactura;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.guardar){
            
            Clientes cliente= (Clientes) vista.Cliente.getSelectedItem();
           String mesfactura = (String) vista.mesFactura.getSelectedItem();
           String consumo = (String) vista.consumo.getSelectedItem();
           String tipoConsumo = (String) vista.tipoConsumo.getSelectedItem();
           
           String fechaEntrega = extraerFecha(vista.fechaEntrega);
           String fechaEmision = extraerFecha(vista.fechaEmision);
           String fechaVencimiento = extraerFecha(vista.fechaVencimiento);
           
           
            //se agrega una nueva factura
            Factura factura = new Factura(cliente, vista.oficinaCobro.getText(), fechaEntrega, vista.circuito.getText(), vista.medidor.getText(),
            vista.numeroFactura.getText(), mesfactura , consumo, fechaEmision, fechaVencimiento, tipoConsumo,
            vista.numeroMedidor.getText(), vista.numeronis.getText(), vista.referenciaCorbo.getText(), Integer.parseInt(vista.diasFacturados.getText()),
            vista.lecturaAnterior.getText(),vista.lecturaActual.getText(), Integer.parseInt(vista.multip.getText()),Integer.parseInt(vista.consumoKWH.getText()), 
            vista.ordenLectura.getText());
            
            //se agrega la factura al fichero
            fichero.imprimir(factura);
            
            try {
                controladorFactura.vista.listaFactura.setModel(fichero.llenarJlist());
            } catch (IOException ex) {
                Logger.getLogger(ControladorDatosFactura.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorDatosFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
     public String extraerFecha(JDateChooser dateChooser) {
        Date selectedDate = dateChooser.getDate();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String formattedDate = dateFormat.format(selectedDate);
        
        return formattedDate;
    }
}
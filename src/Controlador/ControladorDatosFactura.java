
package Controlador;

import Modelo.Clientes;
import Modelo.Factura;
import Modelo.FicheroDatosFactura;
import Vista.DatosFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ControladorDatosFactura implements ActionListener{
    
    FicheroDatosFactura fichero;
    DatosFactura vista;
    
    
    public ControladorDatosFactura(FicheroDatosFactura fichero, Vista.DatosFactura vista) throws IOException{
    this.fichero=fichero;
    this.vista=vista;
    this.vista.guardar.addActionListener(this);
    llenarComboBox(this.vista.Cliente);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.guardar){
            
            Clientes cliente= (Clientes) vista.Cliente.getSelectedItem();
            
           
            Factura factura = new Factura(cliente, vista.oficinaCobro.getText(), vista.fechaEntrega.getDate(), vista.circuito.getText(), vista.medidor.getText(),
            vista.numeroFactura.getText(), vista.mesFactura.getText(), vista.consumo.getText(), vista.fechaEmision.getDate(), vista.fechaVencimiento.getText(),vista.tipoConsumo.getText(),
            vista.numeroMedidor.getText(), Integer.parseInt(vista.numeronis.getText()), Integer.parseInt(vista.referenciaCorbo.getText()), Integer.parseInt(vista.diasFacturados.getText()),
            Integer.parseInt(vista.lecturaAnterior.getText()),Integer.parseInt(vista.lecturaActual.getText()), Integer.parseInt(vista.multip.getText()),Integer.parseInt(vista.consumoKWH.getText()), 
            Double.parseDouble(vista.ordenLectura.getText()));
            
            fichero.imprimir(factura);
            
        }
    }
    
    public void llenarComboBox(JComboBox<Clientes> comboBox) throws IOException {
        
    DefaultComboBoxModel<Clientes> dcm = new DefaultComboBoxModel<>();
    ArrayList<Clientes> listaClientes = fichero.ExtraerDatos();
    
    if (listaClientes != null) { // Verificar si la lista no es nula
        for (Clientes cliente : listaClientes) {
            dcm.addElement(cliente);
        }
    } else {
        // Manejar el caso en el que la lista sea nula o esté vacía
        // Puedes mostrar un mensaje o realizar una acción apropiada.
    }
    
    // Configurar el modelo del JComboBox una vez, fuera del bucle
    comboBox.setModel(dcm);
}
       public void CalculokWh(Factura constructor){
    
        int kwh = constructor.getConsumoKWH();
        Double ValorkWh = 0.0;
        
        ValorkWh = kwh * 5.798642857142857;
        
        constructor.setConsumoCosto(ValorkWh);
    }
    
    public void alumbradoPublico(Factura constructor){
    
        Double valorkwh = constructor.getConsumoCosto();
        double alumbrado = 0.0;
        
        alumbrado = valorkwh * 0.1077592047400254;
        
        constructor.setAlumbradopublico(alumbrado);
    }
    
    public void Comercializacion(Factura constructor){
    
        Double comercializacion = 0.0;
        Double Valorkwh = constructor.getConsumoCosto();
        comercializacion = Valorkwh * 0.0423621290696099;
        
        constructor.setComercializacion(comercializacion);
    }
    
    public void subsidio(Factura constructor){
    
        Double Total = 0.0;
        int kwh = constructor.getConsumoKWH();
        Double Valorkwh= constructor.getConsumoCosto();
        Double alumbrado = constructor.getAlumbradopublico();
        Double comercializacion = constructor.getComercializacion();
        Double subsidio = 0.0;
        
        if(kwh >=50 || kwh<99){
        
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total *0.50;
        }
        if(kwh >=100 || kwh<=150){
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total*0.25;
        
            constructor.setSubcidio(subsidio);
        }
        if(kwh >150){
            Double subcidio = 0.0;
            
            constructor.setSubcidio(subcidio);
        }
    }
    
    public void INE(Factura constructor){
    
        Double ine = 0.0;
        Double total = 0.0;
        Double Valorkwh = constructor.getConsumoCosto();
        Double alumbrado = constructor.getAlumbradopublico();
        Double comercializacion = constructor.getComercializacion();
        Double Subcidio = constructor.getSubcidio();
        
        total = Valorkwh+alumbrado+comercializacion-Subcidio;
        ine = total * 0.01;
        
        constructor.setINE(ine);
    }
    
     public void Total(Factura constructor){
     
         Double Total = 0.0;
         Double Valorkwh = constructor.getConsumoCosto();
         Double alumbrado = constructor.getAlumbradopublico();
         Double comercializacion = constructor.getComercializacion();
         Double subsidio = constructor.getSubcidio();
         Double ine = constructor.getINE();
         
         Total = Valorkwh+alumbrado+comercializacion-subsidio+ine;
         
         constructor.setTotaldeuda(Total);
     }  
}


package Controlador;

import Modelo.Clientes;
import Modelo.FicheroCliente;
import Modelo.FicheroDatosFactura;
import Vista.DatosFactura;
import Vista.registroClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorRegistroCliente implements ActionListener{

    
    registroClientes vista;
    FicheroCliente fichero;
    
    FicheroDatosFactura fichero2 = new FicheroDatosFactura();
    DatosFactura vista2 = new DatosFactura();
    
    ControladorDatosFactura datosFactura;
    
    public ControladorRegistroCliente(){
    }
    
    public ControladorRegistroCliente(FicheroCliente fichero, registroClientes vista) throws IOException{
        
        this.vista = vista;
        this.fichero = fichero;
        this.vista.agregar.addActionListener(this);
        vista.tablaClientes.setModel(fichero.mostrarDatosTabla());
        
          
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == vista.agregar){
            
            Clientes cliente = new Clientes(vista.primerNombre.getText(),
            vista.segundoNombre.getText(), vista.primerApellido.getText(), vista.segundoApellido.getText(),
            vista.direccion.getText(),vista.cuidad.getText(), vista.pais.getText());
            
            fichero.crearFichero(cliente);
            try {
                vista.tablaClientes.setModel(fichero.mostrarDatosTabla());
                datosFactura.llenarComboBox(datosFactura.vista.Cliente);
                
            } catch (IOException ex) {
                Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    
    
}

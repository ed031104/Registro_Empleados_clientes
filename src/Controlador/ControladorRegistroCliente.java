
package Controlador;

import Modelo.Clientes;
import Modelo.FicheroCliente;
import Vista.registroClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;



public class ControladorRegistroCliente implements ActionListener{

    
    registroClientes vista;
    FicheroCliente fichero;
    
    ControladorDatosFactura controlador2;
    
    public ControladorRegistroCliente(){
    }
    
    public ControladorRegistroCliente(FicheroCliente fichero, registroClientes vista, ControladorDatosFactura controlador2 ) throws IOException{
        
        this.vista = vista;
        this.fichero = fichero;
        this.vista.agregar.addActionListener(this);
        
        vista.tablaClientes.setModel(fichero.mostrarDatosTabla());
        
        this.controlador2 = controlador2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == vista.agregar){
            
            //se registra un nuevo cliente
            Clientes cliente = new Clientes(vista.primerNombre.getText(),
            vista.segundoNombre.getText(), vista.primerApellido.getText(), vista.segundoApellido.getText(),
            vista.direccion.getText(),vista.cuidad.getText(), vista.pais.getText());
            
            //se agrega al fichero
            fichero.crearFichero(cliente);
           
            try {
                //se muetra el cliente en el Jtable
                vista.tablaClientes.setModel(fichero.mostrarDatosTabla());
                controlador2.vista.Cliente.setModel(fichero.llenarComboBox());
            } catch (IOException ex) {
            }
            
        }
        
    }

    
    
}

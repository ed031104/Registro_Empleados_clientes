
package Controlador;

import Vista.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterController implements ActionListener{
    
    Register vistaRegistro = new Register();
    
    public RegisterController(){
    }
    
    public RegisterController(Register vista){
        this.vistaRegistro = vista;
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        
    }
    
}

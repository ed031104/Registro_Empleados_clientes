
package Controlador;

import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener{
    
    Principal vista;
    
    public ControladorPrincipal(Principal vista){
    this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    }
    
}

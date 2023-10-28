package Controlador;

import Modelo.FicheroCliente;
import Modelo.FicheroDatosFactura;
import Vista.DatosFactura;
import Vista.Factura;
import Vista.Menu;
import Vista.Principal;
import Vista.Register;
import Vista.registroClientes;
import java.awt.BorderLayout;
import javax.swing.JPanel;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class menuController implements ActionListener{
    
   private Menu vista; 
   Register panelRegister = new Register();
   Principal panelPrincipal = new Principal();
   Factura panelFactura = new Factura();
   registroClientes panelRegistroClientes = new registroClientes();
   DatosFactura panelDatosFactura = new DatosFactura();
   
   ControladorRegistroCliente controladorRegistroCliente;
   FicheroCliente ficheroCliente = new FicheroCliente();
   ControladorDatosFactura controladorFactura;
    FicheroDatosFactura ficheroFactura = new FicheroDatosFactura();
   
    public menuController(){
    }
   
   public menuController(Menu vista) throws IOException{
       this.vista=vista;
       this.vista.btnRegistro.addActionListener(this);
       this.vista.brnMenu.addActionListener(this);
       this.vista.Opcmenu1.addActionListener(this);
       this.vista.btnPrincipal.addActionListener(this);
       this.vista.btnFactura.addActionListener(this);
       this.vista.btnRegistroClientes.addActionListener(this);
       this.vista.btnRegistroFactura.addActionListener(this);
       
       cambiarPanel(vista.content, panelPrincipal);
       controladorRegistroCliente = new ControladorRegistroCliente(ficheroCliente, panelRegistroClientes);
       controladorFactura = new ControladorDatosFactura(ficheroFactura, panelDatosFactura);
   }
   
   public void iniciar() throws IOException{
       vista.setTitle("Sistema ");
       vista.setLocationRelativeTo(null);
       ControladorRegistroCliente controladorRegistroCliente = new ControladorRegistroCliente();
       controladorFactura = new ControladorDatosFactura(ficheroFactura, panelDatosFactura);

   }
   
   public void cambiarPanel(JPanel content,JPanel jp) {
    jp.setVisible(true); // hace visible al panel
    jp.setSize(684, 300); // da el tamaño del panel
    jp.setLocation(0, 0); // centra el panel

    content.removeAll(); // esto elimina lo que se encontraba en content
    content.setLayout(new BorderLayout()); // Establecer el LayoutManager del contenedor Content en BorderLayout
    content.add(jp, BorderLayout.CENTER); // Agregar el panel principal al centro del contenedor Content
    jp.setPreferredSize(content.getSize()); // Asegurarse de que el panel principal ocupe todo el espacio disponible

    content.revalidate(); // notifica al contenedor Content que su diseño ha cambiado y necesita ser validado.
    content.repaint(); // repinta el contenedor Content para que se muestren los cambios realizados.
     }
  
   
   @Override
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == vista.btnRegistro){
           
           cambiarPanel(vista.content,panelRegister );
       }
       if(e.getSource() == vista.brnMenu){
           vista.popupMenu.show(vista.brnMenu, 0, vista.brnMenu.getHeight());
       }
       if(e.getSource() == vista.Opcmenu1){
           System.exit(0);
       }
       if(e.getSource() == vista.btnFactura){
           cambiarPanel(vista.content, panelFactura );
       }
       if(e.getSource() == vista.btnPrincipal){
           cambiarPanel(vista.content, panelPrincipal);
       }
       if(e.getSource() == vista.btnRegistroClientes){
           cambiarPanel(vista.content, panelRegistroClientes);
       }
       if(e.getSource() == vista.btnRegistroFactura){
           cambiarPanel(vista.content, panelDatosFactura);
       }
   }
    
    
    
    
    
    
    
    
}

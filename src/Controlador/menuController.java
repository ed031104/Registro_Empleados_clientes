package Controlador;

import Modelo.FicheroCliente;
import Modelo.FicheroDatosFactura;
import Vista.DatosFactura;
import Vista.FacturaLuz;
import Vista.Menu;
import Vista.Principal;
import Vista.Register;
import Vista.registroClientes;
import java.awt.BorderLayout;
import javax.swing.JPanel;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;


public class menuController implements ActionListener{
    
   private Menu vista; 
   Register panelRegister = new Register();
   Principal panelPrincipal = new Principal();
   FacturaLuz panelFactura = new FacturaLuz();
   registroClientes panelRegistroClientes = new registroClientes();
   DatosFactura panelDatosFactura = new DatosFactura();
   
   ControladorRegistroCliente controladorRegistroCliente;
   FicheroCliente ficheroCliente = new FicheroCliente();
   
   ControladorDatosFactura controladorFactura;
    FicheroDatosFactura ficheroDatosFactura = new FicheroDatosFactura();
    
    ControladorFactura ctlFactura;
    
    ControladorPrincipal controladorPrincipal;
    
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
       
       
   }
   
   public void iniciar() throws IOException, ParseException{
       vista.setTitle("Sistema ");
       vista.setLocationRelativeTo(null);
       
       controladorPrincipal = new ControladorPrincipal(panelPrincipal);
       ctlFactura = new ControladorFactura(ficheroDatosFactura, panelFactura);
       controladorFactura = new ControladorDatosFactura(ficheroDatosFactura, panelDatosFactura, ctlFactura, controladorPrincipal);
       controladorRegistroCliente = new ControladorRegistroCliente(ficheroCliente, panelRegistroClientes, controladorFactura);
       
       
       controladorPrincipal.vista.txtNumFactura.setText(String.valueOf(ctlFactura.totalRecibos()));
       
       
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

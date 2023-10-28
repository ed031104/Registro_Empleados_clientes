
package Controlador;

import Modelo.Factura;
import Modelo.FicheroDatosFactura;
import Vista.FacturaLuz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControladorFactura implements ActionListener{
    
    FicheroDatosFactura fichero;
    FacturaLuz vista;
    
    public ControladorFactura(FicheroDatosFactura fichero, FacturaLuz vista) throws IOException, ParseException{
        this.fichero = fichero;
        this.vista = vista;
        
        this.vista.listaFactura.setModel(fichero.llenarJlist());
        
        // Agrega el ListSelectionListener para manejar la selección en la lista
    this.vista.listaFactura.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            try {
                listaFacturaValueChanged(e);
            } catch (IOException ex) {
                Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    public void listaFacturaValueChanged(ListSelectionEvent e) throws IOException, ParseException{
        if (!e.getValueIsAdjusting()) {
            Factura factura = vista.listaFactura.getSelectedValue();
                if (factura != null) {
                    vista.lblNombreCliente.setText(factura.getCliente().getNombre()+" "+ factura.getCliente().getSegundoNombre()+" "+factura.getCliente().getApellidoPaterno()+" "+factura.getCliente().getApellidoMaterno());
                    vista.lblDireccionCliente.setText(factura.getCliente().getDireccion());
                    vista.lblCuidadPais.setText(factura.getCliente().getCuidad()+" "+ factura.getCliente().getPais());
                    vista.lblNumeroNis.setText(factura.getNumeroNis());
                    vista.lblCircuito.setText(factura.getCircuito());
                    vista.lblMedidor.setText(factura.getMedidor());
                    vista.lblNumeroFactura.setText(factura.getFacturaNumero());
                    vista.lblOrdenFactura.setText(factura.getOrdenlectura());
                    vista.txtFechaEntrega.setText(factura.getFechaEntrega());
                    vista.txtOficinaComercial.setText(factura.getOficinaCobro());
                    vista.txtReferenciaCobro.setText(factura.getReferenciaCobro());
                    vista.txtDiasFacturados.setText(String.valueOf(factura.getDiasFacturados()));
                    vista.txtMesFactura.setText(factura.getMesFactura());
                    vista.txtConsumo.setText(factura.getConsumo());
                    vista.txtFechaEmision.setText(factura.getFechaEmision());
                    vista.txtFechaVencimiento.setText(factura.getFechaVencimiento());
                    vista.txtTipoConsumo.setText(factura.getTipoConsumo());
                    vista.txtNumeroMedidor.setText(factura.getNumeroMedidor());
                    vista.txtLecturaAnterior.setText(factura.getLecturaAnterior());
                    vista.txtLecturaActual.setText(factura.getLecturaActual());
                    vista.txtMultip.setText(String.valueOf(factura.getMultip()));
                    vista.txtConsumoKWH.setText(String.valueOf(factura.getConsumoKWH()));
            }
        }
    }
}

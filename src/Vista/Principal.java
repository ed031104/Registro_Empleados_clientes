
package Vista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JLabel;

public class Principal extends javax.swing.JPanel {

    
    public Principal() {
        initComponents();
        hora(txthora);
    }
  public void hora(JLabel dateTxt) {      
        LocalDate now = LocalDate.now();        //este codigo sirve para mostrar la fecha//
        Locale SpanishLocale = new Locale("es", "Es");
        dateTxt.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'del' YYYY", SpanishLocale)));
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new Estilos_panel.jpanelEsquinasRedondas();
        jScrollPane1 = new javax.swing.JScrollPane();
        background = new Estilos_panel.jpanelEsquinasRedondas();
        panelBienvenida = new Estilos_panel.jpanelEsquinasRedondas();
        imgBienvenida = new javax.swing.JLabel();
        txthora = new javax.swing.JLabel();
        txtBienvenida = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        panelRegistro = new Estilos_panel.jpanelEsquinasRedondas();
        imgRegistro = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JLabel();
        txtNumRegistro = new javax.swing.JLabel();
        txtTotalResgistro = new javax.swing.JLabel();
        panelFactura = new Estilos_panel.jpanelEsquinasRedondas();
        imgFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JLabel();
        txtTotalFactura = new javax.swing.JLabel();

        jpanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setAutoscrolls(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setAutoscrolls(true);

        panelBienvenida.setBackground(new java.awt.Color(204, 204, 255));

        imgBienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 17.png"))); // NOI18N

        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txthora.setForeground(new java.awt.Color(255, 255, 255));
        txthora.setText("Hoy es {dayname} {day} de {month} de {year}");

        txtBienvenida.setFont(new java.awt.Font("Arial Black", 0, 27)); // NOI18N
        txtBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenida.setText("!Bienvenido, \"Usuario\"!");

        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setText("Este sistema registra empleados y hace factura de luz");

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBienvenidaLayout.createSequentialGroup()
                        .addComponent(txthora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65))
                    .addGroup(panelBienvenidaLayout.createSequentialGroup()
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addComponent(txtBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(imgBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(imgBienvenida))
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txthora)
                .addGap(36, 36, 36)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegistro.setBackground(new java.awt.Color(204, 204, 255));

        imgRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3d-casual-life-candidate-resumes-and-briefcase.png"))); // NOI18N

        txtRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistro.setText("Registro:");

        txtNumRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtNumRegistro.setText("0");

        txtTotalResgistro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTotalResgistro.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalResgistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalResgistro.setText("Total de resgistros");

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txtRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumRegistro)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalResgistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(imgRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(imgRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistro)
                    .addComponent(txtNumRegistro))
                .addGap(12, 12, 12)
                .addComponent(txtTotalResgistro)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelFactura.setBackground(new java.awt.Color(204, 204, 255));
        panelFactura.setPreferredSize(new java.awt.Dimension(181, 185));

        imgFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3d-fluency-bill.png"))); // NOI18N

        txtFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtFactura.setText("Factura");

        txtNumFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtNumFactura.setText("0");

        txtTotalFactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTotalFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalFactura.setText("Total de facturas");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imgFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFactura)
                    .addComponent(txtNumFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(panelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Estilos_panel.jpanelEsquinasRedondas background;
    private javax.swing.JLabel imgBienvenida;
    private javax.swing.JLabel imgFactura;
    private javax.swing.JLabel imgRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private Estilos_panel.jpanelEsquinasRedondas jpanel1;
    private Estilos_panel.jpanelEsquinasRedondas panelBienvenida;
    private Estilos_panel.jpanelEsquinasRedondas panelFactura;
    private Estilos_panel.jpanelEsquinasRedondas panelRegistro;
    public javax.swing.JLabel txtBienvenida;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtFactura;
    public javax.swing.JLabel txtNumFactura;
    public javax.swing.JLabel txtNumRegistro;
    private javax.swing.JLabel txtRegistro;
    private javax.swing.JLabel txtTotalFactura;
    private javax.swing.JLabel txtTotalResgistro;
    public javax.swing.JLabel txthora;
    // End of variables declaration//GEN-END:variables
}

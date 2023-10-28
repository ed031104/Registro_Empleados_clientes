
package Vista;

import Modelo.Factura;

public class FacturaLuz extends javax.swing.JPanel {

    
    public FacturaLuz() {
        initComponents();
        setOpaque(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas2 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas3 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblCuidadPais = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCircuito = new javax.swing.JLabel();
        lblMedidor = new javax.swing.JLabel();
        lblNumeroFactura = new javax.swing.JLabel();
        lblOrdenFactura = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblNumeroNis = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        txtMesFactura = new javax.swing.JTextField();
        txtConsumo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaDetalleFacturacion = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaImporte = new javax.swing.JTextPane();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtConsumoKWH = new javax.swing.JTextField();
        txtDiasFacturados = new javax.swing.JTextField();
        txtReferenciaCobro = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtOficinaComercial = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        txtNumeroMedidor = new javax.swing.JTextField();
        txtLecturaAnterior = new javax.swing.JTextField();
        txtLecturaActual = new javax.swing.JTextField();
        txtMultip = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtTipoConsumo = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jpanelEsquinasRedondas4 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFactura = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(1075, 574));

        jScrollPane3.setBorder(null);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1275, 574));

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelEsquinasRedondas1.setPreferredSize(new java.awt.Dimension(1275, 574));

        jpanelEsquinasRedondas2.setBackground(new java.awt.Color(240, 240, 240));

        jpanelEsquinasRedondas3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Distribuidor de Electricidad desl Sur, S.A.");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/558000000000006_DISSUR_Logo_1.png"))); // NOI18N

        javax.swing.GroupLayout jpanelEsquinasRedondas3Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas3);
        jpanelEsquinasRedondas3.setLayout(jpanelEsquinasRedondas3Layout);
        jpanelEsquinasRedondas3Layout.setHorizontalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(733, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas3Layout.setVerticalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireccionCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccionCliente.setText("Direccion del Cliente");
        jPanel1.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 176, -1));

        lblCuidadPais.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblCuidadPais.setForeground(new java.awt.Color(0, 0, 0));
        lblCuidadPais.setText("Cuidad, Mucipio, País");
        jPanel1.add(lblCuidadPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, 168, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NIS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CIRCUITO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 21, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MEDIDOR:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 41, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("FACTURA  NO.:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 61, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ORDEN DE LECTURA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 81, -1, -1));

        lblCircuito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblCircuito.setForeground(new java.awt.Color(0, 0, 0));
        lblCircuito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCircuito.setText("PDT3040");
        jPanel1.add(lblCircuito, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 130, -1));

        lblMedidor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMedidor.setForeground(new java.awt.Color(0, 0, 0));
        lblMedidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedidor.setText("0");
        jPanel1.add(lblMedidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 130, -1));

        lblNumeroFactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblNumeroFactura.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroFactura.setText("F01029102920293");
        jPanel1.add(lblNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 130, -1));

        lblOrdenFactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblOrdenFactura.setForeground(new java.awt.Color(0, 0, 0));
        lblOrdenFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrdenFactura.setText("2210.22.1220.0556");
        jPanel1.add(lblOrdenFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 130, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ENTREGADO");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 102, 22));

        txtFechaEntrega.setEditable(false);
        txtFechaEntrega.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaEntrega.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtFechaEntrega.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaEntrega.setText("dd/mm/yy");
        txtFechaEntrega.setPreferredSize(new java.awt.Dimension(87, 28));
        txtFechaEntrega.setScrollOffset(17);
        jPanel2.add(txtFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 102, 22));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 42));

        jPanel9.setBackground(new java.awt.Color(255, 204, 153));

        lblNombreCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCliente.setText("Nombre completo del Cliente");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCliente)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 420, -1));

        jPanel10.setBackground(new java.awt.Color(255, 204, 153));

        lblNumeroNis.setBackground(new java.awt.Color(255, 204, 153));
        lblNumeroNis.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNumeroNis.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroNis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroNis.setText("000000");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNumeroNis, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNumeroNis))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 4, 140, 17));

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Mes de la Factura");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 110, -1));

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Consumo");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1, 90, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" Fecha de Emisión");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1, 110, -1));

        txtFechaEmision.setEditable(false);
        txtFechaEmision.setBackground(new java.awt.Color(245, 245, 245));
        txtFechaEmision.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaEmision.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaEmision.setText("dd/mm/yy");
        txtFechaEmision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 19, 110, 21));

        txtMesFactura.setEditable(false);
        txtMesFactura.setBackground(new java.awt.Color(245, 245, 245));
        txtMesFactura.setForeground(new java.awt.Color(0, 0, 0));
        txtMesFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMesFactura.setText("ABRIL");
        txtMesFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtMesFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 19, 109, 21));

        txtConsumo.setEditable(false);
        txtConsumo.setBackground(new java.awt.Color(245, 245, 245));
        txtConsumo.setForeground(new java.awt.Color(0, 0, 0));
        txtConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConsumo.setText("REAL");
        txtConsumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumoActionPerformed(evt);
            }
        });
        jPanel6.add(txtConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 19, 90, 21));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Detalle de facturacción");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 310, -1));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Consumo medio");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 126, -1));

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Últimos:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 21, 50, -1));

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("12 meses");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 21, 60, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Kwh/mes");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 47, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("117");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 47, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("C$/día");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 69, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("56.48");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 69, -1, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 90));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText(" Total Facturado");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 20));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText(" Cuota 0/0");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 20));

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("C$");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 50, 20));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("C$");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 20));

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("C$");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 50, 20));

        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText(" Total a Pagar");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 120, 20));

        jScrollPane4.setBorder(null);

        txaDetalleFacturacion.setBackground(new java.awt.Color(240, 240, 240));
        txaDetalleFacturacion.setColumns(20);
        txaDetalleFacturacion.setRows(5);
        txaDetalleFacturacion.setBorder(null);
        jScrollPane4.setViewportView(txaDetalleFacturacion);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 62, 296, 210));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-teléfono-sin-utilizar-20.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 20, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("125");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ATENCION AL CLIENTE");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, -1));

        jPanel7.setBackground(new java.awt.Color(245, 245, 245));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(" Fecha de Vencimiento");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 182, -1));

        txtFechaVencimiento.setEditable(false);
        txtFechaVencimiento.setBackground(new java.awt.Color(255, 204, 153));
        txtFechaVencimiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaVencimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaVencimiento.setText("dd/mm/yy");
        txtFechaVencimiento.setBorder(null);
        jPanel7.add(txtFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 182, 23));

        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Importe en  c$");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 183, 18));

        jScrollPane2.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane2.setBorder(null);

        txaImporte.setBackground(new java.awt.Color(240, 240, 240));
        txaImporte.setBorder(null);
        jScrollPane2.setViewportView(txaImporte);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 170, 210));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("0.00");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("0.00");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("0.00");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("sansserif", 0, 7)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("ESTA FACTURA SOLO TENDRA VALIDEZ CON LA");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 1, -1, -1));

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 7)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("AUTENTIDAD DE LA OFICINA DE COBRO Y NO");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, -1, -1));

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 7)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("ACREDITA EL PAGO DE LAS ANTERIORES.");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, -1, -1));

        jLabel46.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Consumo (kWh)");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Referencia de cobro");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Días Facturados");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtConsumoKWH.setBackground(new java.awt.Color(255, 204, 153));
        txtConsumoKWH.setForeground(new java.awt.Color(0, 0, 0));
        txtConsumoKWH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConsumoKWH.setText("1");
        txtConsumoKWH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsumoKWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumoKWHActionPerformed(evt);
            }
        });

        txtDiasFacturados.setEditable(false);
        txtDiasFacturados.setBackground(new java.awt.Color(245, 245, 245));
        txtDiasFacturados.setForeground(new java.awt.Color(0, 0, 0));
        txtDiasFacturados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasFacturados.setText("28");
        txtDiasFacturados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtReferenciaCobro.setEditable(false);
        txtReferenciaCobro.setBackground(new java.awt.Color(245, 245, 245));
        txtReferenciaCobro.setForeground(new java.awt.Color(0, 0, 0));
        txtReferenciaCobro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReferenciaCobro.setText("2044292273");
        txtReferenciaCobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Tarifa");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Tipo de consumo");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("No. de Medidor");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Lectura Anterior");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Lectura Actual");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Multip.");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtOficinaComercial.setEditable(false);
        txtOficinaComercial.setBackground(new java.awt.Color(245, 245, 245));
        txtOficinaComercial.setForeground(new java.awt.Color(0, 0, 0));
        txtOficinaComercial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOficinaComercial.setText("MD ORIENTAL");
        txtOficinaComercial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtOficinaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOficinaComercialActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(245, 245, 245));
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("TO BT. DOMESTICO");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        txtNumeroMedidor.setEditable(false);
        txtNumeroMedidor.setBackground(new java.awt.Color(245, 245, 245));
        txtNumeroMedidor.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroMedidor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroMedidor.setText("184201931");
        txtNumeroMedidor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumeroMedidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroMedidorActionPerformed(evt);
            }
        });

        txtLecturaAnterior.setEditable(false);
        txtLecturaAnterior.setBackground(new java.awt.Color(245, 245, 245));
        txtLecturaAnterior.setForeground(new java.awt.Color(0, 0, 0));
        txtLecturaAnterior.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLecturaAnterior.setText("17164");
        txtLecturaAnterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLecturaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecturaAnteriorActionPerformed(evt);
            }
        });

        txtLecturaActual.setEditable(false);
        txtLecturaActual.setBackground(new java.awt.Color(245, 245, 245));
        txtLecturaActual.setForeground(new java.awt.Color(0, 0, 0));
        txtLecturaActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLecturaActual.setText("17502");
        txtLecturaActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLecturaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecturaActualActionPerformed(evt);
            }
        });

        txtMultip.setEditable(false);
        txtMultip.setBackground(new java.awt.Color(245, 245, 245));
        txtMultip.setForeground(new java.awt.Color(0, 0, 0));
        txtMultip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMultip.setText("1");
        txtMultip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMultip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultipActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Oficina Comercial");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel56.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Período de consumo");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTipoConsumo.setEditable(false);
        txtTipoConsumo.setBackground(new java.awt.Color(245, 245, 245));
        txtTipoConsumo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoConsumo.setText("Activa kWh BT");
        txtTipoConsumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTipoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoConsumoActionPerformed(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(245, 245, 245));
        jTextField20.setForeground(new java.awt.Color(0, 0, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Activa kWh BT");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(245, 245, 245));
        jTextField21.setForeground(new java.awt.Color(0, 0, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("22/03/2020-21/04/2020");
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Información complementaria");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel58.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("kW Contratados: 1");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel59.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("0.00");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setFocusable(false);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane6.setViewportView(jTextArea2);

        jLabel60.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("facto de potencia: 0.00");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel61.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Oficina Comercial");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("0.00");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("0.00");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel73.setText("30 días                                            C$");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel74.setText("Arreglo de pago                            C$");
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setText("90 o más días                               C$");
        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("0.00");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel78.setText("60 días                                            C$");
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("0.00");
        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("0.00");
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel81.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel81.setText("     Total Deuda                 C$");
        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled_1.png"))); // NOI18N
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Histórico de Consumo");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpanelEsquinasRedondas2Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas2);
        jpanelEsquinasRedondas2.setLayout(jpanelEsquinasRedondas2Layout);
        jpanelEsquinasRedondas2Layout.setHorizontalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addComponent(txtOficinaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(txtDiasFacturados, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(txtLecturaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(txtConsumoKWH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(txtLecturaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(txtReferenciaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtNumeroMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpanelEsquinasRedondas2Layout.setVerticalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtOficinaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48))
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(160, 160, 160)
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel78)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel73))
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel62))
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel74))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDiasFacturados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel49))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel58))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel76))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel63))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel51))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtLecturaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtConsumoKWH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel60))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtLecturaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel57))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtReferenciaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel55)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel46))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel52))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel50))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel61))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtNumeroMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel80))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel79))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtTipoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel56))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel65))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel54))
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel77))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41)))))
        );

        jpanelEsquinasRedondas4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel45.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Clientes");

        listaFactura.setBackground(new java.awt.Color(204, 204, 255));
        listaFactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        listaFactura.setForeground(new java.awt.Color(255, 255, 255));
        listaFactura.setDoubleBuffered(true);
        jScrollPane1.setViewportView(listaFactura);

        javax.swing.GroupLayout jpanelEsquinasRedondas4Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas4);
        jpanelEsquinasRedondas4.setLayout(jpanelEsquinasRedondas4Layout);
        jpanelEsquinasRedondas4Layout.setHorizontalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas4Layout.setVerticalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jpanelEsquinasRedondas1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoActionPerformed

    private void txtConsumoKWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumoKWHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoKWHActionPerformed

    private void txtOficinaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOficinaComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOficinaComercialActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void txtNumeroMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroMedidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMedidorActionPerformed

    private void txtLecturaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecturaAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLecturaAnteriorActionPerformed

    private void txtLecturaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecturaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLecturaActualActionPerformed

    private void txtMultipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultipActionPerformed

    private void txtTipoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoConsumoActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas2;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas3;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas4;
    public javax.swing.JLabel lblCircuito;
    public javax.swing.JLabel lblCuidadPais;
    public javax.swing.JLabel lblDireccionCliente;
    public javax.swing.JLabel lblMedidor;
    public javax.swing.JLabel lblNombreCliente;
    public javax.swing.JLabel lblNumeroFactura;
    public javax.swing.JLabel lblNumeroNis;
    public javax.swing.JLabel lblOrdenFactura;
    public javax.swing.JList<Factura> listaFactura;
    public javax.swing.JTextArea txaDetalleFacturacion;
    public javax.swing.JTextPane txaImporte;
    public javax.swing.JTextField txtConsumo;
    public javax.swing.JTextField txtConsumoKWH;
    public javax.swing.JTextField txtDiasFacturados;
    public javax.swing.JTextField txtFechaEmision;
    public javax.swing.JTextField txtFechaEntrega;
    public javax.swing.JTextField txtFechaVencimiento;
    public javax.swing.JTextField txtLecturaActual;
    public javax.swing.JTextField txtLecturaAnterior;
    public javax.swing.JTextField txtMesFactura;
    public javax.swing.JTextField txtMultip;
    public javax.swing.JTextField txtNumeroMedidor;
    public javax.swing.JTextField txtOficinaComercial;
    public javax.swing.JTextField txtReferenciaCobro;
    public javax.swing.JTextField txtTipoConsumo;
    // End of variables declaration//GEN-END:variables
}

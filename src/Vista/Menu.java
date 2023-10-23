
package Vista;

import Controlador.menuController;
import java.awt.Color;
import java.io.IOException;

public class Menu extends javax.swing.JFrame {

   
    
    public Menu() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Opcmenu1 = new javax.swing.JMenuItem();
        background = new Estilos_panel.jpanelEsquinasRedondas();
        menu = new Estilos_panel.jpanelEsquinasRedondas();
        bgRegistro = new Estilos_panel.jpanelEsquinasRedondas();
        btnRegistro = new javax.swing.JButton();
        bgFactura = new Estilos_panel.jpanelEsquinasRedondas();
        btnFactura = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        bgPrincipal = new Estilos_panel.jpanelEsquinasRedondas();
        btnPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bgRegistroClientes = new Estilos_panel.jpanelEsquinasRedondas();
        btnRegistroClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bgRegistroFactura = new Estilos_panel.jpanelEsquinasRedondas();
        btnRegistroFactura = new javax.swing.JButton();
        content = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        brnMenu = new javax.swing.JButton();
        panelFoto = new Estilos_panel.jPanelRedondo();
        txtNombre = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();

        popupMenu.setBackground(new java.awt.Color(255, 255, 255));

        Opcmenu1.setBackground(new java.awt.Color(255, 255, 255));
        Opcmenu1.setText("salir");
        popupMenu.add(Opcmenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1400, 693));
        setSize(new java.awt.Dimension(1200, 550));

        background.setBackground(new java.awt.Color(242, 242, 242));

        menu.setBackground(new java.awt.Color(153, 153, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgRegistro.setBackground(new java.awt.Color(153, 153, 255));

        btnRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-registro-30.png"))); // NOI18N
        btnRegistro.setText("Formulario");
        btnRegistro.setBorder(null);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setDefaultCapable(false);
        btnRegistro.setFocusPainted(false);
        btnRegistro.setFocusable(false);
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRegistro.setIconTextGap(8);
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgRegistroLayout = new javax.swing.GroupLayout(bgRegistro);
        bgRegistro.setLayout(bgRegistroLayout);
        bgRegistroLayout.setHorizontalGroup(
            bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgRegistroLayout.setVerticalGroup(
            bgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(bgRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 190, 140, -1));

        bgFactura.setBackground(new java.awt.Color(153, 153, 255));

        btnFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-30.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.setBorder(null);
        btnFactura.setBorderPainted(false);
        btnFactura.setContentAreaFilled(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.setDefaultCapable(false);
        btnFactura.setFocusPainted(false);
        btnFactura.setFocusable(false);
        btnFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFactura.setIconTextGap(8);
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgFacturaLayout = new javax.swing.GroupLayout(bgFactura);
        bgFactura.setLayout(bgFacturaLayout);
        bgFacturaLayout.setHorizontalGroup(
            bgFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFacturaLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgFacturaLayout.setVerticalGroup(
            bgFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(bgFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 135, -1));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled.png"))); // NOI18N
        menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 135, 45));

        bgPrincipal.setBackground(new java.awt.Color(153, 153, 255));

        btnPrincipal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-página-principal-30.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(null);
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setDefaultCapable(false);
        btnPrincipal.setFocusPainted(false);
        btnPrincipal.setFocusable(false);
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setIconTextGap(8);
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipalLayout = new javax.swing.GroupLayout(bgPrincipal);
        bgPrincipal.setLayout(bgPrincipalLayout);
        bgPrincipalLayout.setHorizontalGroup(
            bgPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );
        bgPrincipalLayout.setVerticalGroup(
            bgPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(bgPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 135, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Datos");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 74, -1));

        bgRegistroClientes.setBackground(new java.awt.Color(153, 153, 255));

        btnRegistroClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnRegistroClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-clientes-30.png"))); // NOI18N
        btnRegistroClientes.setText("Clientes");
        btnRegistroClientes.setBorder(null);
        btnRegistroClientes.setBorderPainted(false);
        btnRegistroClientes.setContentAreaFilled(false);
        btnRegistroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroClientes.setDefaultCapable(false);
        btnRegistroClientes.setFocusPainted(false);
        btnRegistroClientes.setFocusable(false);
        btnRegistroClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRegistroClientes.setIconTextGap(8);
        btnRegistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegistroClientesLayout = new javax.swing.GroupLayout(bgRegistroClientes);
        bgRegistroClientes.setLayout(bgRegistroClientesLayout);
        bgRegistroClientesLayout.setHorizontalGroup(
            bgRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistroClientesLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgRegistroClientesLayout.setVerticalGroup(
            bgRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistroClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(bgRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Registro");
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 74, -1));

        bgRegistroFactura.setBackground(new java.awt.Color(153, 153, 255));

        btnRegistroFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnRegistroFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-factura-31.png"))); // NOI18N
        btnRegistroFactura.setText("Factura");
        btnRegistroFactura.setBorder(null);
        btnRegistroFactura.setBorderPainted(false);
        btnRegistroFactura.setContentAreaFilled(false);
        btnRegistroFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroFactura.setDefaultCapable(false);
        btnRegistroFactura.setFocusPainted(false);
        btnRegistroFactura.setFocusable(false);
        btnRegistroFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRegistroFactura.setIconTextGap(8);
        btnRegistroFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroFacturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegistroFacturaLayout = new javax.swing.GroupLayout(bgRegistroFactura);
        bgRegistroFactura.setLayout(bgRegistroFacturaLayout);
        bgRegistroFacturaLayout.setHorizontalGroup(
            bgRegistroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistroFacturaLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(btnRegistroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgRegistroFacturaLayout.setVerticalGroup(
            bgRegistroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistroFacturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(bgRegistroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));

        brnMenu.setBackground(new java.awt.Color(255, 255, 255));
        brnMenu.setFont(new java.awt.Font("sansserif", 0, 27)); // NOI18N
        brnMenu.setForeground(new java.awt.Color(153, 153, 255));
        brnMenu.setText("☰");
        brnMenu.setBorder(null);
        brnMenu.setBorderPainted(false);
        brnMenu.setContentAreaFilled(false);
        brnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnMenuActionPerformed(evt);
            }
        });

        panelFoto.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombre.setText("Nombre");

        txtCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtCargo.setForeground(new java.awt.Color(153, 153, 153));
        txtCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCargo.setText("Cargo");

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnMenu)
                    .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                            .addComponent(txtNombre)
                            .addGap(0, 0, 0)
                            .addComponent(txtCargo))))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap(786, Short.MAX_VALUE)
                        .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(837, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        bgRegistro.setBackground(new Color(102,102,255));    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        bgRegistro.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseEntered
        bgFactura.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btnFacturaMouseEntered

    private void btnFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseExited
        bgFactura.setBackground(new Color(153,153,255));    }//GEN-LAST:event_btnFacturaMouseExited

    private void brnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnMenuActionPerformed

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        bgPrincipal.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        bgPrincipal.setBackground(new Color(153,153,255));                                          
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnRegistroClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroClientesMouseEntered
        bgRegistroClientes.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btnRegistroClientesMouseEntered

    private void btnRegistroClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroClientesMouseExited
         bgRegistroClientes.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_btnRegistroClientesMouseExited

    private void btnRegistroFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroFacturaMouseEntered
        bgRegistroFactura.setBackground(new Color(102,102,255));

    }//GEN-LAST:event_btnRegistroFacturaMouseEntered

    private void btnRegistroFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroFacturaMouseExited
         bgRegistroFactura.setBackground(new Color(153,153,255));

    }//GEN-LAST:event_btnRegistroFacturaMouseExited

    
    public static void main(String[] args) throws IOException {
        Menu vista = new Menu();
        
        //Abre el frame principal "Menu" y se inicializa sun controlador 
        menuController controller = new menuController(vista);
        controller.iniciar();
        vista.setVisible(true);
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Logo;
    public javax.swing.JMenuItem Opcmenu1;
    private Estilos_panel.jpanelEsquinasRedondas background;
    public Estilos_panel.jpanelEsquinasRedondas bgFactura;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal;
    public Estilos_panel.jpanelEsquinasRedondas bgRegistro;
    public Estilos_panel.jpanelEsquinasRedondas bgRegistroClientes;
    public Estilos_panel.jpanelEsquinasRedondas bgRegistroFactura;
    public javax.swing.JButton brnMenu;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnPrincipal;
    public javax.swing.JButton btnRegistro;
    public javax.swing.JButton btnRegistroClientes;
    public javax.swing.JButton btnRegistroFactura;
    public Estilos_panel.jpanelEsquinasRedondas content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas menu;
    public Estilos_panel.jPanelRedondo panelFoto;
    public javax.swing.JPopupMenu popupMenu;
    public javax.swing.JLabel txtCargo;
    public javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}

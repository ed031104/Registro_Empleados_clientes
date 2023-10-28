

package Vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JPanel {

     
    
    public Register() {
        initComponents();
    }


    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jpanel1 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanel2 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas4 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel1 = new javax.swing.JLabel();
        jpanelEsquinasRedondas5 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        puestoEjercer = new javax.swing.JTextField();
        descripcionPuesto = new javax.swing.JTextField();
        jpanelEsquinasRedondas6 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        FechaSolicitudEmpleo = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        SueldoMensualDeseado = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SueldoMensualAutorizado = new javax.swing.JTextField();
        jpanelEsquinasRedondas7 = new Estilos_panel.jpanelEsquinasRedondas();
        fotoEmpleado = new javax.swing.JLabel();
        fotoEmpleadoBtn = new javax.swing.JButton();
        jpanel5 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas8 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel2 = new javax.swing.JLabel();
        jpanelEsquinasRedondas9 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombresEmpleado = new javax.swing.JTextField();
        apellidoPaternoEmpleado = new javax.swing.JTextField();
        apellidoMaternoEmpleado = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        domicilioEmpleado = new javax.swing.JTextField();
        coloniaEmpleado = new javax.swing.JTextField();
        telefonoEmpleado = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fechaNacimientoEmpleado = new com.toedter.calendar.JDateChooser();
        viveSoloEmpleado = new javax.swing.JRadioButton();
        viveConPadresEmpleado = new javax.swing.JRadioButton();
        viveConFamiliaEmpleado = new javax.swing.JRadioButton();
        viveConParientesEmpleado = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        MunicipioEmpleado = new javax.swing.JTextField();
        codigoPostalEmpleado = new javax.swing.JTextField();
        lugarNacimientoEmpleado = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        padresDependenEmpleado = new javax.swing.JRadioButton();
        familiaDependeEmpleado = new javax.swing.JRadioButton();
        parientesDependeEmpleado = new javax.swing.JRadioButton();
        nadieDependeEmpleado = new javax.swing.JRadioButton();
        casadoEmpleado = new javax.swing.JRadioButton();
        otroEmpleado = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        solteroEmpleado = new javax.swing.JRadioButton();
        jTextField27 = new javax.swing.JTextField();
        estaturaEmpleado = new javax.swing.JTextField();
        pesoEmpleado = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        EmailEmpleado = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        operadorTelefonoEmpleado = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        edadEmpleado = new javax.swing.JTextField();
        SexoEmpleado = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpanel4 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas11 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel5 = new javax.swing.JLabel();
        jpanelEsquinasRedondas12 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        RegContribuyenteEmpleado = new javax.swing.JTextField();
        claveRegistroPoblacionEmpleado = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        aforeEmpleado = new javax.swing.JTextField();
        numeroPasaporteEmpleado = new javax.swing.JTextField();
        numeroSocialEmpleado = new javax.swing.JTextField();
        numeroCartillaMilitarEmpleado = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        licenciaManejoEmpleado = new javax.swing.JTextField();
        tipoNumeroLicenciaEmpleado = new javax.swing.JTextField();
        DocumentoExtranjeroEmpleado = new javax.swing.JTextField();
        jpanel6 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas13 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel23 = new javax.swing.JLabel();
        jpanelEsquinasRedondas14 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        estadoSaludEmpleado = new javax.swing.JTextField();
        padeceEnfemedadEmpleado = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        pasatiempoEmpleado = new javax.swing.JTextField();
        metaVidaEmpleado = new javax.swing.JTextField();
        practicaDeporteEmpleado = new javax.swing.JTextField();
        clubSocialEmpleado = new javax.swing.JTextField();
        jpanel7 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas15 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel25 = new javax.swing.JLabel();
        jpanelEsquinasRedondas16 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        nombrePadreEmpleado = new javax.swing.JTextField();
        vivePadreEmpleado = new javax.swing.JTextField();
        domicilioPadreEmpleado = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        FinadoPadreEmpleado = new javax.swing.JTextField();
        ocupacionPadreEmpleado = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        nombreMadreEmpleado = new javax.swing.JTextField();
        viveMadreEmpleado = new javax.swing.JTextField();
        FinadoMadreEmpleado = new javax.swing.JTextField();
        domicilioMadreEmpleado = new javax.swing.JTextField();
        ocupacionMadreEmpleado = new javax.swing.JTextField();
        domicilioConyugueEmpleado = new javax.swing.JTextField();
        FinadoConyugueEmpleado = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        nombreConyugueEmpleado = new javax.swing.JTextField();
        ocupacionConyugueEmpleado = new javax.swing.JTextField();
        viveConyugueEmpleado = new javax.swing.JTextField();
        jpanel8 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas17 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel47 = new javax.swing.JLabel();
        jpanelEsquinasRedondas18 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel15 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        nombrePrimariaEmpleado = new javax.swing.JTextField();
        fechaIngresoPrimariaEmpleado = new javax.swing.JTextField();
        domicilioPrimariaEmpleado = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        fechaEgresoPrimariaEmpleado = new javax.swing.JTextField();
        recibioTituloPrimariaEmpleado = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        nombreSecundariaEmpleado = new javax.swing.JTextField();
        fechaIngresoSecundariaEmpleado = new javax.swing.JTextField();
        fechaEgresoSecundariaEmpleado = new javax.swing.JTextField();
        domicilioSecundariaEmpleado = new javax.swing.JTextField();
        recibioTituloSecundariaEmpleado = new javax.swing.JTextField();
        domicilioPreparatoriaEmpleado = new javax.swing.JTextField();
        fechaEgresoPreparatoriaEmpleado = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        nombrePreparatoriaEmpleado = new javax.swing.JTextField();
        recibioTituloPreparatoriaEmpleado = new javax.swing.JTextField();
        fechaIngresoPreparatoriaEmpleado = new javax.swing.JTextField();
        añosPrimariaEmpleado = new javax.swing.JTextField();
        añosSecundariaEmpleado = new javax.swing.JTextField();
        añosPreparatoriaEmpleado = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        NombreComercialEmpleado = new javax.swing.JTextField();
        domicilioComercialEmpleado = new javax.swing.JTextField();
        fechaIngresoComercialEmpleado = new javax.swing.JTextField();
        fechaEgresoComercialEmpleado = new javax.swing.JTextField();
        añosComercialEmpleado = new javax.swing.JTextField();
        recibioTituloComercialEmpleado = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        NombreEstudioActualEMpleado = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        horarioActualEsudioEmpleado = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        nombreCursoActualEmpleado = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        gradoCursoActualEmpleado = new javax.swing.JTextField();
        jpanel9 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas19 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel71 = new javax.swing.JLabel();
        jpanelEsquinasRedondas20 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel17 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        IdiomaEMpleado = new javax.swing.JTextField();
        FuncionDominaEmpleado = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        MaquinasOficinaEMpleado = new javax.swing.JTextField();
        SofwareDominaEmpleado = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        otrasFuncionesDominaEmpleado = new javax.swing.JTextField();
        jpanel10 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas21 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel75 = new javax.swing.JLabel();
        jpanelEsquinasRedondas22 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel26 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        ingresoEmpleoActualEmpleado = new javax.swing.JTextField();
        nombreCompañiaActualEmpleado = new javax.swing.JTextField();
        nombreCompañiaAnterior1Empleado = new javax.swing.JTextField();
        nombreCompañiaAnterior2Empleado = new javax.swing.JTextField();
        nombreCompañiaAnterior3Empleado = new javax.swing.JTextField();
        domicilioEmpleoActualEmpleado = new javax.swing.JTextField();
        domicilioEmpleoAnterior1Empleado = new javax.swing.JTextField();
        domicilioEmpleoAnterior2Empleado = new javax.swing.JTextField();
        domicilioEmpleoAnterior3Empleado = new javax.swing.JTextField();
        suledoMensualInicialEmpleoActualEmpleado = new javax.swing.JTextField();
        suledoMensualInicialEmpleoAnterior1Empleado = new javax.swing.JTextField();
        suledoMensualInicialEmpleoAnterior2Empleado = new javax.swing.JTextField();
        telefonoEmpleoAnterior3Empleado = new javax.swing.JTextField();
        suledoMensualFinalEmpleoActualEmpleado = new javax.swing.JTextField();
        suledoMensualFinalEmpleoAnterior1Empleado = new javax.swing.JTextField();
        suledoMensualFinalEmpleoAnterior2Empleado = new javax.swing.JTextField();
        suledoMensualFinalEmpleoAnterior3Empleado = new javax.swing.JTextField();
        telefonoEmpleoActualEmpleado = new javax.swing.JTextField();
        telefonoEmpleoAnterior2Empleado = new javax.swing.JTextField();
        telefonoEmpleoAnterior1Empleado = new javax.swing.JTextField();
        MotivoSeparaciónEmpleoActualEmpleado = new javax.swing.JTextField();
        MotivoSeparaciónEmpleoAnterior3Empleado = new javax.swing.JTextField();
        MotivoSeparaciónEmpleoAnterior2Empleado = new javax.swing.JTextField();
        MotivoSeparaciónEmpleoAnterior1Empleado = new javax.swing.JTextField();
        nombreJefeDirectoEmpleoActualEMpleado = new javax.swing.JTextField();
        nombreJefeDirectoEmpleoAnterior1EMpleado = new javax.swing.JTextField();
        nombreJefeDirectoEmpleoAnterior2EMpleado = new javax.swing.JTextField();
        puestoJefeDirectoEmpleoActualEmpleado = new javax.swing.JTextField();
        puestoJefeDirectoEmpleoAnterior1Empleado = new javax.swing.JTextField();
        puestoJefeDirectoEmpleoAnterior2Empleado = new javax.swing.JTextField();
        puestoJefeDirectoEmpleoAnterior3Empleado = new javax.swing.JTextField();
        porqueNoDiraMotivoSeparacionActualTrabajo = new javax.swing.JTextField();
        NoDiraMotivoSeoparacionActualTrabajoEmpleado = new javax.swing.JRadioButton();
        siDiraMotivoSeperacioTrabajoActualEmpleado = new javax.swing.JRadioButton();
        MotivoSeparacionActualTrabajoEmpleado = new javax.swing.JTextField();
        siDiraMotivoSeperacioTrabajoAnterior1Empleado = new javax.swing.JRadioButton();
        NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado = new javax.swing.JRadioButton();
        MotivoSeparacionAnterior1TrabajoEmpleado = new javax.swing.JTextField();
        porqueNoDiraMotivoSeparacionAnterior1Trabajo = new javax.swing.JTextField();
        siDiraMotivoSeperacioTrabajoAnterior2Empleado = new javax.swing.JRadioButton();
        NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado = new javax.swing.JRadioButton();
        MotivoSeparacionAnterior2TrabajoEmpleado = new javax.swing.JTextField();
        porqueNoDiraMotivoSeparacionAnterior2Trabajo = new javax.swing.JTextField();
        siDiraMotivoSeperacioTrabajoAnterior3Empleado = new javax.swing.JRadioButton();
        NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado = new javax.swing.JRadioButton();
        MotivoSeparacionAnterior3TrabajoEmpleado = new javax.swing.JTextField();
        porqueNoDiraMotivoSeparacionAnterior3Trabajo = new javax.swing.JTextField();
        egresoEmpleoActualEmpleado = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        ingresoEmpleoAnterior1Empleado = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        egresoEmpleoAnterior1Empleado = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        ingresoEmpleoAnterior2Empleado = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        egresoEmpleoAnterior2Empleado = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        ingresoEmpleoAnterior3Empleado = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        egresoEmpleoAnterior3Empleado = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        nombreJefeDirectoEmpleoAnterior3EMpleado = new javax.swing.JTextField();
        suledoMensualInicialEmpleoAnterior3Empleado = new javax.swing.JTextField();
        jpanel12 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas24 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel106 = new javax.swing.JLabel();
        jpanelEsquinasRedondas25 = new Estilos_panel.jpanelEsquinasRedondas();
        jPanel28 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jTextField67 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jTextField155 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField157 = new javax.swing.JTextField();
        jTextField161 = new javax.swing.JTextField();
        jTextField162 = new javax.swing.JTextField();
        jTextField163 = new javax.swing.JTextField();
        jTextField164 = new javax.swing.JTextField();
        jTextField166 = new javax.swing.JTextField();
        jpanelEsquinasRedondas3 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas10 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel110 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jTextField165 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel115 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel116 = new javax.swing.JLabel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jLabel117 = new javax.swing.JLabel();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel118 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jLabel119 = new javax.swing.JLabel();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel120 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jpanelEsquinasRedondas26 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas27 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jTextField167 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jLabel124 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel125 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jTextField168 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jTextField169 = new javax.swing.JTextField();
        jTextField170 = new javax.swing.JTextField();
        jTextField171 = new javax.swing.JTextField();
        jTextField172 = new javax.swing.JTextField();
        jTextField173 = new javax.swing.JTextField();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jTextField176 = new javax.swing.JTextField();
        jpanelEsquinasRedondas28 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas29 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel137 = new javax.swing.JLabel();
        jTextField177 = new javax.swing.JTextField();
        jpanelEsquinasRedondas30 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel138 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jpanelEsquinasRedondas31 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas32 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel139 = new javax.swing.JLabel();
        jTextField178 = new javax.swing.JTextField();
        jTextField179 = new javax.swing.JTextField();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 1800));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 3200));

        jpanel1.setBackground(new java.awt.Color(255, 255, 255));
        jpanel1.setPreferredSize(new java.awt.Dimension(1241, 4290));

        jpanel2.setBackground(new java.awt.Color(240, 240, 240));
        jpanel2.setBorder(null);

        jpanelEsquinasRedondas4.setBackground(new java.awt.Color(189, 189, 250));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SOLICITUD DE EMPLEO");

        javax.swing.GroupLayout jpanelEsquinasRedondas4Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas4);
        jpanelEsquinasRedondas4.setLayout(jpanelEsquinasRedondas4Layout);
        jpanelEsquinasRedondas4Layout.setHorizontalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas4Layout.setVerticalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas5.setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(217, 217, 246));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Puesto Solicitado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        puestoEjercer.setBackground(new java.awt.Color(255, 255, 255));
        puestoEjercer.setForeground(new java.awt.Color(204, 204, 204));
        puestoEjercer.setText("Ingresa el puesto que quieras solicitar");
        puestoEjercer.setBorder(null);

        descripcionPuesto.setBackground(new java.awt.Color(255, 255, 255));
        descripcionPuesto.setForeground(new java.awt.Color(204, 204, 204));
        descripcionPuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcionPuesto.setText("Ingresa el puesto que deseas");
        descripcionPuesto.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas5Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas5);
        jpanelEsquinasRedondas5.setLayout(jpanelEsquinasRedondas5Layout);
        jpanelEsquinasRedondas5Layout.setHorizontalGroup(
            jpanelEsquinasRedondas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpanelEsquinasRedondas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puestoEjercer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpanelEsquinasRedondas5Layout.setVerticalGroup(
            jpanelEsquinasRedondas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(puestoEjercer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas6.setBackground(new java.awt.Color(240, 240, 240));

        jPanel3.setBackground(new java.awt.Color(217, 217, 246));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        FechaSolicitudEmpleo.setBackground(new java.awt.Color(255, 255, 255));
        FechaSolicitudEmpleo.setBorder(null);
        FechaSolicitudEmpleo.setToolTipText("");

        jPanel5.setBackground(new java.awt.Color(217, 217, 246));
        jPanel5.setPreferredSize(new java.awt.Dimension(190, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Sueldo Mensual Deseado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        SueldoMensualDeseado.setBackground(new java.awt.Color(255, 255, 255));
        SueldoMensualDeseado.setForeground(new java.awt.Color(204, 204, 204));
        SueldoMensualDeseado.setText("C$");
        SueldoMensualDeseado.setBorder(null);

        jPanel10.setBackground(new java.awt.Color(217, 217, 246));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sueldo Mensual autorizado");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        SueldoMensualAutorizado.setBackground(new java.awt.Color(255, 255, 255));
        SueldoMensualAutorizado.setForeground(new java.awt.Color(204, 204, 204));
        SueldoMensualAutorizado.setText("C$");
        SueldoMensualAutorizado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas6Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas6);
        jpanelEsquinasRedondas6.setLayout(jpanelEsquinasRedondas6Layout);
        jpanelEsquinasRedondas6Layout.setHorizontalGroup(
            jpanelEsquinasRedondas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(SueldoMensualAutorizado)
                    .addComponent(SueldoMensualDeseado)
                    .addComponent(FechaSolicitudEmpleo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpanelEsquinasRedondas6Layout.setVerticalGroup(
            jpanelEsquinasRedondas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaSolicitudEmpleo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SueldoMensualDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SueldoMensualAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas7.setBackground(new java.awt.Color(240, 240, 240));

        fotoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fotoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoEmpleado.setText("FOTOGRAFIA");
        fotoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        fotoEmpleadoBtn.setBackground(new java.awt.Color(204, 204, 255));
        fotoEmpleadoBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fotoEmpleadoBtn.setForeground(new java.awt.Color(255, 255, 255));
        fotoEmpleadoBtn.setText("Añadir");
        fotoEmpleadoBtn.setBorder(null);
        fotoEmpleadoBtn.setBorderPainted(false);
        fotoEmpleadoBtn.setDefaultCapable(false);
        fotoEmpleadoBtn.setFocusPainted(false);
        fotoEmpleadoBtn.setFocusable(false);
        fotoEmpleadoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoEmpleadoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelEsquinasRedondas7Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas7);
        jpanelEsquinasRedondas7.setLayout(jpanelEsquinasRedondas7Layout);
        jpanelEsquinasRedondas7Layout.setHorizontalGroup(
            jpanelEsquinasRedondas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelEsquinasRedondas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelEsquinasRedondas7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fotoEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(fotoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas7Layout.setVerticalGroup(
            jpanelEsquinasRedondas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(fotoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fotoEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jpanelEsquinasRedondas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jpanelEsquinasRedondas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(jpanelEsquinasRedondas5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelEsquinasRedondas6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpanelEsquinasRedondas7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jpanel5.setBackground(new java.awt.Color(240, 240, 240));
        jpanel5.setBorder(null);

        jpanelEsquinasRedondas8.setBackground(new java.awt.Color(189, 189, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos personales");

        javax.swing.GroupLayout jpanelEsquinasRedondas8Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas8);
        jpanelEsquinasRedondas8.setLayout(jpanelEsquinasRedondas8Layout);
        jpanelEsquinasRedondas8Layout.setHorizontalGroup(
            jpanelEsquinasRedondas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas8Layout.setVerticalGroup(
            jpanelEsquinasRedondas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas9.setBackground(new java.awt.Color(240, 240, 240));

        jPanel11.setBackground(new java.awt.Color(217, 217, 246));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Vive con:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de nacimiento");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nombresEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombresEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombresEmpleado.setBorder(null);

        apellidoPaternoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaternoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        apellidoPaternoEmpleado.setBorder(null);

        apellidoMaternoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaternoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        apellidoMaternoEmpleado.setBorder(null);

        jPanel13.setBackground(new java.awt.Color(217, 217, 246));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Apellido Paterno");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nombres (s)");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Apellido Materno");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10))
        );

        domicilioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioEmpleado.setBorder(null);

        coloniaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        coloniaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        coloniaEmpleado.setBorder(null);

        telefonoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        telefonoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEmpleado.setBorder(null);

        jPanel14.setBackground(new java.awt.Color(217, 217, 246));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Municipio");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Código postal");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lugar de Nacimiento");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11))
        );

        fechaNacimientoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaNacimientoEmpleado.setBorder(null);
        fechaNacimientoEmpleado.setToolTipText("");

        viveSoloEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        viveSoloEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        viveSoloEmpleado.setText("Solo");

        viveConPadresEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        viveConPadresEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        viveConPadresEmpleado.setText("Padres");

        viveConFamiliaEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        viveConFamiliaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        viveConFamiliaEmpleado.setText("Familia");

        viveConParientesEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        viveConParientesEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        viveConParientesEmpleado.setText("Parientes");

        jPanel22.setBackground(new java.awt.Color(217, 217, 246));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Domicilio (calle y número)");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Colonia");

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Teléfono");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MunicipioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MunicipioEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MunicipioEmpleado.setBorder(null);

        codigoPostalEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        codigoPostalEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        codigoPostalEmpleado.setBorder(null);

        lugarNacimientoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        lugarNacimientoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        lugarNacimientoEmpleado.setBorder(null);

        jPanel12.setBackground(new java.awt.Color(217, 217, 246));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Personas que dependen de usted:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        padresDependenEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        padresDependenEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        padresDependenEmpleado.setText("Padres");

        familiaDependeEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        familiaDependeEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        familiaDependeEmpleado.setText("Familia");

        parientesDependeEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        parientesDependeEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        parientesDependeEmpleado.setText("Parientes");

        nadieDependeEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nadieDependeEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        nadieDependeEmpleado.setText("Solo");

        casadoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        casadoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        casadoEmpleado.setText("Casado");

        otroEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        otroEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        otroEmpleado.setText("Otro");

        jPanel23.setBackground(new java.awt.Color(217, 217, 246));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Estado Civil:");
        jLabel30.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        solteroEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        solteroEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        solteroEmpleado.setText("Soltero");

        jTextField27.setBackground(new java.awt.Color(255, 255, 255));
        jTextField27.setForeground(new java.awt.Color(204, 204, 204));
        jTextField27.setBorder(null);

        estaturaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        estaturaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        estaturaEmpleado.setBorder(null);

        pesoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        pesoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        pesoEmpleado.setBorder(null);

        jPanel24.setBackground(new java.awt.Color(217, 217, 246));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Estatura");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Peso");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel33)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EmailEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        EmailEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        EmailEmpleado.setBorder(null);

        jPanel21.setBackground(new java.awt.Color(217, 217, 246));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Correo electrónico");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        operadorTelefonoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        operadorTelefonoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        operadorTelefonoEmpleado.setBorder(null);
        operadorTelefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorTelefonoEmpleadoActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(217, 217, 246));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Operador de Télefono");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        edadEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        edadEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        edadEmpleado.setBorder(null);

        SexoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        SexoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        SexoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "36 tipos de gei" }));
        SexoEmpleado.setBorder(null);

        jPanel19.setBackground(new java.awt.Color(217, 217, 246));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Edad");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sexo");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpanelEsquinasRedondas9Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas9);
        jpanelEsquinasRedondas9.setLayout(jpanelEsquinasRedondas9Layout);
        jpanelEsquinasRedondas9Layout.setHorizontalGroup(
            jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(padresDependenEmpleado)
                        .addGap(17, 17, 17)
                        .addComponent(familiaDependeEmpleado)
                        .addGap(13, 13, 13)
                        .addComponent(parientesDependeEmpleado)
                        .addGap(21, 21, 21)
                        .addComponent(nadieDependeEmpleado))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(apellidoPaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellidoMaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombresEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(MunicipioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoPostalEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lugarNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(domicilioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coloniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(viveConPadresEmpleado)
                        .addGap(28, 28, 28)
                        .addComponent(viveConFamiliaEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(viveSoloEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(viveConParientesEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(edadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operadorTelefonoEmpleado)
                            .addComponent(EmailEmpleado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(estaturaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addComponent(pesoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas9Layout.createSequentialGroup()
                                .addComponent(solteroEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(casadoEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otroEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jpanelEsquinasRedondas9Layout.setVerticalGroup(
            jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoPaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoMaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombresEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(domicilioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MunicipioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoPostalEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lugarNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(viveConPadresEmpleado)
                                .addComponent(viveConFamiliaEmpleado)
                                .addComponent(viveSoloEmpleado)
                                .addComponent(viveConParientesEmpleado)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(padresDependenEmpleado)
                            .addComponent(familiaDependeEmpleado)
                            .addComponent(parientesDependeEmpleado)
                            .addComponent(nadieDependeEmpleado)))
                    .addGroup(jpanelEsquinasRedondas9Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(operadorTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estaturaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelEsquinasRedondas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(solteroEmpleado)
                                .addComponent(casadoEmpleado)
                                .addComponent(otroEmpleado))
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jpanel5Layout = new javax.swing.GroupLayout(jpanel5);
        jpanel5.setLayout(jpanel5Layout);
        jpanel5Layout.setHorizontalGroup(
            jpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpanelEsquinasRedondas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanel5Layout.setVerticalGroup(
            jpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel5Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas9, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanel4.setBackground(new java.awt.Color(240, 240, 240));
        jpanel4.setBorder(null);

        jpanelEsquinasRedondas11.setBackground(new java.awt.Color(189, 189, 250));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Documentación");

        javax.swing.GroupLayout jpanelEsquinasRedondas11Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas11);
        jpanelEsquinasRedondas11.setLayout(jpanelEsquinasRedondas11Layout);
        jpanelEsquinasRedondas11Layout.setHorizontalGroup(
            jpanelEsquinasRedondas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas11Layout.setVerticalGroup(
            jpanelEsquinasRedondas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas12.setBackground(new java.awt.Color(240, 240, 240));

        jPanel2.setBackground(new java.awt.Color(217, 217, 246));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Reg.Fed. de Contribuyentes");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Clave Única de Registro de Población (CURP)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        RegContribuyenteEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        RegContribuyenteEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        RegContribuyenteEmpleado.setBorder(null);

        claveRegistroPoblacionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        claveRegistroPoblacionEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        claveRegistroPoblacionEmpleado.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(217, 217, 246));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Número de Seguridad Social");

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Número de Pasaporte");

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("AFORE");

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Número de Cartilla Militar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        aforeEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        aforeEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        aforeEmpleado.setBorder(null);

        numeroPasaporteEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        numeroPasaporteEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        numeroPasaporteEmpleado.setBorder(null);

        numeroSocialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        numeroSocialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        numeroSocialEmpleado.setBorder(null);

        numeroCartillaMilitarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        numeroCartillaMilitarEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        numeroCartillaMilitarEmpleado.setBorder(null);

        jPanel8.setBackground(new java.awt.Color(217, 217, 246));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Licencia de Manejo");

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Si es extranjero cuenta que documento le permite laborar en el país");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Número de Licencia");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel40)
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        licenciaManejoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        licenciaManejoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        licenciaManejoEmpleado.setBorder(null);

        tipoNumeroLicenciaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tipoNumeroLicenciaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        tipoNumeroLicenciaEmpleado.setBorder(null);

        DocumentoExtranjeroEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        DocumentoExtranjeroEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        DocumentoExtranjeroEmpleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas12Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas12);
        jpanelEsquinasRedondas12.setLayout(jpanelEsquinasRedondas12Layout);
        jpanelEsquinasRedondas12Layout.setHorizontalGroup(
            jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas12Layout.createSequentialGroup()
                .addGroup(jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas12Layout.createSequentialGroup()
                                .addComponent(RegContribuyenteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(claveRegistroPoblacionEmpleado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas12Layout.createSequentialGroup()
                                .addComponent(numeroSocialEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(aforeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroPasaporteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroCartillaMilitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas12Layout.createSequentialGroup()
                                .addComponent(licenciaManejoEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(tipoNumeroLicenciaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DocumentoExtranjeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelEsquinasRedondas12Layout.setVerticalGroup(
            jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas12Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegContribuyenteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveRegistroPoblacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aforeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPasaporteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCartillaMilitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSocialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoNumeroLicenciaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocumentoExtranjeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenciaManejoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel4Layout = new javax.swing.GroupLayout(jpanel4);
        jpanel4.setLayout(jpanel4Layout);
        jpanel4Layout.setHorizontalGroup(
            jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelEsquinasRedondas11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanel4Layout.setVerticalGroup(
            jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel4Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanelEsquinasRedondas12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel6.setBackground(new java.awt.Color(240, 240, 240));
        jpanel6.setBorder(null);

        jpanelEsquinasRedondas13.setBackground(new java.awt.Color(189, 189, 250));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Estado de salud y Hábitos Personales");

        javax.swing.GroupLayout jpanelEsquinasRedondas13Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas13);
        jpanelEsquinasRedondas13.setLayout(jpanelEsquinasRedondas13Layout);
        jpanelEsquinasRedondas13Layout.setHorizontalGroup(
            jpanelEsquinasRedondas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas13Layout.setVerticalGroup(
            jpanelEsquinasRedondas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas14.setBackground(new java.awt.Color(240, 240, 240));

        jPanel4.setBackground(new java.awt.Color(217, 217, 246));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("¿Cómo considera su estado de salud actual?");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("¿padece de una enfermedad crónica? ¿Cúal?");

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("¿Perteneces a un club social o deportivo?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        estadoSaludEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        estadoSaludEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        estadoSaludEmpleado.setBorder(null);

        padeceEnfemedadEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        padeceEnfemedadEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        padeceEnfemedadEmpleado.setBorder(null);

        jPanel9.setBackground(new java.awt.Color(217, 217, 246));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("¿Practica Usted algún deporte?");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("¿Cuá es su meta en la vidad?");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("¿Cuál es su pasatiempo favorito?");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pasatiempoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        pasatiempoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        pasatiempoEmpleado.setBorder(null);

        metaVidaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        metaVidaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        metaVidaEmpleado.setBorder(null);

        practicaDeporteEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        practicaDeporteEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        practicaDeporteEmpleado.setBorder(null);

        clubSocialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        clubSocialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        clubSocialEmpleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas14Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas14);
        jpanelEsquinasRedondas14.setLayout(jpanelEsquinasRedondas14Layout);
        jpanelEsquinasRedondas14Layout.setHorizontalGroup(
            jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                        .addComponent(estadoSaludEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(padeceEnfemedadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clubSocialEmpleado))
                    .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                        .addComponent(practicaDeporteEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(pasatiempoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(metaVidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanelEsquinasRedondas14Layout.setVerticalGroup(
            jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoSaludEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padeceEnfemedadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubSocialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasatiempoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metaVidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(practicaDeporteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel6Layout = new javax.swing.GroupLayout(jpanel6);
        jpanel6.setLayout(jpanel6Layout);
        jpanel6Layout.setHorizontalGroup(
            jpanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelEsquinasRedondas14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanel6Layout.setVerticalGroup(
            jpanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel6Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel7.setBackground(new java.awt.Color(240, 240, 240));
        jpanel7.setBorder(null);

        jpanelEsquinasRedondas15.setBackground(new java.awt.Color(189, 189, 250));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Datos familiares");

        javax.swing.GroupLayout jpanelEsquinasRedondas15Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas15);
        jpanelEsquinasRedondas15.setLayout(jpanelEsquinasRedondas15Layout);
        jpanelEsquinasRedondas15Layout.setHorizontalGroup(
            jpanelEsquinasRedondas15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas15Layout.setVerticalGroup(
            jpanelEsquinasRedondas15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas16.setBackground(new java.awt.Color(240, 240, 240));

        jPanel6.setBackground(new java.awt.Color(217, 217, 246));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Nombre");

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Vive");

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Finado");

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Domicilio");

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Ocupación");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nombrePadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombrePadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombrePadreEmpleado.setBorder(null);

        vivePadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        vivePadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        vivePadreEmpleado.setBorder(null);

        domicilioPadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioPadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioPadreEmpleado.setBorder(null);

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("padre:");

        FinadoPadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        FinadoPadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        FinadoPadreEmpleado.setBorder(null);

        ocupacionPadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        ocupacionPadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        ocupacionPadreEmpleado.setBorder(null);

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Madre:");

        nombreMadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreMadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreMadreEmpleado.setBorder(null);

        viveMadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        viveMadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        viveMadreEmpleado.setBorder(null);

        FinadoMadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        FinadoMadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        FinadoMadreEmpleado.setBorder(null);

        domicilioMadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioMadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioMadreEmpleado.setBorder(null);

        ocupacionMadreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        ocupacionMadreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        ocupacionMadreEmpleado.setBorder(null);

        domicilioConyugueEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioConyugueEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioConyugueEmpleado.setBorder(null);

        FinadoConyugueEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        FinadoConyugueEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        FinadoConyugueEmpleado.setBorder(null);

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Conyugue:");

        nombreConyugueEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreConyugueEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreConyugueEmpleado.setBorder(null);

        ocupacionConyugueEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        ocupacionConyugueEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        ocupacionConyugueEmpleado.setBorder(null);

        viveConyugueEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        viveConyugueEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        viveConyugueEmpleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas16Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas16);
        jpanelEsquinasRedondas16.setLayout(jpanelEsquinasRedondas16Layout);
        jpanelEsquinasRedondas16Layout.setHorizontalGroup(
            jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombrePadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vivePadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FinadoPadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas16Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(29, 29, 29)))
                        .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                                .addComponent(nombreMadreEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(viveMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FinadoMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                                .addComponent(nombreConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viveConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FinadoConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(domicilioPadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ocupacionConyugueEmpleado)
                    .addComponent(ocupacionMadreEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocupacionPadreEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jpanelEsquinasRedondas16Layout.setVerticalGroup(
            jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vivePadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioPadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinadoPadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocupacionPadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viveMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinadoMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocupacionMadreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viveConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinadoConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocupacionConyugueEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel7Layout = new javax.swing.GroupLayout(jpanel7);
        jpanel7.setLayout(jpanel7Layout);
        jpanel7Layout.setHorizontalGroup(
            jpanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelEsquinasRedondas16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanel7Layout.setVerticalGroup(
            jpanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel7Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel8.setBackground(new java.awt.Color(240, 240, 240));
        jpanel8.setBorder(null);

        jpanelEsquinasRedondas17.setBackground(new java.awt.Color(189, 189, 250));

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Escolaridad");

        javax.swing.GroupLayout jpanelEsquinasRedondas17Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas17);
        jpanelEsquinasRedondas17.setLayout(jpanelEsquinasRedondas17Layout);
        jpanelEsquinasRedondas17Layout.setHorizontalGroup(
            jpanelEsquinasRedondas17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas17Layout.setVerticalGroup(
            jpanelEsquinasRedondas17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas18.setBackground(new java.awt.Color(240, 240, 240));

        jPanel15.setBackground(new java.awt.Color(217, 217, 246));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Nombre de la escuela");

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Domicilio");

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Recibió título o certificado");

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Fechas");

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("De");

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("A");

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Años");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addGap(169, 169, 169))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nombrePrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombrePrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombrePrimariaEmpleado.setBorder(null);

        fechaIngresoPrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaIngresoPrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaIngresoPrimariaEmpleado.setBorder(null);

        domicilioPrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioPrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioPrimariaEmpleado.setBorder(null);

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Primaria:");

        fechaEgresoPrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaEgresoPrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaEgresoPrimariaEmpleado.setBorder(null);

        recibioTituloPrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        recibioTituloPrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        recibioTituloPrimariaEmpleado.setBorder(null);

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Secundaria:");

        nombreSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreSecundariaEmpleado.setBorder(null);

        fechaIngresoSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaIngresoSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaIngresoSecundariaEmpleado.setBorder(null);

        fechaEgresoSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaEgresoSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaEgresoSecundariaEmpleado.setBorder(null);

        domicilioSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioSecundariaEmpleado.setBorder(null);

        recibioTituloSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        recibioTituloSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        recibioTituloSecundariaEmpleado.setBorder(null);

        domicilioPreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioPreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioPreparatoriaEmpleado.setBorder(null);

        fechaEgresoPreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaEgresoPreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaEgresoPreparatoriaEmpleado.setBorder(null);

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("Preparatoria:");

        nombrePreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombrePreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombrePreparatoriaEmpleado.setBorder(null);

        recibioTituloPreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        recibioTituloPreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        recibioTituloPreparatoriaEmpleado.setBorder(null);

        fechaIngresoPreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaIngresoPreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaIngresoPreparatoriaEmpleado.setBorder(null);

        añosPrimariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        añosPrimariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        añosPrimariaEmpleado.setBorder(null);

        añosSecundariaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        añosSecundariaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        añosSecundariaEmpleado.setBorder(null);

        añosPreparatoriaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        añosPreparatoriaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        añosPreparatoriaEmpleado.setBorder(null);

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("Escuela:");

        NombreComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        NombreComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        NombreComercialEmpleado.setBorder(null);

        domicilioComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioComercialEmpleado.setBorder(null);

        fechaIngresoComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaIngresoComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaIngresoComercialEmpleado.setBorder(null);

        fechaEgresoComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        fechaEgresoComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        fechaEgresoComercialEmpleado.setBorder(null);

        añosComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        añosComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        añosComercialEmpleado.setBorder(null);

        recibioTituloComercialEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        recibioTituloComercialEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        recibioTituloComercialEmpleado.setBorder(null);

        jPanel16.setBackground(new java.awt.Color(217, 217, 246));

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel66.setText(" Estudios que está efectuando ahorita");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66)
        );

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Comercial:");

        NombreEstudioActualEMpleado.setBackground(new java.awt.Color(255, 255, 255));
        NombreEstudioActualEMpleado.setForeground(new java.awt.Color(204, 204, 204));
        NombreEstudioActualEMpleado.setBorder(null);

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("Horario:");

        horarioActualEsudioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        horarioActualEsudioEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        horarioActualEsudioEmpleado.setBorder(null);

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText("Curso o carrera:");

        nombreCursoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreCursoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreCursoActualEmpleado.setBorder(null);

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel70.setText("Grado");

        gradoCursoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        gradoCursoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        gradoCursoActualEmpleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas18Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas18);
        jpanelEsquinasRedondas18.setLayout(jpanelEsquinasRedondas18Layout);
        jpanelEsquinasRedondas18Layout.setHorizontalGroup(
            jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreEstudioActualEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horarioActualEsudioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreCursoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradoCursoActualEmpleado))
                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombrePrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                        .addComponent(jLabel61)
                                        .addGap(29, 29, 29))
                                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nombreSecundariaEmpleado)
                                    .addComponent(nombrePreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(domicilioSecundariaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(domicilioPrimariaEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(domicilioPreparatoriaEmpleado)
                            .addComponent(domicilioComercialEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addComponent(fechaIngresoPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fechaEgresoPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                    .addComponent(fechaIngresoSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechaEgresoSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                    .addComponent(fechaIngresoPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechaEgresoPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                    .addComponent(fechaIngresoComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechaEgresoComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(añosComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(añosSecundariaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(añosPrimariaEmpleado)))
                            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(añosPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(recibioTituloPreparatoriaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(recibioTituloSecundariaEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recibioTituloPrimariaEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(recibioTituloComercialEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas18Layout.setVerticalGroup(
            jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(domicilioPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recibioTituloPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(domicilioSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recibioTituloSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(domicilioPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recibioTituloPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(domicilioComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recibioTituloComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaIngresoPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaEgresoPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaIngresoSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaEgresoSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaIngresoPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaEgresoPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaIngresoComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaEgresoComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas18Layout.createSequentialGroup()
                        .addComponent(añosPrimariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añosSecundariaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añosPreparatoriaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añosComercialEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreEstudioActualEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioActualEsudioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCursoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradoCursoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel8Layout = new javax.swing.GroupLayout(jpanel8);
        jpanel8.setLayout(jpanel8Layout);
        jpanel8Layout.setHorizontalGroup(
            jpanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel8Layout.createSequentialGroup()
                .addGroup(jpanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelEsquinasRedondas17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanel8Layout.createSequentialGroup()
                        .addComponent(jpanelEsquinasRedondas18, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanel8Layout.setVerticalGroup(
            jpanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel8Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanel9.setBackground(new java.awt.Color(240, 240, 240));
        jpanel9.setBorder(null);

        jpanelEsquinasRedondas19.setBackground(new java.awt.Color(189, 189, 250));

        jLabel71.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Conocimientos Generales");

        javax.swing.GroupLayout jpanelEsquinasRedondas19Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas19);
        jpanelEsquinasRedondas19.setLayout(jpanelEsquinasRedondas19Layout);
        jpanelEsquinasRedondas19Layout.setHorizontalGroup(
            jpanelEsquinasRedondas19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas19Layout.setVerticalGroup(
            jpanelEsquinasRedondas19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas20.setBackground(new java.awt.Color(240, 240, 240));

        jPanel17.setBackground(new java.awt.Color(217, 217, 246));

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Idiomas que habla (a parte del nativo)   (indique su nivel 50%, 75%, 100%)");

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Funciones de oficina que domina");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        IdiomaEMpleado.setBackground(new java.awt.Color(255, 255, 255));
        IdiomaEMpleado.setForeground(new java.awt.Color(204, 204, 204));
        IdiomaEMpleado.setBorder(null);

        FuncionDominaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        FuncionDominaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        FuncionDominaEmpleado.setBorder(null);

        jPanel18.setBackground(new java.awt.Color(217, 217, 246));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Máquinas de oficina o taller que sepa manejar");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Software que domina");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MaquinasOficinaEMpleado.setBackground(new java.awt.Color(255, 255, 255));
        MaquinasOficinaEMpleado.setForeground(new java.awt.Color(204, 204, 204));
        MaquinasOficinaEMpleado.setBorder(null);

        SofwareDominaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        SofwareDominaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        SofwareDominaEmpleado.setBorder(null);

        jPanel25.setBackground(new java.awt.Color(217, 217, 246));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel78.setText("  Otras funciones que domina");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        otrasFuncionesDominaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        otrasFuncionesDominaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        otrasFuncionesDominaEmpleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas20Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas20);
        jpanelEsquinasRedondas20.setLayout(jpanelEsquinasRedondas20Layout);
        jpanelEsquinasRedondas20Layout.setHorizontalGroup(
            jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas20Layout.createSequentialGroup()
                        .addComponent(IdiomaEMpleado)
                        .addGap(18, 18, 18)
                        .addComponent(FuncionDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jpanelEsquinasRedondas20Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas20Layout.createSequentialGroup()
                                .addComponent(MaquinasOficinaEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SofwareDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(otrasFuncionesDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelEsquinasRedondas20Layout.setVerticalGroup(
            jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas20Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdiomaEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuncionDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SofwareDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaquinasOficinaEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otrasFuncionesDominaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel9Layout = new javax.swing.GroupLayout(jpanel9);
        jpanel9.setLayout(jpanel9Layout);
        jpanel9Layout.setHorizontalGroup(
            jpanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel9Layout.createSequentialGroup()
                .addGroup(jpanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelEsquinasRedondas20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelEsquinasRedondas19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanel9Layout.setVerticalGroup(
            jpanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel9Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpanel10.setBackground(new java.awt.Color(240, 240, 240));
        jpanel10.setBorder(null);

        jpanelEsquinasRedondas21.setBackground(new java.awt.Color(189, 189, 250));

        jLabel75.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Empleo actual y anteriores");

        javax.swing.GroupLayout jpanelEsquinasRedondas21Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas21);
        jpanelEsquinasRedondas21.setLayout(jpanelEsquinasRedondas21Layout);
        jpanelEsquinasRedondas21Layout.setHorizontalGroup(
            jpanelEsquinasRedondas21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas21Layout.setVerticalGroup(
            jpanelEsquinasRedondas21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpanelEsquinasRedondas22.setBackground(new java.awt.Color(240, 240, 240));

        jPanel26.setBackground(new java.awt.Color(217, 217, 246));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Empleo actual o último");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Empleo anterior");

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("Empleo anterior");

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Empleo anterior");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ingresoEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        ingresoEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        ingresoEmpleoActualEmpleado.setBorder(null);

        nombreCompañiaActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreCompañiaActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreCompañiaActualEmpleado.setBorder(null);

        nombreCompañiaAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreCompañiaAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreCompañiaAnterior1Empleado.setBorder(null);

        nombreCompañiaAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreCompañiaAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreCompañiaAnterior2Empleado.setBorder(null);

        nombreCompañiaAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreCompañiaAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreCompañiaAnterior3Empleado.setBorder(null);

        domicilioEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioEmpleoActualEmpleado.setBorder(null);

        domicilioEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioEmpleoAnterior1Empleado.setBorder(null);

        domicilioEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioEmpleoAnterior2Empleado.setBorder(null);

        domicilioEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        domicilioEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        domicilioEmpleoAnterior3Empleado.setBorder(null);

        suledoMensualInicialEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualInicialEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualInicialEmpleoActualEmpleado.setBorder(null);

        suledoMensualInicialEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualInicialEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualInicialEmpleoAnterior1Empleado.setBorder(null);

        suledoMensualInicialEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualInicialEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualInicialEmpleoAnterior2Empleado.setBorder(null);

        telefonoEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        telefonoEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEmpleoAnterior3Empleado.setBorder(null);

        suledoMensualFinalEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualFinalEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualFinalEmpleoActualEmpleado.setBorder(null);

        suledoMensualFinalEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualFinalEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualFinalEmpleoAnterior1Empleado.setBorder(null);

        suledoMensualFinalEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualFinalEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualFinalEmpleoAnterior2Empleado.setBorder(null);

        suledoMensualFinalEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualFinalEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualFinalEmpleoAnterior3Empleado.setBorder(null);

        telefonoEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        telefonoEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEmpleoActualEmpleado.setBorder(null);

        telefonoEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        telefonoEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEmpleoAnterior2Empleado.setBorder(null);

        telefonoEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        telefonoEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEmpleoAnterior1Empleado.setBorder(null);

        MotivoSeparaciónEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparaciónEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparaciónEmpleoActualEmpleado.setBorder(null);

        MotivoSeparaciónEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparaciónEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparaciónEmpleoAnterior3Empleado.setBorder(null);

        MotivoSeparaciónEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparaciónEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparaciónEmpleoAnterior2Empleado.setBorder(null);

        MotivoSeparaciónEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparaciónEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparaciónEmpleoAnterior1Empleado.setBorder(null);

        nombreJefeDirectoEmpleoActualEMpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreJefeDirectoEmpleoActualEMpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreJefeDirectoEmpleoActualEMpleado.setBorder(null);

        nombreJefeDirectoEmpleoAnterior1EMpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreJefeDirectoEmpleoAnterior1EMpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreJefeDirectoEmpleoAnterior1EMpleado.setBorder(null);

        nombreJefeDirectoEmpleoAnterior2EMpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreJefeDirectoEmpleoAnterior2EMpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreJefeDirectoEmpleoAnterior2EMpleado.setBorder(null);

        puestoJefeDirectoEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        puestoJefeDirectoEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        puestoJefeDirectoEmpleoActualEmpleado.setBorder(null);

        puestoJefeDirectoEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        puestoJefeDirectoEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        puestoJefeDirectoEmpleoAnterior1Empleado.setBorder(null);

        puestoJefeDirectoEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        puestoJefeDirectoEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        puestoJefeDirectoEmpleoAnterior2Empleado.setBorder(null);

        puestoJefeDirectoEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        puestoJefeDirectoEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        puestoJefeDirectoEmpleoAnterior3Empleado.setBorder(null);

        porqueNoDiraMotivoSeparacionActualTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        porqueNoDiraMotivoSeparacionActualTrabajo.setForeground(new java.awt.Color(204, 204, 204));
        porqueNoDiraMotivoSeparacionActualTrabajo.setBorder(null);

        NoDiraMotivoSeoparacionActualTrabajoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NoDiraMotivoSeoparacionActualTrabajoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        NoDiraMotivoSeoparacionActualTrabajoEmpleado.setText("No");

        siDiraMotivoSeperacioTrabajoActualEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siDiraMotivoSeperacioTrabajoActualEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        siDiraMotivoSeperacioTrabajoActualEmpleado.setText("Si");

        MotivoSeparacionActualTrabajoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparacionActualTrabajoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparacionActualTrabajoEmpleado.setBorder(null);

        siDiraMotivoSeperacioTrabajoAnterior1Empleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siDiraMotivoSeperacioTrabajoAnterior1Empleado.setForeground(new java.awt.Color(0, 0, 0));
        siDiraMotivoSeperacioTrabajoAnterior1Empleado.setText("Si");

        NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado.setText("No");

        MotivoSeparacionAnterior1TrabajoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparacionAnterior1TrabajoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparacionAnterior1TrabajoEmpleado.setBorder(null);

        porqueNoDiraMotivoSeparacionAnterior1Trabajo.setBackground(new java.awt.Color(255, 255, 255));
        porqueNoDiraMotivoSeparacionAnterior1Trabajo.setForeground(new java.awt.Color(204, 204, 204));
        porqueNoDiraMotivoSeparacionAnterior1Trabajo.setBorder(null);

        siDiraMotivoSeperacioTrabajoAnterior2Empleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siDiraMotivoSeperacioTrabajoAnterior2Empleado.setForeground(new java.awt.Color(0, 0, 0));
        siDiraMotivoSeperacioTrabajoAnterior2Empleado.setText("Si");

        NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado.setText("No");

        MotivoSeparacionAnterior2TrabajoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparacionAnterior2TrabajoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparacionAnterior2TrabajoEmpleado.setBorder(null);

        porqueNoDiraMotivoSeparacionAnterior2Trabajo.setBackground(new java.awt.Color(255, 255, 255));
        porqueNoDiraMotivoSeparacionAnterior2Trabajo.setForeground(new java.awt.Color(204, 204, 204));
        porqueNoDiraMotivoSeparacionAnterior2Trabajo.setBorder(null);

        siDiraMotivoSeperacioTrabajoAnterior3Empleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siDiraMotivoSeperacioTrabajoAnterior3Empleado.setForeground(new java.awt.Color(0, 0, 0));
        siDiraMotivoSeperacioTrabajoAnterior3Empleado.setText("Si");

        NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado.setText("No");

        MotivoSeparacionAnterior3TrabajoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        MotivoSeparacionAnterior3TrabajoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        MotivoSeparacionAnterior3TrabajoEmpleado.setBorder(null);

        porqueNoDiraMotivoSeparacionAnterior3Trabajo.setBackground(new java.awt.Color(255, 255, 255));
        porqueNoDiraMotivoSeparacionAnterior3Trabajo.setForeground(new java.awt.Color(204, 204, 204));
        porqueNoDiraMotivoSeparacionAnterior3Trabajo.setBorder(null);

        egresoEmpleoActualEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        egresoEmpleoActualEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        egresoEmpleoActualEmpleado.setBorder(null);

        jLabel85.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("A:");

        jLabel98.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("De:");

        jLabel99.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("De:");

        ingresoEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        ingresoEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        ingresoEmpleoAnterior1Empleado.setBorder(null);

        jLabel100.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("A:");

        egresoEmpleoAnterior1Empleado.setBackground(new java.awt.Color(255, 255, 255));
        egresoEmpleoAnterior1Empleado.setForeground(new java.awt.Color(204, 204, 204));
        egresoEmpleoAnterior1Empleado.setBorder(null);

        jLabel101.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("De:");

        ingresoEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        ingresoEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        ingresoEmpleoAnterior2Empleado.setBorder(null);

        jLabel102.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("A:");

        egresoEmpleoAnterior2Empleado.setBackground(new java.awt.Color(255, 255, 255));
        egresoEmpleoAnterior2Empleado.setForeground(new java.awt.Color(204, 204, 204));
        egresoEmpleoAnterior2Empleado.setBorder(null);

        jLabel103.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("De:");

        ingresoEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        ingresoEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        ingresoEmpleoAnterior3Empleado.setBorder(null);

        jLabel104.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setText("A:");

        egresoEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        egresoEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        egresoEmpleoAnterior3Empleado.setBorder(null);

        jPanel27.setBackground(new java.awt.Color(240, 240, 240));

        jPanel29.setBackground(new java.awt.Color(217, 217, 246));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Tiempo que preto su servicios");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(217, 217, 246));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Nombre de la compañía");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(217, 217, 246));

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Domicilio");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel36.setBackground(new java.awt.Color(217, 217, 246));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("teléfono");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel33.setBackground(new java.awt.Color(217, 217, 246));

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Mensual");

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Sueldo");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(18, 18, 18))
        );

        jPanel34.setBackground(new java.awt.Color(217, 217, 246));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Inicial");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel35.setBackground(new java.awt.Color(217, 217, 246));

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Final");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel37.setBackground(new java.awt.Color(217, 217, 246));

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Motivo de su separación");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel38.setBackground(new java.awt.Color(217, 217, 246));

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Nombre de su jefe directo");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel41.setBackground(new java.awt.Color(217, 217, 246));

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Puesto de su jefe directo");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel43.setBackground(new java.awt.Color(217, 217, 246));

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Motivo de su separación");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        nombreJefeDirectoEmpleoAnterior3EMpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreJefeDirectoEmpleoAnterior3EMpleado.setForeground(new java.awt.Color(204, 204, 204));
        nombreJefeDirectoEmpleoAnterior3EMpleado.setBorder(null);

        suledoMensualInicialEmpleoAnterior3Empleado.setBackground(new java.awt.Color(255, 255, 255));
        suledoMensualInicialEmpleoAnterior3Empleado.setForeground(new java.awt.Color(204, 204, 204));
        suledoMensualInicialEmpleoAnterior3Empleado.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas22Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas22);
        jpanelEsquinasRedondas22.setLayout(jpanelEsquinasRedondas22Layout);
        jpanelEsquinasRedondas22Layout.setHorizontalGroup(
            jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel98)
                                .addGap(10, 10, 10)
                                .addComponent(ingresoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel85)
                                .addGap(8, 8, 8)
                                .addComponent(egresoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel99)
                                .addGap(10, 10, 10)
                                .addComponent(ingresoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel100)
                                .addGap(8, 8, 8)
                                .addComponent(egresoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel101)
                                .addGap(10, 10, 10)
                                .addComponent(ingresoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel102)
                                .addGap(8, 8, 8)
                                .addComponent(egresoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingresoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(egresoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(MotivoSeparaciónEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(MotivoSeparaciónEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(MotivoSeparaciónEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(MotivoSeparaciónEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                    .addComponent(suledoMensualFinalEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualFinalEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualFinalEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualFinalEmpleoAnterior3Empleado))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                    .addComponent(nombreCompañiaActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreCompañiaAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreCompañiaAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreCompañiaAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                    .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(telefonoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                            .addComponent(domicilioEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(domicilioEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(domicilioEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(domicilioEmpleoAnterior3Empleado)
                                        .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                            .addComponent(telefonoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                    .addComponent(suledoMensualInicialEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualInicialEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualInicialEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(suledoMensualInicialEmpleoAnterior3Empleado)))
                            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                        .addComponent(NoDiraMotivoSeoparacionActualTrabajoEmpleado)
                                        .addGap(9, 9, 9)
                                        .addComponent(porqueNoDiraMotivoSeparacionActualTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado)
                                        .addGap(9, 9, 9)
                                        .addComponent(porqueNoDiraMotivoSeparacionAnterior1Trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado)
                                        .addGap(9, 9, 9)
                                        .addComponent(porqueNoDiraMotivoSeparacionAnterior2Trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado)
                                        .addGap(9, 9, 9)
                                        .addComponent(porqueNoDiraMotivoSeparacionAnterior3Trabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                        .addComponent(telefonoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(telefonoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                        .addComponent(siDiraMotivoSeperacioTrabajoActualEmpleado)
                                        .addGap(16, 16, 16)
                                        .addComponent(MotivoSeparacionActualTrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(siDiraMotivoSeperacioTrabajoAnterior1Empleado)
                                        .addGap(16, 16, 16)
                                        .addComponent(MotivoSeparacionAnterior1TrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(siDiraMotivoSeperacioTrabajoAnterior2Empleado)
                                        .addGap(16, 16, 16)
                                        .addComponent(MotivoSeparacionAnterior2TrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(siDiraMotivoSeperacioTrabajoAnterior3Empleado)
                                        .addGap(16, 16, 16)
                                        .addComponent(MotivoSeparacionAnterior3TrabajoEmpleado))
                                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                        .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                                .addComponent(puestoJefeDirectoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addComponent(puestoJefeDirectoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(puestoJefeDirectoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                                                .addComponent(nombreJefeDirectoEmpleoActualEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addComponent(nombreJefeDirectoEmpleoAnterior1EMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(nombreJefeDirectoEmpleoAnterior2EMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(23, 23, 23)
                                        .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(puestoJefeDirectoEmpleoAnterior3Empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(nombreJefeDirectoEmpleoAnterior3EMpleado, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(53, 53, 53)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpanelEsquinasRedondas22Layout.setVerticalGroup(
            jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas22Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas22Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egresoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egresoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egresoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ingresoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(egresoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreCompañiaActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCompañiaAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCompañiaAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCompañiaAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(domicilioEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domicilioEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefonoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suledoMensualInicialEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suledoMensualInicialEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suledoMensualInicialEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suledoMensualInicialEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suledoMensualFinalEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suledoMensualFinalEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suledoMensualFinalEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suledoMensualFinalEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MotivoSeparaciónEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotivoSeparaciónEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotivoSeparaciónEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotivoSeparaciónEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJefeDirectoEmpleoActualEMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJefeDirectoEmpleoAnterior1EMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreJefeDirectoEmpleoAnterior2EMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreJefeDirectoEmpleoAnterior3EMpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puestoJefeDirectoEmpleoActualEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puestoJefeDirectoEmpleoAnterior1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puestoJefeDirectoEmpleoAnterior2Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puestoJefeDirectoEmpleoAnterior3Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siDiraMotivoSeperacioTrabajoActualEmpleado)
                    .addComponent(MotivoSeparacionActualTrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siDiraMotivoSeperacioTrabajoAnterior1Empleado)
                    .addComponent(MotivoSeparacionAnterior1TrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siDiraMotivoSeperacioTrabajoAnterior2Empleado)
                    .addComponent(MotivoSeparacionAnterior2TrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siDiraMotivoSeperacioTrabajoAnterior3Empleado)
                    .addComponent(MotivoSeparacionAnterior3TrabajoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelEsquinasRedondas22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoDiraMotivoSeoparacionActualTrabajoEmpleado)
                    .addComponent(porqueNoDiraMotivoSeparacionActualTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado)
                    .addComponent(porqueNoDiraMotivoSeparacionAnterior1Trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado)
                    .addComponent(porqueNoDiraMotivoSeparacionAnterior2Trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado)
                    .addComponent(porqueNoDiraMotivoSeparacionAnterior3Trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jpanel10Layout = new javax.swing.GroupLayout(jpanel10);
        jpanel10.setLayout(jpanel10Layout);
        jpanel10Layout.setHorizontalGroup(
            jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel10Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpanelEsquinasRedondas21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanel10Layout.setVerticalGroup(
            jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel10Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel12.setBackground(new java.awt.Color(240, 240, 240));
        jpanel12.setBorder(null);

        jpanelEsquinasRedondas24.setBackground(new java.awt.Color(189, 189, 250));

        jLabel106.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Referencias personales");

        javax.swing.GroupLayout jpanelEsquinasRedondas24Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas24);
        jpanelEsquinasRedondas24.setLayout(jpanelEsquinasRedondas24Layout);
        jpanelEsquinasRedondas24Layout.setHorizontalGroup(
            jpanelEsquinasRedondas24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas24Layout.setVerticalGroup(
            jpanelEsquinasRedondas24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas25.setBackground(new java.awt.Color(240, 240, 240));

        jPanel28.setBackground(new java.awt.Color(217, 217, 246));

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Nombre");

        jLabel108.setBackground(new java.awt.Color(255, 255, 255));
        jLabel108.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Teléfono");

        jLabel109.setBackground(new java.awt.Color(255, 255, 255));
        jLabel109.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("Tiempo de conocerlo");

        jLabel111.setBackground(new java.awt.Color(255, 255, 255));
        jLabel111.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("Domicilio");

        jLabel112.setBackground(new java.awt.Color(255, 255, 255));
        jLabel112.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("Ocupacion");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTextField67.setBackground(new java.awt.Color(255, 255, 255));
        jTextField67.setForeground(new java.awt.Color(204, 204, 204));
        jTextField67.setBorder(null);

        jTextField83.setBackground(new java.awt.Color(255, 255, 255));
        jTextField83.setForeground(new java.awt.Color(204, 204, 204));
        jTextField83.setBorder(null);

        jTextField84.setBackground(new java.awt.Color(255, 255, 255));
        jTextField84.setForeground(new java.awt.Color(204, 204, 204));
        jTextField84.setBorder(null);

        jTextField89.setBackground(new java.awt.Color(255, 255, 255));
        jTextField89.setForeground(new java.awt.Color(204, 204, 204));
        jTextField89.setBorder(null);

        jTextField91.setBackground(new java.awt.Color(255, 255, 255));
        jTextField91.setForeground(new java.awt.Color(204, 204, 204));
        jTextField91.setBorder(null);

        jTextField92.setBackground(new java.awt.Color(255, 255, 255));
        jTextField92.setForeground(new java.awt.Color(204, 204, 204));
        jTextField92.setBorder(null);

        jTextField149.setBackground(new java.awt.Color(255, 255, 255));
        jTextField149.setForeground(new java.awt.Color(204, 204, 204));
        jTextField149.setBorder(null);

        jTextField150.setBackground(new java.awt.Color(255, 255, 255));
        jTextField150.setForeground(new java.awt.Color(204, 204, 204));
        jTextField150.setBorder(null);

        jTextField151.setBackground(new java.awt.Color(255, 255, 255));
        jTextField151.setForeground(new java.awt.Color(204, 204, 204));
        jTextField151.setBorder(null);

        jTextField152.setBackground(new java.awt.Color(255, 255, 255));
        jTextField152.setForeground(new java.awt.Color(204, 204, 204));
        jTextField152.setBorder(null);

        jTextField153.setBackground(new java.awt.Color(255, 255, 255));
        jTextField153.setForeground(new java.awt.Color(204, 204, 204));
        jTextField153.setBorder(null);

        jTextField154.setBackground(new java.awt.Color(255, 255, 255));
        jTextField154.setForeground(new java.awt.Color(204, 204, 204));
        jTextField154.setBorder(null);

        jTextField155.setBackground(new java.awt.Color(255, 255, 255));
        jTextField155.setForeground(new java.awt.Color(204, 204, 204));
        jTextField155.setBorder(null);

        jTextField156.setBackground(new java.awt.Color(255, 255, 255));
        jTextField156.setForeground(new java.awt.Color(204, 204, 204));
        jTextField156.setBorder(null);

        jTextField157.setBackground(new java.awt.Color(255, 255, 255));
        jTextField157.setForeground(new java.awt.Color(204, 204, 204));
        jTextField157.setBorder(null);

        jTextField161.setBackground(new java.awt.Color(255, 255, 255));
        jTextField161.setForeground(new java.awt.Color(204, 204, 204));
        jTextField161.setBorder(null);

        jTextField162.setBackground(new java.awt.Color(255, 255, 255));
        jTextField162.setForeground(new java.awt.Color(204, 204, 204));
        jTextField162.setBorder(null);

        jTextField163.setBackground(new java.awt.Color(255, 255, 255));
        jTextField163.setForeground(new java.awt.Color(204, 204, 204));
        jTextField163.setBorder(null);

        jTextField164.setBackground(new java.awt.Color(255, 255, 255));
        jTextField164.setForeground(new java.awt.Color(204, 204, 204));
        jTextField164.setBorder(null);

        jTextField166.setBackground(new java.awt.Color(255, 255, 255));
        jTextField166.setForeground(new java.awt.Color(204, 204, 204));
        jTextField166.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas25Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas25);
        jpanelEsquinasRedondas25.setLayout(jpanelEsquinasRedondas25Layout);
        jpanelEsquinasRedondas25Layout.setHorizontalGroup(
            jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField84, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jTextField151)
                    .addComponent(jTextField153)
                    .addComponent(jTextField162))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField149)
                    .addComponent(jTextField157)
                    .addComponent(jTextField163)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField154, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jTextField164))))
                .addGap(41, 41, 41)
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField166, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas25Layout.setVerticalGroup(
            jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelEsquinasRedondas25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelEsquinasRedondas25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanel12Layout = new javax.swing.GroupLayout(jpanel12);
        jpanel12.setLayout(jpanel12Layout);
        jpanel12Layout.setHorizontalGroup(
            jpanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel12Layout.createSequentialGroup()
                .addGroup(jpanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelEsquinasRedondas25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelEsquinasRedondas24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanel12Layout.setVerticalGroup(
            jpanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel12Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanelEsquinasRedondas3.setBackground(new java.awt.Color(240, 240, 240));

        jpanelEsquinasRedondas10.setBackground(new java.awt.Color(204, 204, 255));

        jLabel110.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("Datos generales");

        javax.swing.GroupLayout jpanelEsquinasRedondas10Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas10);
        jpanelEsquinasRedondas10.setLayout(jpanelEsquinasRedondas10Layout);
        jpanelEsquinasRedondas10Layout.setHorizontalGroup(
            jpanelEsquinasRedondas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelEsquinasRedondas10Layout.setVerticalGroup(
            jpanelEsquinasRedondas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel113.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 0));
        jLabel113.setText("¿Tienes parientes trabajando en esta empresa?");

        jRadioButton20.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton20.setText("Anuncio");

        jRadioButton21.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton21.setText("Internet");

        jRadioButton22.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton22.setText("Otro");

        jTextField165.setBackground(new java.awt.Color(255, 255, 255));
        jTextField165.setForeground(new java.awt.Color(204, 204, 204));
        jTextField165.setBorder(null);

        jLabel114.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 0));
        jLabel114.setText("Como supo del empleo");

        jRadioButton23.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton23.setText("Sí");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erformed(evt);
            }
        });

        jRadioButton24.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton24.setText("No");

        jLabel115.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("¿Haz estado afiliado a algún sindicato?");

        jRadioButton25.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton25.setText("Sí");

        jRadioButton26.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton26.setText("No");

        jLabel116.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("¿Tienes disponibilidad de horarios?");

        jRadioButton27.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton27.setText("Sí");

        jRadioButton28.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton28.setText("No");

        jLabel117.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("¿Tienes Provlemas de transporte/trasnlado?");

        jRadioButton29.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton29.setText("Sí");

        jRadioButton30.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton30.setText("No");

        jLabel118.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setText("¿Disposición de viajar?");

        jRadioButton31.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton31.setText("Sí");

        jRadioButton32.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton32.setText("No");

        jLabel119.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("¿Disponibilidad a cambiar su lugar de residencia?");

        jRadioButton33.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton33.setText("Sí");

        jRadioButton34.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton34.setText("No");

        jLabel120.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Fecha en que se podría presentar a trabajar");

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setBorder(null);
        jDateChooser3.setToolTipText("");

        javax.swing.GroupLayout jpanelEsquinasRedondas3Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas3);
        jpanelEsquinasRedondas3.setLayout(jpanelEsquinasRedondas3Layout);
        jpanelEsquinasRedondas3Layout.setHorizontalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField165))
                    .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton24))
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton26))
                            .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton28))
                            .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton30))
                            .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton32))
                            .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                                .addComponent(jRadioButton33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton34))
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelEsquinasRedondas3Layout.setVerticalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24))
                .addGap(18, 18, 18)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26))
                .addGap(18, 18, 18)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28))
                .addGap(18, 18, 18)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30))
                .addGap(18, 18, 18)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32))
                .addGap(18, 18, 18)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34))
                .addGap(18, 18, 18)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas26.setBackground(new java.awt.Color(240, 240, 240));

        jpanelEsquinasRedondas27.setBackground(new java.awt.Color(204, 204, 255));

        jLabel121.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("Datos enconómicos");

        javax.swing.GroupLayout jpanelEsquinasRedondas27Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas27);
        jpanelEsquinasRedondas27.setLayout(jpanelEsquinasRedondas27Layout);
        jpanelEsquinasRedondas27Layout.setHorizontalGroup(
            jpanelEsquinasRedondas27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelEsquinasRedondas27Layout.setVerticalGroup(
            jpanelEsquinasRedondas27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel122.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("¿Su conyugue trabaja?");

        jRadioButton36.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton36.setText("No");

        jRadioButton37.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton37.setText("Sí");

        jTextField167.setBackground(new java.awt.Color(255, 255, 255));
        jTextField167.setForeground(new java.awt.Color(204, 204, 204));
        jTextField167.setBorder(null);

        jLabel123.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("¿Tiene usted otros ingresos?");

        jRadioButton38.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton38.setText("No");

        jRadioButton39.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton39.setText("Sí");

        jLabel124.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(0, 0, 0));
        jLabel124.setText("¿Vive en casa propia?");

        jRadioButton40.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton40.setText("No");

        jRadioButton41.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton41.setText("Sí");

        jLabel125.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(0, 0, 0));
        jLabel125.setText("¿Paga renta?");

        jRadioButton42.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton42.setText("No");

        jRadioButton43.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton43.setText("Sí");

        jLabel126.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setText("¿Tienes automóvil propio?");

        jLabel127.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 0));
        jLabel127.setText("¿Tiene deudas? ¿Con quién?");

        jLabel128.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 0, 0));
        jLabel128.setText("¿Cuánto abona mensualmente?");

        jLabel129.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("¿A cuánto ascienden sus gastos mensuales?");

        jTextField168.setBackground(new java.awt.Color(255, 255, 255));
        jTextField168.setForeground(new java.awt.Color(204, 204, 204));
        jTextField168.setBorder(null);

        jLabel130.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Importe mensual");

        jLabel131.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setText("Percepción Mensual");

        jLabel132.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(0, 0, 0));
        jLabel132.setText("Valor Aproximado");

        jLabel133.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 0));
        jLabel133.setText("Importe");

        jLabel134.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 0));

        jLabel135.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(0, 0, 0));
        jLabel135.setText("Importe");

        jLabel136.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(0, 0, 0));
        jLabel136.setText("Importe");

        jTextField169.setBackground(new java.awt.Color(255, 255, 255));
        jTextField169.setForeground(new java.awt.Color(204, 204, 204));
        jTextField169.setBorder(null);

        jTextField170.setBackground(new java.awt.Color(255, 255, 255));
        jTextField170.setForeground(new java.awt.Color(204, 204, 204));
        jTextField170.setBorder(null);

        jTextField171.setBackground(new java.awt.Color(255, 255, 255));
        jTextField171.setForeground(new java.awt.Color(204, 204, 204));
        jTextField171.setBorder(null);

        jTextField172.setBackground(new java.awt.Color(255, 255, 255));
        jTextField172.setForeground(new java.awt.Color(204, 204, 204));
        jTextField172.setBorder(null);

        jTextField173.setBackground(new java.awt.Color(255, 255, 255));
        jTextField173.setForeground(new java.awt.Color(204, 204, 204));
        jTextField173.setBorder(null);

        jTextField174.setBackground(new java.awt.Color(255, 255, 255));
        jTextField174.setForeground(new java.awt.Color(204, 204, 204));
        jTextField174.setBorder(null);

        jTextField175.setBackground(new java.awt.Color(255, 255, 255));
        jTextField175.setForeground(new java.awt.Color(204, 204, 204));
        jTextField175.setBorder(null);

        jRadioButton44.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton44.setText("Sí");

        jRadioButton45.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton45.setText("No");

        jRadioButton46.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton46.setText("Sí");

        jRadioButton47.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton47.setText("No");

        jTextField176.setBackground(new java.awt.Color(255, 255, 255));
        jTextField176.setForeground(new java.awt.Color(204, 204, 204));
        jTextField176.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas26Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas26);
        jpanelEsquinasRedondas26.setLayout(jpanelEsquinasRedondas26Layout);
        jpanelEsquinasRedondas26Layout.setHorizontalGroup(
            jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas26Layout.createSequentialGroup()
                                    .addComponent(jRadioButton38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas26Layout.createSequentialGroup()
                                    .addComponent(jRadioButton40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton41))
                                .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelEsquinasRedondas26Layout.createSequentialGroup()
                                    .addComponent(jRadioButton42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton43))
                                .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel129, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                                .addComponent(jRadioButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                                .addComponent(jRadioButton47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton46))
                            .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel130)
                            .addComponent(jLabel132)
                            .addComponent(jLabel133)
                            .addComponent(jLabel134)
                            .addComponent(jLabel135)
                            .addComponent(jLabel131)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField169, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jTextField170, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField175, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField176, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField171, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField172))))
                    .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                        .addComponent(jRadioButton45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton44))
                    .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas26Layout.setVerticalGroup(
            jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton36)
                            .addComponent(jRadioButton37)
                            .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel122)
                        .addGap(18, 18, 18)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton38)
                            .addComponent(jRadioButton39)
                            .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton40)
                            .addComponent(jRadioButton41))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton42)
                            .addComponent(jRadioButton43))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel126)
                        .addGap(12, 12, 12)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton45)
                            .addComponent(jRadioButton44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel127)
                        .addGap(12, 12, 12)
                        .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton47)
                            .addComponent(jRadioButton46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel128))
                    .addGroup(jpanelEsquinasRedondas26Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addGap(8, 8, 8)
                        .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel131)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField170, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel132)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel134)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel136)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas28.setBackground(new java.awt.Color(240, 240, 240));

        jpanelEsquinasRedondas29.setBackground(new java.awt.Color(204, 204, 255));

        jLabel137.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("Comentarios del entrevistador");

        javax.swing.GroupLayout jpanelEsquinasRedondas29Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas29);
        jpanelEsquinasRedondas29.setLayout(jpanelEsquinasRedondas29Layout);
        jpanelEsquinasRedondas29Layout.setHorizontalGroup(
            jpanelEsquinasRedondas29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas29Layout.setVerticalGroup(
            jpanelEsquinasRedondas29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField177.setBackground(new java.awt.Color(255, 255, 255));
        jTextField177.setForeground(new java.awt.Color(204, 204, 204));
        jTextField177.setBorder(null);

        jpanelEsquinasRedondas30.setBackground(new java.awt.Color(204, 204, 255));

        jLabel138.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel138.setText("¿Candidato pasa a siguiente filtro?");

        javax.swing.GroupLayout jpanelEsquinasRedondas30Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas30);
        jpanelEsquinasRedondas30.setLayout(jpanelEsquinasRedondas30Layout);
        jpanelEsquinasRedondas30Layout.setHorizontalGroup(
            jpanelEsquinasRedondas30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas30Layout.setVerticalGroup(
            jpanelEsquinasRedondas30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRadioButton35.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton35.setText("Sí");

        jRadioButton48.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton48.setText("No");

        javax.swing.GroupLayout jpanelEsquinasRedondas28Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas28);
        jpanelEsquinasRedondas28.setLayout(jpanelEsquinasRedondas28Layout);
        jpanelEsquinasRedondas28Layout.setHorizontalGroup(
            jpanelEsquinasRedondas28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelEsquinasRedondas30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas28Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField177)
                .addGap(24, 24, 24))
        );
        jpanelEsquinasRedondas28Layout.setVerticalGroup(
            jpanelEsquinasRedondas28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas28Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelEsquinasRedondas30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton48))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas31.setBackground(new java.awt.Color(240, 240, 240));

        jpanelEsquinasRedondas32.setBackground(new java.awt.Color(204, 204, 255));

        jLabel139.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("Hago constar que mis respuestas son verdaderas");

        javax.swing.GroupLayout jpanelEsquinasRedondas32Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas32);
        jpanelEsquinasRedondas32.setLayout(jpanelEsquinasRedondas32Layout);
        jpanelEsquinasRedondas32Layout.setHorizontalGroup(
            jpanelEsquinasRedondas32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas32Layout.setVerticalGroup(
            jpanelEsquinasRedondas32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField178.setBackground(new java.awt.Color(255, 255, 255));
        jTextField178.setForeground(new java.awt.Color(204, 204, 204));
        jTextField178.setBorder(null);

        jTextField179.setBackground(new java.awt.Color(255, 255, 255));
        jTextField179.setForeground(new java.awt.Color(204, 204, 204));
        jTextField179.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField179.setText("NOMBRE COMPLETO Y FIRMA DEL CANDIDATO");
        jTextField179.setBorder(null);

        javax.swing.GroupLayout jpanelEsquinasRedondas31Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas31);
        jpanelEsquinasRedondas31.setLayout(jpanelEsquinasRedondas31Layout);
        jpanelEsquinasRedondas31Layout.setHorizontalGroup(
            jpanelEsquinasRedondas31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField178)
                    .addComponent(jTextField179))
                .addContainerGap())
        );
        jpanelEsquinasRedondas31Layout.setVerticalGroup(
            jpanelEsquinasRedondas31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas31Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField179, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPLEADOS");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-guardar-25 (1).png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setIconTextGap(2);

        jList1.setBackground(new java.awt.Color(204, 204, 255));
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Juan", "Pedro", "Miguel" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setFocusable(false);
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpanelEsquinasRedondas28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelEsquinasRedondas31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpanelEsquinasRedondas26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jpanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
                    .addComponent(jpanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
                    .addComponent(jpanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
                    .addComponent(jpanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jpanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jpanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jpanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanelEsquinasRedondas26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelEsquinasRedondas28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpanelEsquinasRedondas31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(596, 596, 596))
        );

        jScrollPane1.setViewportView(jpanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 4800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void operadorTelefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorTelefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operadorTelefonoEmpleadoActionPerformed

    private void erformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erformed
         // TODO add your handling code here:
    }//GEN-LAST:event_erformed

    private void fotoEmpleadoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoEmpleadoBtnMouseClicked
    JFileChooser jf = new JFileChooser();
    
    //filtro de extensiones de archivo para limitar las opciones del usuario a archivos con extensiones ".jpg", ".png" y ".gif".
    FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
    
    //Se establece el filtro de extensiones de archivo en el objeto
    jf.setFileFilter(fil);
    //Se establece el directorio de inicio del cuadro de diálogo en una ubicación específica.
    jf.setCurrentDirectory(new File("Fotos"));

    //La variable "el" captura el resultado de la elección del usuario, que será igual a JFileChooser.APPROVE_OPTION
    //si el usuario selecciona un archivo.
    int el = jf.showOpenDialog(this);

    //Se verifica si el usuario ha seleccionado un archivo.
    if (el == JFileChooser.APPROVE_OPTION) {
        fotoEmpleado.setText("");
        
        // Se obtiene el archivo seleccionado por el usuario y se almacena en la variable selectedFile.
        File selectedFile = jf.getSelectedFile();
        //Se establece el texto del componente fotoEmpleado con la ruta absoluta del archivo seleccionado.
        //fotoEmpleado.setText(selectedFile.getAbsolutePath());

        // Ahora necesitas cargar la imagen en el ImageIcon y establecerla en tu componente.
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
        fotoEmpleado.setIcon(icon);
      }
    }//GEN-LAST:event_fotoEmpleadoBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField DocumentoExtranjeroEmpleado;
    public javax.swing.JTextField EmailEmpleado;
    public com.toedter.calendar.JDateChooser FechaSolicitudEmpleo;
    public javax.swing.JTextField FinadoConyugueEmpleado;
    public javax.swing.JTextField FinadoMadreEmpleado;
    public javax.swing.JTextField FinadoPadreEmpleado;
    public javax.swing.JTextField FuncionDominaEmpleado;
    public javax.swing.JTextField IdiomaEMpleado;
    public javax.swing.JTextField MaquinasOficinaEMpleado;
    private javax.swing.JTextField MotivoSeparacionActualTrabajoEmpleado;
    private javax.swing.JTextField MotivoSeparacionAnterior1TrabajoEmpleado;
    private javax.swing.JTextField MotivoSeparacionAnterior2TrabajoEmpleado;
    private javax.swing.JTextField MotivoSeparacionAnterior3TrabajoEmpleado;
    private javax.swing.JTextField MotivoSeparaciónEmpleoActualEmpleado;
    private javax.swing.JTextField MotivoSeparaciónEmpleoAnterior1Empleado;
    private javax.swing.JTextField MotivoSeparaciónEmpleoAnterior2Empleado;
    private javax.swing.JTextField MotivoSeparaciónEmpleoAnterior3Empleado;
    public javax.swing.JTextField MunicipioEmpleado;
    private javax.swing.JRadioButton NoDiraMotivoSeoparacionActualTrabajoEmpleado;
    private javax.swing.JRadioButton NoDiraMotivoSeoparacionAnterior1TrabajoEmpleado;
    private javax.swing.JRadioButton NoDiraMotivoSeoparacionAnterior2TrabajoEmpleado;
    private javax.swing.JRadioButton NoDiraMotivoSeoparacionAnterior3TrabajoEmpleado;
    public javax.swing.JTextField NombreComercialEmpleado;
    public javax.swing.JTextField NombreEstudioActualEMpleado;
    public javax.swing.JTextField RegContribuyenteEmpleado;
    public javax.swing.JComboBox<String> SexoEmpleado;
    public javax.swing.JTextField SofwareDominaEmpleado;
    public javax.swing.JTextField SueldoMensualAutorizado;
    public javax.swing.JTextField SueldoMensualDeseado;
    public javax.swing.JTextField aforeEmpleado;
    public javax.swing.JTextField apellidoMaternoEmpleado;
    public javax.swing.JTextField apellidoPaternoEmpleado;
    public javax.swing.JTextField añosComercialEmpleado;
    public javax.swing.JTextField añosPreparatoriaEmpleado;
    public javax.swing.JTextField añosPrimariaEmpleado;
    public javax.swing.JTextField añosSecundariaEmpleado;
    public javax.swing.JRadioButton casadoEmpleado;
    public javax.swing.JTextField claveRegistroPoblacionEmpleado;
    public javax.swing.JTextField clubSocialEmpleado;
    public javax.swing.JTextField codigoPostalEmpleado;
    public javax.swing.JTextField coloniaEmpleado;
    public javax.swing.JTextField descripcionPuesto;
    public javax.swing.JTextField domicilioComercialEmpleado;
    public javax.swing.JTextField domicilioConyugueEmpleado;
    public javax.swing.JTextField domicilioEmpleado;
    private javax.swing.JTextField domicilioEmpleoActualEmpleado;
    private javax.swing.JTextField domicilioEmpleoAnterior1Empleado;
    private javax.swing.JTextField domicilioEmpleoAnterior2Empleado;
    private javax.swing.JTextField domicilioEmpleoAnterior3Empleado;
    public javax.swing.JTextField domicilioMadreEmpleado;
    public javax.swing.JTextField domicilioPadreEmpleado;
    public javax.swing.JTextField domicilioPreparatoriaEmpleado;
    public javax.swing.JTextField domicilioPrimariaEmpleado;
    public javax.swing.JTextField domicilioSecundariaEmpleado;
    public javax.swing.JTextField edadEmpleado;
    private javax.swing.JTextField egresoEmpleoActualEmpleado;
    private javax.swing.JTextField egresoEmpleoAnterior1Empleado;
    private javax.swing.JTextField egresoEmpleoAnterior2Empleado;
    private javax.swing.JTextField egresoEmpleoAnterior3Empleado;
    public javax.swing.JTextField estadoSaludEmpleado;
    public javax.swing.JTextField estaturaEmpleado;
    public javax.swing.JRadioButton familiaDependeEmpleado;
    public javax.swing.JTextField fechaEgresoComercialEmpleado;
    public javax.swing.JTextField fechaEgresoPreparatoriaEmpleado;
    public javax.swing.JTextField fechaEgresoPrimariaEmpleado;
    public javax.swing.JTextField fechaEgresoSecundariaEmpleado;
    public javax.swing.JTextField fechaIngresoComercialEmpleado;
    public javax.swing.JTextField fechaIngresoPreparatoriaEmpleado;
    public javax.swing.JTextField fechaIngresoPrimariaEmpleado;
    public javax.swing.JTextField fechaIngresoSecundariaEmpleado;
    public com.toedter.calendar.JDateChooser fechaNacimientoEmpleado;
    public javax.swing.JLabel fotoEmpleado;
    private javax.swing.JButton fotoEmpleadoBtn;
    public javax.swing.JTextField gradoCursoActualEmpleado;
    public javax.swing.JTextField horarioActualEsudioEmpleado;
    private javax.swing.JTextField ingresoEmpleoActualEmpleado;
    private javax.swing.JTextField ingresoEmpleoAnterior1Empleado;
    private javax.swing.JTextField ingresoEmpleoAnterior2Empleado;
    private javax.swing.JTextField ingresoEmpleoAnterior3Empleado;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    private javax.swing.JTextField jTextField163;
    private javax.swing.JTextField jTextField164;
    private javax.swing.JTextField jTextField165;
    private javax.swing.JTextField jTextField166;
    private javax.swing.JTextField jTextField167;
    private javax.swing.JTextField jTextField168;
    private javax.swing.JTextField jTextField169;
    private javax.swing.JTextField jTextField170;
    private javax.swing.JTextField jTextField171;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField177;
    private javax.swing.JTextField jTextField178;
    private javax.swing.JTextField jTextField179;
    javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private Estilos_panel.jpanelEsquinasRedondas jpanel1;
    private Estilos_panel.jpanelEsquinasRedondas jpanel10;
    private Estilos_panel.jpanelEsquinasRedondas jpanel12;
    private Estilos_panel.jpanelEsquinasRedondas jpanel2;
    private Estilos_panel.jpanelEsquinasRedondas jpanel4;
    private Estilos_panel.jpanelEsquinasRedondas jpanel5;
    private Estilos_panel.jpanelEsquinasRedondas jpanel6;
    private Estilos_panel.jpanelEsquinasRedondas jpanel7;
    private Estilos_panel.jpanelEsquinasRedondas jpanel8;
    private Estilos_panel.jpanelEsquinasRedondas jpanel9;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas10;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas11;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas12;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas13;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas14;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas15;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas16;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas17;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas18;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas19;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas20;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas21;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas22;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas24;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas25;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas26;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas27;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas28;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas29;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas3;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas30;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas31;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas32;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas4;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas5;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas6;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas7;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas8;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas9;
    public javax.swing.JTextField licenciaManejoEmpleado;
    public javax.swing.JTextField lugarNacimientoEmpleado;
    public javax.swing.JTextField metaVidaEmpleado;
    public javax.swing.JRadioButton nadieDependeEmpleado;
    private javax.swing.JTextField nombreCompañiaActualEmpleado;
    private javax.swing.JTextField nombreCompañiaAnterior1Empleado;
    private javax.swing.JTextField nombreCompañiaAnterior2Empleado;
    private javax.swing.JTextField nombreCompañiaAnterior3Empleado;
    public javax.swing.JTextField nombreConyugueEmpleado;
    public javax.swing.JTextField nombreCursoActualEmpleado;
    private javax.swing.JTextField nombreJefeDirectoEmpleoActualEMpleado;
    private javax.swing.JTextField nombreJefeDirectoEmpleoAnterior1EMpleado;
    private javax.swing.JTextField nombreJefeDirectoEmpleoAnterior2EMpleado;
    private javax.swing.JTextField nombreJefeDirectoEmpleoAnterior3EMpleado;
    public javax.swing.JTextField nombreMadreEmpleado;
    public javax.swing.JTextField nombrePadreEmpleado;
    public javax.swing.JTextField nombrePreparatoriaEmpleado;
    public javax.swing.JTextField nombrePrimariaEmpleado;
    public javax.swing.JTextField nombreSecundariaEmpleado;
    public javax.swing.JTextField nombresEmpleado;
    public javax.swing.JTextField numeroCartillaMilitarEmpleado;
    public javax.swing.JTextField numeroPasaporteEmpleado;
    public javax.swing.JTextField numeroSocialEmpleado;
    public javax.swing.JTextField ocupacionConyugueEmpleado;
    public javax.swing.JTextField ocupacionMadreEmpleado;
    public javax.swing.JTextField ocupacionPadreEmpleado;
    public javax.swing.JTextField operadorTelefonoEmpleado;
    public javax.swing.JTextField otrasFuncionesDominaEmpleado;
    public javax.swing.JRadioButton otroEmpleado;
    public javax.swing.JTextField padeceEnfemedadEmpleado;
    public javax.swing.JRadioButton padresDependenEmpleado;
    public javax.swing.JRadioButton parientesDependeEmpleado;
    public javax.swing.JTextField pasatiempoEmpleado;
    public javax.swing.JTextField pesoEmpleado;
    private javax.swing.JTextField porqueNoDiraMotivoSeparacionActualTrabajo;
    private javax.swing.JTextField porqueNoDiraMotivoSeparacionAnterior1Trabajo;
    private javax.swing.JTextField porqueNoDiraMotivoSeparacionAnterior2Trabajo;
    private javax.swing.JTextField porqueNoDiraMotivoSeparacionAnterior3Trabajo;
    public javax.swing.JTextField practicaDeporteEmpleado;
    public javax.swing.JTextField puestoEjercer;
    private javax.swing.JTextField puestoJefeDirectoEmpleoActualEmpleado;
    private javax.swing.JTextField puestoJefeDirectoEmpleoAnterior1Empleado;
    private javax.swing.JTextField puestoJefeDirectoEmpleoAnterior2Empleado;
    private javax.swing.JTextField puestoJefeDirectoEmpleoAnterior3Empleado;
    public javax.swing.JTextField recibioTituloComercialEmpleado;
    public javax.swing.JTextField recibioTituloPreparatoriaEmpleado;
    public javax.swing.JTextField recibioTituloPrimariaEmpleado;
    public javax.swing.JTextField recibioTituloSecundariaEmpleado;
    private javax.swing.JRadioButton siDiraMotivoSeperacioTrabajoActualEmpleado;
    private javax.swing.JRadioButton siDiraMotivoSeperacioTrabajoAnterior1Empleado;
    private javax.swing.JRadioButton siDiraMotivoSeperacioTrabajoAnterior2Empleado;
    private javax.swing.JRadioButton siDiraMotivoSeperacioTrabajoAnterior3Empleado;
    public javax.swing.JRadioButton solteroEmpleado;
    private javax.swing.JTextField suledoMensualFinalEmpleoActualEmpleado;
    private javax.swing.JTextField suledoMensualFinalEmpleoAnterior1Empleado;
    private javax.swing.JTextField suledoMensualFinalEmpleoAnterior2Empleado;
    private javax.swing.JTextField suledoMensualFinalEmpleoAnterior3Empleado;
    private javax.swing.JTextField suledoMensualInicialEmpleoActualEmpleado;
    private javax.swing.JTextField suledoMensualInicialEmpleoAnterior1Empleado;
    private javax.swing.JTextField suledoMensualInicialEmpleoAnterior2Empleado;
    private javax.swing.JTextField suledoMensualInicialEmpleoAnterior3Empleado;
    public javax.swing.JTextField telefonoEmpleado;
    private javax.swing.JTextField telefonoEmpleoActualEmpleado;
    private javax.swing.JTextField telefonoEmpleoAnterior1Empleado;
    private javax.swing.JTextField telefonoEmpleoAnterior2Empleado;
    private javax.swing.JTextField telefonoEmpleoAnterior3Empleado;
    public javax.swing.JTextField tipoNumeroLicenciaEmpleado;
    public javax.swing.JRadioButton viveConFamiliaEmpleado;
    public javax.swing.JRadioButton viveConPadresEmpleado;
    public javax.swing.JRadioButton viveConParientesEmpleado;
    public javax.swing.JTextField viveConyugueEmpleado;
    public javax.swing.JTextField viveMadreEmpleado;
    public javax.swing.JTextField vivePadreEmpleado;
    public javax.swing.JRadioButton viveSoloEmpleado;
    // End of variables declaration//GEN-END:variables
}

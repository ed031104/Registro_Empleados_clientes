package Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicheroEmpleado{
    ArrayList<Empleados> empleado = new ArrayList<>();
 
    public FicheroEmpleado() {}
    
    public void crearFichero(Empleados empleado) {
        FileWriter fl = null;
        try {
            fl = new FileWriter("Empleados.txt", true);
            BufferedWriter bw = new BufferedWriter(fl);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print( empleado.getNombre()+",");
            pw.print( empleado.getApellidoPaterno()+",");
            pw.print( empleado.getApellidoMaterno()+",");
            pw.print( empleado.getPuestoSolicitado()+",");
            pw.print( empleado.getDescripcionPuesto()+",");
            pw.print( empleado.getFechaSolicitudEmpleo()+",");
            pw.print( empleado.getSueldoMensualDeseado()+",");
            pw.print( empleado.getSueldoMensualAutorizado()+",");
            pw.print( empleado.getEstatura()+",");
            pw.print( empleado.getPeso()+",");
            pw.print( empleado.getDomicilio()+",");
            pw.print( empleado.getColonia()+",");
            pw.print( empleado.getTelefono()+",");
            pw.print( empleado.getMunicipio()+",");
            pw.print( empleado.getLugarNacimiento()+",");
            pw.print( empleado.getSexo()+",");
            pw.print( empleado.getOperadorTelefono()+",");
            pw.print( empleado.getEmail()+",");
            pw.print( empleado.getFechaNacimiento()+",");
            pw.print( empleado.getEdad()+",");
            pw.print( empleado.getCodigoPostal()+",");
            pw.print( empleado.getRegistroOperacionContribuyentes()+",");
            pw.print( empleado.getClaveUnicaRegistroPoblacion()+",");
            pw.print( empleado.getNumeroSeguridadSocial()+",");
            pw.print( empleado.getAfore()+",");
            pw.print( empleado.getNumeroPasaporte()+",");
            pw.print( empleado.getCartillaMilitar()+",");
            pw.print( empleado.getLicenciaManejo()+",");
            pw.print( empleado.getNumeroLicencia()+",");
            pw.print( empleado.getDocumentacionExtrajeroLaboral()+",");
            pw.print( empleado.getSaludActual()+",");
            pw.print( empleado.getEnfermedadCronica()+",");
            pw.print( empleado.getClubSocial()+",");
            pw.print( empleado.getDeporte()+",");
            pw.print( empleado.getPasatiempo()+",");
            pw.print( empleado.getMetaVida()+",");
            pw.print( empleado.getNombrePadre()+",");
            pw.print( empleado.getVivePadre()+",");
            pw.print( empleado.getFinadoPadre()+",");
            pw.print( empleado.getDomicilioPadre()+",");
            pw.print( empleado.getOcupacionPadre()+",");
            pw.print( empleado.getNombreMadre()+",");
            pw.print( empleado.getViveMadre()+",");
            pw.print( empleado.getFinadoMadre()+",");
            pw.print( empleado.getDomicilioMadre()+",");
            pw.print( empleado.getOcupacionMadre()+",");
            pw.print( empleado.getNombreConyugue()+",");
            pw.print( empleado.getViveConyugue()+",");
            pw.print( empleado.getFinadoConyugue()+",");
            pw.print( empleado.getDomicilioConyugue()+",");
            pw.print( empleado.getOcupacionConyugue()+",");
            pw.print( empleado.getNombreEscuelaPrimaria()+",");
            pw.print( empleado.getDomicilioEscuelaPrimaria()+",");
            pw.print( empleado.getFechaInicioEscuelaPrimaria()+",");
            pw.print( empleado.getFechaFinalEscuelaPrimaria()+",");
            pw.print( empleado.getAñosCursadosEscuelaPrimaria()+",");
            pw.print( empleado.getTituloEscuelaPrimaria()+",");
            pw.print( empleado.getNombreEscuelaSecundaria()+",");
            pw.print( empleado.getDomicilioEscuelaSecundaria()+",");
            pw.print( empleado.getFechaInicioEscuelaSecundaria()+",");
            pw.print( empleado.getFechaFinalEscuelaSecundaria()+",");
            pw.print( empleado.getAñosCursadosEscuelaSecundaria()+",");
            pw.print( empleado.getTituloEscuelaSecundaria()+",");
            pw.print( empleado.getNombreEscuelaPreparatoria()+",");
            pw.print( empleado.getDomicilioEscuelaPreparatoria()+",");
            pw.print( empleado.getFechaInicioEscuelaPreparatoria()+",");
            pw.print( empleado.getFechaFinalEscuelaPreparatoria()+",");
            pw.print( empleado.getAñosCursadosEscuelaPreparatoria()+",");
            pw.print( empleado.getTituloEscuelaPreparatoria()+",");
            pw.print( empleado.getNombreEscuelaComercial()+",");
            pw.print( empleado.getDomicilioEscuelaComercial()+",");
            pw.print( empleado.getFechaInicioEscuelaComercial()+",");
            pw.print( empleado.getFechaFinalEscuelaComercial()+",");
            pw.print( empleado.getAñosCursadosEscuelaComercial()+",");
            pw.print( empleado.getTituloEscuelaComercial()+",");
            pw.print( empleado.getNombreEscuelaActual()+",");
            pw.print( empleado.getHorarioEscuelaActual()+",");
            pw.print( empleado.getCarreraEscuelaActual()+",");
            pw.print( empleado.getGradoEscuelaActual()+",");
            pw.print( empleado.getIdiomasExtranjeros()+",");
            pw.print( empleado.getFuncionesOficina()+",");
            pw.print( empleado.getMaquinasOficinaManejo()+",");
            pw.print( empleado.getSoftwareDomina()+",");
            pw.print( empleado.getOtrasFuncionesDomina()+",");
            pw.print( empleado.getPrestoServisiosEmpleoActualDesde()+",");
            pw.print( empleado.getPrestoServisiosEmpleoActualHasta()+",");
            pw.print( empleado.getNombreCompañiaEmpleoActual()+",");
            pw.print( empleado.getDomicilioEmpleoActual()+",");
            pw.print( empleado.getTelefonoEmpleoActual()+",");
            pw.print( empleado.getPuestoDesempeñoEmpleoActual()+",");
            pw.print( empleado.getSueldoInicialEmpleoActual()+",");
            pw.print( empleado.getSueldoFinalEmpleoActual()+",");
            pw.print( empleado.getMotivoSeparacionEmpleoActual()+",");
            pw.print( empleado.getNombreJefeDirectoEmpleoActual()+",");
            pw.print( empleado.getPuestoJefeDirectoEmpleoActual()+",");
            pw.print( empleado.getMotivoseparacionEmpleoActualSi()+",");
            pw.print( empleado.getMotivoseparacionEmpleoActualNo()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior1Desde()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior1Hasta()+",");
            pw.print( empleado.getNombreCompañiaEmpleoAnterior1()+",");
            pw.print( empleado.getDomicilioEmpleoAnterior1()+",");
            pw.print( empleado.getTelefonoEmpleoAnterior1()+",");
            pw.print( empleado.getPuestoDesempeñoEmpleoAnterior1()+",");
            pw.print( empleado.getSueldoInicialEmpleoAnterior1()+",");
            pw.print( empleado.getSueldoFinalEmpleoAnterior1()+",");
            pw.print( empleado.getMotivoSeparacionEmpleoAnterior1()+",");
            pw.print( empleado.getNombreJefeDirectoEmpleoAnterior1()+",");
            pw.print( empleado.getPuestoJefeDirectoEmpleoAnterior1()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior1Si()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior1No()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior2Desde()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior2Hasta()+",");
            pw.print( empleado.getNombreCompañiaEmpleoAnterior2()+",");
            pw.print( empleado.getDomicilioEmpleoAnterior2()+",");
            pw.print( empleado.getTelefonoEmpleoAnterior2()+",");
            pw.print( empleado.getPuestoDesempeñoEmpleoAnterior2()+",");
            pw.print( empleado.getSueldoInicialEmpleoAnterior2()+",");
            pw.print( empleado.getSueldoFinalEmpleoAnterior2()+",");    
            pw.print( empleado.getMotivoSeparacionEmpleoAnterior2()+",");
            pw.print( empleado.getNombreJefeDirectoEmpleoAnterior2()+",");
            pw.print( empleado.getPuestoJefeDirectoEmpleoAnterior2()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior2Si()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior2No()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior3Desde()+",");
            pw.print( empleado.getPrestoServisiosEmpleoAnterior3Hasta()+",");
            pw.print( empleado.getNombreCompañiaEmpleoAnterior3()+",");
            pw.print( empleado.getDomicilioEmpleoAnterior3()+",");
            pw.print( empleado.getTelefonoEmpleoAnterior3()+",");
            pw.print( empleado.getPuestoDesempeñoEmpleoAnterior3()+",");
            pw.print( empleado.getSueldoInicialEmpleoAnterior3()+",");
            pw.print( empleado.getSueldoFinalEmpleoAnterior3()+",");
            pw.print( empleado.getMotivoSeparacionEmpleoAnterior3()+",");
            pw.print( empleado.getNombreJefeDirectoEmpleoAnterior3()+",");
            pw.print( empleado.getPuestoJefeDirectoEmpleoAnterior3()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior3Si()+",");
            pw.print( empleado.getMotivoseparacionEmpleoAnterior3No()+",");
            pw.print( empleado.getReferenciaNombre()+",");
            pw.print( empleado.getReferenciaTelefono()+",");
            pw.print( empleado.getReferenciaDomicilio()+",");
            pw.print( empleado.getReferenciaOcupacion()+",");
            pw.print( empleado.getReferenciatimepoconocerce()+",");
            pw.print( empleado.getReferenciaNombre2()+",");
            pw.print( empleado.getReferenciaTelefono2()+",");
            pw.print( empleado.getReferenciaDomicilio2()+",");
            pw.print( empleado.getReferenciaOcupacion2()+",");
            pw.print( empleado.getReferenciatimepoconocerce2()+",");
            pw.print( empleado.getReferenciaNombre3()+",");
            pw.print( empleado.getReferenciaTelefono3()+",");
            pw.print( empleado.getReferenciaDomicilio3()+",");
            pw.print( empleado.getReferenciaOcupacion3()+",");
            pw.print( empleado.getReferenciatimepoconocerce3()+",");
            pw.print( empleado.getReferenciaNombre4()+",");
            pw.print( empleado.getReferenciaTelefono4()+",");
            pw.print( empleado.getReferenciaDomicilio4()+",");
            pw.print( empleado.getReferenciaOcupacion4()+",");
            pw.print( empleado.getReferenciatimepoconocerce4()+",");
            pw.print( empleado.getSaberEmpleoOtro()+",");
            pw.print( empleado.getFachaUnir()+",");
            pw.print( empleado.getOtrosIngresos()+",");
            pw.print( empleado.getImporteMensual()+",");
            pw.print( empleado.getConyugueTrabaja()+",");
            pw.print( empleado.getPercepcionMensual()+",");
            pw.print( empleado.getValorAproximado()+",");
            pw.print( empleado.getImporte()+",");
            pw.print( empleado.getImporteDeudas()+",");
            pw.print( empleado.getAbonoMensual()+",");
            pw.print( empleado.getGastosMensuales()+",");
            pw.print( empleado.getComentarioEntrevistador()+",");
            pw.print( empleado.getRespuestas()+",");
            pw.print( empleado.getCandidato()+",");
        
        } catch (Exception e) {
            
        }
    }
    
    public Empleados LeerFicheroEmpleados(String empleado){
        
        try{
            
        FileReader fr = new FileReader("nominas.txt");
        
        BufferedReader bf = new BufferedReader(fr);
        
        String cadena;
        while ((cadena = bf.readLine()) != null) {
            
            String[] dato = cadena.split(",");
        if (dato.length == 170) {
            
            String nombre = dato[0].trim();
            String apellidopaterno = dato[1].trim();
            String apellidomaterno = dato[2].trim();
            String puestosolicitado = dato[3].trim();
            String descripcionpuesto = dato[4].trim();
            String fechasolicitudempleo = dato[5].trim();
            double sueldomensualdeseado = Double.valueOf(dato[6].trim());
            double sueldomensualautorizado = Double.valueOf(dato[7].trim());
            double estatura = Double.valueOf(dato[8].trim());
            double peso = Double.valueOf(dato[9].trim());
            String domicilio = dato[10].trim();
            String colonia = dato[11].trim();
            String telefono = dato[12].trim();
            String municipio = dato[13].trim();
            String lugardenacimiento = dato[14].trim();
            String sexo = dato[15].trim();
            String operadortelefono = dato[16].trim();
            String email = dato[17].trim();
            String fechadenacimiento = dato[18].trim();
            int edad = Integer.parseInt(dato[19].trim());
            int codigopostal = Integer.parseInt(dato[20].trim());
            String registrooperacioncontribuyentes = dato[21].trim();
            String claveunicaregistropoblacion = dato[22].trim();
            String numeroseguridadsocial = dato[23].trim();
            String afore = dato[24].trim();
            String numeropasaporte = dato[25].trim();
            String cartillamilitar = dato[26].trim();
            String licenciamanejo = dato[27].trim();
            String numerolicencia = dato[28].trim();
            String documentacionextranjerolaboral = dato[29].trim();
            String saludactual =dato[30].trim();
            String enfermedadcronica = dato[31].trim();
            String clubsocial = dato[32].trim();
            String deporte = dato[33].trim();
            String pasatiempo = dato[34].trim();
            String metavida = dato[35].trim();
            String nombrepadre = dato[36].trim();
            String vivepadre = dato[37].trim();
            String finadopadre = dato[38].trim();
            String domiciliopadre =dato[39].trim();
            String ocupacionpadre = dato[40].trim();
            String nombremadre = dato[41].trim();
            String vivemadre = dato[42].trim();
            String finadomadre = dato[43].trim();
            String domiciliomadre = dato[44].trim();
            String ocupacionmadre = dato[45].trim();
            String nombreconyugue = dato[46].trim();
            String viveconyugue = dato[47].trim();
            String finadoconyugue = dato[48].trim();
            String domicilioconyugue = dato[49].trim();
            String ocupacionconyugue = dato[50].trim();
            String nombreescuelaprimaria = dato[51].trim();
            String domicilioescuelaprimaria = dato[52].trim();
            String fechainicioescuelaprimaria = dato[53].trim();
            String fechafinalescuelaprimaria = dato[54].trim();
            String añoscursadosescuelaprimaria = dato[55].trim();
            String tituloescuelaprimaria = dato[56].trim();
            String nombreescuelasecundaria = dato[57].trim();
            String domicilioescuelasecundaria = dato[58].trim();
            String fechainicioescuelasecundaria = dato[59].trim();
            String fechafinalescuelasecundaria = dato[60].trim();
            String Añoscursadosescuelasecundaria = dato[61].trim();
            String tituloescuelasecundaria = dato[62].trim();
            String nombreescuelapreparatoria = dato[63].trim();
            String domicilioescuelapreparatoria = dato[64].trim();
            String fechainicioescuelapreparatoria = dato[65].trim();
            String fechafinalescuelapreparatoria  = dato[66].trim();
            String añoscursadosescuelapreparatoria = dato[67].trim();
            String tituloescuelapreparatoria = dato[68].trim();
            String nombreescuelacomercial = dato[69].trim();
            String domicilioescuelacomercial = dato[70].trim();
            String fechainicioescuelacomercial = dato[71].trim();
            String fechafinalescuelacomercial = dato[72].trim();
            String añoscursadosescuelacomercial = dato[73].trim();
            String tituloescuelacomercial = dato[74].trim();
            String nombreescuelaactual = dato[75].trim();
            String horarioescuelaactual = dato[76].trim();
            String carreraescuelaactual = dato[77].trim();
            String gradoescuelaactual = dato[78].trim();
            String idiomasextranjeros = dato[79].trim();
            String funcionesoficina = dato[80].trim();
            String maquinasoficinamanejo = dato[81].trim();
            String softwaredomina = dato[82].trim();
            String otrasfuncionesdomina = dato[83].trim();
            String prestoserviciosempleoactualdesde = dato[84].trim();
            String prestoserviciosempleoactualhasta = dato[85].trim();
            String nombrecompañiaempleoactual = dato[86].trim();
            String domicilioempleoactual = dato[87].trim();
            String telefonoempleoactual = dato[88].trim();
            String puestodesempeñoempleoactual = dato[89].trim();
            String sueldoinicialempleoactual = dato[90].trim();
            String sueldofinalempleoactual = dato[91].trim();
            String motivoseparacionempleoactual = dato[92].trim();
            String nombrejefedirectoempleoactual = dato[93].trim();
            String puestojefedirectoempleoactual = dato[94].trim();
            String motivoseparacionempleoactualsi = dato[95].trim();
            String motivoseparacionempleoactualno = dato[96].trim();
            String prestoservicioempleoanterior1desde = dato[97].trim();
            String prestoserviciosempleoanterior1hasta = dato[98].trim();
            String nombrecompañiaempleoanterior1 = dato[99].trim();
            String domicilioempleoanterior1 = dato[100].trim();
            String telefonoempleoanterior1 = dato[101].trim();
            String puestodesempeñoempleoanterio1 = dato[102].trim();
            String sueldoinicialempleoanterior1 = dato[103].trim();
            String sueldofinalempleoanterior1 = dato[104].trim();
            String motivoseparacionempleoanterior1 = dato[105].trim();
            String nombrejefedirectoempleoanterior1 = dato[106].trim();
            String puestojefedirectoempleoanterior1 =dato[107].trim();
            String motivoseparacionempleoanterior1si = dato[108].trim();
            String motivoseparacionempleoanterior1no = dato[109].trim();
            String prestoservicioempleoanterior2desde = dato[110].trim();
            String prestoserviciosempleoanterior2hasta = dato[111].trim();
            String nombrecompañiaempleoanterior2 = dato[112].trim();
            String domicilioempleoanterior2 = dato[113].trim();
            String telefonoempleoanterior2 = dato[114].trim();
            String puestodesempeñoempleoanterio2 = dato[115].trim();
            String sueldoinicialempleoanterior2 = dato[116].trim();
            String sueldofinalempleoanterior2 = dato[117].trim();
            String motivoseparacionempleoanterior2 = dato[118].trim();
            String nombrejefedirectoempleoanterior2 = dato[119].trim();
            String puestojefedirectoempleoanterior2 =dato[120].trim();
            String motivoseparacionempleoanterior2si = dato[121].trim();
            String motivoseparacionempleoanterior2no = dato[122].trim();
            String prestoservicioempleoanterior3desde = dato[123].trim();
            String prestoserviciosempleoanterior3hasta = dato[124].trim();
            String nombrecompañiaempleoanterior3 = dato[125].trim();
            String domicilioempleoanterior3 = dato[126].trim();
            String telefonoempleoanterior3 = dato[127].trim();
            String puestodesempeñoempleoanterio3 = dato[128].trim();
            String sueldoinicialempleoanterior3 = dato[129].trim();
            String sueldofinalempleoanterior3 = dato[130].trim();
            String motivoseparacionempleoanterior3 = dato[131].trim();
            String nombrejefedirectoempleoanterior3 = dato[132].trim();
            String puestojefedirectoempleoanterior3 =dato[133].trim();
            String motivoseparacionempleoanterior3si = dato[134].trim();
            String motivoseparacionempleoanterior3no = dato[135].trim();
            String referencianombre = dato[136].trim();
            String referenciatelefono = dato[137].trim();
            String referenciadomicilio = dato[138].trim();
            String referenciaocupacion = dato[139].trim();
            String referenciatiempoconocerse = dato[140].trim();
            String referencianombre2 = dato[141].trim();
            String referenciatelefono2 = dato[142].trim();
            String referenciadomicilio2 = dato[143].trim();
            String referenciaocupacion2 = dato[144].trim();
            String referenciatiempoconocerse2 = dato[145].trim();
            String referencianombre3 = dato[146].trim();
            String referenciatelefono3 = dato[147].trim();
            String referenciadomicilio3 = dato[148].trim();
            String referenciaocupacion3 = dato[149].trim();
            String referenciatiempoconocerse3 = dato[150].trim();
            String referencianombre4 = dato[151].trim();
            String referenciatelefono4 = dato[152].trim();
            String referenciadomicilio4 = dato[153].trim();
            String referenciaocupacion4 = dato[154].trim();
            String referenciatiempoconocerse4 = dato[155].trim();
            String saberemppleootros = dato[156].trim();
            String fachaunir = dato[157].trim();
            String otrosingresos = dato[158].trim();
            String importemensual = dato[159].trim();
            String conyuguetrabaja = dato[160].trim();
            String percepcionmensual = dato[161].trim();
            String valoraproximano = dato[162].trim();
            String importe = dato[163].trim();
            String abonomensual = dato[164].trim();
            String gastomensual = dato[165].trim();
            String comentarioentrevistador = dato[166].trim();
            String respuestas = dato[167].trim();
            String candidato = dato[168].trim();
            
            this.empleado.add(new Empleados(puestosolicitado, descripcionpuesto, fechasolicitudempleo, sueldomensualdeseado, 
                    sueldomensualautorizado, estatura, peso, domicilio, colonia, telefono, municipio, lugardenacimiento, sexo, 
                    operadortelefono, email, fechadenacimiento, edad, codigopostal, registrooperacioncontribuyentes, 
                    claveunicaregistropoblacion, numeroseguridadsocial, afore, numeropasaporte, cartillamilitar, 
                    licenciamanejo, numerolicencia, documentacionextranjerolaboral, saludactual, enfermedadcronica, 
                    clubsocial, deporte, pasatiempo, metavida, nombrepadre, vivepadre, finadopadre, domiciliopadre, 
                    ocupacionpadre, nombremadre, vivemadre, finadomadre, domiciliomadre, ocupacionmadre, nombreconyugue, 
                    viveconyugue, finadoconyugue, domicilioconyugue, ocupacionconyugue, nombreescuelaprimaria, 
                    domicilioescuelaprimaria, fechainicioescuelaprimaria, fechafinalescuelaprimaria, 
                    añoscursadosescuelaprimaria, tituloescuelaprimaria, nombreescuelasecundaria, domicilioescuelasecundaria, 
                    fechainicioescuelasecundaria, fechafinalescuelasecundaria, Añoscursadosescuelasecundaria, 
                    tituloescuelasecundaria, nombreescuelapreparatoria, domicilioescuelapreparatoria, 
                    fechainicioescuelapreparatoria, fechafinalescuelapreparatoria, añoscursadosescuelapreparatoria, 
                    tituloescuelapreparatoria, nombreescuelacomercial, domicilioescuelacomercial, fechainicioescuelacomercial, 
                    fechafinalescuelacomercial, añoscursadosescuelacomercial, tituloescuelacomercial, nombreescuelaactual, 
                    horarioescuelaactual, carreraescuelaactual, gradoescuelaactual, idiomasextranjeros, funcionesoficina, 
                    maquinasoficinamanejo, softwaredomina, otrasfuncionesdomina, prestoserviciosempleoactualdesde, 
                    prestoserviciosempleoactualhasta, nombrecompañiaempleoactual, domicilioempleoactual, telefonoempleoactual, 
                    puestodesempeñoempleoactual, sueldoinicialempleoactual, sueldofinalempleoactual, 
                    motivoseparacionempleoactual, nombrejefedirectoempleoactual, puestojefedirectoempleoactual, 
                    motivoseparacionempleoactualsi, motivoseparacionempleoactualno, prestoservicioempleoanterior1desde, 
                    prestoserviciosempleoanterior1hasta, nombrecompañiaempleoanterior1, domicilioempleoanterior1, 
                    telefonoempleoanterior1, puestodesempeñoempleoanterio1, sueldoinicialempleoanterior1, 
                    sueldofinalempleoanterior1, motivoseparacionempleoanterior1, nombrejefedirectoempleoanterior1, 
                    puestojefedirectoempleoanterior1, motivoseparacionempleoanterior1si, motivoseparacionempleoanterior1no, 
                    prestoservicioempleoanterior2desde, prestoserviciosempleoanterior2hasta, nombrecompañiaempleoanterior2, 
                    domicilioempleoanterior2, telefonoempleoanterior2, puestodesempeñoempleoanterio2, 
                    sueldoinicialempleoanterior2, sueldofinalempleoanterior2, motivoseparacionempleoanterior2, 
                    nombrejefedirectoempleoanterior2, puestojefedirectoempleoanterior2, motivoseparacionempleoanterior2si, 
                    motivoseparacionempleoanterior2no, prestoservicioempleoanterior3desde, prestoserviciosempleoanterior3hasta, 
                    nombrecompañiaempleoanterior3, domicilioempleoanterior3, telefonoempleoanterior3, 
                    puestodesempeñoempleoanterio3, sueldoinicialempleoanterior3, sueldofinalempleoanterior3, 
                    motivoseparacionempleoanterior3, nombrejefedirectoempleoanterior3, puestojefedirectoempleoanterior3, 
                    motivoseparacionempleoanterior3si, motivoseparacionempleoanterior3no, referencianombre, referenciatelefono, 
                    referenciadomicilio, referenciaocupacion, referenciatiempoconocerse, referencianombre2, 
                    referenciatelefono2, referenciadomicilio2, referenciaocupacion2, referenciatiempoconocerse2, 
                    referencianombre3, referenciatelefono3, referenciadomicilio3, referenciaocupacion3, 
                    referenciatiempoconocerse3, referencianombre4, referenciatelefono4, referenciadomicilio4, 
                    referenciaocupacion4, referenciatiempoconocerse4, saberemppleootros, fachaunir, otrosingresos, 
                    importemensual, conyuguetrabaja, percepcionmensual, valoraproximano, importe, importemensual, 
                    abonomensual, gastomensual, comentarioentrevistador, respuestas, candidato, nombre, apellidomaterno, 
                    apellidopaterno));
            
            
            }
        } 
    }catch(Exception e){e.printStackTrace();}
        return null;
}
    

    
    protected void eliminarDatosDeFichero() {

    }

    
    protected void buscarDatosDeFichero() {

    }

    
    protected void actualizarDatosDeFichero() {

    }
}

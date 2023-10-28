
package Modelo;


public class Empleados extends Personas{

    
String puestoSolicitado, descripcionPuesto, fechaSolicitudEmpleo;
double sueldoMensualDeseado, sueldoMensualAutorizado, estatura, peso;

String domicilio, colonia, telefono, municipio, lugarNacimiento, sexo, operadorTelefono, email, fechaNacimiento;
int edad, codigoPostal;

String RegistroOperacionContribuyentes,claveUnicaRegistroPoblacion, numeroSeguridadSocial, Afore, numeroPasaporte, cartillaMilitar,
        LicenciaManejo, NumeroLicencia, DocumentacionExtrajeroLaboral;

String saludActual, enfermedadCronica, clubSocial, deporte, pasatiempo, metaVida;

String nombrePadre, vivePadre, finadoPadre, domicilioPadre, ocupacionPadre,
        nombreMadre, viveMadre, finadoMadre, domicilioMadre, ocupacionMadre,
        nombreConyugue, viveConyugue, finadoConyugue, domicilioConyugue, ocupacionConyugue;

String nombreEscuelaPrimaria, domicilioEscuelaPrimaria, FechaInicioEscuelaPrimaria, fechaFinalEscuelaPrimaria, añosCursadosEscuelaPrimaria, tituloEscuelaPrimaria,
       nombreEscuelaSecundaria, domicilioEscuelaSecundaria, FechaInicioEscuelaSecundaria, fechaFinalEscuelaSecundaria, añosCursadosEscuelaSecundaria, tituloEscuelaSecundaria, 
       nombreEscuelaPreparatoria, domicilioEscuelaPreparatoria, FechaInicioEscuelaPreparatoria, fechaFinalEscuelaPreparatoria, añosCursadosEscuelaPreparatoria, tituloEscuelaPreparatoria, 
       nombreEscuelaComercial, domicilioEscuelaComercial, FechaInicioEscuelaComercial, fechaFinalEscuelaComercial, añosCursadosEscuelaComercial, tituloEscuelaComercial, 
       nombreEscuelaActual, horarioEscuelaActual, carreraEscuelaActual, gradoEscuelaActual;

String IdiomasExtranjeros, FuncionesOficina, MaquinasOficinaManejo, SoftwareDomina, otrasFuncionesDomina;

String prestoServisiosEmpleoActualDesde, prestoServisiosEmpleoActualHasta, nombreCompañiaEmpleoActual, domicilioEmpleoActual,
        telefonoEmpleoActual,puestoDesempeñoEmpleoActual, sueldoInicialEmpleoActual, sueldoFinalEmpleoActual, motivoSeparacionEmpleoActual,
        nombreJefeDirectoEmpleoActual, puestoJefeDirectoEmpleoActual, motivoseparacionEmpleoActualSi,motivoseparacionEmpleoActualNo,
        prestoServisiosEmpleoAnterior1Desde, prestoServisiosEmpleoAnterior1Hasta, nombreCompañiaEmpleoAnterior1, domicilioEmpleoAnterior1,
        telefonoEmpleoAnterior1,puestoDesempeñoEmpleoAnterior1, sueldoInicialEmpleoAnterior1, sueldoFinalEmpleoAnterior1, motivoSeparacionEmpleoAnterior1,
        nombreJefeDirectoEmpleoAnterior1, puestoJefeDirectoEmpleoAnterior1, motivoseparacionEmpleoAnterior1Si,motivoseparacionEmpleoAnterior1No,
        prestoServisiosEmpleoAnterior2Desde, prestoServisiosEmpleoAnterior2Hasta, nombreCompañiaEmpleoAnterior2, domicilioEmpleoAnterior2,
        telefonoEmpleoAnterior2,puestoDesempeñoEmpleoAnterior2, sueldoInicialEmpleoAnterior2, sueldoFinalEmpleoAnterior2, motivoSeparacionEmpleoAnterior2,
        nombreJefeDirectoEmpleoAnterior2, puestoJefeDirectoEmpleoAnterior2, motivoseparacionEmpleoAnterior2Si, motivoseparacionEmpleoAnterior2No,
        prestoServisiosEmpleoAnterior3Desde, prestoServisiosEmpleoAnterior3Hasta, nombreCompañiaEmpleoAnterior3, domicilioEmpleoAnterior3,
        telefonoEmpleoAnterior3,puestoDesempeñoEmpleoAnterior3, sueldoInicialEmpleoAnterior3, sueldoFinalEmpleoAnterior3, motivoSeparacionEmpleoAnterior3,
        nombreJefeDirectoEmpleoAnterior3, puestoJefeDirectoEmpleoAnterior3, motivoseparacionEmpleoAnterior3Si,motivoseparacionEmpleoAnterior3No;
        
String  referenciaNombre, referenciaTelefono, referenciaDomicilio, referenciaOcupacion, referenciatimepoconocerce,
        referenciaNombre2, referenciaTelefono2, referenciaDomicilio2, referenciaOcupacion2, referenciatimepoconocerce2,
        referenciaNombre3, referenciaTelefono3, referenciaDomicilio3, referenciaOcupacion3, referenciatimepoconocerce3,
        referenciaNombre4, referenciaTelefono4, referenciaDomicilio4, referenciaOcupacion4, referenciatimepoconocerce4;

String saberEmpleoOtro, FachaUnir;

String otrosIngresos, importeMensual, conyugueTrabaja, PercepcionMensual, valorAproximado, Importe, ImporteDeudas, abonoMensual, gastosMensuales;

String comentarioEntrevistador, Respuestas, Candidato;

    public Empleados(){
    }

    public Empleados(String puestoSolicitado, String descripcionPuesto, String fechaSolicitudEmpleo, double sueldoMensualDeseado, double sueldoMensualAutorizado, double estatura, double peso, String domicilio, String colonia, String telefono, String municipio, String lugarNacimiento, String sexo, String operadorTelefono, String email, String fechaNacimiento, int edad, int codigoPostal, String RegistroOperacionContribuyentes, String claveUnicaRegistroPoblacion, String numeroSeguridadSocial, String Afore, String numeroPasaporte, String cartillaMilitar, String LicenciaManejo, String NumeroLicencia, String DocumentacionExtrajeroLaboral, String saludActual, String enfermedadCronica, String clubSocial, String deporte, String pasatiempo, String metaVida, String nombrePadre, String vivePadre, String finadoPadre, String domicilioPadre, String ocupacionPadre, String nombreMadre, String viveMadre, String finadoMadre, String domicilioMadre, String ocupacionMadre, String nombreConyugue, String viveConyugue, String finadoConyugue, String domicilioConyugue, String ocupacionConyugue, String nombreEscuelaPrimaria, String domicilioEscuelaPrimaria, String FechaInicioEscuelaPrimaria, String fechaFinalEscuelaPrimaria, String añosCursadosEscuelaPrimaria, String tituloEscuelaPrimaria, String nombreEscuelaSecundaria, String domicilioEscuelaSecundaria, String FechaInicioEscuelaSecundaria, String fechaFinalEscuelaSecundaria, String añosCursadosEscuelaSecundaria, String tituloEscuelaSecundaria, String nombreEscuelaPreparatoria, String domicilioEscuelaPreparatoria, String FechaInicioEscuelaPreparatoria, String fechaFinalEscuelaPreparatoria, String añosCursadosEscuelaPreparatoria, String tituloEscuelaPreparatoria, String nombreEscuelaComercial, String domicilioEscuelaComercial, String FechaInicioEscuelaComercial, String fechaFinalEscuelaComercial, String añosCursadosEscuelaComercial, String tituloEscuelaComercial, String nombreEscuelaActual, String horarioEscuelaActual, String carreraEscuelaActual, String gradoEscuelaActual, String IdiomasExtranjeros, String FuncionesOficina, String MaquinasOficinaManejo, String SoftwareDomina, String otrasFuncionesDomina, String prestoServisiosEmpleoActualDesde, String prestoServisiosEmpleoActualHasta, String nombreCompañiaEmpleoActual, String domicilioEmpleoActual, String telefonoEmpleoActual, String puestoDesempeñoEmpleoActual, String sueldoInicialEmpleoActual, String sueldoFinalEmpleoActual, String motivoSeparacionEmpleoActual, String nombreJefeDirectoEmpleoActual, String puestoJefeDirectoEmpleoActual, String motivoseparacionEmpleoActualSi, String motivoseparacionEmpleoActualNo, String prestoServisiosEmpleoAnterior1Desde, String prestoServisiosEmpleoAnterior1Hasta, String nombreCompañiaEmpleoAnterior1, String domicilioEmpleoAnterior1, String telefonoEmpleoAnterior1, String puestoDesempeñoEmpleoAnterior1, String sueldoInicialEmpleoAnterior1, String sueldoFinalEmpleoAnterior1, String motivoSeparacionEmpleoAnterior1, String nombreJefeDirectoEmpleoAnterior1, String puestoJefeDirectoEmpleoAnterior1, String motivoseparacionEmpleoAnterior1Si, String motivoseparacionEmpleoAnterior1No, String prestoServisiosEmpleoAnterior2Desde, String prestoServisiosEmpleoAnterior2Hasta, String nombreCompañiaEmpleoAnterior2, String domicilioEmpleoAnterior2, String telefonoEmpleoAnterior2, String puestoDesempeñoEmpleoAnterior2, String sueldoInicialEmpleoAnterior2, String sueldoFinalEmpleoAnterior2, String motivoSeparacionEmpleoAnterior2, String nombreJefeDirectoEmpleoAnterior2, String puestoJefeDirectoEmpleoAnterior2, String motivoseparacionEmpleoAnterior2Si, String motivoseparacionEmpleoAnterior2No, String prestoServisiosEmpleoAnterior3Desde, String prestoServisiosEmpleoAnterior3Hasta, String nombreCompañiaEmpleoAnterior3, String domicilioEmpleoAnterior3, String telefonoEmpleoAnterior3, String puestoDesempeñoEmpleoAnterior3, String sueldoInicialEmpleoAnterior3, String sueldoFinalEmpleoAnterior3, String motivoSeparacionEmpleoAnterior3, String nombreJefeDirectoEmpleoAnterior3, String puestoJefeDirectoEmpleoAnterior3, String motivoseparacionEmpleoAnterior3Si, String motivoseparacionEmpleoAnterior3No, String referenciaNombre, String referenciaTelefono, String referenciaDomicilio, String referenciaOcupacion, String referenciatimepoconocerce, String referenciaNombre2, String referenciaTelefono2, String referenciaDomicilio2, String referenciaOcupacion2, String referenciatimepoconocerce2, String referenciaNombre3, String referenciaTelefono3, String referenciaDomicilio3, String referenciaOcupacion3, String referenciatimepoconocerce3, String referenciaNombre4, String referenciaTelefono4, String referenciaDomicilio4, String referenciaOcupacion4, String referenciatimepoconocerce4, String saberEmpleoOtro, String FachaUnir, String otrosIngresos, String importeMensual, String conyugueTrabaja, String PercepcionMensual, String valorAproximado, String Importe, String ImporteDeudas, String abonoMensual, String gastosMensuales, String comentarioEntrevistador, String Respuestas, String Candidato, String nombre, String apellidoMaterno, String apellidoPaterno) {
        super(nombre, apellidoMaterno, apellidoPaterno);
        this.puestoSolicitado = puestoSolicitado;
        this.descripcionPuesto = descripcionPuesto;
        this.fechaSolicitudEmpleo = fechaSolicitudEmpleo;
        this.sueldoMensualDeseado = sueldoMensualDeseado;
        this.sueldoMensualAutorizado = sueldoMensualAutorizado;
        this.estatura = estatura;
        this.peso = peso;
        this.domicilio = domicilio;
        this.colonia = colonia;
        this.telefono = telefono;
        this.municipio = municipio;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
        this.operadorTelefono = operadorTelefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.codigoPostal = codigoPostal;
        this.RegistroOperacionContribuyentes = RegistroOperacionContribuyentes;
        this.claveUnicaRegistroPoblacion = claveUnicaRegistroPoblacion;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.Afore = Afore;
        this.numeroPasaporte = numeroPasaporte;
        this.cartillaMilitar = cartillaMilitar;
        this.LicenciaManejo = LicenciaManejo;
        this.NumeroLicencia = NumeroLicencia;
        this.DocumentacionExtrajeroLaboral = DocumentacionExtrajeroLaboral;
        this.saludActual = saludActual;
        this.enfermedadCronica = enfermedadCronica;
        this.clubSocial = clubSocial;
        this.deporte = deporte;
        this.pasatiempo = pasatiempo;
        this.metaVida = metaVida;
        this.nombrePadre = nombrePadre;
        this.vivePadre = vivePadre;
        this.finadoPadre = finadoPadre;
        this.domicilioPadre = domicilioPadre;
        this.ocupacionPadre = ocupacionPadre;
        this.nombreMadre = nombreMadre;
        this.viveMadre = viveMadre;
        this.finadoMadre = finadoMadre;
        this.domicilioMadre = domicilioMadre;
        this.ocupacionMadre = ocupacionMadre;
        this.nombreConyugue = nombreConyugue;
        this.viveConyugue = viveConyugue;
        this.finadoConyugue = finadoConyugue;
        this.domicilioConyugue = domicilioConyugue;
        this.ocupacionConyugue = ocupacionConyugue;
        this.nombreEscuelaPrimaria = nombreEscuelaPrimaria;
        this.domicilioEscuelaPrimaria = domicilioEscuelaPrimaria;
        this.FechaInicioEscuelaPrimaria = FechaInicioEscuelaPrimaria;
        this.fechaFinalEscuelaPrimaria = fechaFinalEscuelaPrimaria;
        this.añosCursadosEscuelaPrimaria = añosCursadosEscuelaPrimaria;
        this.tituloEscuelaPrimaria = tituloEscuelaPrimaria;
        this.nombreEscuelaSecundaria = nombreEscuelaSecundaria;
        this.domicilioEscuelaSecundaria = domicilioEscuelaSecundaria;
        this.FechaInicioEscuelaSecundaria = FechaInicioEscuelaSecundaria;
        this.fechaFinalEscuelaSecundaria = fechaFinalEscuelaSecundaria;
        this.añosCursadosEscuelaSecundaria = añosCursadosEscuelaSecundaria;
        this.tituloEscuelaSecundaria = tituloEscuelaSecundaria;
        this.nombreEscuelaPreparatoria = nombreEscuelaPreparatoria;
        this.domicilioEscuelaPreparatoria = domicilioEscuelaPreparatoria;
        this.FechaInicioEscuelaPreparatoria = FechaInicioEscuelaPreparatoria;
        this.fechaFinalEscuelaPreparatoria = fechaFinalEscuelaPreparatoria;
        this.añosCursadosEscuelaPreparatoria = añosCursadosEscuelaPreparatoria;
        this.tituloEscuelaPreparatoria = tituloEscuelaPreparatoria;
        this.nombreEscuelaComercial = nombreEscuelaComercial;
        this.domicilioEscuelaComercial = domicilioEscuelaComercial;
        this.FechaInicioEscuelaComercial = FechaInicioEscuelaComercial;
        this.fechaFinalEscuelaComercial = fechaFinalEscuelaComercial;
        this.añosCursadosEscuelaComercial = añosCursadosEscuelaComercial;
        this.tituloEscuelaComercial = tituloEscuelaComercial;
        this.nombreEscuelaActual = nombreEscuelaActual;
        this.horarioEscuelaActual = horarioEscuelaActual;
        this.carreraEscuelaActual = carreraEscuelaActual;
        this.gradoEscuelaActual = gradoEscuelaActual;
        this.IdiomasExtranjeros = IdiomasExtranjeros;
        this.FuncionesOficina = FuncionesOficina;
        this.MaquinasOficinaManejo = MaquinasOficinaManejo;
        this.SoftwareDomina = SoftwareDomina;
        this.otrasFuncionesDomina = otrasFuncionesDomina;
        this.prestoServisiosEmpleoActualDesde = prestoServisiosEmpleoActualDesde;
        this.prestoServisiosEmpleoActualHasta = prestoServisiosEmpleoActualHasta;
        this.nombreCompañiaEmpleoActual = nombreCompañiaEmpleoActual;
        this.domicilioEmpleoActual = domicilioEmpleoActual;
        this.telefonoEmpleoActual = telefonoEmpleoActual;
        this.puestoDesempeñoEmpleoActual = puestoDesempeñoEmpleoActual;
        this.sueldoInicialEmpleoActual = sueldoInicialEmpleoActual;
        this.sueldoFinalEmpleoActual = sueldoFinalEmpleoActual;
        this.motivoSeparacionEmpleoActual = motivoSeparacionEmpleoActual;
        this.nombreJefeDirectoEmpleoActual = nombreJefeDirectoEmpleoActual;
        this.puestoJefeDirectoEmpleoActual = puestoJefeDirectoEmpleoActual;
        this.motivoseparacionEmpleoActualSi = motivoseparacionEmpleoActualSi;
        this.motivoseparacionEmpleoActualNo = motivoseparacionEmpleoActualNo;
        this.prestoServisiosEmpleoAnterior1Desde = prestoServisiosEmpleoAnterior1Desde;
        this.prestoServisiosEmpleoAnterior1Hasta = prestoServisiosEmpleoAnterior1Hasta;
        this.nombreCompañiaEmpleoAnterior1 = nombreCompañiaEmpleoAnterior1;
        this.domicilioEmpleoAnterior1 = domicilioEmpleoAnterior1;
        this.telefonoEmpleoAnterior1 = telefonoEmpleoAnterior1;
        this.puestoDesempeñoEmpleoAnterior1 = puestoDesempeñoEmpleoAnterior1;
        this.sueldoInicialEmpleoAnterior1 = sueldoInicialEmpleoAnterior1;
        this.sueldoFinalEmpleoAnterior1 = sueldoFinalEmpleoAnterior1;
        this.motivoSeparacionEmpleoAnterior1 = motivoSeparacionEmpleoAnterior1;
        this.nombreJefeDirectoEmpleoAnterior1 = nombreJefeDirectoEmpleoAnterior1;
        this.puestoJefeDirectoEmpleoAnterior1 = puestoJefeDirectoEmpleoAnterior1;
        this.motivoseparacionEmpleoAnterior1Si = motivoseparacionEmpleoAnterior1Si;
        this.motivoseparacionEmpleoAnterior1No = motivoseparacionEmpleoAnterior1No;
        this.prestoServisiosEmpleoAnterior2Desde = prestoServisiosEmpleoAnterior2Desde;
        this.prestoServisiosEmpleoAnterior2Hasta = prestoServisiosEmpleoAnterior2Hasta;
        this.nombreCompañiaEmpleoAnterior2 = nombreCompañiaEmpleoAnterior2;
        this.domicilioEmpleoAnterior2 = domicilioEmpleoAnterior2;
        this.telefonoEmpleoAnterior2 = telefonoEmpleoAnterior2;
        this.puestoDesempeñoEmpleoAnterior2 = puestoDesempeñoEmpleoAnterior2;
        this.sueldoInicialEmpleoAnterior2 = sueldoInicialEmpleoAnterior2;
        this.sueldoFinalEmpleoAnterior2 = sueldoFinalEmpleoAnterior2;
        this.motivoSeparacionEmpleoAnterior2 = motivoSeparacionEmpleoAnterior2;
        this.nombreJefeDirectoEmpleoAnterior2 = nombreJefeDirectoEmpleoAnterior2;
        this.puestoJefeDirectoEmpleoAnterior2 = puestoJefeDirectoEmpleoAnterior2;
        this.motivoseparacionEmpleoAnterior2Si = motivoseparacionEmpleoAnterior2Si;
        this.motivoseparacionEmpleoAnterior2No = motivoseparacionEmpleoAnterior2No;
        this.prestoServisiosEmpleoAnterior3Desde = prestoServisiosEmpleoAnterior3Desde;
        this.prestoServisiosEmpleoAnterior3Hasta = prestoServisiosEmpleoAnterior3Hasta;
        this.nombreCompañiaEmpleoAnterior3 = nombreCompañiaEmpleoAnterior3;
        this.domicilioEmpleoAnterior3 = domicilioEmpleoAnterior3;
        this.telefonoEmpleoAnterior3 = telefonoEmpleoAnterior3;
        this.puestoDesempeñoEmpleoAnterior3 = puestoDesempeñoEmpleoAnterior3;
        this.sueldoInicialEmpleoAnterior3 = sueldoInicialEmpleoAnterior3;
        this.sueldoFinalEmpleoAnterior3 = sueldoFinalEmpleoAnterior3;
        this.motivoSeparacionEmpleoAnterior3 = motivoSeparacionEmpleoAnterior3;
        this.nombreJefeDirectoEmpleoAnterior3 = nombreJefeDirectoEmpleoAnterior3;
        this.puestoJefeDirectoEmpleoAnterior3 = puestoJefeDirectoEmpleoAnterior3;
        this.motivoseparacionEmpleoAnterior3Si = motivoseparacionEmpleoAnterior3Si;
        this.motivoseparacionEmpleoAnterior3No = motivoseparacionEmpleoAnterior3No;
        this.referenciaNombre = referenciaNombre;
        this.referenciaTelefono = referenciaTelefono;
        this.referenciaDomicilio = referenciaDomicilio;
        this.referenciaOcupacion = referenciaOcupacion;
        this.referenciatimepoconocerce = referenciatimepoconocerce;
        this.referenciaNombre2 = referenciaNombre2;
        this.referenciaTelefono2 = referenciaTelefono2;
        this.referenciaDomicilio2 = referenciaDomicilio2;
        this.referenciaOcupacion2 = referenciaOcupacion2;
        this.referenciatimepoconocerce2 = referenciatimepoconocerce2;
        this.referenciaNombre3 = referenciaNombre3;
        this.referenciaTelefono3 = referenciaTelefono3;
        this.referenciaDomicilio3 = referenciaDomicilio3;
        this.referenciaOcupacion3 = referenciaOcupacion3;
        this.referenciatimepoconocerce3 = referenciatimepoconocerce3;
        this.referenciaNombre4 = referenciaNombre4;
        this.referenciaTelefono4 = referenciaTelefono4;
        this.referenciaDomicilio4 = referenciaDomicilio4;
        this.referenciaOcupacion4 = referenciaOcupacion4;
        this.referenciatimepoconocerce4 = referenciatimepoconocerce4;
        this.saberEmpleoOtro = saberEmpleoOtro;
        this.FachaUnir = FachaUnir;
        this.otrosIngresos = otrosIngresos;
        this.importeMensual = importeMensual;
        this.conyugueTrabaja = conyugueTrabaja;
        this.PercepcionMensual = PercepcionMensual;
        this.valorAproximado = valorAproximado;
        this.Importe = Importe;
        this.ImporteDeudas = ImporteDeudas;
        this.abonoMensual = abonoMensual;
        this.gastosMensuales = gastosMensuales;
        this.comentarioEntrevistador = comentarioEntrevistador;
        this.Respuestas = Respuestas;
        this.Candidato = Candidato;
    }

    public String getPuestoSolicitado() {
        return puestoSolicitado;
    }

    public void setPuestoSolicitado(String puestoSolicitado) {
        this.puestoSolicitado = puestoSolicitado;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public String getFechaSolicitudEmpleo() {
        return fechaSolicitudEmpleo;
    }

    public void setFechaSolicitudEmpleo(String fechaSolicitudEmpleo) {
        this.fechaSolicitudEmpleo = fechaSolicitudEmpleo;
    }

    public double getSueldoMensualDeseado() {
        return sueldoMensualDeseado;
    }

    public void setSueldoMensualDeseado(double sueldoMensualDeseado) {
        this.sueldoMensualDeseado = sueldoMensualDeseado;
    }

    public double getSueldoMensualAutorizado() {
        return sueldoMensualAutorizado;
    }

    public void setSueldoMensualAutorizado(double sueldoMensualAutorizado) {
        this.sueldoMensualAutorizado = sueldoMensualAutorizado;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOperadorTelefono() {
        return operadorTelefono;
    }

    public void setOperadorTelefono(String operadorTelefono) {
        this.operadorTelefono = operadorTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getRegistroOperacionContribuyentes() {
        return RegistroOperacionContribuyentes;
    }

    public void setRegistroOperacionContribuyentes(String RegistroOperacionContribuyentes) {
        this.RegistroOperacionContribuyentes = RegistroOperacionContribuyentes;
    }

    public String getClaveUnicaRegistroPoblacion() {
        return claveUnicaRegistroPoblacion;
    }

    public void setClaveUnicaRegistroPoblacion(String claveUnicaRegistroPoblacion) {
        this.claveUnicaRegistroPoblacion = claveUnicaRegistroPoblacion;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getAfore() {
        return Afore;
    }

    public void setAfore(String Afore) {
        this.Afore = Afore;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getCartillaMilitar() {
        return cartillaMilitar;
    }

    public void setCartillaMilitar(String cartillaMilitar) {
        this.cartillaMilitar = cartillaMilitar;
    }

    public String getLicenciaManejo() {
        return LicenciaManejo;
    }

    public void setLicenciaManejo(String LicenciaManejo) {
        this.LicenciaManejo = LicenciaManejo;
    }

    public String getNumeroLicencia() {
        return NumeroLicencia;
    }

    public void setNumeroLicencia(String NumeroLicencia) {
        this.NumeroLicencia = NumeroLicencia;
    }

    public String getDocumentacionExtrajeroLaboral() {
        return DocumentacionExtrajeroLaboral;
    }

    public void setDocumentacionExtrajeroLaboral(String DocumentacionExtrajeroLaboral) {
        this.DocumentacionExtrajeroLaboral = DocumentacionExtrajeroLaboral;
    }

    public String getSaludActual() {
        return saludActual;
    }

    public void setSaludActual(String saludActual) {
        this.saludActual = saludActual;
    }

    public String getEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(String enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public String getClubSocial() {
        return clubSocial;
    }

    public void setClubSocial(String clubSocial) {
        this.clubSocial = clubSocial;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public String getMetaVida() {
        return metaVida;
    }

    public void setMetaVida(String metaVida) {
        this.metaVida = metaVida;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getVivePadre() {
        return vivePadre;
    }

    public void setVivePadre(String vivePadre) {
        this.vivePadre = vivePadre;
    }

    public String getFinadoPadre() {
        return finadoPadre;
    }

    public void setFinadoPadre(String finadoPadre) {
        this.finadoPadre = finadoPadre;
    }

    public String getDomicilioPadre() {
        return domicilioPadre;
    }

    public void setDomicilioPadre(String domicilioPadre) {
        this.domicilioPadre = domicilioPadre;
    }

    public String getOcupacionPadre() {
        return ocupacionPadre;
    }

    public void setOcupacionPadre(String ocupacionPadre) {
        this.ocupacionPadre = ocupacionPadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getViveMadre() {
        return viveMadre;
    }

    public void setViveMadre(String viveMadre) {
        this.viveMadre = viveMadre;
    }

    public String getFinadoMadre() {
        return finadoMadre;
    }

    public void setFinadoMadre(String finadoMadre) {
        this.finadoMadre = finadoMadre;
    }

    public String getDomicilioMadre() {
        return domicilioMadre;
    }

    public void setDomicilioMadre(String domicilioMadre) {
        this.domicilioMadre = domicilioMadre;
    }

    public String getOcupacionMadre() {
        return ocupacionMadre;
    }

    public void setOcupacionMadre(String ocupacionMadre) {
        this.ocupacionMadre = ocupacionMadre;
    }

    public String getNombreConyugue() {
        return nombreConyugue;
    }

    public void setNombreConyugue(String nombreConyugue) {
        this.nombreConyugue = nombreConyugue;
    }

    public String getViveConyugue() {
        return viveConyugue;
    }

    public void setViveConyugue(String viveConyugue) {
        this.viveConyugue = viveConyugue;
    }

    public String getFinadoConyugue() {
        return finadoConyugue;
    }

    public void setFinadoConyugue(String finadoConyugue) {
        this.finadoConyugue = finadoConyugue;
    }

    public String getDomicilioConyugue() {
        return domicilioConyugue;
    }

    public void setDomicilioConyugue(String domicilioConyugue) {
        this.domicilioConyugue = domicilioConyugue;
    }

    public String getOcupacionConyugue() {
        return ocupacionConyugue;
    }

    public void setOcupacionConyugue(String ocupacionConyugue) {
        this.ocupacionConyugue = ocupacionConyugue;
    }

    public String getNombreEscuelaPrimaria() {
        return nombreEscuelaPrimaria;
    }

    public void setNombreEscuelaPrimaria(String nombreEscuelaPrimaria) {
        this.nombreEscuelaPrimaria = nombreEscuelaPrimaria;
    }

    public String getDomicilioEscuelaPrimaria() {
        return domicilioEscuelaPrimaria;
    }

    public void setDomicilioEscuelaPrimaria(String domicilioEscuelaPrimaria) {
        this.domicilioEscuelaPrimaria = domicilioEscuelaPrimaria;
    }

    public String getFechaInicioEscuelaPrimaria() {
        return FechaInicioEscuelaPrimaria;
    }

    public void setFechaInicioEscuelaPrimaria(String FechaInicioEscuelaPrimaria) {
        this.FechaInicioEscuelaPrimaria = FechaInicioEscuelaPrimaria;
    }

    public String getFechaFinalEscuelaPrimaria() {
        return fechaFinalEscuelaPrimaria;
    }

    public void setFechaFinalEscuelaPrimaria(String fechaFinalEscuelaPrimaria) {
        this.fechaFinalEscuelaPrimaria = fechaFinalEscuelaPrimaria;
    }

    public String getAñosCursadosEscuelaPrimaria() {
        return añosCursadosEscuelaPrimaria;
    }

    public void setAñosCursadosEscuelaPrimaria(String añosCursadosEscuelaPrimaria) {
        this.añosCursadosEscuelaPrimaria = añosCursadosEscuelaPrimaria;
    }

    public String getTituloEscuelaPrimaria() {
        return tituloEscuelaPrimaria;
    }

    public void setTituloEscuelaPrimaria(String tituloEscuelaPrimaria) {
        this.tituloEscuelaPrimaria = tituloEscuelaPrimaria;
    }

    public String getNombreEscuelaSecundaria() {
        return nombreEscuelaSecundaria;
    }

    public void setNombreEscuelaSecundaria(String nombreEscuelaSecundaria) {
        this.nombreEscuelaSecundaria = nombreEscuelaSecundaria;
    }

    public String getDomicilioEscuelaSecundaria() {
        return domicilioEscuelaSecundaria;
    }

    public void setDomicilioEscuelaSecundaria(String domicilioEscuelaSecundaria) {
        this.domicilioEscuelaSecundaria = domicilioEscuelaSecundaria;
    }

    public String getFechaInicioEscuelaSecundaria() {
        return FechaInicioEscuelaSecundaria;
    }

    public void setFechaInicioEscuelaSecundaria(String FechaInicioEscuelaSecundaria) {
        this.FechaInicioEscuelaSecundaria = FechaInicioEscuelaSecundaria;
    }

    public String getFechaFinalEscuelaSecundaria() {
        return fechaFinalEscuelaSecundaria;
    }

    public void setFechaFinalEscuelaSecundaria(String fechaFinalEscuelaSecundaria) {
        this.fechaFinalEscuelaSecundaria = fechaFinalEscuelaSecundaria;
    }

    public String getAñosCursadosEscuelaSecundaria() {
        return añosCursadosEscuelaSecundaria;
    }

    public void setAñosCursadosEscuelaSecundaria(String añosCursadosEscuelaSecundaria) {
        this.añosCursadosEscuelaSecundaria = añosCursadosEscuelaSecundaria;
    }

    public String getTituloEscuelaSecundaria() {
        return tituloEscuelaSecundaria;
    }

    public void setTituloEscuelaSecundaria(String tituloEscuelaSecundaria) {
        this.tituloEscuelaSecundaria = tituloEscuelaSecundaria;
    }

    public String getNombreEscuelaPreparatoria() {
        return nombreEscuelaPreparatoria;
    }

    public void setNombreEscuelaPreparatoria(String nombreEscuelaPreparatoria) {
        this.nombreEscuelaPreparatoria = nombreEscuelaPreparatoria;
    }

    public String getDomicilioEscuelaPreparatoria() {
        return domicilioEscuelaPreparatoria;
    }

    public void setDomicilioEscuelaPreparatoria(String domicilioEscuelaPreparatoria) {
        this.domicilioEscuelaPreparatoria = domicilioEscuelaPreparatoria;
    }

    public String getFechaInicioEscuelaPreparatoria() {
        return FechaInicioEscuelaPreparatoria;
    }

    public void setFechaInicioEscuelaPreparatoria(String FechaInicioEscuelaPreparatoria) {
        this.FechaInicioEscuelaPreparatoria = FechaInicioEscuelaPreparatoria;
    }

    public String getFechaFinalEscuelaPreparatoria() {
        return fechaFinalEscuelaPreparatoria;
    }

    public void setFechaFinalEscuelaPreparatoria(String fechaFinalEscuelaPreparatoria) {
        this.fechaFinalEscuelaPreparatoria = fechaFinalEscuelaPreparatoria;
    }

    public String getAñosCursadosEscuelaPreparatoria() {
        return añosCursadosEscuelaPreparatoria;
    }

    public void setAñosCursadosEscuelaPreparatoria(String añosCursadosEscuelaPreparatoria) {
        this.añosCursadosEscuelaPreparatoria = añosCursadosEscuelaPreparatoria;
    }

    public String getTituloEscuelaPreparatoria() {
        return tituloEscuelaPreparatoria;
    }

    public void setTituloEscuelaPreparatoria(String tituloEscuelaPreparatoria) {
        this.tituloEscuelaPreparatoria = tituloEscuelaPreparatoria;
    }

    public String getNombreEscuelaComercial() {
        return nombreEscuelaComercial;
    }

    public void setNombreEscuelaComercial(String nombreEscuelaComercial) {
        this.nombreEscuelaComercial = nombreEscuelaComercial;
    }

    public String getDomicilioEscuelaComercial() {
        return domicilioEscuelaComercial;
    }

    public void setDomicilioEscuelaComercial(String domicilioEscuelaComercial) {
        this.domicilioEscuelaComercial = domicilioEscuelaComercial;
    }

    public String getFechaInicioEscuelaComercial() {
        return FechaInicioEscuelaComercial;
    }

    public void setFechaInicioEscuelaComercial(String FechaInicioEscuelaComercial) {
        this.FechaInicioEscuelaComercial = FechaInicioEscuelaComercial;
    }

    public String getFechaFinalEscuelaComercial() {
        return fechaFinalEscuelaComercial;
    }

    public void setFechaFinalEscuelaComercial(String fechaFinalEscuelaComercial) {
        this.fechaFinalEscuelaComercial = fechaFinalEscuelaComercial;
    }

    public String getAñosCursadosEscuelaComercial() {
        return añosCursadosEscuelaComercial;
    }

    public void setAñosCursadosEscuelaComercial(String añosCursadosEscuelaComercial) {
        this.añosCursadosEscuelaComercial = añosCursadosEscuelaComercial;
    }

    public String getTituloEscuelaComercial() {
        return tituloEscuelaComercial;
    }

    public void setTituloEscuelaComercial(String tituloEscuelaComercial) {
        this.tituloEscuelaComercial = tituloEscuelaComercial;
    }

    public String getNombreEscuelaActual() {
        return nombreEscuelaActual;
    }

    public void setNombreEscuelaActual(String nombreEscuelaActual) {
        this.nombreEscuelaActual = nombreEscuelaActual;
    }

    public String getHorarioEscuelaActual() {
        return horarioEscuelaActual;
    }

    public void setHorarioEscuelaActual(String horarioEscuelaActual) {
        this.horarioEscuelaActual = horarioEscuelaActual;
    }

    public String getCarreraEscuelaActual() {
        return carreraEscuelaActual;
    }

    public void setCarreraEscuelaActual(String carreraEscuelaActual) {
        this.carreraEscuelaActual = carreraEscuelaActual;
    }

    public String getGradoEscuelaActual() {
        return gradoEscuelaActual;
    }

    public void setGradoEscuelaActual(String gradoEscuelaActual) {
        this.gradoEscuelaActual = gradoEscuelaActual;
    }

    public String getIdiomasExtranjeros() {
        return IdiomasExtranjeros;
    }

    public void setIdiomasExtranjeros(String IdiomasExtranjeros) {
        this.IdiomasExtranjeros = IdiomasExtranjeros;
    }

    public String getFuncionesOficina() {
        return FuncionesOficina;
    }

    public void setFuncionesOficina(String FuncionesOficina) {
        this.FuncionesOficina = FuncionesOficina;
    }

    public String getMaquinasOficinaManejo() {
        return MaquinasOficinaManejo;
    }

    public void setMaquinasOficinaManejo(String MaquinasOficinaManejo) {
        this.MaquinasOficinaManejo = MaquinasOficinaManejo;
    }

    public String getSoftwareDomina() {
        return SoftwareDomina;
    }

    public void setSoftwareDomina(String SoftwareDomina) {
        this.SoftwareDomina = SoftwareDomina;
    }

    public String getOtrasFuncionesDomina() {
        return otrasFuncionesDomina;
    }

    public void setOtrasFuncionesDomina(String otrasFuncionesDomina) {
        this.otrasFuncionesDomina = otrasFuncionesDomina;
    }

    public String getPrestoServisiosEmpleoActualDesde() {
        return prestoServisiosEmpleoActualDesde;
    }

    public void setPrestoServisiosEmpleoActualDesde(String prestoServisiosEmpleoActualDesde) {
        this.prestoServisiosEmpleoActualDesde = prestoServisiosEmpleoActualDesde;
    }

    public String getPrestoServisiosEmpleoActualHasta() {
        return prestoServisiosEmpleoActualHasta;
    }

    public void setPrestoServisiosEmpleoActualHasta(String prestoServisiosEmpleoActualHasta) {
        this.prestoServisiosEmpleoActualHasta = prestoServisiosEmpleoActualHasta;
    }

    public String getNombreCompañiaEmpleoActual() {
        return nombreCompañiaEmpleoActual;
    }

    public void setNombreCompañiaEmpleoActual(String nombreCompañiaEmpleoActual) {
        this.nombreCompañiaEmpleoActual = nombreCompañiaEmpleoActual;
    }

    public String getDomicilioEmpleoActual() {
        return domicilioEmpleoActual;
    }

    public void setDomicilioEmpleoActual(String domicilioEmpleoActual) {
        this.domicilioEmpleoActual = domicilioEmpleoActual;
    }

    public String getTelefonoEmpleoActual() {
        return telefonoEmpleoActual;
    }

    public void setTelefonoEmpleoActual(String telefonoEmpleoActual) {
        this.telefonoEmpleoActual = telefonoEmpleoActual;
    }

    public String getPuestoDesempeñoEmpleoActual() {
        return puestoDesempeñoEmpleoActual;
    }

    public void setPuestoDesempeñoEmpleoActual(String puestoDesempeñoEmpleoActual) {
        this.puestoDesempeñoEmpleoActual = puestoDesempeñoEmpleoActual;
    }

    public String getSueldoInicialEmpleoActual() {
        return sueldoInicialEmpleoActual;
    }

    public void setSueldoInicialEmpleoActual(String sueldoInicialEmpleoActual) {
        this.sueldoInicialEmpleoActual = sueldoInicialEmpleoActual;
    }

    public String getSueldoFinalEmpleoActual() {
        return sueldoFinalEmpleoActual;
    }

    public void setSueldoFinalEmpleoActual(String sueldoFinalEmpleoActual) {
        this.sueldoFinalEmpleoActual = sueldoFinalEmpleoActual;
    }

    public String getMotivoSeparacionEmpleoActual() {
        return motivoSeparacionEmpleoActual;
    }

    public void setMotivoSeparacionEmpleoActual(String motivoSeparacionEmpleoActual) {
        this.motivoSeparacionEmpleoActual = motivoSeparacionEmpleoActual;
    }

    public String getNombreJefeDirectoEmpleoActual() {
        return nombreJefeDirectoEmpleoActual;
    }

    public void setNombreJefeDirectoEmpleoActual(String nombreJefeDirectoEmpleoActual) {
        this.nombreJefeDirectoEmpleoActual = nombreJefeDirectoEmpleoActual;
    }

    public String getPuestoJefeDirectoEmpleoActual() {
        return puestoJefeDirectoEmpleoActual;
    }

    public void setPuestoJefeDirectoEmpleoActual(String puestoJefeDirectoEmpleoActual) {
        this.puestoJefeDirectoEmpleoActual = puestoJefeDirectoEmpleoActual;
    }

    public String getMotivoseparacionEmpleoActualSi() {
        return motivoseparacionEmpleoActualSi;
    }

    public void setMotivoseparacionEmpleoActualSi(String motivoseparacionEmpleoActualSi) {
        this.motivoseparacionEmpleoActualSi = motivoseparacionEmpleoActualSi;
    }

    public String getMotivoseparacionEmpleoActualNo() {
        return motivoseparacionEmpleoActualNo;
    }

    public void setMotivoseparacionEmpleoActualNo(String motivoseparacionEmpleoActualNo) {
        this.motivoseparacionEmpleoActualNo = motivoseparacionEmpleoActualNo;
    }

    public String getPrestoServisiosEmpleoAnterior1Desde() {
        return prestoServisiosEmpleoAnterior1Desde;
    }

    public void setPrestoServisiosEmpleoAnterior1Desde(String prestoServisiosEmpleoAnterior1Desde) {
        this.prestoServisiosEmpleoAnterior1Desde = prestoServisiosEmpleoAnterior1Desde;
    }

    public String getPrestoServisiosEmpleoAnterior1Hasta() {
        return prestoServisiosEmpleoAnterior1Hasta;
    }

    public void setPrestoServisiosEmpleoAnterior1Hasta(String prestoServisiosEmpleoAnterior1Hasta) {
        this.prestoServisiosEmpleoAnterior1Hasta = prestoServisiosEmpleoAnterior1Hasta;
    }

    public String getNombreCompañiaEmpleoAnterior1() {
        return nombreCompañiaEmpleoAnterior1;
    }

    public void setNombreCompañiaEmpleoAnterior1(String nombreCompañiaEmpleoAnterior1) {
        this.nombreCompañiaEmpleoAnterior1 = nombreCompañiaEmpleoAnterior1;
    }

    public String getDomicilioEmpleoAnterior1() {
        return domicilioEmpleoAnterior1;
    }

    public void setDomicilioEmpleoAnterior1(String domicilioEmpleoAnterior1) {
        this.domicilioEmpleoAnterior1 = domicilioEmpleoAnterior1;
    }

    public String getTelefonoEmpleoAnterior1() {
        return telefonoEmpleoAnterior1;
    }

    public void setTelefonoEmpleoAnterior1(String telefonoEmpleoAnterior1) {
        this.telefonoEmpleoAnterior1 = telefonoEmpleoAnterior1;
    }

    public String getPuestoDesempeñoEmpleoAnterior1() {
        return puestoDesempeñoEmpleoAnterior1;
    }

    public void setPuestoDesempeñoEmpleoAnterior1(String puestoDesempeñoEmpleoAnterior1) {
        this.puestoDesempeñoEmpleoAnterior1 = puestoDesempeñoEmpleoAnterior1;
    }

    public String getSueldoInicialEmpleoAnterior1() {
        return sueldoInicialEmpleoAnterior1;
    }

    public void setSueldoInicialEmpleoAnterior1(String sueldoInicialEmpleoAnterior1) {
        this.sueldoInicialEmpleoAnterior1 = sueldoInicialEmpleoAnterior1;
    }

    public String getSueldoFinalEmpleoAnterior1() {
        return sueldoFinalEmpleoAnterior1;
    }

    public void setSueldoFinalEmpleoAnterior1(String sueldoFinalEmpleoAnterior1) {
        this.sueldoFinalEmpleoAnterior1 = sueldoFinalEmpleoAnterior1;
    }

    public String getMotivoSeparacionEmpleoAnterior1() {
        return motivoSeparacionEmpleoAnterior1;
    }

    public void setMotivoSeparacionEmpleoAnterior1(String motivoSeparacionEmpleoAnterior1) {
        this.motivoSeparacionEmpleoAnterior1 = motivoSeparacionEmpleoAnterior1;
    }

    public String getNombreJefeDirectoEmpleoAnterior1() {
        return nombreJefeDirectoEmpleoAnterior1;
    }

    public void setNombreJefeDirectoEmpleoAnterior1(String nombreJefeDirectoEmpleoAnterior1) {
        this.nombreJefeDirectoEmpleoAnterior1 = nombreJefeDirectoEmpleoAnterior1;
    }

    public String getPuestoJefeDirectoEmpleoAnterior1() {
        return puestoJefeDirectoEmpleoAnterior1;
    }

    public void setPuestoJefeDirectoEmpleoAnterior1(String puestoJefeDirectoEmpleoAnterior1) {
        this.puestoJefeDirectoEmpleoAnterior1 = puestoJefeDirectoEmpleoAnterior1;
    }

    public String getMotivoseparacionEmpleoAnterior1Si() {
        return motivoseparacionEmpleoAnterior1Si;
    }

    public void setMotivoseparacionEmpleoAnterior1Si(String motivoseparacionEmpleoAnterior1Si) {
        this.motivoseparacionEmpleoAnterior1Si = motivoseparacionEmpleoAnterior1Si;
    }

    public String getMotivoseparacionEmpleoAnterior1No() {
        return motivoseparacionEmpleoAnterior1No;
    }

    public void setMotivoseparacionEmpleoAnterior1No(String motivoseparacionEmpleoAnterior1No) {
        this.motivoseparacionEmpleoAnterior1No = motivoseparacionEmpleoAnterior1No;
    }

    public String getPrestoServisiosEmpleoAnterior2Desde() {
        return prestoServisiosEmpleoAnterior2Desde;
    }

    public void setPrestoServisiosEmpleoAnterior2Desde(String prestoServisiosEmpleoAnterior2Desde) {
        this.prestoServisiosEmpleoAnterior2Desde = prestoServisiosEmpleoAnterior2Desde;
    }

    public String getPrestoServisiosEmpleoAnterior2Hasta() {
        return prestoServisiosEmpleoAnterior2Hasta;
    }

    public void setPrestoServisiosEmpleoAnterior2Hasta(String prestoServisiosEmpleoAnterior2Hasta) {
        this.prestoServisiosEmpleoAnterior2Hasta = prestoServisiosEmpleoAnterior2Hasta;
    }

    public String getNombreCompañiaEmpleoAnterior2() {
        return nombreCompañiaEmpleoAnterior2;
    }

    public void setNombreCompañiaEmpleoAnterior2(String nombreCompañiaEmpleoAnterior2) {
        this.nombreCompañiaEmpleoAnterior2 = nombreCompañiaEmpleoAnterior2;
    }

    public String getDomicilioEmpleoAnterior2() {
        return domicilioEmpleoAnterior2;
    }

    public void setDomicilioEmpleoAnterior2(String domicilioEmpleoAnterior2) {
        this.domicilioEmpleoAnterior2 = domicilioEmpleoAnterior2;
    }

    public String getTelefonoEmpleoAnterior2() {
        return telefonoEmpleoAnterior2;
    }

    public void setTelefonoEmpleoAnterior2(String telefonoEmpleoAnterior2) {
        this.telefonoEmpleoAnterior2 = telefonoEmpleoAnterior2;
    }

    public String getPuestoDesempeñoEmpleoAnterior2() {
        return puestoDesempeñoEmpleoAnterior2;
    }

    public void setPuestoDesempeñoEmpleoAnterior2(String puestoDesempeñoEmpleoAnterior2) {
        this.puestoDesempeñoEmpleoAnterior2 = puestoDesempeñoEmpleoAnterior2;
    }

    public String getSueldoInicialEmpleoAnterior2() {
        return sueldoInicialEmpleoAnterior2;
    }

    public void setSueldoInicialEmpleoAnterior2(String sueldoInicialEmpleoAnterior2) {
        this.sueldoInicialEmpleoAnterior2 = sueldoInicialEmpleoAnterior2;
    }

    public String getSueldoFinalEmpleoAnterior2() {
        return sueldoFinalEmpleoAnterior2;
    }

    public void setSueldoFinalEmpleoAnterior2(String sueldoFinalEmpleoAnterior2) {
        this.sueldoFinalEmpleoAnterior2 = sueldoFinalEmpleoAnterior2;
    }

    public String getMotivoSeparacionEmpleoAnterior2() {
        return motivoSeparacionEmpleoAnterior2;
    }

    public void setMotivoSeparacionEmpleoAnterior2(String motivoSeparacionEmpleoAnterior2) {
        this.motivoSeparacionEmpleoAnterior2 = motivoSeparacionEmpleoAnterior2;
    }

    public String getNombreJefeDirectoEmpleoAnterior2() {
        return nombreJefeDirectoEmpleoAnterior2;
    }

    public void setNombreJefeDirectoEmpleoAnterior2(String nombreJefeDirectoEmpleoAnterior2) {
        this.nombreJefeDirectoEmpleoAnterior2 = nombreJefeDirectoEmpleoAnterior2;
    }

    public String getPuestoJefeDirectoEmpleoAnterior2() {
        return puestoJefeDirectoEmpleoAnterior2;
    }

    public void setPuestoJefeDirectoEmpleoAnterior2(String puestoJefeDirectoEmpleoAnterior2) {
        this.puestoJefeDirectoEmpleoAnterior2 = puestoJefeDirectoEmpleoAnterior2;
    }

    public String getMotivoseparacionEmpleoAnterior2Si() {
        return motivoseparacionEmpleoAnterior2Si;
    }

    public void setMotivoseparacionEmpleoAnterior2Si(String motivoseparacionEmpleoAnterior2Si) {
        this.motivoseparacionEmpleoAnterior2Si = motivoseparacionEmpleoAnterior2Si;
    }

    public String getMotivoseparacionEmpleoAnterior2No() {
        return motivoseparacionEmpleoAnterior2No;
    }

    public void setMotivoseparacionEmpleoAnterior2No(String motivoseparacionEmpleoAnterior2No) {
        this.motivoseparacionEmpleoAnterior2No = motivoseparacionEmpleoAnterior2No;
    }

    public String getPrestoServisiosEmpleoAnterior3Desde() {
        return prestoServisiosEmpleoAnterior3Desde;
    }

    public void setPrestoServisiosEmpleoAnterior3Desde(String prestoServisiosEmpleoAnterior3Desde) {
        this.prestoServisiosEmpleoAnterior3Desde = prestoServisiosEmpleoAnterior3Desde;
    }

    public String getPrestoServisiosEmpleoAnterior3Hasta() {
        return prestoServisiosEmpleoAnterior3Hasta;
    }

    public void setPrestoServisiosEmpleoAnterior3Hasta(String prestoServisiosEmpleoAnterior3Hasta) {
        this.prestoServisiosEmpleoAnterior3Hasta = prestoServisiosEmpleoAnterior3Hasta;
    }

    public String getNombreCompañiaEmpleoAnterior3() {
        return nombreCompañiaEmpleoAnterior3;
    }

    public void setNombreCompañiaEmpleoAnterior3(String nombreCompañiaEmpleoAnterior3) {
        this.nombreCompañiaEmpleoAnterior3 = nombreCompañiaEmpleoAnterior3;
    }

    public String getDomicilioEmpleoAnterior3() {
        return domicilioEmpleoAnterior3;
    }

    public void setDomicilioEmpleoAnterior3(String domicilioEmpleoAnterior3) {
        this.domicilioEmpleoAnterior3 = domicilioEmpleoAnterior3;
    }

    public String getTelefonoEmpleoAnterior3() {
        return telefonoEmpleoAnterior3;
    }

    public void setTelefonoEmpleoAnterior3(String telefonoEmpleoAnterior3) {
        this.telefonoEmpleoAnterior3 = telefonoEmpleoAnterior3;
    }

    public String getPuestoDesempeñoEmpleoAnterior3() {
        return puestoDesempeñoEmpleoAnterior3;
    }

    public void setPuestoDesempeñoEmpleoAnterior3(String puestoDesempeñoEmpleoAnterior3) {
        this.puestoDesempeñoEmpleoAnterior3 = puestoDesempeñoEmpleoAnterior3;
    }

    public String getSueldoInicialEmpleoAnterior3() {
        return sueldoInicialEmpleoAnterior3;
    }

    public void setSueldoInicialEmpleoAnterior3(String sueldoInicialEmpleoAnterior3) {
        this.sueldoInicialEmpleoAnterior3 = sueldoInicialEmpleoAnterior3;
    }

    public String getSueldoFinalEmpleoAnterior3() {
        return sueldoFinalEmpleoAnterior3;
    }

    public void setSueldoFinalEmpleoAnterior3(String sueldoFinalEmpleoAnterior3) {
        this.sueldoFinalEmpleoAnterior3 = sueldoFinalEmpleoAnterior3;
    }

    public String getMotivoSeparacionEmpleoAnterior3() {
        return motivoSeparacionEmpleoAnterior3;
    }

    public void setMotivoSeparacionEmpleoAnterior3(String motivoSeparacionEmpleoAnterior3) {
        this.motivoSeparacionEmpleoAnterior3 = motivoSeparacionEmpleoAnterior3;
    }

    public String getNombreJefeDirectoEmpleoAnterior3() {
        return nombreJefeDirectoEmpleoAnterior3;
    }

    public void setNombreJefeDirectoEmpleoAnterior3(String nombreJefeDirectoEmpleoAnterior3) {
        this.nombreJefeDirectoEmpleoAnterior3 = nombreJefeDirectoEmpleoAnterior3;
    }

    public String getPuestoJefeDirectoEmpleoAnterior3() {
        return puestoJefeDirectoEmpleoAnterior3;
    }

    public void setPuestoJefeDirectoEmpleoAnterior3(String puestoJefeDirectoEmpleoAnterior3) {
        this.puestoJefeDirectoEmpleoAnterior3 = puestoJefeDirectoEmpleoAnterior3;
    }

    public String getMotivoseparacionEmpleoAnterior3Si() {
        return motivoseparacionEmpleoAnterior3Si;
    }

    public void setMotivoseparacionEmpleoAnterior3Si(String motivoseparacionEmpleoAnterior3Si) {
        this.motivoseparacionEmpleoAnterior3Si = motivoseparacionEmpleoAnterior3Si;
    }

    public String getMotivoseparacionEmpleoAnterior3No() {
        return motivoseparacionEmpleoAnterior3No;
    }

    public void setMotivoseparacionEmpleoAnterior3No(String motivoseparacionEmpleoAnterior3No) {
        this.motivoseparacionEmpleoAnterior3No = motivoseparacionEmpleoAnterior3No;
    }

    public String getReferenciaNombre() {
        return referenciaNombre;
    }

    public void setReferenciaNombre(String referenciaNombre) {
        this.referenciaNombre = referenciaNombre;
    }

    public String getReferenciaTelefono() {
        return referenciaTelefono;
    }

    public void setReferenciaTelefono(String referenciaTelefono) {
        this.referenciaTelefono = referenciaTelefono;
    }

    public String getReferenciaDomicilio() {
        return referenciaDomicilio;
    }

    public void setReferenciaDomicilio(String referenciaDomicilio) {
        this.referenciaDomicilio = referenciaDomicilio;
    }

    public String getReferenciaOcupacion() {
        return referenciaOcupacion;
    }

    public void setReferenciaOcupacion(String referenciaOcupacion) {
        this.referenciaOcupacion = referenciaOcupacion;
    }

    public String getReferenciatimepoconocerce() {
        return referenciatimepoconocerce;
    }

    public void setReferenciatimepoconocerce(String referenciatimepoconocerce) {
        this.referenciatimepoconocerce = referenciatimepoconocerce;
    }

    public String getReferenciaNombre2() {
        return referenciaNombre2;
    }

    public void setReferenciaNombre2(String referenciaNombre2) {
        this.referenciaNombre2 = referenciaNombre2;
    }

    public String getReferenciaTelefono2() {
        return referenciaTelefono2;
    }

    public void setReferenciaTelefono2(String referenciaTelefono2) {
        this.referenciaTelefono2 = referenciaTelefono2;
    }

    public String getReferenciaDomicilio2() {
        return referenciaDomicilio2;
    }

    public void setReferenciaDomicilio2(String referenciaDomicilio2) {
        this.referenciaDomicilio2 = referenciaDomicilio2;
    }

    public String getReferenciaOcupacion2() {
        return referenciaOcupacion2;
    }

    public void setReferenciaOcupacion2(String referenciaOcupacion2) {
        this.referenciaOcupacion2 = referenciaOcupacion2;
    }

    public String getReferenciatimepoconocerce2() {
        return referenciatimepoconocerce2;
    }

    public void setReferenciatimepoconocerce2(String referenciatimepoconocerce2) {
        this.referenciatimepoconocerce2 = referenciatimepoconocerce2;
    }

    public String getReferenciaNombre3() {
        return referenciaNombre3;
    }

    public void setReferenciaNombre3(String referenciaNombre3) {
        this.referenciaNombre3 = referenciaNombre3;
    }

    public String getReferenciaTelefono3() {
        return referenciaTelefono3;
    }

    public void setReferenciaTelefono3(String referenciaTelefono3) {
        this.referenciaTelefono3 = referenciaTelefono3;
    }

    public String getReferenciaDomicilio3() {
        return referenciaDomicilio3;
    }

    public void setReferenciaDomicilio3(String referenciaDomicilio3) {
        this.referenciaDomicilio3 = referenciaDomicilio3;
    }

    public String getReferenciaOcupacion3() {
        return referenciaOcupacion3;
    }

    public void setReferenciaOcupacion3(String referenciaOcupacion3) {
        this.referenciaOcupacion3 = referenciaOcupacion3;
    }

    public String getReferenciatimepoconocerce3() {
        return referenciatimepoconocerce3;
    }

    public void setReferenciatimepoconocerce3(String referenciatimepoconocerce3) {
        this.referenciatimepoconocerce3 = referenciatimepoconocerce3;
    }

    public String getReferenciaNombre4() {
        return referenciaNombre4;
    }

    public void setReferenciaNombre4(String referenciaNombre4) {
        this.referenciaNombre4 = referenciaNombre4;
    }

    public String getReferenciaTelefono4() {
        return referenciaTelefono4;
    }

    public void setReferenciaTelefono4(String referenciaTelefono4) {
        this.referenciaTelefono4 = referenciaTelefono4;
    }

    public String getReferenciaDomicilio4() {
        return referenciaDomicilio4;
    }

    public void setReferenciaDomicilio4(String referenciaDomicilio4) {
        this.referenciaDomicilio4 = referenciaDomicilio4;
    }

    public String getReferenciaOcupacion4() {
        return referenciaOcupacion4;
    }

    public void setReferenciaOcupacion4(String referenciaOcupacion4) {
        this.referenciaOcupacion4 = referenciaOcupacion4;
    }

    public String getReferenciatimepoconocerce4() {
        return referenciatimepoconocerce4;
    }

    public void setReferenciatimepoconocerce4(String referenciatimepoconocerce4) {
        this.referenciatimepoconocerce4 = referenciatimepoconocerce4;
    }

    public String getSaberEmpleoOtro() {
        return saberEmpleoOtro;
    }

    public void setSaberEmpleoOtro(String saberEmpleoOtro) {
        this.saberEmpleoOtro = saberEmpleoOtro;
    }

    public String getFachaUnir() {
        return FachaUnir;
    }

    public void setFachaUnir(String FachaUnir) {
        this.FachaUnir = FachaUnir;
    }

    public String getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(String otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public String getImporteMensual() {
        return importeMensual;
    }

    public void setImporteMensual(String importeMensual) {
        this.importeMensual = importeMensual;
    }

    public String getConyugueTrabaja() {
        return conyugueTrabaja;
    }

    public void setConyugueTrabaja(String conyugueTrabaja) {
        this.conyugueTrabaja = conyugueTrabaja;
    }

    public String getPercepcionMensual() {
        return PercepcionMensual;
    }

    public void setPercepcionMensual(String PercepcionMensual) {
        this.PercepcionMensual = PercepcionMensual;
    }

    public String getValorAproximado() {
        return valorAproximado;
    }

    public void setValorAproximado(String valorAproximado) {
        this.valorAproximado = valorAproximado;
    }

    public String getImporte() {
        return Importe;
    }

    public void setImporte(String Importe) {
        this.Importe = Importe;
    }

    public String getImporteDeudas() {
        return ImporteDeudas;
    }

    public void setImporteDeudas(String ImporteDeudas) {
        this.ImporteDeudas = ImporteDeudas;
    }

    public String getAbonoMensual() {
        return abonoMensual;
    }

    public void setAbonoMensual(String abonoMensual) {
        this.abonoMensual = abonoMensual;
    }

    public String getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(String gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    public String getComentarioEntrevistador() {
        return comentarioEntrevistador;
    }

    public void setComentarioEntrevistador(String comentarioEntrevistador) {
        this.comentarioEntrevistador = comentarioEntrevistador;
    }

    public String getRespuestas() {
        return Respuestas;
    }

    public void setRespuestas(String Respuestas) {
        this.Respuestas = Respuestas;
    }

    public String getCandidato() {
        return Candidato;
    }

    public void setCandidato(String Candidato) {
        this.Candidato = Candidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

  


    
     




   

}


package Modelo;


public class Factura {

 Clientes cliente; 

 String oficinaCobro,   circuito, medidor, facturaNumero, mesFactura, consumo,  
         tipoConsumo, numeroMedidor, numeroNis, referenciaCobro,lecturaAnterior, lecturaActual,ordenlectura, fechaentrega, fechaEmision, fechaVencimiento ;
 
int   diasFacturados,  multip, consumoKWH;

double ConsumoCosto,Alumbradopublico,subcidio,Comercializacion,INE,Totaldeuda;

    public Factura(Clientes cliente, String oficinaCobro, String FechaEntrega, String circuito, String medidor,
            String facturaNumero, String mesFactura, String consumo, String fechaEmision, String fechaVencimiento,
            String tipoConsumo, String numeroMedidor, String numeroNis, String referenciaCobro, int diasFacturados,
            String lecturaAnterior, String lecturaActual, int multip, int consumoKWH, String ordenlectura, 
            double ConsumoCosto, double Alumbradopublico, double subcidio, double Comercializacion, double INE, double Totaldeuda) {
        
        this.cliente = cliente;
        this.oficinaCobro = oficinaCobro;
        this.fechaentrega = FechaEntrega;
        this.circuito = circuito;
        this.medidor = medidor;
        this.facturaNumero = facturaNumero;
        this.mesFactura = mesFactura;
        this.consumo = consumo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoConsumo = tipoConsumo;
        this.numeroMedidor = numeroMedidor;
        this.numeroNis = numeroNis;
        this.referenciaCobro = referenciaCobro;
        this.diasFacturados = diasFacturados;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.multip = multip;
        this.consumoKWH = consumoKWH;
        this.ordenlectura = ordenlectura;
        
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getOficinaCobro() {
        return oficinaCobro;
    }

    public void setOficinaCobro(String oficinaCobro) {
        this.oficinaCobro = oficinaCobro;
    }

    public String getFechaEntrega() {
        return fechaentrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.fechaentrega = FechaEntrega;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getMedidor() {
        return medidor;
    }

    public void setMedidor(String medidor) {
        this.medidor = medidor;
    }

    public String getFacturaNumero() {
        return facturaNumero;
    }

    public void setFacturaNumero(String facturaNumero) {
        this.facturaNumero = facturaNumero;
    }

    public String getMesFactura() {
        return mesFactura;
    }

    public void setMesFactura(String mesFactura) {
        this.mesFactura = mesFactura;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(String tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(String numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public String getNumeroNis() {
        return numeroNis;
    }

    public void setNumeroNis(String numeroNis) {
        this.numeroNis = numeroNis;
    }

    public String getReferenciaCobro() {
        return referenciaCobro;
    }

    public void setReferenciaCobro(String referenciaCobro) {
        this.referenciaCobro = referenciaCobro;
    }

    public int getDiasFacturados() {
        return diasFacturados;
    }

    public void setDiasFacturados(int diasFacturados) {
        this.diasFacturados = diasFacturados;
    }

    public String getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(String lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public String getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(String lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public int getMultip() {
        return multip;
    }

    public void setMultip(int multip) {
        this.multip = multip;
    }

    public int getConsumoKWH() {
        return consumoKWH;
    }

    public void setConsumoKWH(int consumoKWH) {
        this.consumoKWH = consumoKWH;
    }

    public String getOrdenlectura() {
        return ordenlectura;
    }

    public void setOrdenlectura(String ordenlectura) {
        this.ordenlectura = ordenlectura;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public double getConsumoCosto() {
        return ConsumoCosto;
    }

    public void setConsumoCosto(double ConsumoCosto) {
        this.ConsumoCosto = ConsumoCosto;
    }

    public double getAlumbradopublico() {
        return Alumbradopublico;
    }

    public void setAlumbradopublico(double Alumbradopublico) {
        this.Alumbradopublico = Alumbradopublico;
    }

    public double getSubcidio() {
        return subcidio;
    }

    public void setSubcidio(double subcidio) {
        this.subcidio = subcidio;
    }

    public double getComercializacion() {
        return Comercializacion;
    }

    public void setComercializacion(double Comercializacion) {
        this.Comercializacion = Comercializacion;
    }

    public double getINE() {
        return INE;
    }

    public void setINE(double INE) {
        this.INE = INE;
    }

    public double getTotaldeuda() {
        return Totaldeuda;
    }

    public void setTotaldeuda(double Totaldeuda) {
        this.Totaldeuda = Totaldeuda;
    }



    
     public void CalculokWh(){
    
        int kwh = getConsumoKWH();
        Double ValorkWh = 0.0;
        
        ValorkWh = kwh * 5.798642857142857;
        
        setConsumoCosto(ValorkWh);
    }
    
    public void alumbradoPublico(){
    
        Double valorkwh = getConsumoCosto();
        double alumbrado = 0.0;
        
        alumbrado = valorkwh * 0.1077592047400254;
        
        setAlumbradopublico(alumbrado);
    }
    
    public void Comercializacion(){
    
        Double comercializacion = 0.0;
        Double Valorkwh = getConsumoCosto();
        comercializacion = Valorkwh * 0.0423621290696099;
        
        setComercializacion(comercializacion);
    }
    
    public void subsidio(){
    
        Double Total = 0.0;
        int kwh = getConsumoKWH();
        Double Valorkwh= getConsumoCosto();
        Double alumbrado = getAlumbradopublico();
        Double comercializacion = getComercializacion();
        Double subsidio = 0.0;
        
        if(kwh >=50 || kwh<99){
        
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total *0.50;
        }
        if(kwh >=100 || kwh<=150){
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total*0.25;
        
            setSubcidio(subsidio);
        }
        if(kwh >150){
            Double subcidio = 0.0;
            
            setSubcidio(subcidio);
        }
    }
    
    public void INE(){
    
        Double ine = 0.0;
        Double total = 0.0;
        Double Valorkwh = getConsumoCosto();
        Double alumbrado = getAlumbradopublico();
        Double comercializacion = getComercializacion();
        Double Subcidio = getSubcidio();
        
        total = Valorkwh+alumbrado+comercializacion-Subcidio;
        ine = total * 0.01;
        
        setINE(ine);
    }
    
     public void Total(){
     
         Double Total = 0.0;
         Double Valorkwh = getConsumoCosto();
         Double alumbrado = getAlumbradopublico();
         Double comercializacion = getComercializacion();
         Double subsidio = getSubcidio();
         Double ine = getINE();
         
         Total = Valorkwh+alumbrado+comercializacion-subsidio+ine;
         
         setTotaldeuda(Total);
     }
    
    
     @Override
    public String toString(){
    return cliente.nombre;
    }
    
}

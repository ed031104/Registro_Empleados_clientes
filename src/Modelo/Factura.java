
package Modelo;

import java.util.Date;

public class Factura {

Clientes cliente; 
 String oficinaCobro, FechaEntrega,  circuito, medidor, facturaNumero, mesFactura, consumo, fechaEmision, fechaVencimiento,
         tipoConsumo, numeroMedidor ;
int numeroNis, referenciaCobro, diasFacturados, lecturaAnterior, lecturaActual, multip, consumoKWH;
double ordenlectura,ConsumoCosto,Alumbradopublico,subcidio,Comercializacion,INE,Totaldeuda;

    public Factura(Clientes cliente, String oficinaCobro, String FechaEntrega, String circuito, String medidor, String facturaNumero, String mesFactura,
            String consumo, String fechaEmision, String fechaVencimiento, String tipoConsumo, String numeroMedidor, int numeroNis, int referenciaCobro,
            int diasFacturados, int lecturaAnterior, int lecturaActual, int multip, int consumoKWH, double ordenlectura,double ConsumoCosto,
            double Alumbradopublico, double subcidio,double Comercializacion,double INE,double Totaldeuda) {
        this.cliente = cliente;
        this.oficinaCobro = oficinaCobro;
        this.FechaEntrega = FechaEntrega;
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
//        this.ConsumoCosto = ConsumoCosto;
//        this.Alumbradopublico = Alumbradopublico;
//        this.subcidio = subcidio;
//        this.Comercializacion = Comercializacion;
//        this.INE = INE;
//        this.Totaldeuda = Totaldeuda;
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
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
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

    public int getNumeroNis() {
        return numeroNis;
    }

    public void setNumeroNis(int numeroNis) {
        this.numeroNis = numeroNis;
    }

    public int getReferenciaCobro() {
        return referenciaCobro;
    }

    public void setReferenciaCobro(int referenciaCobro) {
        this.referenciaCobro = referenciaCobro;
    }

    public int getDiasFacturados() {
        return diasFacturados;
    }

    public void setDiasFacturados(int diasFacturados) {
        this.diasFacturados = diasFacturados;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public int getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(int lecturaActual) {
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

    public double getOrdenlectura() {
        return ordenlectura;
    }

    public void setOrdenlectura(double ordenlectura) {
        this.ordenlectura = ordenlectura;
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
}

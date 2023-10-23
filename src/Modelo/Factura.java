
package Modelo;

import java.util.Date;

public class Factura {

 Clientes cliente; 
 String oficinaCobro,   circuito, medidor, facturaNumero, mesFactura, consumo,  fechaVencimiento,
         tipoConsumo, numeroMedidor ;
    Date fechaentrega, fechaEmision;
int numeroNis, referenciaCobro, diasFacturados, lecturaAnterior, lecturaActual, multip, consumoKWH;
double ordenlectura;

    public Factura(Clientes cliente, String oficinaCobro, Date FechaEntrega, String circuito, String medidor,
            String facturaNumero, String mesFactura, String consumo, Date fechaEmision, String fechaVencimiento,
            String tipoConsumo, String numeroMedidor, int numeroNis, int referenciaCobro, int diasFacturados,
            int lecturaAnterior, int lecturaActual, int multip, int consumoKWH, double ordenlectura) {
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

    public Date getFechaEntrega() {
        return fechaentrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
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

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
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


    
}

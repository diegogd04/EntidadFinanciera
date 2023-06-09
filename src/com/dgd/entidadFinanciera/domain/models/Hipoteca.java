package com.dgd.entidadFinanciera.domain.models;

public class Hipoteca extends ProductoBancario{
    protected String fechaInicioPrestamo;
    protected Integer interes;
    protected String fechaFinPrestamo;

    public String getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(String fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    public String getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }

    public void setFechaFinPrestamo(String fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }
}

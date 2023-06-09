package com.dgd.entidadFinanciera.domain.models;

public class PlazoFijo extends ProductoBancario{
    protected Integer duracionMesesPlazo;
    protected Integer interes;

    public Integer getDuracionMesesPlazo() {
        return duracionMesesPlazo;
    }

    public void setDuracionMesesPlazo(Integer duracionMesesPlazo) {
        this.duracionMesesPlazo = duracionMesesPlazo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }
}

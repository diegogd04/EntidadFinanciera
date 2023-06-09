package com.dgd.entidadFinanciera.domain.models;

public class Empleado extends Persona{
    protected String numeroSeguridadSocial;

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}

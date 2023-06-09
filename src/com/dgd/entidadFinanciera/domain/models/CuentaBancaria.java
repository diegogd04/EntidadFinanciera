package com.dgd.entidadFinanciera.domain.models;

public class CuentaBancaria {
    private String numeroCuenta;
    private Cliente titular;
    private Movimiento transacciones;
    private ProductoBancario productosContrados;
    private Integer saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Movimiento getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Movimiento transacciones) {
        this.transacciones = transacciones;
    }

    public ProductoBancario getProductosContrados() {
        return productosContrados;
    }

    public void setProductosContrados(ProductoBancario productosContrados) {
        this.productosContrados = productosContrados;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}

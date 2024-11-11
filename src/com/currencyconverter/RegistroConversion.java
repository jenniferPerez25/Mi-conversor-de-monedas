package com.currencyconverter;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class RegistroConversion {
    private String monedaBase;
    private String monedaDestino;
    private double valor;
    private double resultado;

    public RegistroConversion(String monedaBase, String monedaDestino, double valor, double resultado) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.valor = valor;
        this.resultado = redondearResultado(resultado);
    }
    private double redondearResultado(double resultado) {
        BigDecimal bd = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String getRespuesta() {
        return String.format("tasa de conversion de %s a %s: %.2f", monedaBase, monedaDestino, resultado);
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = redondearResultado(resultado);
    }
}



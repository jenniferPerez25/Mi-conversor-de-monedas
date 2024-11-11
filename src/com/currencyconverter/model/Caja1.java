package com.currencyconverter.model;

import java.util.Map;

public class Caja1 {
    private String base;
    private Map<String, Double> rates;
    private String error;

    private String getBase()  {
        return base;
    }

    public void setBase(String base) {
        this.base = base;

    }

    public Map<String, Double> getRates() {
        return rates;
    }


    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public String getError() {
        return error;

    }

    public void setError(String error) {
        this.error = error;
    }

}
package com.currencyconverter.controller;


import com.currencyconverter.OrdenamientoApi;
import com.currencyconverter.RegistroConversion;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CajaFinal {


    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
         double exchangeRate = OrdenamientoApi.getExchangeRate(fromCurrency, toCurrency);

         if (exchangeRate != 1.0)  {
             double converterAmount = amount * exchangeRate;
             BigDecimal bd = new BigDecimal(converterAmount).setScale(2, RoundingMode.HALF_UP);
             converterAmount = bd.doubleValue();
             return converterAmount;
         } else {
            System.out.println("Error: No se pudo obtener la tasa de cambio.");
            return -1.0;
        }

    }

}




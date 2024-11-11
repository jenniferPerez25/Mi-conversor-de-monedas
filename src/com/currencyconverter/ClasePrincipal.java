package com.currencyconverter;

import com.currencyconverter.controller.CajaFinal;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        CajaFinal controller = new CajaFinal();
        Scanner scanner = new Scanner(System.in);


         try {
            System.out.println("Introduce la moneda de origen (ejemplo: USD , ARS , COP ):");
            String fromCurrency = scanner.nextLine(). trim().toUpperCase();

            System.out.println("Introduce la moneda de destino (ejemplo: USD, ARS, COP ):");
            String toCurrency = scanner.nextLine().trim().toUpperCase();

            System.out.println("Introduce el monto a convertir: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            double convertedAmount = controller.convertCurrency(fromCurrency, toCurrency.toUpperCase(), amount);

             String respuesta = String.format("El monto convertido es: %.2f", convertedAmount);
             System.out.println(respuesta);

         } catch (Exception e) {
             System.out.println("Ocurrió un error durante la conversion:" + e.getMessage());
         } finally {
             scanner.close();
             
         }

          }

}






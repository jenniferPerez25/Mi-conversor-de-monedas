package com.currencyconverter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OrdenamientoApi {


    private static final String API_KEY = "e690f13992a7930bbe3352d4";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double getExchangeRate(String fromCurrency, String toCurrency)  {
        try {
            String urlString = BASE_URL + fromCurrency;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JsonObject jsonResponse = JsonParser.parseString(content.toString()).getAsJsonObject();
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

            if (conversionRates.has(toCurrency)) {
                return conversionRates.get(toCurrency).getAsDouble();
            } else {
                System.out.println("Moneda de destino no disponible.");
                return 1.0;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return 1.0;
          }

    }


}




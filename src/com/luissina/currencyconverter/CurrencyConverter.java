package com.luissina.currencyconverter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyConverter {
    private final String apiKey = "32cd9f70adaec21cc9d96c17"; // Tu API key
    private final HttpClient client;

    public CurrencyConverter() {
        client = HttpClient.newHttpClient(); // Crear cliente HttpClient
    }

    // Método para obtener la tasa de cambio
    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apiKey, fromCurrency);

        // Crear solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Enviar solicitud y obtener la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Verificar si la respuesta fue exitosa
        if (response.statusCode() != 200) {
            throw new IOException("Error en la llamada a la API: " + response.statusCode());
        }

        // Parsear la respuesta JSON usando Gson
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        return json.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
    }

    // Método para convertir la cantidad de una moneda a otra
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate; // Retorna la cantidad convertida
    }
}

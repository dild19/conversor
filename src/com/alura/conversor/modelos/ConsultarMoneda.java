package com.alura.conversor.modelos;

import com.google.gson.Gson;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5cb5392f875d50a2955fe1f9/pair/"+monedaBase+"/"+monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e){
            throw new RuntimeException("Moneda no encontrada. Por favor verifique nuevamente.");
        }
    }
}

package com.alura.conversor.modelos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {

        double cantidad;
        double cantidadConvertida;
        Locale colombia = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(colombia);

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedaBase+" a convertir:");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" equivalen a = "+ formatoMoneda.format(cantidadConvertida) + " "+ monedas.target_code());

    }


    public static void convertirOtraMoneda (ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda de origen: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la moneda objetivo");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);

    }

}

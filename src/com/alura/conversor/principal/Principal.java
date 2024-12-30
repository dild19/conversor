package com.alura.conversor.principal;

import com.alura.conversor.modelos.ConsultarMoneda;
import com.alura.conversor.modelos.ConvertirMoneda;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion !=8) {
            System.out.println("-------------------------\n" +
                    "Conversor de monedas para Alura Latam\n" +
                    "Por favor seleccione una de las siguientes opciones:\n" +
                    "1. Convertir dólares a pesos argentinos\n" +
                    "2. Convertir pesos argentinos a dólares\n" +
                    "3. Convertir dólares a reales brasileños\n" +
                    "4. Convertir reales brasileños a dólares\n" +
                    "5. Convertir dólares a pesos colombianos\n" +
                    "6. Convertir pesos colombianos a dólares\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Finalizar");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente");
                    break;
            }

        }
    }
}

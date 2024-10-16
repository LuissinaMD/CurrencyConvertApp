package com.luissina.currencyconverter;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final CurrencyConverter converter;
    private final Scanner scanner;

    public Menu(CurrencyConverter converter) {
        this.converter = converter;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n*****************************************************\n");
        System.out.println("¡Sea bienvenido/a al Conversor de Moneda de Luissina!");
        System.out.println("Comencemos...");
        System.out.println("\n*****************************************************\n");

        int option = 0;

        while (option != 21) {
            printOptions(); // Mostrar opciones del menú

            // Leer la opción del usuario con manejo de excepciones
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                // Si se introduce un valor no numérico, advertimos al usuario
                System.out.println("Error: Por favor, ingrese solo un número de la lista.");
                scanner.next(); // Limpiar el valor incorrecto de la entrada
                System.out.println("\n*****************************************************\n"); // Separador
                continue; // Saltar a la siguiente iteración para que vuelva a intentar
            }

            System.out.println("\n************************************************************************************************************\n");

            if (option == 21) {
                System.out.println("Acaba de salir de la aplicación. Gracias por utilizar el Conversor de Moneda de Luissina. ¡Hasta la próxima!");
                System.out.println("\n************************************************************************************************************\n");
                break;
            }

            // Procesar la opción seleccionada
            processOption(option);

            // Separar cada iteración con una línea de asteriscos
            System.out.println("\n*****************************************************\n");
        }

        scanner.close();
    }

    private void printOptions() {
        System.out.println("Seleccione el tipo de conversión que desea realizar:\n");
        System.out.println("1 ARS ---> USD");
        System.out.println("2 USD ---> ARS");
        System.out.println("3 ARS ---> BRL");
        System.out.println("4 BRL ---> ARS");
        System.out.println("5 ARS ---> EUR");
        System.out.println("6 EUR ---> ARS");
        System.out.println("7 ARS ---> MXN");
        System.out.println("8 MXN ---> ARS");
        System.out.println("9 USD ---> EUR");
        System.out.println("10 EUR ---> USD");
        System.out.println("11 USD ---> BRL");
        System.out.println("12 BRL ---> USD");
        System.out.println("13 USD ---> MXN");
        System.out.println("14 MXN ---> USD");
        System.out.println("15 EUR ---> BRL");
        System.out.println("16 BRL ---> EUR");
        System.out.println("17 EUR ---> MXN");
        System.out.println("18 MXN ---> EUR");
        System.out.println("19 BRL ---> MXN");
        System.out.println("20 MXN ---> BRL");
        System.out.println("21 Salir");
    }

    private void processOption(int option) {
        String fromCurrency = "";
        String toCurrency = "";

        switch (option) {
            case 1:
                fromCurrency = "ARS";
                toCurrency = "USD";
                break;
            case 2:
                fromCurrency = "USD";
                toCurrency = "ARS";
                break;
            case 3:
                fromCurrency = "ARS";
                toCurrency = "BRL";
                break;
            case 4:
                fromCurrency = "BRL";
                toCurrency = "ARS";
                break;
            case 5:
                fromCurrency = "ARS";
                toCurrency = "EUR";
                break;
            case 6:
                fromCurrency = "EUR";
                toCurrency = "ARS";
                break;
            case 7:
                fromCurrency = "ARS";
                toCurrency = "MXN";
                break;
            case 8:
                fromCurrency = "MXN";
                toCurrency = "ARS";
                break;
            case 9:
                fromCurrency = "USD";
                toCurrency = "EUR";
                break;
            case 10:
                fromCurrency = "EUR";
                toCurrency = "USD";
                break;
            case 11:
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;
            case 12:
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;
            case 13:
                fromCurrency = "USD";
                toCurrency = "MXN";
                break;
            case 14:
                fromCurrency = "MXN";
                toCurrency = "USD";
                break;
            case 15:
                fromCurrency = "EUR";
                toCurrency = "BRL";
                break;
            case 16:
                fromCurrency = "BRL";
                toCurrency = "EUR";
                break;
            case 17:
                fromCurrency = "EUR";
                toCurrency = "MXN";
                break;
            case 18:
                fromCurrency = "MXN";
                toCurrency = "EUR";
                break;
            case 19:
                fromCurrency = "BRL";
                toCurrency = "MXN";
                break;
            case 20:
                fromCurrency = "MXN";
                toCurrency = "BRL";
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione un número entre 1 y 21.");
                return;
        }

        // Solicitar la cantidad
        System.out.println("Ingrese el valor que desea convertir:");
        double amount = scanner.nextDouble();

        // Realizar la conversión
        try {
            double result = converter.convertCurrency(amount, fromCurrency, toCurrency);
            System.out.printf("%.2f %s son %.2f %s%n", amount, fromCurrency, result, toCurrency);
        } catch (IOException e) {
            System.err.println("Hubo un error al obtener la tasa de cambio: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("La conversión fue interrumpida: " + e.getMessage());
        }
    }
}

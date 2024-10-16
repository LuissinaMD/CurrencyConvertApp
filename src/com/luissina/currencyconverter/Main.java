package com.luissina.currencyconverter;


public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Menu menu = new Menu(converter);
        menu.showMenu();
    }
}

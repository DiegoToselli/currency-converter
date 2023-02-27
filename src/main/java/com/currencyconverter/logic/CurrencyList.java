/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.currencyconverter.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DMT
 */
public class CurrencyList {

    private static List<String> currencyList = new ArrayList<>() {
        {
            add("From Peso Argentino to Dólar");
            add("From Peso Argentino to Euro");
            add("From Peso Argentino to Pound Sterling");
            add("From Peso Argentino to Japanese Yen");
            add("From Peso Argentino to South Korean Won");
            add("From Dólar to Peso Argentino");
            add("From Euro to Peso Argentino");
            add("From Pund Sterling to Peso Argentino");
            add("From Japanese Yen to Peso Argentino");
            add("From South Korean Won to Peso Argentino");
        }

    };

    public static List<String> getCurrencyList() {
        return currencyList;
    }
}

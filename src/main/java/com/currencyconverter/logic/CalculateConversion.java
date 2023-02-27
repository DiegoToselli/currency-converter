/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.currencyconverter.logic;

/**
 *
 * @author DMT
 */
public class CalculateConversion {

    public static double calculate(double amount, double rate) {
        return Math.round((amount * rate) * 100.0) / 100.0;
    }
}

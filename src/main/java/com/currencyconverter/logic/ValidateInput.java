/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.currencyconverter.logic;

/**
 *
 * @author DMT
 */
public class ValidateInput {

    public static boolean validate(String value) {
        return value.matches("^[0-9]+([.][0-9]+)?$") && (Double.parseDouble(value) > 0);
    }
}

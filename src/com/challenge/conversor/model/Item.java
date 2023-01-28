package com.challenge.conversor.model;

/***
 * Clase que representa el item de cada conversor
 */
public class Item {
    private String nombre;
    private double valorConversion;
    private String convertido;

    public Item(String nombre,double valorConversion,String convertido){
        this.nombre = nombre;
        this.valorConversion=valorConversion;
        this.convertido=convertido;
    }

    public String getNombre() {
        return nombre;
    }
    public double getValorConversion() {
        return valorConversion;
    }

    public String getConvertido() {
        return convertido;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

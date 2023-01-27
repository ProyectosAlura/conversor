package com.challenge.conversor.model;

public class Item {
    private String nombre;
    private double valorConversion;

    public Item(String nombre,double valorConversion){
        this.nombre = nombre;
        this.valorConversion=valorConversion;
    }

    public String getNombre() {
        return nombre;
    }
    public double getValorConversion() {
        return valorConversion;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombre;
    }
}

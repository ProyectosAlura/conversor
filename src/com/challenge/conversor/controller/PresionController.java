package com.challenge.conversor.controller;

import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;

public abstract class PresionController {
    static Item it1 = new Item("Atmósfera a Bar", 1.01325,"Bar");
    static Item it2 = new Item("Bar a Atmósfera", Math.pow(1.01325, -1),"Atmósfera");
    static Item it3 = new Item("Psi a Pascal", 6895,"Pascales");
    static Item it4 = new Item("Pascal a Psi", Math.pow(6895, -1),"Psi");
    static Item it5 = new Item("Atmosfera a Pascal", 101325,"Pascales");


    private static Item []  opciones = {it1,it2,it3,it4,it5};

    private static Conversor conversor = new Conversor(opciones, "Conversor de Presión", "presion");

    public static Conversor obtnerConversor(){
        return conversor;
    }
}

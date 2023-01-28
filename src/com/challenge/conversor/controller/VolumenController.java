package com.challenge.conversor.controller;

import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;

public abstract class VolumenController {
    static Item it1 = new Item("Litro a Mililitro", 1000,"Mililitros");
    static Item it2 = new Item("Mililitro a Litro", Math.pow(1000, -1),"Litros");
    static Item it3 = new Item("Metro cúbico a Litro", 1000,"Litros");
    static Item it4 = new Item("Litro a Metro cúbico", Math.pow(1000,-1),"Metros cúbicos");
    static Item it5 = new Item("Galón estadounidense a Litro", 3.78541,"Litros");
    static Item it6 = new Item("Litro a Galón estadounidense", Math.pow(3.78541,-1),"Galónes estadounidense");
    static Item it7 = new Item("Litro a Pulgada cúbica", 61.0237,"Pulgadas cúbica");
    static Item it8 = new Item("Pulgada cúbica a Litro", Math.pow(61.0237,-1),"Litros");

    private static Item []  opciones = {it1,it2,it3,it4,it5,it6,it7,it8};

    private static Conversor conversor = new Conversor(opciones, "Conversor de Volumen", "volumen");

    public static Conversor obtnerConversor(){
        return conversor;
    }
}

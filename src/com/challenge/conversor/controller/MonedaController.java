package com.challenge.conversor.controller;

import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;

public abstract class MonedaController {
    
    static Item it1 = new Item("COP a Dólar", Math.pow(4520.85, -1),"Dólares");
    static Item it2 = new Item("COP a Euros", Math.pow( 4922.82,-1),"Euros");
    static Item it3 = new Item("COP a Libras Esterlinas", Math.pow(5606.19,-1),"Libras Esterlinas");
    static Item it4 = new Item("COP a Yen Japonés", Math.pow(34.84,-1),"Yenes Japonéses");
    static Item it5 = new Item("COP a Won sul-coreano", Math.pow(3.68,-1),"Won sul-coreanos");
    static Item it6 = new Item("Dólar a COP", 4520.85,"COP");
    static Item it7 = new Item("Euros a COP", 4922.82,"COP");
    static Item it8 = new Item("Libras Esterlinas a COP", 5606.19,"COP");
    static Item it9 = new Item("Yen Japonés a COP", 34.84,"COP");
    static Item it10 = new Item("Won sul-coreano a COP", 3.68,"COP");
    
    private static Item []  opciones = {it1,it2,it3,it4,it5,it6,it7,it8,it9,it10};

    private static Conversor conversor = new Conversor(opciones, "Conversor de Moneda", "moneda");

    public static Conversor obtnerConversor(){
        return conversor;
    }

}

package com.challenge.conversor.controller;

import com.challenge.conversor.model.Item;

public class MonedaController {
    
    Item it1 = new Item("COP a Dólar", Math.pow(4520.85, -1));
    Item it2 = new Item("COP a Euros", Math.pow( 4922.82,-1));
    Item it3 = new Item("COP a Libras Esterlinas", Math.pow(5606.19,-1));
    Item it4 = new Item("COP a Yen Japonés", Math.pow(34.84,-1));
    Item it5 = new Item("COP a Won sul-coreano", Math.pow(3.68,-1));
    Item it6 = new Item("Dólar a COP", 4520.85);
    Item it7 = new Item("Euros a COP", 4922.82);
    Item it8 = new Item("Libras Esterlinas a COP", 5606.19);
    Item it9 = new Item("Yen Japonés a COP", 34.84);
    Item it10 = new Item("Won sul-coreano a COP", 3.68);
    
    private Item []  opcionesMonedas = {it1,it2,it3,it4,it5,it6,it7,it8,it9,it10};

    public Item[] getOpcionesMonedas() {
        return opcionesMonedas;
    }

    
}

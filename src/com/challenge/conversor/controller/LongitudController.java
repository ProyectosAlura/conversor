package com.challenge.conversor.controller;

import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;

/***
 * @see com.challenge.conversor.model.Conversor
 */
public abstract class LongitudController{
    static Item it1 = new Item("Kilómetro a Metro", 1000,"Metros");
    static Item it2 = new Item("Metro a kilómetro", Math.pow(1000, -1),"Kilometros");
    static Item it3 = new Item("Metro a Centímetro", 100,"Centímetros");
    static Item it4 = new Item("Centímetro a Metro", Math.pow(100,-1),"Metros");
    static Item it5 = new Item("Centímetro a Milímetro", 10,"Milímetros");
    static Item it6 = new Item("Milímetro a Centímetro", Math.pow(10,-1),"Centímetros");
    static Item it7 = new Item("Pie a Centímetro", 30.48,"Centímetros");
    static Item it8 = new Item("Centímetro a Pie", Math.pow(30.48,-1),"Pies");
    static Item it9 = new Item("Pie a Pulgada", 12,"Pulgadas");
    static Item it10 = new Item("Pulgada a  Pie", Math.pow(12,-1),"Pies");

    private static Item []  opciones = {it1,it2,it3,it4,it5,it6,it7,it8,it9,it10};

    private static Conversor conversor = new Conversor(opciones, "Conversor de Longitud", "longitud");

    public static Conversor obtnerConversor(){
        return conversor;
    }
    
}

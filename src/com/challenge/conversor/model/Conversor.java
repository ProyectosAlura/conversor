package com.challenge.conversor.model;

public class Conversor {
    private Item [] items;
    private String nombre;
    private String tipo;

    public Conversor(String nombre,String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        
    }

    public Conversor(Item [] items, String nombre,String tipo){
        this.items=items;
        this.nombre=nombre;
        this.tipo=tipo;
    }


    public String getNombre() {
        return nombre;
    }

    /***
     * 
     * @return Devuelve la lista de items del conversor
     */
    public Item[] getItems() {
        return items;
    }

    public String getTipo() {
        return tipo;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    /**
     * Método para calcular la conversión
     * @param valor Reprensenta el valor a convertir
     * @param item Objeto para obtener el valor de conversión
     * @return Devuelve el resultado de la operación
     */
    public  double calcularConversion(double valor, Item item){
        double resultado = valor*item.getValorConversion();
        return resultado;
    }

    /**
     * Método para buscar items
     * @param obj
     * @return Devuelve true si el item es encontrado
     */
    public boolean buscarItem(Item obj){
        for (Item item:items){
            if(item.getNombre().equals(obj.getNombre())){
                return true;
            }
        }
        return false;
    }

}


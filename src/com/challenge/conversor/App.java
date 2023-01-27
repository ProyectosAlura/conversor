package com.challenge.conversor;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.challenge.conversor.controller.MonedaController;
import com.challenge.conversor.model.Item;
import com.challenge.conversor.view.InterfazGrafica;


public class App {
    
    /***
     * @author Daniel Caro
     * @version 1.0
     * @param args
     */
    public static void main(String[] args) {

        MonedaController moneda = new MonedaController();
        Item [] opciones = moneda.getOpcionesMonedas();
        boolean iniciar = true;
        double valor=0,resultado=0;
        String conversor = InterfazGrafica.desplegarMenuPrincipal();

        while (iniciar) {
            if (conversor.equals("Conversor de Monedas")) {
                Item opcionDeConversion = InterfazGrafica.desplegarMenu(opciones);
                
                for (Item item:opciones){
                    if(item.getNombre().equals(opcionDeConversion.getNombre())){
                        try {
                            valor = InterfazGrafica.desplegarInput();
                            resultado = valor*item.getValorConversion();
                        } catch (Exception e) {
                            InterfazGrafica.desplegarMensajeError("Valor no valido");
                            break;
                        }
                        InterfazGrafica.desplegarMensaje("Tienes $" + String.format("%.2f", resultado) + " Dolares");
                        break;
                    }
                }
            }else{
                iniciar=false;
                continue;
            }

            int estado = InterfazGrafica.deplegarOption();
            if (estado == 0) {
                InterfazGrafica.desplegarMenuPrincipal();
            } else {
                InterfazGrafica.desplegarMensaje("Programa terminado");
                iniciar = false;
            }
        }

    }

}

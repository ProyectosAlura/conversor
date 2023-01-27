package com.challenge.conversor.view;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.JOptionPane;

import com.challenge.conversor.model.Item;

public abstract class InterfazGrafica {
    private static String [] tipoConversor = {"Conversor de Monedas"};

    public static String desplegarMenuPrincipal(){
        String opcion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversion","Conversor",JOptionPane.PLAIN_MESSAGE,null,tipoConversor,"Conversor de Monedas");
        if(opcion != null){
            return opcion;
        }
        desplegarMensaje("Programa Finalizado");
        return "";
    }
    
    public static Item desplegarMenu(Item [] array){
        Item opcion = (Item) JOptionPane.showInputDialog(null,"Elije la conversión que deseas","Conversor",JOptionPane.PLAIN_MESSAGE,null,array,array[0]);
        return opcion;
    }

    public static double desplegarInput() throws Exception{
        String x =  JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
        double valor = Double.parseDouble(x);
        return valor;
    }

    public static void desplegarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int deplegarOption(){
        return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
    }

    public static void desplegarMensajeError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "¡Error!", JOptionPane.ERROR_MESSAGE);;
    }
}

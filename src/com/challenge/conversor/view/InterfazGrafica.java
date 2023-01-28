package com.challenge.conversor.view;

import javax.swing.JOptionPane;
import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;

/***
 * Clase que realiza las operaciones graficas
 */
public abstract class InterfazGrafica {

    /**
     * Método para desplegar un mensaje
     * @param mensaje este parámetro define el mensaje que se quiere mostrar
     */
    public static void desplegarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Método que muestra una serie de opciones 
     * @return Devuelve un entero dependiendo de la elección
     */
    public static int deplegarOption(){
        return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
    }

    /**
     * Método que muestra una mensaje de error
     * @param mensaje mensaje a mostrar
     */
    public static void desplegarMensajeError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "¡Error!", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que muestra una lista items y alcamena la selección
     * @param conversores Representa la lista que se quiere mostrar
     * @return Devuelve el conversor seleccionado
     */
    public static Conversor desplegarMenuPrincipal(Conversor [] conversores){
        Conversor opcion = (Conversor) JOptionPane.showInputDialog(null,"Seleccione una opción de conversion","Conversor",JOptionPane.PLAIN_MESSAGE,null,conversores,"Conversor de Monedas");
        if(opcion != null){
            return opcion;
        }
        return new Conversor(null, null, "");
    }

    /**
     * Método que muestra una lista items y alcamena la selección
     * @param array Representa la lista que se quiere mostrar
     * @param titulo Define el título que se quiere mostrar
     * @return Devuelve el conversor seleccionado
     */
    public static Item desplegarMenu(Item [] array,String titulo){
        Item opcion = (Item) JOptionPane.showInputDialog(null,"Elije la conversión que deseas",titulo,JOptionPane.PLAIN_MESSAGE,null,array,array[0]);
        if(opcion != null){
            return opcion;
        }
        return new Item("",0.0,"");
    }

    /**
     * Método que muestra una caja de texto
     * @return Devuelve el valor especificado
     */
    public static double desplegarInput() {
        double valor =-1.0;
        String x =  JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
    
        if(x != null){

            if(Double.parseDouble(x) > 0 ){
                try {
                    valor = Double.parseDouble(x);
                } catch (Exception e) {
                    desplegarMensajeError("¡Error! Dato no válido");
                }
            }else{
                desplegarMensajeError("¡Error! Dato no válido");
            }
        }
        return valor;
    }

    /**
     * Método que muestra el resultado
     * @param mensaje
     * @param resultado Representa el resultado a mostrar
     * @param item
     */
    public static void desplegarResultado(String mensaje,double resultado,Item item){
        if(resultado < 1){
            InterfazGrafica.desplegarMensaje(mensaje + String.format("%.6f", resultado) + " "+item.getConvertido());
        }else{
            InterfazGrafica.desplegarMensaje(mensaje + String.format("%.3f", resultado) + " "+item.getConvertido());
        }
    }

}


package com.challenge.conversor;

import com.challenge.conversor.controller.LongitudController;
import com.challenge.conversor.controller.MonedaController;
import com.challenge.conversor.controller.PresionController;
import com.challenge.conversor.controller.VolumenController;
import com.challenge.conversor.model.Conversor;
import com.challenge.conversor.model.Item;
import com.challenge.conversor.view.InterfazGrafica;

/***
* @author Daniel Caro
* @version 1.0
* @see https://github.com/DanielC001
*/

public class App {

    public static void main(String[] args) {

        boolean iniciar = true;
        Item opcionConversor;
        Conversor moneda = MonedaController.obtnerConversor();
        Conversor longitud = LongitudController.obtnerConversor();
        Conversor volumen = VolumenController.obtnerConversor();
        Conversor presion = PresionController.obtnerConversor();
        Conversor[] conversores = { moneda, longitud, volumen, presion };

        while (iniciar) { //Inicia el programa
            Conversor conversorSeleccionado = InterfazGrafica.desplegarMenuPrincipal(conversores); 
            switch (conversorSeleccionado.getTipo()) { //Obtener el tipo de conversor
                case "moneda":
                    opcionConversor = InterfazGrafica.desplegarMenu(conversorSeleccionado.getItems(), //Obtener el item del conversor
                            conversorSeleccionado.getNombre());
                        calcular(conversorSeleccionado, opcionConversor, "Tienes: "); //Calcular la conversión
                    break;
                    case "longitud":
                    opcionConversor = InterfazGrafica.desplegarMenu(conversorSeleccionado.getItems(), 
                            conversorSeleccionado.getNombre());
                        calcular(conversorSeleccionado, opcionConversor, "Tienes: "); 
                    break;
                    case "volumen":
                    opcionConversor = InterfazGrafica.desplegarMenu(conversorSeleccionado.getItems(), 
                            conversorSeleccionado.getNombre());
                        calcular(conversorSeleccionado, opcionConversor, "Tienes: "); 
                    break;
                    case "presion":
                    opcionConversor = InterfazGrafica.desplegarMenu(conversorSeleccionado.getItems(), 
                            conversorSeleccionado.getNombre());
                        calcular(conversorSeleccionado, opcionConversor, "Tienes: "); 
                    break;
                default:
                    break;
                    
            }

            int estado = InterfazGrafica.deplegarOption();   //Preguntar si se repite el programa
            if (estado != 0) {
                InterfazGrafica.desplegarMensaje("Programa terminado");
                iniciar = false;
            } 
        }
    }

    /**
     * Método para calcular y desplegar el resultado de la conversión
     * @param conversorSeleccionado
     * @param opcionConversor
     * @param mensaje
     */
    public static void calcular(Conversor conversorSeleccionado , Item opcionConversor,String mensaje){
        if (opcionConversor != null && conversorSeleccionado.buscarItem(opcionConversor)) {
            double valor = InterfazGrafica.desplegarInput();
            if(valor>0){
                double resultado = conversorSeleccionado.calcularConversion(valor, opcionConversor);
                InterfazGrafica.desplegarResultado(mensaje, resultado, opcionConversor);
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;

/**
 *
 * @author Dai
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ServicioAhorcado sa = new ServicioAhorcado();
    Ahorcado aho = sa.crearJuego();
    
    sa.juego(aho);
      
    }
    
}

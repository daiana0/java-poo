/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import Entidad.Nif;
import Servicio.ServicioNif;


/**
 *
 * @author Dai
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioNif sn = new ServicioNif();
        
        Nif nn = sn.crearNif();
        sn.mostrar(nn);
        
    }
    
}

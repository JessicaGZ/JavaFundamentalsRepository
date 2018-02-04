/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCA
 */
public class MainArchivo {
    
    public static void main(String[] args) {
        
        /* Guardar el archivo */
        try {
            GuardarArchivo guardarArchivo = new GuardarArchivo();
            guardarArchivo.guardarArchivo();
            
        } catch (FileNotFoundException ffe) {
            Logger.getLogger(MainArchivo.class.getName()).log(Level.SEVERE, null, ffe);
        } catch (IOException ie) {
            Logger.getLogger(MainArchivo.class.getName()).log(Level.SEVERE, null, ie);
        }
                
        /* Leer del archivo */
        LeerArchivo leerArchivo = new LeerArchivo();
        leerArchivo.leerArchivo();
        
    }
    
}

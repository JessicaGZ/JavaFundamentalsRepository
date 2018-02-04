/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCA
 */
public class GuardarArchivo {
    
    public void guardarArchivo() throws FileNotFoundException, IOException{
        
        String file = "C:\\Users\\DCA\\Desktop\\Java Fundamentals\\manejoArchivos\\index.txt";
        
        FileOutputStream fos = new FileOutputStream(file);
        
        fos.write(100);
        fos.close();
    }
    
}

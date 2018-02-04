/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DCA
 */
public class ClaseFileWriter {
    
    public void escribirArchivo(){
        String path = "C:\\Users\\DCA\\Desktop\\Java Fundamentals\\manejoArchivos\\repositorio.txt";
        try (FileWriter fw = new FileWriter(new File(path), true)){
            fw.append("Fecha: 03022018");
            fw.close();
            
        } catch(FileNotFoundException ffe){
            ffe.printStackTrace();
        } catch (IOException ie){
            ie.printStackTrace();
        }
        
    }
    
}

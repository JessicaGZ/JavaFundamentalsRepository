/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

/**
 *
 * @author DCA
 */
public class FileMain {
    
    public static void main(String[] args){
        ClaseFileReader cfr = new ClaseFileReader();
        cfr.leerArchivo();
        
        ClaseFileWriter cfw = new ClaseFileWriter();
        cfw.escribirArchivo();
    }
    
}

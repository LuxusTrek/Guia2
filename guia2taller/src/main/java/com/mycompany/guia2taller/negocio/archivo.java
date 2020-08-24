/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guia2taller.negocio;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Luis Camacho
 */
public class archivo {
    private static final String CARPETA_ARCHIVO =System.getProperty("user.home")
        +File.pathSeparator +  "Guia2";
    private final int TamanioRegistro = 80;
    private final RandomAccessFile flujo;
    private int NumeroRegistro;
    
    private static final String RUTA_ARCHIVO = CARPETA_ARCHIVO
        +File.pathSeparator + "registro.dat";
    
    public archivo() throws IOException{
        File carpeta = new File(CARPETA_ARCHIVO);
        if(!carpeta.exists()){
            carpeta.mkdirs();
        }
        flujo = new RandomAccessFile(RUTA_ARCHIVO, "rw");
    }
}

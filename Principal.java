/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptos;

/**
 *
 * @author lenovo
 */
public class Principal {
    
    public static void main(String[] args){
        
        Perro i = new Perro("Toby","Labrador",14);
       
        Gato j = new Gato("Estrella","bengala",10);
        
        i.mostrar();
        i.Sonido();
        
        j.mostrar();
        j.Sonido();
    }
}


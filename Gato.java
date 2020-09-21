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
public class Gato extends Animal {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos"> 
    private String nombre;
    private String raza;
    private float  altura;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor"> 
    public Gato(String nombre, String raza, float altura) {
        super(nombre, raza, altura);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos de la clase"> 
    public  void Sonido(){
        System.out.println("Sonido: MIAU");
    }
    public void mostrar() {
        System.out.println("Nombre= " + getNombre() + ", raza=" + getRaza() + ", altura=" + getAltura());
    }
    //</editor-fold>
}

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
public class Perro extends Animal {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos"> 
    private String nombre;
    private String raza;
    private float  altura;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor"> 
    public Perro(String nombre, String raza, float altura) {
        super(nombre, raza, altura);
    }
     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos de la clase"> 
    public  void Sonido(){
        System.out.println("Sonido: WOOF");
    }
    public void mostrar() {
        System.out.println("Nombre= " + getNombre() + ", raza=" + getRaza() + ", altura=" + getAltura());
    }
    //</editor-fold>
}

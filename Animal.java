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
public class Animal {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">    
    private String nombre;
    private String raza;
    private float  altura;
     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos, Constructor, getter and setter">  
    public Animal(String nombre, String raza, float altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos de la clase"> 
    public  void Sonido(){
        
    }
    public void mostrar() {
        System.out.println("Nombre= " + getNombre() + ", raza=" + getRaza() + ", altura=" + getAltura());
    }
    //</editor-fold>

    
}

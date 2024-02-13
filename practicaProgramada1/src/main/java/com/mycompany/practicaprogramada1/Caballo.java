/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada1;

/**
 *
 * @author User
 */
public class Caballo extends Vehiculo{
    private String raza; 
    private int edad;
    private String nivelDeHambre;

    public Caballo(String raza, int edad, String nivelDeHambre) {
        this.raza = raza;
        this.edad = edad;
        this.nivelDeHambre = nivelDeHambre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivelDeHambre() {
        return nivelDeHambre;
    }

    public void setNivelDeHambre(String nivelDeHambre) {
        this.nivelDeHambre = nivelDeHambre;
    }
    

    @Override
    public void aumentarVelocidad() {
    }

    @Override
    public void disminuirVelocidad() {
    }

    @Override
    public void frenar() {
    }

    @Override
    public void encenderAlarma() {
    }
    
    

    
    
    
}

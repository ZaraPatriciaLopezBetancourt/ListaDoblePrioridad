/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class Prioridad {
    private int nivel;
    private char dato;
    public Prioridad() {
    }
    public Prioridad(int nivel, char dato) {
        this.nivel = nivel;
        this.dato = dato;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }


     @Override
    public String toString() {
        return dato + " , " + "Nivel:" + nivel;
    }

}
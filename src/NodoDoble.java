/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class NodoDoble {
    Prioridad dato;
    private char valor;
    private int prioridad;
    private NodoDoble sig;
    private NodoDoble ant;
    
    public Prioridad getDato() {
        return dato;
    }
    public NodoDoble(char v, int p){
        valor=v;
        prioridad=p;
        sig=null;
        ant=null;
        
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
     public NodoDoble(){
        ant = sig = this;
    }
    
    public NodoDoble(Prioridad d){
        this.dato = d;
        ant = sig = this;
    }
    
    public NodoDoble(Prioridad d, NodoDoble a, NodoDoble s){
        this.dato = d;
        ant = a;
        sig = s;
    }  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class ListaPrioridad {
    private NodoDoble ini;
    private NodoDoble fin;
    
    public ListaPrioridad(){
        ini=fin=null;
    }
    
    public boolean insertar(char v, int p){
        NodoDoble nuevo = new NodoDoble(v,p);
        if(hayListaDobleVacia())ini=fin=nuevo;
        if(nuevo==null){
            return false;
        }
        if(ini==null && fin==null){
            ini=fin=nuevo;
            return true;
        }
        if(nuevo.getPrioridad()>ini.getPrioridad()){
            ini.setAnt(nuevo);
            nuevo.setSig(ini);
            ini=nuevo;
            return true;
        }
        if(nuevo.getPrioridad()<=fin.getPrioridad()){
            fin.setAnt(nuevo);
            nuevo.setAnt(fin);
            fin=nuevo;
            return true;
        }
        NodoDoble t=null;
        for(t=fin.getAnt();nuevo.getPrioridad()>t.getPrioridad(); t=t.getAnt()){}
        t.getSig().setAnt(nuevo);
        nuevo.setSig(t);
        t.setSig(nuevo);
        nuevo.setAnt(t);
        return true;
    }
    
    public String mostrar(){
        if(ini==null && fin==null){
            return "LISTA VACIA";
        }
        return mostrar(ini);
    }
    
    private String mostrar(NodoDoble temp){
        if(temp==null){
            return "";
        }
        return temp.getValor()+", "+ mostrar(temp.getSig());
    }
    
    public boolean eliminar(){
        if(hayListaDobleVacia())return false;
        if(SoloHayUnNodo()){
            ini.setAnt(null);
            fin.setAnt(null);
            ini = fin = null;
        }else{
            NodoDoble dato = ini;
            ini = ini.getSig();
            dato.setSig(null);
            ini.setAnt(null);
            ini.setAnt(fin);
            fin.setSig(ini);
            dato.setAnt(null);
            dato = null;
        }return true;
    }
    public boolean hayListaDobleVacia(){
        return ini == null;
    }
    public boolean SoloHayUnNodo(){
        return ini==fin;
    }
}

//Leonardo García Bernal.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoed;
import java.util.ArrayList;

public class Pila implements InterfazPila {

    private String[] pila;
    private Integer tope;

    public Pila(Integer tam){
        tope=-1;
        pila=new String[tam];
    }
    @Override
    public String pop() {
        String dato;
        dato=pila[tope];
        pila[tope]=null;
        tope--;
        return dato;
    }

    @Override
    public String peek() {
        return pila[tope];
    }

    @Override
    public void push(String dato) {
       if(tope<pila.length){
            tope++;
            pila[tope]=dato;
       }
    }
    @Override
    public Boolean isEmpty() {
        return tope==-1;
    }
    
    
}//Clase

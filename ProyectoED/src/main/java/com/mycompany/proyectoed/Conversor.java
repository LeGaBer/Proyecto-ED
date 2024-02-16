//Leonardo García Bernal.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoed;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Conversor {

    private String argumento;
    private ArrayList<String> posfijo;
    private ArrayList<String> desglose;
    private Pila aux;
    
    public Conversor(String argumento){
        this.argumento=argumento;
        posfijo=new ArrayList();
        desglose=new ArrayList();
        separadorCadena();
        aux=new Pila(desglose.size());
    }//Constructor Conversor
    public ArrayList<String> getPosfijo(){
        return posfijo;
    }
    private void separadorCadena(){
        StringTokenizer tokenizer;
        tokenizer=new StringTokenizer(argumento,"+*/^()",true);
        while(tokenizer.hasMoreTokens())
            desglose.add(tokenizer.nextToken());
    }//Método separadorCadena()
    private Integer jerarquia(String operador){
        Integer j=-1;
        switch(operador){
            case "+":{
                j=0;
                break;
            }
            case "*":{
                j=1;
                break;
            }
            case "/":{
                j=1;
                break;
            }
            case "^":{
                j=2;
                break;
            }
        }//Switch
        return j;
    }
    public void conversorPosfijo(){
        Integer tam=desglose.size();
        for(int i=0;i<tam;i++){
            switch(desglose.get(i)){
                case "(":{
                    aux.push(desglose.get(i));
                    break;
                }
                case ")":{
                    while(!aux.peek().equals("("))
                        posfijo.add(aux.pop());
                    aux.pop();
                    break;
                }
                case "+":{
                    while(!aux.isEmpty() && jerarquia(aux.peek())>=0)
                        posfijo.add(aux.pop());
                    aux.push(desglose.get(i));
                    break;
                }
                case "/":{
                    while(!aux.isEmpty() && jerarquia(aux.peek())>=1)
                        posfijo.add(aux.pop());
                    aux.push(desglose.get(i));
                    break;
                }
                case "*":{
                    while(!aux.isEmpty() && jerarquia(aux.peek())>=1)
                        posfijo.add(aux.pop());
                    aux.push(desglose.get(i));
                    break;
                }
                case "^":{
                    while(!aux.isEmpty() && jerarquia(aux.peek())>=2)
                        posfijo.add(aux.pop());
                    aux.push(desglose.get(i));
                    break;
                }
                default:{
                    posfijo.add(desglose.get(i));
                    break;
                }
            }//Swtich
        }//If
        while(!aux.isEmpty())
            posfijo.add(aux.pop());
    }//Método conversorPosfijo()
}//Clase Conversor

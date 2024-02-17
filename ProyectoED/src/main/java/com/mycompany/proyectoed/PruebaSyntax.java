/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author alega
 */
public class PruebaSyntax {
    
    public PruebaSyntax(){
        
    }
    public static void main(String[] args) {
        System.out.println("Prueba 1 (se espera que el resultado sea falso):" + Syntax.Syntax("175.0.1"));
        System.out.println("Pueba 2 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("15.2+13.0"));
        System.out.println("Pueba 3 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("8%*100"));
        System.out.println("Prueba 4 (se espera que el resultado sea falso): "+Syntax.Syntax("3%*"));
        System.out.println("Prueba 5 (se espera que el resultado sea falso):" + Syntax.Syntax("(8+9.0)+(10%*100"));
        System.out.println("Pueba 6 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("(18%*500)+((25*9)+(4/2))"));
        System.out.println("Pueba 7 (se espera que el resultado sea falso): "+ Syntax.Syntax(""));
        System.out.println("Prueba 8 (se espera que el resultado sea falso): "+Syntax.Syntax("89+15@90"));
        System.out.println("Pueba 9 (se espera que el resultado sea falso): "+ Syntax.Syntax("25+18/2*(Prueba)"));
        
    }
    
}

/**
 * <pre>
 * Clase PruebaProyecto
 * 
 * Clase de prueba del proyecto de calculadora.
 * Esta clase contiene el método main que realiza pruebas de las funciones del 
 * proyecto. Las pruebas incluyen la sintaxis de las expresiones, la conversión 
 * de expresiones a notación postfija y la evaluación de expresiones en notación 
 * postfija para obtener el resultado.
 * </pre>
 * @version 1.0
 * @author Ana Sofía Conde Islas, Carmen Sofía Delgado Escobar, Maria Alejandra Galicia Almaraz, Leonargo García Bernal, Alejandro Salas Aguilar y Jimena San German Elizondo
 */
public class PruebaProyecto {
    
    //Prueba Sintaxis 
    /**
     * Método principal que realiza pruebas de las funciones del proyecto de calculadora.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        //Prueba Sintaxis 
        System.out.println("SINTAXIS");
        System.out.println("Prueba 1 (se espera que el resultado sea falso):" + Syntax.Syntax("175.0.1"));
        System.out.println("Prueba 2 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("15.2+13.0"));
        System.out.println("Prueba 3 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("8%*100"));
        System.out.println("Prueba 4 (se espera que el resultado sea falso): "+Syntax.Syntax("3%*"));
        System.out.println("Prueba 5 (se espera que el resultado sea falso):" + Syntax.Syntax("(8+9.0)+(10%*100"));
        System.out.println("Prueba 6 (se espera que el resultado sea verdadero): "+ Syntax.Syntax("(18%*500)+((25*9)+(4/2))"));
        System.out.println("Prueba 7 (se espera que el resultado sea falso): "+ Syntax.Syntax(""));
        System.out.println("Prueba 8 (se espera que el resultado sea falso): "+Syntax.Syntax("89+15@90"));
        System.out.println("Prueba 9 (se espera que el resultado sea falso): "+ Syntax.Syntax("25+18/2*(Prueba)")+ "\n");
        
        //Prueba Convertir
        System.out.println("CONVERTIR A POSTFIJO");
        System.out.println(Convertir.Convertir("3*((34+87)-3(45)+(46/52))"));
        System.out.println(Convertir.Convertir("8^2"));
        System.out.println(Convertir.Convertir("25%100") + "\n");
        
        //Prueba De Postfijo a Resultado
        DePostfijaAResultado prueba=new DePostfijaAResultado();
        System.out.println("DE POSTFIJA A RESULTADO");
        String resultado1=prueba.dePostfijaAResultado("((3+4)*5)");
        System.out.println("Expresion: (3+4)*5, Resultado: "+ resultado1);
        String resultado2=prueba.dePostfijaAResultado("((2^3)*4)");
        System.out.println("Resultado:" +resultado2);
        String resultado3=prueba.dePostfijaAResultado("25%*100");
        System.out.println("Resultado:" +resultado3);
        String resultado4=prueba.dePostfijaAResultado("7/0");
        System.out.println("Resultado:" + resultado4);
        //FALTA PONER EL CASO DE NEGATIVOS EN CONVERTIR
        //String resultado6=prueba.dePostfijaAResultado("(-3+4)*-5)");
        //System.out.println("Resultado:" +resultado5);
    }
    
}

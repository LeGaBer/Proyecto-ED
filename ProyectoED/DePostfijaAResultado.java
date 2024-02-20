
import java.util.ArrayList;


public class DePostfijaAResultado {
    
    public DePostfijaAResultado(){
    }
    
    //metodo que realiza operaciones dependiendo del operador proporcionado
    private static String resuelveOperadores(String operador, String num1, String num2) {
      double d = 0;
      switch (operador) {
         case "*":
            d = Double.parseDouble(num1)*Double.parseDouble(num2);
            break;
         case "/":
            d = Double.parseDouble(num1)/Double.parseDouble(num2);
            break;
         case "^":
            d = Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
            break;
         case "+":
            d = Double.parseDouble(num1)+Double.parseDouble(num2);
            break;
         case "-":
            d = Double.parseDouble(num1)-Double.parseDouble(num2);
            break;
      }

      return Double.toString(d); //convierte el doble a cadena
   }//end resuelveOperadores
    
    //verifica si la cadena proporcionada es un número
    public static boolean esUnNumero(String cadena) {
        if (cadena==null || cadena.isEmpty()) // si está vacia
            return false;
        else{
            try{
                double cadenaADoble= Double.parseDouble(cadena); //trata de convertyir la cadena a double
                return true;
            }
            catch (NumberFormatException ex) { //NumberFormatException: excepcion en java cuando se intenta convertir de string a numero
            return false;
        }
        }
    }//end esUnNumero

    public String dePostfijaAResultado(String expresion) {
        ArregloPila<String> pila= new ArregloPila();
        String resultado = "";

        // 1) Verificar validez de la expresión
        if (Syntax.Syntax(expresion)) {
            
            // 2) Convertir a notación postfija
            if(!esUnNumero(expresion)){
                ArrayList<String> arrayList= Convertir.Convertir(expresion);
                // 3) Evaluar la expresión en notación postfija
                for (int i = 0; i < arrayList.size(); i++) {
                    String elemento = (String)arrayList.get(i);
                    if (esUnNumero(elemento)){
                        pila.push(elemento);
                    } else {
                        if (pila.isEmpty()) 
                            return "Error: Expresión incorrecta";
                        String num2 = pila.pop();
                        // Verificar de nuevo si hay suficientes operandos en la pila
                        if (pila.isEmpty()) 
                            return "Error: Expresión incorrecta";
                        String num1 = pila.pop();
                        // Realizar la operación y agregar el resultado a la pila
                        if ("/".equals(elemento) && Double.parseDouble(num2) == 0.0) 
                            return "Error: No se puede dividir entre cero";
                        else
                            pila.push(resuelveOperadores(elemento, num1, num2));
                    } 
                }
            }
            // Verificar si hay un solo resultado en la pila al final
            if (pila.isEmpty()) 
                return "Error: Expresión incorrecta";
            else 
                resultado = pila.peek();
        } else 
            return "Error de sintaxis";
        

        return resultado;
    }
      
}
    
    
import java.util.ArrayList;
/**
 * 
 * @author Leonardo García Bernal
 */
public class Convertir {

    /**
     *
     */
    public Convertir() {

    }
/**
 * 
 * @param chr Recibe un caractér cualquiera.
 * @return Regresa la jerarquía del orden de ejecución de operadores aritméticos
 * por convención si el peramétro es un operador,sino es operador regresa -1;
 */
    private static int JerarquiaOperaciones(char chr) {
        byte var;
        switch (chr) {
            case '*':
            case '/':
                var = 2;
                break;
            case '+':
            case '-':
                var = 1;
                break;
            case '^':
                var = 3;
                break;
            default:
                var = -1;

        }
        return var;
    }
/**
 * 
 * @param str Recibe la cadena de caracteres que contiene la operación aritmética que se quiere
 * convertir a posfia.
 * @return Regresa un ArrayList de los caracteres individuales del String dado como parámetro ordenados
 * en forma posfija.
 */
    public static ArrayList<String> Convertir(String str) {
        ArrayList<String> arrayList = new ArrayList();
        ArregloPila<Character> pila = new ArregloPila();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                String aux;
                if (str.charAt(i) == '-' && (i == 0 || str.charAt(i - 1) == '(')) {
                    // Si hay un '-' al principio o después de '('
                    aux = new String("");
                    aux = aux + str.charAt(i);
                    i++;

                    while (i < str.length() && (Character.isLetterOrDigit(str.charAt(i)) || str.charAt(i) == '.')) {
                        aux = aux + str.charAt(i);
                        i++;
                    }
                    arrayList.add(aux);
                    i--;
                } else if (Character.isLetterOrDigit(str.charAt(i))) {
                    for (aux = new String(""); i < str.length() && (Character.isLetterOrDigit(str.charAt(i)) || str.charAt(i) == '.'); i++) {
                        aux = aux + str.charAt(i);
                    }

                    if (i < str.length() && str.charAt(i) == '%') {
                        aux = Double.toString(Double.parseDouble(aux) / 100.0);
                        i++;
                    }

                    arrayList.add(aux);
                    i--;
                } else if (i - 1 >= 0 && Character.isLetterOrDigit(str.charAt(i - 1)) && str.charAt(i) == '(') {
                    pila.push('*');
                    pila.push('(');
                } else if (str.charAt(i) == '(') {
                    pila.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    while (!pila.isEmpty() && (Character) pila.peek() != '(') {
                        arrayList.add("" + pila.pop());
                    }

                    pila.pop();
                } else {
                    while (!pila.isEmpty() && JerarquiaOperaciones(str.charAt(i)) <= JerarquiaOperaciones((Character) pila.peek())) {
                        arrayList.add("" + pila.pop());
                    }

                    pila.push(str.charAt(i));
                }
            }
        }
        while (!pila.isEmpty()) {
            arrayList.add("" + pila.pop());
        }
        return arrayList;
    }
}

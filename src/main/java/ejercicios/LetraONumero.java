
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        if (Character.isLetter(caracter)) {
            if (Character.isUpperCase(caracter)) {
                return "Es letra Mayuscula";
            }else if (Character.isLowerCase(caracter)) {
                return "Es letra Minuscula";
            }
        }else if (Character.isDigit(caracter)) {
            return "Es numero";
        }else{
            return "No es letra ni número";
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}

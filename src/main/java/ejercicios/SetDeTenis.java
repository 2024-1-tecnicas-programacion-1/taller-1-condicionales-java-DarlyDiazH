package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA>6 && numVictoriasB<5 || numVictoriasB>6 && numVictoriasA<5) {
            return "Invalido";
        }else if (numVictoriasA==6 && numVictoriasB<=4) {
            return "Gano A";
        }else if (numVictoriasB==6 && numVictoriasA<=4) {
            return"Gano B";
        }else if (numVictoriasB==5 && numVictoriasA==7 || numVictoriasB==6 && numVictoriasA==7) {
            return "Gano A";
        }else if (numVictoriasA==5 && numVictoriasB==7 || numVictoriasA==6 && numVictoriasB==7) {
            return "Gano B";
        }else if (numVictoriasA<6 && numVictoriasB<6) {
            return "Aun no termina";
        }else if (numVictoriasA==6 && numVictoriasB>4 || numVictoriasB==6 && numVictoriasA>4) {
            return "Aun no termina";
        }
        else{
            return "Invalido";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganados por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}

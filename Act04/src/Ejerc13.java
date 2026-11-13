import java.util.Scanner;
public class Ejerc13 {
    public static void main(String[] args){
        // Crea un programa que permita al usuario almacenar una secuencia aritmética en un
        //array y luego mostrarla. Una secuencia aritmética es una serie de números que
        //comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
        //e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
        //programa solicitará al usuario V, I además de N (nº de valores a crear)

        Scanner teclado = new Scanner(System.in);

            IO.println("Introduce el valor inicial V:");
            int V = teclado.nextInt();

            IO.println("Introduce el incremento I:");
            int I = teclado.nextInt();

            IO.println("Cuantos valores quieres crear?");
            int N = teclado.nextInt();

            int[] numeros = new int[N];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = V + i * I;
            }

            IO.println("La secuencia aritmetica es:");

            for (int i = 0; i < numeros.length; i++) {
                IO.println(numeros[i]);
            }
        }
    }

import java.util.Scanner;
public class Ejerc9 {
    public static void main(String[] args) {
        // Crea un array de 100 enteros aleatorios entre 1 y 10.
        // Luego pide un número N y muestra las posiciones donde aparece.

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1 + Math.random() * 10);
        }

        Scanner sc = new Scanner(System.in);

        IO.println("Introduce un numero entre 1 y 10:");
        int N = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == N) {
                IO.println("Aparece en la posicion: " + i);
            }
        }

        sc.close();
    }
}


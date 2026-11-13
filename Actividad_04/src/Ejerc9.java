import java.util.Scanner;
public class Ejerc9 {
    public static void main(String[] args) {
        //Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        //enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        //y mostrará en qué posiciones del array aparece N

        Scanner teclado = new Scanner(System.in);
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
    }
}

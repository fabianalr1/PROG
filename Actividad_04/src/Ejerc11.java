import java.util.Scanner;
public class Ejerc11 {
    public static void main(String[] args){
        //Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        //el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        //del primer array al segundo array en orden inverso, y mostrar ambos por pantalla

        Scanner teclado = new Scanner(System.in);
            int[] numeros1 = new int[100];
            int[] numeros2 = new int[100];

            for (int i = 0; i < numeros1.length; i++) {
                numeros1[i] = i + 1;
            }

            for (int i = 0; i < numeros1.length; i++) {
                numeros2[i] = numeros1[99 - i];
            }

            IO.println("Primer array:");

            for (int i = 0; i < numeros1.length; i++) {
                IO.println(numeros1[i]);
            }

            IO.println("Segundo array en orden inverso:");

            for (int i = 0; i < numeros2.length; i++) {
                IO.println(numeros2[i]);
            }
        }
    }

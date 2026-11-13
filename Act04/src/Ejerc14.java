import java.util.Scanner;
public class Ejerc14 {
    public static void main(String[] args){
        // Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        //valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        //muestre por pantalla

        Scanner teclado = new Scanner(System.in);

            int[] numeros = new int[55];
            int posicion = 0;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= i; j++) {
                    numeros[posicion] = i;
                    posicion++;
                }
            }

            for (int i = 0; i < numeros.length; i++) {
                IO.print(numeros[i] + " ");
            }
        }
   }

import java.util.Arrays;
import java.util.Scanner;
public class Ejerc6 {
    public static void main(String[] args){
        /*Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla
         */
        Scanner teclado = new Scanner(System.in);
        IO.println("Introduzca el número de las variables");
        int N= teclado.nextInt();
        IO.println("Introduzca el valor a escribir ");
        int M= teclado.nextInt();
        int[] variable= new int[M];
        Arrays.fill(variable,M);
        for (int i : variable){
            IO.println(i);
        }
    }
}
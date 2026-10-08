import java.util.Scanner;
public class Ejerc2 {
    public static void main(String[] args) {
        /*EJERCICIO2:Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores
         */
        int[] numeros = new int[10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("Introduce los 10 numeros");
            int ni = teclado.nextInt();
            numeros[i] = ni;
            suma = suma + numeros[i];
        }
        IO.println("La suma de los numeros son: " + suma);
    }
}
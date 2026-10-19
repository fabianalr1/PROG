import java.util.Scanner;
public class Ejerc4 {
    public static void main(String[] args) {
        /*Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos
         */
        int[] numeros = new int[20];
        int suma= 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("Introduce los 20 numeros: ");
            int ni = teclado.nextByte();
            numeros[i] = ni;
            suma= suma + numeros[i];
        }
        IO.println("La suma es: " + suma);
    }
}
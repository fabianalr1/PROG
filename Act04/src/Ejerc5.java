import java.util.Scanner;
public class Ejerc5 {
    public static void main(String[] args){
        //Crea un programa que pida veinte números reales por teclado, los almacene en un array
        //y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.

        int[] numeros = new int[20];
        int suma= 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("Introduce los 20 numeros: ");
            int ni = teclado.nextByte();
            numeros[i] = ni;
            suma = suma + numeros[i];
        }
        int media = suma/ numeros.length;
        IO.println("La media es: " + media);
    }
}
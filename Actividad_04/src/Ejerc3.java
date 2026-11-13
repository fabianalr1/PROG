import java.util.Scanner;
import java.util.Arrays;
import java.util.OptionalInt;
public class Ejerc3 {
    public static void main(String[] args){
        /*EJERCICIO3: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        */

    int [] numeros= new int[10];
    for (int i=0 ; i< numeros.length ; i++) {
        Scanner teclado = new Scanner(System.in);
        IO.println("Introduce los 10 numeros: ");
        int ni= teclado.nextByte();
        numeros[i]=ni;
    }
    OptionalInt max = Arrays.stream(numeros).max();
        OptionalInt min = Arrays.stream(numeros).min();
        IO.println("Mayor: " + max);
        IO.println("Menor: " + min);
    }
}

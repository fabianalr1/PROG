import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        /*EJERCICIO1: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores */
            int [] numeros = new int[10];
            for ( int i=0;  i<numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("Introduce los 10 numeros" );
             int ni = teclado.nextInt();
             numeros[i]=ni;
        }
            for (int e = 0; e< numeros.length; e++){
                IO.println("Los numeros son: "+ numeros[e]);
            }
    }
}
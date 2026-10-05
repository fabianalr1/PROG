import java.util.Scanner;

public class Ejerc12 {
    public static void main(String[] args){
//Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre
// si ha leído algún número negativo, cuantos positivos y cuantos negativos.
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int negativos = 0, positivos = 0;

        do{
            IO.println("Introduce un número");
            numero = teclado.nextInt();
            if (numero <0){
                negativos++;

            }
        } while
    }
}

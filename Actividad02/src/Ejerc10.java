import java.util.Scanner;

public class Ejerc10 {
    public static void main(String[] args){
        /*
        Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        leído algún número negativo o no.
         */
        Scanner teclado = new Scanner(System.in);
        int contador;
        boolean hayNegativos = false;
        while(contador <= 10)
            IO.println("Introduce un número no nulo");
        int numero = teclado.nextInt();
        if(numero !=0){
            contador++;
            if(numero <0){
                hayNegativos = true;
            }
        }
    }
}
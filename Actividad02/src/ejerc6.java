import java.util.Scanner;

public class ejerc6 {
    public static void main(String[] args){
        //Realiza un programa que muestre los números desde el 1 hasta un número N que se
        //introducirá por teclado
        Scanner teclado = new Scanner(System.in);

        int n;
        int contador = 1;
        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        while(contador <= n){
            System.out.println(contador);
            contador = contador + 1;
        }
    }
}

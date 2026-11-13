import java.util.Scanner;
public class Ejerc7 {
    public static void main(String[] args){
        //Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        //todos los valores desde P hasta Q, y lo muestre por pantalla
        Scanner teclado= new Scanner(System.in);
        IO.println("Introduce P ");
        int P= teclado.nextInt();
        IO.println("Introduce Q ");
        int Q= teclado.nextInt();
        int valor = (Q - P);
        int[] variable = new int[valor];
        for (int i = 0 ; i <= variable.length; i++){
            IO.println(i + valor);
        }
    }
}
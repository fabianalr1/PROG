import java.util.Scanner;

public class ejerc8 {
    public static void main(String[] args){
        // Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        //Siendo el factorial:
        //• 0! = 1
        //• 1! = 1
        //• 2! = 2 * 1
        //• 3! = 3 * 2* 1
        //• N! = N * (N-1) * (N-2)........* 3*2*1
        Scanner teclado = new Scanner(System.in);
       System.out.print("Introduce nùmero positivo");
       double num = teclado.nextInt();

       double factorial = 1;
       for(int i = 1; i <= num; i++){
           factorial = factorial * i;
         }
       System.out.println("El factorial de " + num + "es: " + Math.abs(factorial));
       }
    }

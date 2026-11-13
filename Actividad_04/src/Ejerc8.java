import java.util.Scanner;
public class Ejerc8 {
    public static void main(String[] args) {
        //Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        //utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        //cuántos valores del array son igual o superiores a R
        Scanner teclado = new Scanner(System.in);
        double[] num = new double[100];
        for (int i = 0; i < num.length; i++) {
            double numero = Math.random();
        }
        int igual = 0;
        IO.println("Introduzca R: ");
        double R = teclado.nextDouble();
        if (R >= 0.0 && R <= 1.0) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] == R) {
                    igual++;
                }
            }
            IO.println("Son iguales: "+igual);
        }
    }
}
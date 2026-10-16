import java.util.Scanner;
public class Ejerc10 {
    public static void main(String[] args){
        //Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        //personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por 2
        //teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        //miden por encima y por debajo de la media

        Scanner teclado = new Scanner(System.in);
        IO.println("Cuantas personas hay");
        int n10 = teclado.nextInt();
        double sumae10 = 0.0,
        if(n10 > 0){
            double[] numeros = new double[n10];
        for (int i = 0; i < numeros.length; i++) {
            IO.println("Introduce la altura");
            numerose10[i] = Math.abs(teclado.nextDouble());
        }
    }
}

import java.util.Scanner;
public class Ejerc10 {
    public static void main(String[] args){
        // Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        //personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por 2
        //teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        //miden por encima y por debajo de la media

            Scanner teclado = new Scanner(System.in);

            IO.println("Cuantas personas hay?");
            int N = teclado.nextInt();

            double[] alturas = new double[N];

            for (int i = 0; i < alturas.length; i++) {
                IO.println("Introduce la altura de la persona " + (i + 1) + " en metros:");
                alturas[i] = teclado.nextDouble();
            }

            double suma = 0;
            double maxima = alturas[0];
            double minima = alturas[0];

            for (int i = 0; i < alturas.length; i++) {
                suma = suma + alturas[i];

                if (alturas[i] > maxima) {
                    maxima = alturas[i];
                }

                if (alturas[i] < minima) {
                    minima = alturas[i];
                }
            }
            double media = suma / N;

            int encima = 0;
            int debajo = 0;

            for (int i = 0; i < alturas.length; i++) {
                if (alturas[i] > media) {
                    encima++;
                }
                if (alturas[i] < media) {
                    debajo++;
                }
            }
            IO.println("Altura media: " + media + " metros");
            IO.println("Altura maxima: " + maxima + " metros");
            IO.println("Altura minima: " + minima + " metros");
            IO.println("Personas por encima de la media: " + encima);
            IO.println("Personas por debajo de la media: " + debajo);
        }
    }

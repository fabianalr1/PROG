import java.util.Scanner;

public class ejerc7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una calificación entre 0 y 10: ");
        double nota = teclado.nextDouble();
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy Deficiente");
        } else if (nota < 5 ) {
            System.out.println("Insuficiente");
        } else if (nota < 6 ) {
            System.out.println("Bien");
        } else if (nota < 9 ) {
            System.out.println("Notable");
        } else if (nota <=10 ) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La calificación no es válida");
        }
    }
}


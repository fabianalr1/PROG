import java.util.Scanner;

public class ejerc7 {
    public static void main(String[] args){
        // Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        //calificación alfabética, escribiendo el resultado
        //• de 0 a <3 Muy Deficiente
        //• de 3 a <5 Insuficiente
        //• de 5 a <6 Suficiente
        //• de 6 a <7 Bien
        //• de 7 a <9 Notable
        //• de 9 a 10 Sobresaliente

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una calificación entre 0 y 10: ");
        double nota = teclado.nextDouble();
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy Deficiente");
        } else if (nota  >= 3 && nota < 5 ) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6 ) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota  < 7 ) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota  < 9 ) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <10 ) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La calificación no es válida");
        }
    }
}

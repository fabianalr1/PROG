import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escribe un programa que pide la edad por teclado y nos muestra el mensaje
        // de “Eres mayor de edad” solo si lo somos
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE SU EDAD:");
        double edad = teclado.nextDouble();
        if (edad >= 18) ; {
            System.out.println("ERES MAYOR DE EDAD");
            teclado.close();
        }
    }
}
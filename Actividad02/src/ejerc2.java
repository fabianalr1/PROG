import java.util.Scanner;
public class ejerc2 {
        public static void main(String[] args) {
            //Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
            //mayor de edad” o el mensaje de “eres menor de edad”
            Scanner teclado = new Scanner(System.in);
            System.out.println("DIGITE SU EDAD: " );
            int edad2= teclado.nextInt();
            if (edad2>=18){
                System.out.println("ERES MAYOR DE EDAD");
            } else
                System.out.println("ERES MENOR DE EDAD");
        }
}

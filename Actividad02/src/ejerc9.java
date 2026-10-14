import java.util.Scanner;

public class ejerc9 {
    public static void main(String[] args){
        //Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        //minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        //transcurrido un segundo
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca horas: " );
        int horas = teclado.nextInt();
        System.out.print("Introduzca minutos: ");
        int minutos = teclado.nextInt();
        System.out.print("Introduzca segundos: ");
        int segundos = teclado.nextInt();
        //pasa un segundo
        ++segundos;
        if (segundos == 60) {
            segundos = 0;
        ++minutos;
        }
        if (minutos == 60) {
            minutos = 0;
        ++horas;
        if (horas == 24) {
            horas = 0;
        }
        System.out.println( horas + ": "minutos +": "segundos );
    }
}

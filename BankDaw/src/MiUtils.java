import java.util.Scanner;
public class MiUtils {

    public static double leerDoublePantalla (String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerTextoPantalla (String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();
    }

    public static boolean comprobarPatron (String patron , String texto){
        boolean is0k = false;
        is0k = texto.matches(patron);
        return is0k;
    }

    public static String comprobarPatronRepetidamente ( String patron , String mensaje){
        boolean is0k = false;
        String texto= "";
        do {
            texto = MiUtils.leerTextoPantalla(mensaje);
            is0k = MiUtils.comprobarPatron(patron , texto);
            if (!is0k){
                IO.println("El formato es incorrecto, vuelve a introduccirlo");
            }

        }while (!is0k);

        return texto;
    }
}

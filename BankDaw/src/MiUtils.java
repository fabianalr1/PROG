import java.util.Scanner;
public class MiUtils {
    private static String Sysytem;

    public static double leerDoublePantallla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerTextoPantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();
    }

    public static boolean comprobarPatron (String patron , String texto){
        boolean is0k = false;
        is0k = texto.matches(patron);
        return is0k;
    }

    public static String comprobrarPatronRepetidamente ( String patron , String texto){
        boolean is0k = false;
        String texto = "";
        do {
            texto = MiUtils.leerTextoPantalla();
            is0k = MiUtils.comprobarPatron(patron , texto);
            if (!is0k){
                IO.println("El formato es incorrecto, vuelve a introduccirlo");
            }

        }
    }
}

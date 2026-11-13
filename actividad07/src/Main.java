import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Se debe realizar un proyecto para crear el juego de “Piedra, papel o tijera”, el programa debe
        //de seguir la siguiente estructura.
        // Explicarle al jugador cómo se juega.
        // Generar la jugada aleatoria del ordenador.
        // Pedir al jugador su jugada mediante una letra (P para piedra, L para papel, T para tijeras,
        //o S para salir terminando la partida):
        // Decidir quién ha ganado.

        Scanner teclado = new Scanner(System.in);
        IO.println("El juego consiste en  tres simples pasos \n " +
                "jugar con el ordenador pulsando una letra");
        String opcion;
        do{
            IO.println("P = papel \n L = papel \n T = tijera \n S = salir");
            opcion = teclado.nextLine();

            if (opcion.equalsIgnoreCase("P"));


            else if (opcion.equalsIgnoreCase("L")) {
                IO.println("L");
            }
            else(opcion.equalsIgnoreCase("T"){
                IO.println("T");
            }
        }while ()




    }
}


//Una cosa es saber como se juega y otra es saberlo programar, los pasos a seguir serían:
// Preparar el esqueleto y las constantes necesarias.
// Mostrar instrucciones al usuario.
// Generar la jugada del ordenador.
// Recoger la jugada del usuario.
// Interpretar la jugada del usuario.
// Mostrar el resultado de la jugada.
// Hacer el juego repetitivo.
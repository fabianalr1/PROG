import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
       //1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        // palabra de la cadena en una línea distinta
         /* IO.println("Introduce una cadena de texto");
          String texto= Sc.nextLine();
          IO.println( texto.replace(" ", "\n"));
          */

        //2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        //iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas
       /*IO.println("Introduce la primera cadena de texto: ");
        String cadena1= Sc.nextLine();
        IO.println("Introduce la segunda cadena de texto: ");
        String cadena2= Sc.nextLine();
        if(cadena1.equals(cadena2)){
            IO.println("Las frases son iguales:");
        } else if (cadena1.equalsIgnoreCase(cadena2)) {
            IO.println("las frases son iguales ignorando mayusculas y mnusculas");
        }
        else {
            IO.println("las frases sopn distintas");
        }

        */
        //3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos
        //Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        //las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        //“Tarazón” y “Alcocer” mostrará “LIOTARALC”

        /*Scanner teclado = new Scanner(System.in);
        IO.println("INTRODUCE EL PRIMER NOMBRE");
        String nombre = Sc.nextLine();
        IO.println("INTRODUCE EL  PRIMER APELLIDO ");
        String apellido1 = Sc.nextLine();
        IO.println("INTRODUCE EL SEGUNDO APELLIDO");
        String apellido2 = Sc.nextLine();

        String codigo = (nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3)).toUpperCase();

         */
        //4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        //‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        //mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        //Nº de A's: 3
        //Nº de E's: 1
        //Nº de I's: 2
        //Nº de O's: 0
        //Nº de U's: 0

       /* Scanner teclado = new Scanner(System.in);
        IO.println("Introdusca la frase de desee: ");
        String fraseEj4 = Sc.nextLine();

        int  aes = 0,  ees = 0, ies = 0, oes = 0,ues = 0;

        for (char c : fraseEj4.toLowerCase().toCharArray()){
            switch (c){
                case 'a' -> aes++;
                case 'e' -> ees++;
                case 'i' -> ies++;
                case 'o' -> oes++;
                case 'u' -> ues++;
            }
        }

        */
        //5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        //o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas)
        //Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        //acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        //derecha a izquierda
        //Por ejemplo:
        //Amigo no gima
        //Dabale arroz a la zorra el abad
        //Amo la pacífica paloma
        //A man a plan a canal Panama

        Scanner teclado = new Scanner(System.in);
        IO.println("Introduzca la frase que desee: ");
        String fraseEj5 = Sc.nextLine();

        String fraseProcesada = fraseEj5.replace(" ", "").toLowerCase();

        boolean isPalindromo = true;
        int izquierda = 0;
        int derecha = fraseProcesada.length() - 1;


        while (izquierda < derecha){
            if (fraseProcesada.charAt(izquierda) != fraseProcesada.charAt(derecha)){
                isPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        IO.println("La frase es un palindromo " +isPalindromo);
    }
}
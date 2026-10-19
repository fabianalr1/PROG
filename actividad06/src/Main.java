import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        //y luego muestre la matriz por pantalla

        /*int[][] numeros = new int[5][5];
        int numero = 1;


        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                numeros[fila][columna] = numero;
                numero++;
            }
        }
        IO.println("Matriz de numeros: ");

        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.printf("%4d", numeros[fila][columna]);
            }
            IO.println();
        }

         */

        //2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        //multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla

        /*Scanner teclado = new Scanner(System.in);
        int[][] tablas = new int[10][10];

        for (int fila = 0; fila < tablas.length; fila++){
            for (int columna = 0; columna < tablas[fila].length; columna++){
                tablas[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        for (int fila = 0; fila < tablas.length; fila++){
            IO.println("Tabla del " + (fila + 1) + ": ");


            for (int columna = 0; columna < tablas[fila].length; columna++){
                System.out.printf("%4d", tablas[fila][columna]);
            }
            IO.println();
        }

         */

        //3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        //introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        //matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        //menores que cero y cuántos son igual a cero

        /*Scanner teclado = new Scanner(System.in);

        IO.println("Introduce el numero de filas: ");
        int filas = teclado.nextInt();
        IO.println("Introduce el numero de columnas: ");
        int columnas = teclado.nextInt();

        if (filas <= 0 || columnas <= 0) {
            IO.println("Las dimensiones deben ser positivas.");
        } else {
            int[][] numeros = new int[filas][columnas];

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            // Pedimos los valores de la matriz
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    IO.println("Valor [" + i + "][" + j + "]: ");
                    numeros[i][j] = teclado.nextInt();
                        }
                    }

            // Contamos los valores segun su signo
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    if (numeros[i][j] > 0) {
                        positivos++;
                    } else if (numeros[i][j] < 0) {
                        negativos++;
                    } else {
                        ceros++;
                    }
                }
            }

            System.out.println("\nResultado:");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
        teclado.close();

         */

        //4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        //1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        //programa mostrará la nota mínima, máxima y media de cada alumno

        /*Scanner teclado = new Scanner(System.in);

        double[][] notas = new double[4][5];

        for (int i = 0; i < notas.length; i++){
            IO.println("\nNotas del alumno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++){
                IO.println("Asignatura " + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++){

            double minima = notas[i][0];
            double maxima = notas [i][0];
            double suma = 0;

            for (int j = 0; j < notas[i].length; j++){

                suma += notas[i][j];

                if (notas[i][j] < minima){
                    minima = notas[i][j];
                }

                if (notas[i][j] > maxima){
                    maxima = notas[i][j];
                }
            }

            double media = suma / notas[i].length;

            IO.println("\nAlumno " + (i + 1));
            IO.println("Nota minima " + minima);
            IO.println("Nota maxima " + maxima);
            System.out.printf("Nota media: %.2f%n", media);
        }
            teclado.close();

         */

        //5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        //y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        //de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        //género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        //matriz. Luego se mostrará por pantalla el sueldo medio de cada género

            Scanner teclado = new Scanner(System.in);

            IO.println("Numero de personas en la empresa: ");
            int cantidad = teclado.nextInt();

            if (cantidad <= 0){
                IO.println("Debe hacer al menos una persona");
            }else {

                double[][] empleados = new double[cantidad][2];

                double sumaHombres = 0;
                double sumaMujeres = 0;

                int hombres = 0;
                int mujeres = 0;

                for (int i = 0; i < empleados.length; i++){

                    int genero;

                    do {
                        IO.println("Genero de la persona " + (i + 1)
                        + "(0=varon, 1=mujer): ");
                        genero = teclado.nextInt();

                        if (genero != 0 && genero !=1){
                            IO.println("Introduce 0 o 1");
                        }
                    }while (genero != 0 && genero != 1);
                    IO.println("Sueldo: ");
                    double sueldo = teclado.nextDouble();

                    empleados[i][0] = genero;
                    empleados[i][1] = sueldo;
                }

                for (int i = 0; i < empleados.length; i++){

                    if (empleados[i][0] ==0){
                        sumaHombres += empleados[i][1];
                        hombres++;
                    } else {
                        sumaMujeres += empleados[i][1];
                        mujeres++;
                    }
                }

                double mediaHombres = 0;
                double mediaMujeres = 0;

                System.out.println("\nResultados de la empresa:");

                if (hombres > 0){
                    mediaHombres = sumaHombres / hombres;
                    System.out.printf("Sueldo medio de los hombres: %.2f%n",
                            mediaHombres);
                }else {
                    IO.println("No hay hombres registrados ");
                }
                if (mujeres > 0){
                    mediaMujeres = sumaMujeres / mujeres;
                    System.out.printf("Sueldo medio de las mujeres: %.2f%n",
                            mediaMujeres);
                } else {
                    IO.println("No hay mujeres registradas");
                }

                if (hombres > 0 && mujeres >0){

                    double diferencia = Math.abs(mediaHombres - mediaMujeres);
                    System.out.printf("Diferencia entre las medias: %.2f%n",
                            diferencia);

                    if (diferencia > 0.001){
                        System.out.println("Existe una diferencia entre los sueldos medios.");
                    }else {
                        IO.println("los sueldos medios son iguales ");
                    }
                }
            }
            teclado.close();
        }
    }

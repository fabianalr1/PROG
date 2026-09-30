public class ejerc5 {
    public static void main(String[] args){
        //Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Esta vez utiliza un contador sumando de 1 en 1.
        int np =1;
        while(np <= 200){
            if (np % 2 == 0){
                System.out.println(np);
            }
            np = np + 1;
        }
    }
}

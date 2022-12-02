import java.util.Scanner;

public class Reader {

      private static int key;
    public static int[] reader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many data do you have?");

        // accepts the total number of numbers/data they will put in
        key= scanner.nextInt();

        int[] numbers = new int[key];

        System.out.println("Please Enter Your list of data?");

        // accepts arrays
        for (int i = 0; i < key; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

   public static int getKey(){
        return key;
   }
}

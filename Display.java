import java.util.Scanner;

public class Display {

       // This method used for accepting the users interest in seeing the result
      // arrays are printed out
    public static void display(int numbers[]){

        System.out.println("Do you want to see the Sorted array? Y or N");
        Scanner scanner = new Scanner(System.in);
        char reply= scanner.next().charAt(0);

          // the accepted character is matched
        // desired array is printed
        if(reply=='Y'||reply=='y'){
            for (int value:numbers) {
                System.out.println(" "+value);

            }

        }else{
            System.out.println("Oops Sorry Next time then!");
        }

    }


}

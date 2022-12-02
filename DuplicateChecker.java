import java.util.Scanner;

public class DuplicateChecker {

       // checks if there is duplicate element in the given array
    public void arrayDuplicateChecker(int numbers[],int key) {
        boolean flag = false;

           // Search for duplicate in the given array
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                   //  if two different elements are the same then does not go in
                if (i!=j && (numbers[j] == numbers[i])) {
                    flag = true;
                    break;
                }
            }
        }

        if(flag==true) {
            System.out.println("There is a duplicate on your datas");
        } else{
            System.out.println("All values in your data are unique");
        }


    }
}
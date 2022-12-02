import java.util.Scanner;

public class BubbleSort {

    public void bubbleSort(int numbers[],int key){

        // Does the BubbleSort Algorithm
        // compares to values next to each other if one initial is higher then swap them
         for(int i=0;i<numbers.length-1;i++) {
             for (int j = 0; j < numbers.length- 1; j++) {
                 int temp;

                    // swapping is done here
                 if (numbers[j] > numbers[j + 1]) {
                     temp = numbers[j + 1];
                     numbers[j + 1] = numbers[j];
                     numbers[j] = temp;
                 }
             }
         }
 // calls display method to display sorted array
   Display.display(numbers);


    }

}

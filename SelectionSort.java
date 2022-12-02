import java.util.Scanner;

public class SelectionSort {

    public void selectionSort(int numbers[],int key) {


        // an index we use to point at the current least value

        for (int index = 0; index < numbers.length - 1; index++) {
            int lowestValuePointer = index;

            for (int i = index + 1; i < numbers.length; i++) {

                // Selecting the minimum number in each loop.
                if (numbers[i] < numbers[lowestValuePointer]) {
                    lowestValuePointer = i;
                }
            }

            // put lowestValuePointer at the correct position
            int temp = numbers[index];
            numbers[index] = numbers[lowestValuePointer];
            numbers[lowestValuePointer] = temp;
        }
        Display.display(numbers);

    }
}







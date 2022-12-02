public class QuickSort {



          public static int pivotFinder(int numbers[], int low, int high) {

               // we are choosing the rightmost number as a pivot
               int pivot = numbers[high];

               // index would point at the number with higher value
               int i = (low - 1);

               //compares each value with the pivot
               for (int j = low; j < high; j++) {
                    if (numbers[j] <= pivot) {
                         // swap it with the greater element pointed by i
                         i++;

                         // swapping element at i with element at j
                         int temp = numbers[i];
                         numbers[i] = numbers[j];
                         numbers[j] = temp;
                    }

               }

               // swapping the pivot element with the greater element specified by i
               int temp = numbers[i + 1];
               numbers[i + 1] = numbers[high];
               numbers[high] = temp;

               return (i + 1);
          }

          static void quickSort(int numbers[], int low, int high) {
               if (low < high) {

                    // elements smaller than pivot are on the left
                    // elements greater than pivot are on the right and then find the pivot
                    int pi = pivotFinder(numbers, low, high);

                    // recursive call on the left of pivot
                    quickSort(numbers, low, pi - 1);

                    // recursive call on the right of pivot
                    quickSort(numbers, pi + 1, high);
               }

     show(numbers);
          }

          public static void show(int numbers[]){
               Display.display(numbers);
               System.exit(0);
          }

     }



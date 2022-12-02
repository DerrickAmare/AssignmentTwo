public class Main {

    public static void main(String[] args) {

         // Accepting value of the arrays from user by calling reader method
        // Accepting value of their array length respectively from user by calling getKey method
   int numbers[]=Reader.reader();
      int numbers2[] =Reader.reader();
        int key=Reader.getKey();


        // Object is created for every class in order to access the methods inside since they are not static
        SelectionSort ss= new SelectionSort();
        BubbleSort bs= new BubbleSort();
        DuplicateChecker dc= new DuplicateChecker();
        QuickSort qs= new QuickSort();
        MergeSort ms= new MergeSort();
        SubsetChecker sc= new SubsetChecker();




           // Here is the method are called using their respective objects
          // those who accept values are sent to them
       qs.quickSort(numbers,0,numbers.length-1);
          ss.selectionSort(numbers,key);
          bs.bubbleSort(numbers,key);
          dc.arrayDuplicateChecker(numbers,key);
            ms.mergeSort(numbers,0,numbers.length-1);
        ms.show(numbers);
        sc.subsetValidator(numbers,numbers2);


    }

}
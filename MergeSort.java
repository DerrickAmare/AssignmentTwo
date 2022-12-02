public class MergeSort {


       public  void merge (int numbers[],int p, int q, int r) {


            int n1 = q - p + 1;
            int n2 = r - q;

            int L[] = new int[n1];
            int M[] = new int[n2];

            for (int i = 0; i < n1; i++)
                L[i] = numbers[p + i];
            for (int j = 0; j < n2; j++)
                M[j] = numbers[q + 1 + j];

            // Maintain current index of sub arrays and main array
            int i, j, k;
            i = 0;
            j = 0;
            k = p;

            // elements L and M and place them in the correct position at A[p..r]
            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    numbers[k] = L[i];
                    i++;
                } else {
                    numbers[k] = M[j];
                    j++;
                }
                k++;
            }

            // When we run out of elements in either L or M,
            // pick up the remaining elements and put in A[p..r]
            while (i < n1) {
                numbers[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                numbers[k] = M[j];
                j++;
                k++;
            }
        }

        // Divide the array into two sub arrays, sort them and then merge them together
        void mergeSort(int numbers[], int l, int r) {
            if (l < r) {

                // m is the point where the array is divided into two sub arrays
                int m = (l + r) / 2;

                mergeSort(numbers, l, m);
                mergeSort(numbers, m + 1, r);


                merge(numbers, l, m, r);
            }

        }
    public void show(int numbers[]){
        Display.display(numbers);
        System.exit(0);
    }

    }


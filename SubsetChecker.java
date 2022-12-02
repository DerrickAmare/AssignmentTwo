import java.util.Scanner;

public class SubsetChecker {

       public void subsetValidator(int numbers[],int numbers2[]) {

            int j;
           boolean flag=true;

           // iterates through each element of both arrays
           //tries to match each value and if equal breaks out of the current loop and matches the next value


           for(int i=0;i<numbers2.length;i++)
           {
               for(j=0;j<numbers.length;j++)
               {
                   //since i is incremented that value of the second array will not be compared again
                   if(numbers2[i]==numbers[j])
                   {
                       break;
                   }
               }
               // if gone through all elements and not break done yet then set value to false
               // signals that array is not subset
               if(j==numbers.length)
               {
                   flag=false;
                   System.out.println("your second array is not a subset of the main array");
                   break;
               }
           }
           if(flag)
           {
               System.out.println("your second array is a subset of the main array");
           }
       }
       }



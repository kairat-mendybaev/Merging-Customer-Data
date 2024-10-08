// // Input Format:
////
////Two sorted integer arrays customerData1 and customerData2, and two integers m and n.
////Output Format:
////
////The merged array, sorted in non-decreasing order, stored in customerData1.
////Examples:
////
////Example 1:
////Input: customerData1 = [101,104,107,0,0,0], m = 3, customerData2 = [102,105,108], n = 3
////Output: [101,102,104,105,107,108]
////Explanation: The arrays being merged are [101,104,107] and [102,105,108].
////Example 2:
////Input: customerData1 = [103], m = 1, customerData2 = [], n = 0
////Output: [103]
////Explanation: Only one customer record in customerData1, none in customerData2.

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many values will be in the 1st array: ");
        int sizeOfArray1 = scan.nextInt();

        System.out.println("Enter data for Customer 1: ");
        ArrayList<Integer> customerData1 = new ArrayList<>(sizeOfArray1);
        for (int i = 0; i < sizeOfArray1; i++) {
            customerData1.add(scan.nextInt()); // stores all input numbers to Array
        }

        System.out.println("Enter how many values will be in the 2nd array: ");
        int sizeOfArray2 = scan.nextInt();
        if (sizeOfArray2 > 0) {
            System.out.println("Enter data for Customer 2: ");
        }
        ArrayList<Integer> customerData2 = new ArrayList<>(sizeOfArray2);
        for (int n = 0; n < sizeOfArray2; n++) {
            customerData2.add(scan.nextInt()); // stores all input numbers to Array
        }

        int mergedArraySize = sizeOfArray1 + sizeOfArray2;
        ArrayList<Integer> mergedArray = new ArrayList<>(mergedArraySize); // new separate Array for merging 2 arrays
        for (int i = 0; i < sizeOfArray1; i++) {
            mergedArray.add(customerData1.get(i)); // should store all values from customerData1 to mergedArray
        }

        for (int i = 0; i < sizeOfArray2; i++) {
            mergedArray.add(customerData2.get(i)); // should store all values from customerData2 to mergedArray
        }

        mergedArray.sort(null); // sorting the array
        System.out.println(mergedArray);

    }
}
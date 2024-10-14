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
import java.util.Collections;
import java.util.Scanner;

public class CustomerData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many values will be in the 1st array: ");
        int m = scan.nextInt();

        ArrayList<Integer> customerData1 = new ArrayList<>();
        System.out.println("Enter data for Customer 1: ");
        for (int i = 0; i < m; i++) {
            customerData1.add(scan.nextInt());
        }

        System.out.println("Enter how many values will be in the 2nd array: ");
        int n = scan.nextInt();
        ArrayList<Integer> customerData2 = new ArrayList<>();
        if (n > 0) {
            System.out.println("Enter data for Customer 2: ");
            for (int i = 0; i < n; i++) {
                customerData2.add(scan.nextInt());
            }
        }

        mergeAndSort(customerData1, m, customerData2, n);
        System.out.println(customerData1);
    }

    public static void mergeAndSort(ArrayList<Integer> customerData1, int m, ArrayList<Integer> customerData2, int n) {
        customerData1.addAll(customerData2);
        Collections.sort(customerData1);
    }
}

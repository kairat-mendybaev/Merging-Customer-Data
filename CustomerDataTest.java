import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerDataTest {

    @Test
    public void testMergeAndSortBothArraysFilled() {
        ArrayList<Integer> customerData1 = new ArrayList<>(Arrays.asList(101, 104, 107));
        ArrayList<Integer> customerData2 = new ArrayList<>(Arrays.asList(102, 105, 108));
        CustomerData.mergeAndSort(customerData1, 3, customerData2, 3);
        assertEquals(Arrays.asList(101, 102, 104, 105, 107, 108), customerData1);
    }

    @Test
    public void testMergeAndSortFirstArrayEmpty() {
        ArrayList<Integer> customerData1 = new ArrayList<>();
        ArrayList<Integer> customerData2 = new ArrayList<>(Arrays.asList(102, 105, 108));
        CustomerData.mergeAndSort(customerData1, 0, customerData2, 3);
        assertEquals(Arrays.asList(102, 105, 108), customerData1);
    }

    @Test
    public void testMergeAndSortSecondArrayEmpty() {
        ArrayList<Integer> customerData1 = new ArrayList<>(Arrays.asList(101, 104, 107));
        ArrayList<Integer> customerData2 = new ArrayList<>();
        CustomerData.mergeAndSort(customerData1, 3, customerData2, 0);
        assertEquals(Arrays.asList(101, 104, 107), customerData1);
    }

    @Test
    public void testMergeAndSortBothArraysEmpty() {
        ArrayList<Integer> customerData1 = new ArrayList<>();
        ArrayList<Integer> customerData2 = new ArrayList<>();
        CustomerData.mergeAndSort(customerData1, 0, customerData2, 0);
        assertTrue(customerData1.isEmpty());
    }

    @Test
    public void testMergeAndSortWithNegativeValues() {
        ArrayList<Integer> customerData1 = new ArrayList<>(Arrays.asList(-5, -3, 0));
        ArrayList<Integer> customerData2 = new ArrayList<>(Arrays.asList(-10, -4, 1));
        CustomerData.mergeAndSort(customerData1, 3, customerData2, 3);
        assertEquals(Arrays.asList(-10, -5, -4, -3, 0, 1), customerData1);
    }
    @Test
    public void testMergeAndSortWithDuplicates() {
        ArrayList<Integer> customerData1 = new ArrayList<>(Arrays.asList(100, 150, 200));
        ArrayList<Integer> customerData2 = new ArrayList<>(Arrays.asList(100, 150, 250));
        CustomerData.mergeAndSort(customerData1, 3, customerData2, 3);
        assertEquals(Arrays.asList(100, 100, 150, 150, 200, 250), customerData1);
    }


}

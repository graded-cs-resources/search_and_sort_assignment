import java.util.Arrays;
import java.util.Timer;

public class App {
    
    /*
     * The start method below currently generates one sorted array and one unsorted
     * array, prints the random one, then searches the unsorted array for the value 78
     * and shows how long it took
     * 
     * It does not work right now because the linear search method is not implemented.
     * Please go implement the linear search method, then play with this code, trying
     * different values for the arrays, different array lengths, etc.
     * 
     * Then extend this program to test binary search (using the sorted array) as
     * well as your two sorting methods. Method stubs for all of them are below the start method.
     * 
     */
    public void start() {
        int[] testArray1 = makeRandomArray(200, 500000000);
        int[] testArray2 = makeSortedArray(100);
        
       // System.out.println("Random array is " + Arrays.toString(testArray1));
        int searchVal = 78;
        System.out.println("Looking for " + searchVal + " in array...");
        long timeBeforeLinearSearch = System.currentTimeMillis();
        int searchPos = linearSearch(searchVal, testArray1);
        long timeAfterLinearSearch = System.currentTimeMillis();
        if (searchPos > 0) {
            System.out.println("Foudn it at position " + searchPos);
        }else{
            System.out.println("Did not find it");
        }
        double linearMS = (timeAfterLinearSearch - timeBeforeLinearSearch);
        System.out.println("Linear search took " + linearMS + " milliseconds");




    }
    
    /**
     * TODO - IMPLEMENT THIS
     * performs linear searc of arr for searchVal and returns the index of the first hit
     * returns -1 if value is not found
     */
    int linearSearch(int searchVal, int[] arr) {
        return -1;
    }

     /**
     * TODO - IMPLEMENT THIS
     * performs bionary of arr for searchVal and returns the index of the first hit
     * returns -1 if value is not found. Assumes arr is sorted.
     */
    int binarySearch(int searchVal, int[] arr) {
        return -1;
    }


     /**
     * TODO - IMPLEMENT THIS
     * sorts the arr of ints using bubble sort
     */
    void bubbleSort(int[] arr) {
        
    }

     /**
     * TODO - IMPLEMENT THIS
     * sorts the arr of ints using selection sort
     */
    void selectionSort(int[] arr) {
        
    }


    public int[] makeSortedArray(int count) {
        int[] output = new int[count];
        int c = 0;
        for (int i = 0; i < count; i++) {
            // add between 0 and 3 each step
            c += (int)(Math.random()*4);
            output[i]=c;
        }


        return output;
    }

    /**
     * Gernerates an array of size count of random ints between 0 and max
     * @param max
     * @param count
     * @return
     */
    public int[] makeRandomArray(int max, int count) {
        max = Math.abs(max);
        count = Math.abs(count);
        int[] output = new int[count];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int)(Math.random()*(max+1));
        }

        return output;
    }
    
    public static void main(String[] args) {
        new App().start();
    }
}

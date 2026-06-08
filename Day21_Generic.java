import java.io.*;
import java.util.*;

public class Solution {

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        int m = scanner.nextInt();
        String[] stringArray = new String[m];
        for (int i = 0; i < m; i++) {
            stringArray[i] = scanner.next();
        }
        
        printArray(intArray);
        printArray(stringArray);
    }
}

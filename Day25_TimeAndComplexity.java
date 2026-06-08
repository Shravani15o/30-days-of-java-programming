import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPrime(int n) {
        // Edge cases
        if (n <= 1) {
            return false;  
        }
        if (n == 2) {
            return true;  
        }
        if (n % 2 == 0) {
            return false;  
        }
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;  
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        
        scanner.close();
    }
}

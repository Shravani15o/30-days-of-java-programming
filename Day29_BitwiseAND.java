import java.io.*;
import java.util.*;

public class Solution {
    
    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int and = i & j;
                if (and < K && and > max) {
                    max = and;
                }
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(bitwiseAnd(N, K));
        }
        
        scanner.close();
    }
}

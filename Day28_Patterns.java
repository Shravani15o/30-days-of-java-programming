import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        List<String> gmailUsers = new ArrayList<>();

        Pattern pattern = Pattern.compile("@gmail\\.com$");
        
        for (int i = 0; i < N; i++) {
            String firstName = scanner.next();
            String emailID = scanner.next();
            
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                gmailUsers.add(firstName);
            }
        }
        
        Collections.sort(gmailUsers);
        
        for (String name : gmailUsers) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}

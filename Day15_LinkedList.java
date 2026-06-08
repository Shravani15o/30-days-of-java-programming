import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    
   
    public static Node insert(Node head, int data) {
      
        Node newNode = new Node(data);
        
        if (head == null) {
            return newNode;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    
        current.next = newNode;
        
   
        return head;
    }
    
   
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int T = scanner.nextInt();
        
       
        Node head = null;
        
        
        for (int i = 0; i < T; i++) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }
        
        
        display(head);
        
      
        scanner.close();
    }
}

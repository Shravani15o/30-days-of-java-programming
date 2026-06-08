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
    
  
    public static Node removeDuplicates(Node head) {
      
        if (head == null || head.next == null) {
            return head;
        }
      
        Node current = head;
    
        while (current != null && current.next != null) {
           
            if (current.data == current.next.data) {
               
                current.next = current.next.next;
            } else {
                
                current = current.next;
            }
        }
        
        return head;
    }
   
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
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int data = sc.nextInt();
            head = insert(head, data);
        }
        
        head = removeDuplicates(head);
        display(head);
        
        sc.close();
    }
}

import java.io.*;
import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;
    
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    public char calculate() {
        int total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total = total + testScores[i];
        }
        int average = total / testScores.length;
        
        if (average >= 90) return 'O';
        if (average >= 80) return 'E';
        if (average >= 70) return 'A';
        if (average >= 55) return 'P';
        if (average >= 40) return 'D';
        return 'T';
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        
        int numScores = scan.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

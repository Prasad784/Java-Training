package First;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
        // Create an ArrayList of type Student
        ArrayList<Student> studentList = new ArrayList<>();

        // Store 5 student data in the ArrayList
        studentList.add(new Student(101, "Alice"));
        studentList.add(new Student(102, "Bob"));
        studentList.add(new Student(103, "Eve"));
        studentList.add(new Student(104, "David"));
        studentList.add(new Student(105, "Carol"));

        // Print unsorted student data
        System.out.println("Unsorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Call the sort() method of Collections to sort student data
        Collections.sort(studentList);

        // Print sorted student data
        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}



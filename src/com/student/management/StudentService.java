package com.student.management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    // 1. Add Student
    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, age, department, marks));
        System.out.println("Student added successfully!");
    }

    // 2. View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println("----------------------");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Department: " + s.department);
            System.out.println("Marks: " + s.marks);
        }
    }

    // 3. Update Student
    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new Department: ");
                s.department = sc.nextLine();

                System.out.print("Enter new Marks: ");
                s.marks = sc.nextInt();

                System.out.println("Student updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // 4. Delete Student
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        boolean found = false;
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // 5. Search Student by ID
    public void searchStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("---- Student Found ----");
                System.out.println("ID: " + s.id);
                System.out.println("Name: " + s.name);
                System.out.println("Age: " + s.age);
                System.out.println("Department: " + s.department);
                System.out.println("Marks: " + s.marks);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}

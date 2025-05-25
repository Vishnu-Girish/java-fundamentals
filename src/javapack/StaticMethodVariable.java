package javapack;

class Student {
    String name;
    int marks;

    // Static variable to keep count of all students
    static int studentCount = 0;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        studentCount++; // Increment count when a new student is created
    }

    // Static method to calculate average marks
    static double calculateAverage(Student[] students) {
        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        return (double) total / studentCount;
    }
}

public class StaticMethodVariable{
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 90);
        students[1] = new Student("Bob", 80);
        students[2] = new Student("Charlie", 70);
        students[3] = new Student("David", 85);
        students[4] = new Student("Eva", 75);

        System.out.println("Total number of students: " + Student.studentCount);
        System.out.println("Average marks: " + Student.calculateAverage(students));
    }
}

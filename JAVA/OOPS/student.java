import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];
    int total;
    double average;
    char grade;

    void calculate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void display() {
        System.out.println("Name: " + name);
           System.out.println("Total Marks: " + total);
                System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           Student student = new Student();

        System.out.print("Enter student name: ");
             student.name = scanner.nextLine();

        System.out.println("Enter marks5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            student.marks[i] = scanner.nextInt();
        }

        student.calculate();
        student.display();
    }
}

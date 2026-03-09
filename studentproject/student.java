import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    int age;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
    }
}
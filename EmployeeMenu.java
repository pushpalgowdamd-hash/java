package basic;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

   
    Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        setSalary(designation);
    }


    void setSalary(String designation) {
        switch (designation) {
            case "P20": salary = 20000; break;
            case "M30": salary = 30000; break;
            case "T25": salary = 25000; break;
            default: salary = 0; break;
        }
    }

   
    void raiseSalary() {
        salary += 2000; // Example increment
        System.out.println("Salary raised successfully!");
    }

 
    void display() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your salary is: " + salary);
        System.out.println("Your designation is: " + designation);
    }
}

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = sc.next();
                    System.out.print("Enter the age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter the designation (P20/M30/T25): ");
                    String designation = sc.next();
                    emp = new Employee(name, age, designation);
                    System.out.println("Employee created successfully!");
                    break;

                case 2:
                    if (emp != null) {
                        emp.display();
                    } else {
                        System.out.println("No employee record found. Please create first.");
                    }
                    break;

                case 3:
                    if (emp != null) {
                        emp.raiseSalary();
                    } else {
                        System.out.println("No employee record found. Please create first.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}


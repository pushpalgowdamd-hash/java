package atm;

import java.util.Scanner;

class EmployeeData {
    String name;
    int age;

    EmployeeData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeData[] employees = new EmployeeData[100];

        int count = 0;
        int choice;

        do {
           // System.out.println("--------------------");
            System.out.println(" 1) Create \n 2) Display \n 3) Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    char addMore;

                    do {
                        if (count >= employees.length) {
                            System.out.println("Storage full! Cannot add more employees.");
                            break;
                        }

                        System.out.print("Enter your name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter your age: ");
                        int age = sc.nextInt();
                        sc.nextLine(); 

                        employees[count++] = new EmployeeData(name, age);

                        System.out.print("Enter next set of details? (y/n): ");
                        addMore = sc.next().toLowerCase().charAt(0);
                        sc.nextLine(); 

                    } while (addMore == 'y');

                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Employee Records ---");
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 3.");
            }

        } while (choice != 3);

        sc.close();
    }
}

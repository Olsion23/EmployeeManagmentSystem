package org.example;

import java.util.Scanner;

public class Main {
    EmployeeService employeeService = new EmployeeService();
    static boolean ordering = true;
    public static void menu(){
        System.out.println("******Welcome To Employee Management System******"
        + "\n1. Add Employee"
        + "\n2. View Employee"
        + "\n3. Update Employee"
        + "\n4. Delete Employee"
        + "\n5. View All Employee"
        + "\n6. Exit");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();


        do {
            menu();
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Employee: ");
                    employeeService.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee: ");
                    employeeService.viewEmployeeById();
                    break;
                case 3:
                    System.out.println("Update Employee: ");
                    employeeService.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee: ");
                    employeeService.deleteEmployee();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    employeeService.viewAllEmployees();
                    break;
                case 6:
                    System.out.println("Thank You For Using Our App!");
                    System.exit(0);

                default:
                    System.out.println("Please Enter A Valid Choice");
                    break;


            }
        }while (ordering);
    }
}
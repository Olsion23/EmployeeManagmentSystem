package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> employeeHashSet = new HashSet<>();

    Employee employee1 = new Employee (101, "Olsion", 34, "Software Developer", "IT", 13000);
    Employee employee2 = new Employee (102, "Bob", 30, "Software Developer", "IT", 8000);
    Employee employee3 = new Employee (103, "Max", 20, "Software Developer", "IT", 70000);

    Scanner scanner = new Scanner(System.in);
    int id;
    String name;
    int age;
    String position;
    String department;
    double salary;
    boolean found;

    public EmployeeService(){
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
    }
    /* View All Employees */
    public void viewAllEmployees(){
        for (Employee employee: employeeHashSet){
            System.out.println(employee);
        }
    }
    /* View Employee Based On Id */
    public void viewEmployeeById(){
        System.out.println("Enter The Employee Id: ");
        id = scanner.nextInt();
        for(Employee employee : employeeHashSet){
            if(employee.getId() == id){
                System.out.println(employee);
                found = true;
            }
        }if (! found){
            System.out.println("Employee With ID: " + id + "Not Found");
        }
    }
    /* Update The Employees */
    public void updateEmployee(){
        System.out.println("Enter The Employee Id: ");
        id = scanner.nextInt();
        for (Employee employee: employeeHashSet){
            if (employee.getId() == id){
                found = false;
                System.out.println("Enter New Name: ");
                name = scanner.next();
                System.out.println("Enter New Salary: ");
                salary = scanner.nextDouble();
                employee.setName(name);
                employee.setSalary(salary);
                System.out.println("Updated Details For Employee with id: " + id + "are: " + employee);
                found = true;
                }
            }if (! found){
            System.out.println("Employee with id: " + id + " is not present");
        }else {
            System.out.println("Employee with id: " + id + " updated successfully");
        }
    }
    /* Delete The Employee */
     public void deleteEmployee(){
         System.out.println("Enter The Employee Id: ");
         id = scanner.nextInt();
         boolean found = false;
         Employee employeeDelete = null;
         for (Employee employee: employeeHashSet){
             if (employee.getId() == id){
                 employeeDelete = employee;
                 found = true;
             }
         }if (! found){
             System.out.println("Employee with id: " + id + " is not present");
         }else {
             employeeHashSet.remove(employeeDelete);
             System.out.println("Employee deleted successfully");
         }
     }
     /* Add Employee */
    public void addEmployee(){
        System.out.println("Enter Employee Id: ");
        id = scanner.nextInt();
        System.out.println("Enter Employee Name: ");
        name = scanner.next();
        System.out.println("Enter Employee age: ");
        age = scanner.nextInt();
        System.out.println("Enter Employee Position: ");
        position = scanner.next();
        System.out.println("Enter Employee Department: ");
        department = scanner.next();
        System.out.println("Enter Employee Salary: ");
        salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, age, position, department, salary);
        employeeHashSet.add(employee);
        System.out.println("Employee Added Successfully");
        System.out.println(employee);
    }
}

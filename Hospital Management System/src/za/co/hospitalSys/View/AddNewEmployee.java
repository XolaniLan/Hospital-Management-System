package za.co.hospitalSys.View;

import za.co.hospitalSys.Controller.CreateEmployee;
import za.co.hospitalSys.Model.Cashier;
import za.co.hospitalSys.Model.Database;
import za.co.hospitalSys.Model.Employee;
import za.co.hospitalSys.Model.Option;
import za.co.hospitalSys.Model.Receptionist;
import za.co.hospitalSys.Model.User;

import java.util.Scanner;

public class AddNewEmployee implements Option {
    @Override
    public void operation(Scanner s, Database database,
                          User user) {

        System.out.println("Enter first name: ");
        String firstName = s.next();
        System.out.println("Enter Last Name: ");
        String lastName = s.next();

        System.out.println("Enter email: ");
        String email = s.next();
        System.out.println("Enter phone numbers: ");
        String phoneNumber = s.next();

        System.out.println("Enter password: ");
        String password = s.next();

        String confirmPassword;
        do {
            System.out.println("Confirm password: ");
            confirmPassword = s.next();
        } while (!password.equals(confirmPassword));

        System.out.println("Enter salary (double): ");
        double salary = s.nextDouble();
        int job;
        do {
            System.out.println("""
                Enter job title:
                1. Cashier
                2. Receptionist""");
            job = s.nextInt();
        } while ( job < 0 || job > 2 );

        Employee employee = null;

        switch (job) {
            case 1:
                employee = new Cashier();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setPhoneNumber(phoneNumber);
                employee.setPassword(confirmPassword);
                employee.setSalary(salary);
                break;
            case 2:
                employee = new Receptionist();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setPhoneNumber(phoneNumber);
                employee.setPassword(confirmPassword);
                employee.setSalary(salary);
                break;
            default:
                employee = new Employee() {
                    @Override
                    public int getJob() {
                        return 1-1;
                    }
                };
        }

        if (new CreateEmployee((employee, database).isCreated())) {
            System.out.println("Employee added successfully.");

        }

    }

    @Override
    public String getName() {
        return "Adds New Employee";
    }
}

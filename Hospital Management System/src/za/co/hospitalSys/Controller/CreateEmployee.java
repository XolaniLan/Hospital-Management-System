package za.co.hospitalSys.Controller;

import za.co.hospitalSys.Model.Database;
import za.co.hospitalSys.Model.Employee;

import java.sql.SQLException;


public class CreateEmployee {
    private Employee employee;
    private Database database;

    public CreateEmployee(Employee employee,
                          Database database) {
        this.employee = employee;
        this.database = database;
    }

    public boolean isCreated() {
        boolean created = false;
        String insert = "INSERT INTO `employees`(`FirstName`, `LastName`, `Email`, " +
                                                "`PhoneNumber`, `Password`, `Salary`, `Job`) " +
                        "VALUES ('" + employee.getFirstName() + "','" + employee.getLastName() + "'" +
                                 ",'" + employee.getEmail() + "','" + employee.getPhoneNumber() + "' +" +
                                 ",'" + employee.getPassword() + "','" + employee.getSalary() + "' + " +
                                 ",'" + employee.getJob() + "');";

        try {
            database.getStatement().execute(insert);
            created = true;
        } catch (SQLException e) {
            e.printStackTrace();
            created = false;
        }
        return created;
    }
}

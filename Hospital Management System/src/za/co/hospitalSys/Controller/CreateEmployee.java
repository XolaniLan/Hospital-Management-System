package za.co.hospitalSys.Controller;

import za.co.hospitalSys.Model.Database;
import za.co.hospitalSys.Model.Employee;


public class CreateEmployee {
    private Employee employee;
    private Database database;

    public CreateEmployee(Employee employee,
                          Database database) {
        this.employee = employee;
        this.database = database;
    }
}

package za.co.hospitalSys.Controller;

import za.co.hospitalSys.Model.Database;
import za.co.hospitalSys.Model.Employee;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ReadEmployees {
    private ArrayList<Employee> employees;

    public ReadEmployees(Database database) {
        String select = "SELECT * FROM `employees`;";
        employees = new ArrayList<>();

        try {
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                Employee e;
                
            }
        }
    }
}

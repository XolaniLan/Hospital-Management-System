package za.co.hospitalSys.View;

import za.co.hospitalSys.Model.Database;
import za.co.hospitalSys.Model.Option;
import za.co.hospitalSys.Model.User;

import java.util.Scanner;

public class ViewEmployees implements Option {
    @Override
    public void operation(Scanner s, Database database,
                          User user) {

    }

    @Override
    public String getName() {
        return "View All Employees";
    }
}

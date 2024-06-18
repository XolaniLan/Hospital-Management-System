package za.co.hospitalSys.Model;

import java.util.Scanner;

public interface Option {
    void operation(Scanner s, Database database,
                   User user);
    String getName();
}


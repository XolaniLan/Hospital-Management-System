package za.co.hospitalSys.Model;

public class Employee extends User {
    private double salary;

    public Employee() {
        super();
    }

    //\\ ==getters&&setters== //\\
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

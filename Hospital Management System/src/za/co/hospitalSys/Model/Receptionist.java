package za.co.hospitalSys.Model;

public class Receptionist extends Employee {
    public Receptionist() {
        super();
        this.options = new Option[] {};
    }

    @Override
    public int getJob() {
        return 2;
    }
}

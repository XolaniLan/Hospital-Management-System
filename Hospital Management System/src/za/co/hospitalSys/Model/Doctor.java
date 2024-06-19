package za.co.hospitalSys.Model;

public class Doctor extends Employee {
    private String specialization;

    public Doctor() {
        super();
        this.options = new Option[] {};
    }

    //\\ ==getters&&setters== //\\
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public int getJob() {
        return 0;
    }
}

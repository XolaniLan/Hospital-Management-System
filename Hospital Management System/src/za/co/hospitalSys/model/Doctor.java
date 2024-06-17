package za.co.hospitalSys.model;

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
}

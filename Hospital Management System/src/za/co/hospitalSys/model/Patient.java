package za.co.hospitalSys.model;

import java.util.ArrayList;

public class Patient extends User {
    private String bloodGroup;
    private ArrayList<Operations> operations;
    private ArrayList<Report> reports;
    private ArrayList<Operations> unpaidOperations;
    private ArrayList<Report> unpaidReport;

    public Patient() {
        super();
        this.options = new Option[] {};
    }

    //\\ ==getters&&setters== //\\
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public ArrayList<Operations> getOperations() {
        return operations;
    }
    public void setOperations(ArrayList<Operations> operations) {
        this.operations = operations;
    }
    public ArrayList<Report> getReports() {
        return reports;
    }
    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }
    public ArrayList<Operations> getUnpaidOperations() {
        return unpaidOperations;
    }
    public void setUnpaidOperations(ArrayList<Operations> unpaidOperations) {
        this.unpaidOperations = unpaidOperations;
    }
    public ArrayList<Report> getUnpaidReport() {
        return unpaidReport;
    }
    public void setUnpaidReport(ArrayList<Report> unpaidReport) {
        this.unpaidReport = unpaidReport;
    }

}

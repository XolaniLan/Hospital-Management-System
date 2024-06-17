package za.co.hospitalSys.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operations {

    private int ID;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateTime;
    private boolean paid;
    private DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("MM//dd/yyyy HH:mm:ss");

    public Operations() {}

    //\\ ==getters&&setters== //\\



}

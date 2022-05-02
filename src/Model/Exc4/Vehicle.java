package Model.Exc4;

import java.util.Calendar;
import java.util.Scanner;

public class Vehicle {
    
    private int id;
    private String type;
    private int numberPass;
    private boolean crew;
    private int numberWheels;
    private Calendar registrationDate;
    private String mediumMove;

    public Vehicle(int id,String type, int numberPass, boolean crew, int numberWheels, String mediumMove) {
        this.id= id;
        this.type = type;
        this.numberPass = numberPass;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.registrationDate = Calendar.getInstance();
        this.registrationDate.getCalendarType();
        this.mediumMove = mediumMove;
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberPass() {
        return numberPass;
    }

    public void setNumberPass(int numberPass) {
        this.numberPass = numberPass;
    }

    public boolean isCrew() {
        return crew;
    }

    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getMediumMove() {
        return mediumMove;
    }

    public void setMediumMove(String mediumMove) {
        this.mediumMove = mediumMove;
    }


    /**
     * Show the Vehicle's information formatted
     */
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tDate: " + getRegistrationDate().getTime()+"\n\tcrew: " + isCrew()+
                " \n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }


}

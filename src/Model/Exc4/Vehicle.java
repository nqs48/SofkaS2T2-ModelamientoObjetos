package Model.Exc4;

import java.util.Calendar;

/**
 * @author Nestor Quiroga
 * Class Vehicle
 */
public class Vehicle {
    /**
     * Vehicle's id
     */
    private int id;

    /**
     * Vehicle's type
     */
    private String type;

    /**
     * Vehicle's number passengers
     */
    private int numberPass;

    /**
     * is there crew on the vehicle
     */
    private boolean crew;

    /**
     * Vehicle's number wheels
     */
    private int numberWheels;

    /**
     * Vehicle's registration Date
     */
    private Calendar registrationDate;

    /**
     * Vehicle's medium Move
     */
    private String mediumMove;

    /**
     * Constructor class Vehicle
     * @param id value to Vehicle's id
     * @param type value to Vehicle's type
     * @param numberPass value to Vehicle's number passengers
     * @param crew value is there crew on the vehicle
     * @param numberWheels value to Vehicle's number wheels
     * @param mediumMove value to Vehicle's medium Move
     */
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

    /**
     * Gets the current vehicle's id
     * @return returns the vehicle's id type int
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the current vehicle's type
     * @return returns the vehicle's type, type string
     */
    public String getType() {
        return type;
    }

    /**
     * Sets a new vehicle's type
     * @param type Contains the new type to set, type string
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the current vehicle's number passengers
     * @return returns the vehicle's number passengers, type int
     */
    public int getNumberPass() {
        return numberPass;
    }


    /**
     * Gets the current is there crew on the vehicle
     * @return returns is there crew on the vehicle, type boolean
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Gets the current vehicle's number wheels
     * @return returns the vehicle's number wheels, type int
     */
    public int getNumberWheels() {
        return numberWheels;
    }

    /**
     * Gets the current vehicle's registration date
     * @return returns the vehicle's registration date, type Calendar
     */
    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Gets the current vehicle's medium move
     * @return returns the vehicle's medium move, type string
     */
    public String getMediumMove() {
        return mediumMove;
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

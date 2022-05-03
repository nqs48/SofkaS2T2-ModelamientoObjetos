package Model.Exc5;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Abstract Class AbsVehicle
 */
public abstract class AbsVehicle {
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
    public AbsVehicle(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove) {
        this.id = id;
        this.type = type;
        this.numberPass = numberPass;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.registrationDate = Calendar.getInstance();
        this.registrationDate.getCalendarType();
        this.mediumMove = mediumMove;
    }

    /**
     * Empty constructor abstract class AbsVehicle
     */
    public AbsVehicle() {
    }

    /**
     * Gets the current vehicle's id
     * @return returns the vehicle's id type int
     */
    public int getId() {
        return id;
    }

    /**
     * Sets a new vehicle's id
     * @param size Contains the new id to set, type int
     */
    public void setId(int size) {
        this.id = size + 1;
    }

    /**
     * Gets the current vehicle's type
     * @return returns the vehicle's type, type string
     */
    public String getType() {
        return type;
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
     * Static method to show information
     */
    public abstract void showInformation();

    /**
     * Receives the user information to create the entity
     * @param type Contains the key to create the entity
     * @return The new entity created
     */
    public AbsVehicle requestData(String type) {
        System.out.println("\nEnter the vehicle's number passengers:");
        Scanner numberPass = new Scanner(System.in);
        int s1NumberPass = numberPass.nextInt();
        System.out.println("\nThere is crew? (true or false): ");
        Scanner crew = new Scanner(System.in);
        boolean s1Crew = crew.nextBoolean();
        System.out.println("\nEnter the vehicle's number wheels: ");
        Scanner numberWheels = new Scanner(System.in);
        int s1NumberWheels = numberWheels.nextInt();
        System.out.println("\nEnter the vehicle's medium move: ");
        Scanner mediumMove = new Scanner(System.in);
        String s1MediumMove = mediumMove.nextLine();
        int autogenerateId = 0;
        switch (type) {
            case "bicycle" -> {
                System.out.println("\nEnter the bicycle's brakes type (Disk, Mechanic): ");
                Scanner brakes = new Scanner(System.in);
                String s1Brakes = brakes.nextLine();
                System.out.println("\nEnter the bicycle's rim size (inches): ");
                Scanner rimSize = new Scanner(System.in);
                int s1RimSize = rimSize.nextInt();
                return new Bicycle(autogenerateId, type, s1NumberPass, s1Crew, s1NumberWheels, s1MediumMove, s1Brakes, s1RimSize);
            }
            case "boat" -> {
                System.out.println("\nEnter the boat's material: ");
                Scanner material = new Scanner(System.in);
                String s1Material = material.nextLine();
                System.out.println("\nDoes the boat have oars (true 0r false) ?: ");
                Scanner oars = new Scanner(System.in);
                boolean s1Oars = oars.nextBoolean();
                return new Boat(autogenerateId, type, s1NumberPass, s1Crew, s1NumberWheels, s1MediumMove, s1Material, s1Oars);
            }

            case "car" -> {
                System.out.println("\nEnter the car's number doors: ");
                Scanner doors = new Scanner(System.in);
                int s1Doors = doors.nextInt();
                System.out.println("\nIs the car convertible (true or false) ?: ");
                Scanner convertible = new Scanner(System.in);
                boolean s1Convertible = convertible.nextBoolean();
                return new Car(autogenerateId, type, s1NumberPass, s1Crew, s1NumberWheels, s1MediumMove, s1Doors, s1Convertible);
            }
            case "motorcycle" -> {
                System.out.println("\nEnter the motorcycle's cylinder capacity (CC): ");
                Scanner cylinder = new Scanner(System.in);
                int s1Cylinder = cylinder.nextInt();
                System.out.println("\nEnter the motorcycle's type (OffRoad, Street): ");
                Scanner typeWay = new Scanner(System.in);
                String s1TypeWay = typeWay.nextLine();
                return new Motorcycle(autogenerateId, type, s1NumberPass, s1Crew, s1NumberWheels, s1MediumMove, s1Cylinder, s1TypeWay);
            }
            case "truck" -> {
                System.out.println("\nEnter the truck's height (mts): ");
                Scanner truckHeight = new Scanner(System.in);
                double s1TruckHeight = truckHeight.nextDouble();
                System.out.println("\nEnter the truck's capacity carry (Kgrs): ");
                Scanner capacity = new Scanner(System.in);
                int s1Capacity = capacity.nextInt();
                return new Truck(autogenerateId, type, s1NumberPass, s1Crew, s1NumberWheels, s1MediumMove, s1TruckHeight, s1Capacity);
            }
            default -> {
                return null;
            }
        }
    }
}
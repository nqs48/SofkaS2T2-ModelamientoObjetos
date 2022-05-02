package Model.Exc5;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class AbsVehicle {
    private int id;
    private String type;
    private int numberPass;
    private boolean crew;
    private int numberWheels;
    private Calendar registrationDate;
    private String mediumMove;

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

    public AbsVehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int size) {
        this.id = size + 1;
    }

    public String getType() {
        return type;
    }

    public int getNumberPass() {
        return numberPass;
    }

    public boolean isCrew() {
        return crew;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public String getMediumMove() {
        return mediumMove;
    }

    public abstract void showInformation();

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
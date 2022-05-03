package Model.Exc5;

/**
 * @author Nestor Quiroga
 * Class Bicycle to extends abstract class AbsVehicle
 */
public class Car extends AbsVehicle {
    /**
     * Car's number of doors
     */
    private int numberDoors;

    /**
     * is the car convertible
     */
    private boolean convertible;

    /**
     * Constructor class Car
     * @param id value to Car's id
     * @param type value to Car's type
     * @param numberPass value to Car's number passengers
     * @param crew value is there crew on the Car
     * @param numberWheels value to Car's number wheels
     * @param mediumMove value to Car's medium Move
     * @param numberDoors value to Car's number of doors
     * @param convertible value is the car convertible
     */
    public Car(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, int numberDoors, boolean convertible) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.numberDoors = numberDoors;
        this.convertible = convertible;
    }

    /**
     * Empty constructor class Car
     */
    public Car() {
    }

    /**
     * Gets the current Car's number of doors
     * @return returns the Car's number of doors, type int
     */
    public int getNumberDoors() {
        return numberDoors;
    }

    /**
     * Gets the current value for is the car convertible
     * @return returns is the car convertible, type boolean
     */
    public boolean isConvertible() {
        return convertible;
    }

    /**
     * Overrides the abstract parent method to show the car's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tNumber of Doors: " + getNumberDoors()+" doors\n\tIs Convertible?: " + isConvertible()+
                 "\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

package Model.Exc5;

/**
 * @author Nestor Quiroga
 * Class Bicycle to extends abstract class AbsVehicle
 */
public class Bicycle extends AbsVehicle {
    /**
     * Bicycle's brakes type
     */
    private String brakesType;

    /**
     * Bicycle's rim size
     */
    private int rimSize;

    /**
     * Constructor class Bicycle
     * @param id value to Bicycle's id
     * @param type value to Bicycle's type
     * @param numberPass value to Bicycle's number passengers
     * @param crew value is there crew on the Bicycle
     * @param numberWheels value to Bicycle's number wheels
     * @param mediumMove value to Bicycle's medium Move
     * @param brakesType value to Bicycle's brakes type
     * @param rimSize value to Bicycle's rim size
     */
    public Bicycle(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, String brakesType, int rimSize) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.brakesType = brakesType;
        this.rimSize = rimSize;
    }

    /**
     * Empty constructor class Bicycle
     */
    public Bicycle() {
    }

    /**
     * Gets the current Bicycle's brakes type
     * @return returns the Bicycle's brakes type, type string
     */
    public String getBrakesType() {
        return brakesType;
    }

    /**
     * Gets the current Bicycle's rim size
     * @return returns the Bicycle's rim size, type int
     */
    public int getRimSize() {
        return rimSize;
    }

    /**
     * Overrides the abstract parent method to show the bicycle's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tCrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tBrakes Type: " + getBrakesType()+"\n\tRim Size: " + getRimSize()+
                " inches\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

package Model.Exc5;

/**
 * @author Nestor Quiroga
 * Class Bicycle to extends abstract class AbsVehicle
 */
public class Boat extends AbsVehicle {
    /**
     * Boat's material
     */
    private String material;

    /**
     * is there oars on the boat
     */
    private boolean isOars;

    /**
     * Constructor class Boat
     * @param id value to Boat's id
     * @param type value to Boat's type
     * @param numberPass value to Boat's number passengers
     * @param crew value is there crew on the Boat
     * @param numberWheels value to Boat's number wheels
     * @param mediumMove value to Boat's medium Move
     * @param material value to Boat's material
     * @param isOars value is there oars on the boat
     */
    public Boat(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, String material, boolean isOars) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.material = material;
        this.isOars = isOars;
    }

    /**
     * Empty constructor class Boat
     */
    public Boat() {
    }

    /**
     * Gets the current Boat's material
     * @return returns the Boat's material, type string
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Gets the current value for is there oars on the boat
     * @return returns is there oars on the boat, type boolean
     */
    public boolean getIsOars() {
        return isOars;
    }

    /**
     * Overrides the abstract parent method to show the boat's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tMaterial: " + getMaterial()+"\n\tIs Oars?: " + getIsOars()+"\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

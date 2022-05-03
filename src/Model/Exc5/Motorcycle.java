package Model.Exc5;

/**
 * @author Nestor Quiroga
 * Class Motorcycle to extends abstract class AbsVehicle
 */
public class Motorcycle extends AbsVehicle {
    /**
     *  Motorcycle's cylinder capacity
     */
    private int cylinderCapacity;

    /**
     *  Motorcycle's type way
     */
    private String typeWay;

    /**
     * Constructor class Motorcycle
     * @param id value to Motorcycle's id
     * @param type value to Motorcycle's type
     * @param numberPass value to Motorcycle's number passengers
     * @param crew value is there Motorcycle on the Boat
     * @param numberWheels value to Motorcycle's number wheels
     * @param mediumMove value to Motorcycle's medium Move
     * @param cylinderCapacity value Motorcycle's cylinder capacity
     * @param typeWay value Motorcycle's type way
     */
    public Motorcycle(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, int cylinderCapacity, String typeWay) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.cylinderCapacity = cylinderCapacity;
        this.typeWay = typeWay;
    }

    /**
     * Empty constructor class Motorcycle
     */
    public Motorcycle() {
    }

    /**
     * Gets the current Motorcycle's type way
     * @return returns the Motorcycle's type way, type string
     */
    public String getTypeWay() {
        return typeWay;
    }

    /**
     * Gets the current Motorcycle's cylinder capacity
     * @return returns the Motorcycle's cylinder capacity, type int
     */
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Overrides the abstract parent method to show the Motorcycle's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tCylinder Capacity: " + getCylinderCapacity()+" CC \n\tType: " + getTypeWay()+
                "\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

package Model.Exc5;

/**
 * @author Nestor Quiroga
 * Class Truck to extends abstract class AbsVehicle
 */
public class Truck extends AbsVehicle {
    /**
     * Truck's height
     */
    private double truckHeight;

    /**
     * Truck's capacity Carry
     */
    private int capacityCarry;

    /**
     * Constructor class Truck
     * @param id value to Truck's id
     * @param type value to Truck's type
     * @param numberPass value to Truck's number passengers
     * @param crew value is there crew on the Truck
     * @param numberWheels value to Truck's number wheels
     * @param mediumMove value to Truck's medium Move
     * @param truckHeight value to Truck's height
     * @param capacityCarry value to Truck's capacity Carry
     */
    public Truck(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, double truckHeight, int capacityCarry) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.truckHeight = truckHeight;
        this.capacityCarry = capacityCarry;
    }

    /**
     * Empty constructor class Truck
     */
    public Truck() {
    }

    /**
     * Gets the current Truck's height
     * @return returns the Truck's height, type double
     */
    public double getTruckHeight() {
        return truckHeight;
    }

    /**
     * Gets the current Truck's capacity Carry
     * @return returns the Truck's capacity Carry, type int
     */
    public int getCapacityCarry() {
        return capacityCarry;
    }

    /**
     * Overrides the abstract parent method to show the Truck's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tCapacity Carry: " + getCapacityCarry()+"Kgr \n\tTruck Height: " + getTruckHeight()+
                " mts\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

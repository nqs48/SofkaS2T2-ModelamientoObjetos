package Model.Exc5;


public class Truck extends AbsVehicle {

    private double truckHeight;
    private int capacityCarry;

    public Truck(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, double truckHeight, int capacityCarry) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.truckHeight = truckHeight;
        this.capacityCarry = capacityCarry;
    }

    public Truck() {
    }

    public double getTruckHeight() {
        return truckHeight;
    }

    public int getCapacityCarry() {
        return capacityCarry;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tCapacity Carry: " + getCapacityCarry()+"Kgr \n\tTruck Height: " + getTruckHeight()+
                " mts\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

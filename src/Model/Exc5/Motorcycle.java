package Model.Exc5;

public class Motorcycle extends AbsVehicle {

    private int cylinderCapacity;
    private String typeWay;

    public Motorcycle(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, int cylinderCapacity, String typeWay) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.cylinderCapacity = cylinderCapacity;
        this.typeWay = typeWay;
    }

    public Motorcycle() {
    }

    public String getTypeWay() {
        return typeWay;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tCylinder Capacity: " + getCylinderCapacity()+" CC \n\tType: " + getTypeWay()+
                "\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

package Model.Exc5;

public class Boat extends AbsVehicle {

    private String material;
    private boolean isOars;

    public Boat(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, String material, boolean isOars) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.material = material;
        this.isOars = isOars;
    }


    public Boat() {
    }

    public String getMaterial() {
        return material;
    }

    public boolean getIsOars() {
        return isOars;
    }


    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tMaterial: " + getMaterial()+"\n\tIs Oars?: " + getIsOars()+"\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

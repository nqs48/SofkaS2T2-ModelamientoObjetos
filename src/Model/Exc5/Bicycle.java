package Model.Exc5;

public class Bicycle extends AbsVehicle {

    private String brakesType;
    private int rimSize;

    public Bicycle(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, String brakesType, int rimSize) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.brakesType = brakesType;
        this.rimSize = rimSize;
    }

    public Bicycle() {
    }

    public String getBrakesType() {
        return brakesType;
    }

    public int getRimSize() {
        return rimSize;
    }


    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tCrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tBrakes Type: " + getBrakesType()+"\n\tRim Size: " + getRimSize()+
                " inches\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

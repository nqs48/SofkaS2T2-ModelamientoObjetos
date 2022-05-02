package Model.Exc5;

public class Car extends AbsVehicle {
    private int numberDoors;
    private boolean convertible;


    public Car(int id, String type, int numberPass, boolean crew, int numberWheels, String mediumMove, int numberDoors, boolean convertible) {
        super(id, type, numberPass, crew, numberWheels, mediumMove);
        this.numberDoors = numberDoors;
        this.convertible = convertible;
    }

    public Car() {
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Vehicle: " + getId() +" ++++++++++++++" + "\n\tType: " + getType() + "\n\tNumber Passengers: " + getNumberPass() +
                "\n\tcrew: " + isCrew()+ "\n\tNumber Wheels: " + getNumberWheels() + "\n\tMedium Move: " + getMediumMove()+
                "\n\tNumber of Doors: " + getNumberDoors()+" doors\n\tIs Convertible?: " + isConvertible()+
                 "\n\tRegistration Date: " + getRegistrationDate().getTime()+"\n");
        System.out.print("-----------------------------------------\n\n");
    }
}

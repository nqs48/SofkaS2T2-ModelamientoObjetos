package Model.Exc1;

import Model.Exc1.AbsCelestialBody;

public class Star extends AbsCelestialBody {

    private double sunDistance;
    private int age;

    public Star(int id, String name, double mass, double density, double diameter, double sunDistance, int age) {
        super(id, name, mass, density, diameter);
        this.sunDistance=sunDistance;
        this.age = age;
    }

    public Star() {
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public int getAge() {
        return age;
    }


    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Star: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                "Kgs \n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tSun Distance: "+ getSunDistance()+" kms\n\tAge: "+getAge()+" years");
        System.out.print("-----------------------------------------\n\n");
    }
}

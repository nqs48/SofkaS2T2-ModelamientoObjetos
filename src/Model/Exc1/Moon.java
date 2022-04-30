package Model.Exc1;

import Model.Exc1.AbsCelestialBody;

public class Moon extends AbsCelestialBody {

    private double sunDistance;
    private String color;
    private String composition;

    public Moon(int id, String name, double mass, double density, double diameter, double sunDistance, String color, String composition) {
        super(id, name, mass, density, diameter);
        this.sunDistance= sunDistance;
        this.color = color;
        this.composition = composition;
    }

    public Moon() {
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public String getColor() {
        return color;
    }

    public String getComposition() {
        return composition;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Moon: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" Kms\n\tSun Distance: "+ getSunDistance()+" Kms\n\tColor: "+getColor() +
                "\n\tComposition: " + getComposition());
        System.out.print("-----------------------------------------\n\n");
    }
}

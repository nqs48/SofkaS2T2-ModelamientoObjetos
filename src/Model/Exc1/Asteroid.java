package Model.Exc1;

import Model.Exc1.AbsCelestialBody;

public class Asteroid extends AbsCelestialBody {

    public Asteroid(int id, String name, double mass, double density, double diameter) {
        super(id, name, mass, density, diameter);
    }

    public Asteroid() {
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Asteroid: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " Kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms");
        System.out.print("-----------------------------------------\n\n");
    }
}

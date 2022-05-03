package Model.Exc1;

/**
 * @author Nestor Quiroga
 * Class Asteroid to extends abstract class AbsCelestialBody
 */
public class Asteroid extends AbsCelestialBody {
    /**
     * Constructor class Asteroid
     * @param id value to CelestialBody's id
     * @param name value to CelestialBody's name
     * @param mass value to CelestialBody's mass
     * @param density value to CelestialBody's density
     * @param diameter value to CelestialBody's diameter
     */
    public Asteroid(int id, String name, double mass, double density, double diameter) {
        super(id, name, mass, density, diameter);
    }

    /**
     *  Empty constructor class Asteroid
     */
    public Asteroid() {
    }

    /**
     * Override the abstract parent method to show the asteroid's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Asteroid: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " Kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms");
        System.out.print("-----------------------------------------\n\n");
    }
}

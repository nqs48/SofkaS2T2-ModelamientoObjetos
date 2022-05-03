package Model.Exc1;

/**
 * @author Nestor Quiroga
 * Class Star to extends abstract class AbsCelestialBody
 */
public class Star extends AbsCelestialBody {
    /**
     * Star's distance to the sun
     */
    private double sunDistance;

    /**
     * Star's age
     */
    private int age;

    /**
     * Constructor class Star
     * @param id value to Star's id
     * @param name value to Star's name
     * @param mass value to Star's mass
     * @param density value to Star's density
     * @param diameter value to Star's diameter
     * @param sunDistance value Star's distance to the sun
     * @param age value Star's age
     */
    public Star(int id, String name, double mass, double density, double diameter, double sunDistance, int age) {
        super(id, name, mass, density, diameter);
        this.sunDistance=sunDistance;
        this.age = age;
    }

    /**
     * Empty constructor class Star
     */
    public Star() {
    }

    /**
     * Gets the current Star's distance to the sun
     * @return returns the Star's sun distance type double
     */
    public double getSunDistance() {
        return sunDistance;
    }

    /**
     * Gets the current star's age
     * @return returns the star's age type int
     */
    public int getAge() {
        return age;
    }

    /**
     * Overrides the abstract parent method to show the star's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Star: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                "Kgs \n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tSun Distance: "+ getSunDistance()+" kms\n\tAge: "+getAge()+" years");
        System.out.print("-----------------------------------------\n\n");
    }
}

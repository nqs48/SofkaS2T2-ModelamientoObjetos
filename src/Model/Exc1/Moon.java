package Model.Exc1;

/**
 * @author Nestor Quiroga
 * Class Moon to extends abstract class AbsCelestialBody
 */
public class Moon extends AbsCelestialBody {
    /**
     * Moon's distance to the sun
     */
    private double sunDistance;

    /**
     * Moon's color
     */
    private String color;

    /**
     * Moon's composition
     */
    private String composition;

    /**
     * Constructor class Moon
     * @param id value to Moon's id
     * @param name value to Moon's name
     * @param mass value to Moon's mass
     * @param density value to Moon's density
     * @param diameter value to Moon's diameter
     * @param sunDistance value Moon's distance to the sun
     * @param color value Moon's color
     * @param composition value Moon's composition
     */
    public Moon(int id, String name, double mass, double density, double diameter, double sunDistance, String color, String composition) {
        super(id, name, mass, density, diameter);
        this.sunDistance= sunDistance;
        this.color = color;
        this.composition = composition;
    }

    /**
     * Empty constructor class Moon
     */
    public Moon() {
    }

    /**
     * Gets the current Moon's distance to the sun
     * @return returns the Moon's sun distance type double
     */
    public double getSunDistance() {
        return sunDistance;
    }

    /**
     * Gets the current Moon's color
     * @return returns the Moon's color type string
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the current Moon's composition
     * @return returns the Moon's Composition type string
     */
    public String getComposition() {
        return composition;
    }

    /**
     * Override the abstract parent method to show the moon's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Moon: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" Kms\n\tSun Distance: "+ getSunDistance()+" Kms\n\tColor: "+getColor() +
                "\n\tComposition: " + getComposition());
        System.out.print("-----------------------------------------\n\n");
    }
}

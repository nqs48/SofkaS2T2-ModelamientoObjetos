package Model.Exc1;

/**
 * @author Nestor Quiroga
 * Class Planet to extends abstract class AbsCelestialBody
 */
public class Planet extends AbsCelestialBody {
    /**
     * Planet's distance to the sun
     */
    private double sunDistance;

    /**
     * is there life on the planet
     */
    private boolean existingLife;

    /**
     * is there water on the planet
     */
    private boolean thereIsWater;

    /**
     * Constructor class Planet
     * @param id value to Planet's id
     * @param name value to Planet's name
     * @param mass value to Planet's mass
     * @param density value to Planet's density
     * @param diameter value to Planet's diameter
     * @param sunDistance value Planet's distance to the sun
     * @param existingLife value is there life on the planet
     * @param thereIsWater value is there water on the planet
     */
    public Planet(int id, String name, double mass, double density, double diameter,double sunDistance, boolean existingLife, boolean thereIsWater) {
        super(id, name, mass, density, diameter);
        this.sunDistance= sunDistance;
        this.existingLife = existingLife;
        this.thereIsWater= thereIsWater;
    }

    /**
     * Empty constructor class Planet
     */
    public Planet() {
    }

    /**
     * Gets the current Planet's distance to the sun
     * @return returns the Planet's sun distance type double
     */
    public double getSunDistance() {
        return sunDistance;
    }

    /**
     * Gets the current value for is there life on the planet
     * @return returns is there life on the planet, type boolean
     */
    public boolean isExistingLife() {
        return existingLife;
    }

    /**
     * Gets the current value for is there water on the planet
     * @return returns is there water on the planet, type boolean
     */
    public boolean isThereIsWater() {
        return thereIsWater;
    }

    /**
     * Overrides the abstract parent method to show the planet's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Planet: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tSun Distance: "+ getSunDistance() +
                " kms\n\tExisting Life: "+isExistingLife()+"\n\tThere's Water: "+isThereIsWater());
        System.out.print("-----------------------------------------\n\n");
    }
}

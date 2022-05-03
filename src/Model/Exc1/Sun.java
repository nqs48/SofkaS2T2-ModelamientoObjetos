package Model.Exc1;

/**
 * @author Nestor Quiroga
 * Class Sun to extends abstract class AbsCelestialBody
 */
public class Sun extends AbsCelestialBody {
    /**
     * Sun's color
     */
    private String color;

    /**
     * Sun's temperature
     */
    private double temperature;

    /**
     * Constructor class Sun
     * @param id value to Sun's id
     * @param name value to Sun's name
     * @param mass value to Sun's mass
     * @param density value to Sun's density
     * @param diameter value to Sun's diameter
     * @param color value to Sun's color
     * @param temperature value to Sun's temperature
     */
    public Sun(int id, String name, double mass, double density, double diameter, String color, double temperature) {
        super(id, name, mass, density, diameter);
        this.color = color;
        this.temperature = temperature;
    }

    /**
     * Empty constructor class Sun
     */
    public Sun() {
    }

    /**
     * Gets the current Sun's color
     * @return returns the Sun's color type string
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the current Sun's temperature
     * @return returns the Sun's temperature type double
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Overrides the abstract parent method to show the sun's information formatted
     */
    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Sun: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tColor: "+ getColor()+"\n\tTemperature: "+getTemperature()+" oC");
        System.out.print("-----------------------------------------\n\n");
    }
}

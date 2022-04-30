package Model.Exc1;

import Model.Exc1.AbsCelestialBody;

public class Sun extends AbsCelestialBody {

    private String color;
    private double temperature;

    public Sun(int id, String name, double mass, double density, double diameter, String color, double temperature) {
        super(id, name, mass, density, diameter);
        this.color = color;
        this.temperature = temperature;
    }

    public Sun() {
    }

    public String getColor() {
        return color;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Sun: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tColor: "+ getColor()+"\n\tTemperature: "+getTemperature()+" oC");
        System.out.print("-----------------------------------------\n\n");
    }
}

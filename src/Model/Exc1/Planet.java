package Model.Exc1;


import Model.Exc1.AbsCelestialBody;

public class Planet extends AbsCelestialBody {
    private double sunDistance;
    private boolean existingLife;
    private boolean thereIsWater;

    public Planet(int id, String name, double mass, double density, double diameter,double sunDistance, boolean existingLife, boolean thereIsWater) {
        super(id, name, mass, density, diameter);
        this.sunDistance= sunDistance;
        this.existingLife = existingLife;
        this.thereIsWater= thereIsWater;
    }

    public Planet() {
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public boolean isExistingLife() {
        return existingLife;
    }

    public boolean isThereIsWater() {
        return thereIsWater;
    }

    @Override
    public void showInformation() {
        System.out.println("\n++++++++++++++ Id Planet: " + getId() +" ++++++++++++++" + "\n\tName: " + getName() + "\n\tMass: " + getMass() +
                " kgs\n\tDensity: " + getDensity()+ " g/cm^3\n\tDiameter: " + getDiameter()+" kms\n\tSun Distance: "+ getSunDistance() +
                " kms\n\tExisting Life: "+isExistingLife()+"\n\tThere's Water: "+isThereIsWater());
        System.out.print("-----------------------------------------\n\n");
    }
}

package Model.Exc1;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class AbsCelestialBody {
    private int id;
    public String name;
    private double mass;
    private double density;
    private double diameter;

    public AbsCelestialBody(int id, String name, double mass, double density, double diameter) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
    }

    public AbsCelestialBody() {
    }

    public int getId() {
        return id;
    }

    public void setId(int size) {
        this.id= size+1;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

    public abstract void showInformation();


    public AbsCelestialBody requestData(String type) {
        System.out.println("\nEnter the "+ type+"s name: ");
        Scanner name = new Scanner(System.in);
        String s1Name = name.nextLine();
        System.out.println("\nEnter the "+ type+"s mass (Kgs)");
        Scanner mass = new Scanner(System.in);
        double s1Mass = mass.nextDouble();
        System.out.println("\nEnter the "+ type+"s density (g/cm^3): ");
        Scanner density = new Scanner(System.in);
        double s1Density = density.nextDouble();
        System.out.println("\nEnter the "+ type+"s diameter (kms): ");
        Scanner diameter = new Scanner(System.in);
        double s1Diameter = diameter.nextDouble();
        int autogenerateId = 0;
        switch (type) {
            case "planet" -> {
                    System.out.println("\nEnter the planet's sun distance (kms): ");
                    Scanner distance = new Scanner(System.in);
                    double s1Distance = distance.nextDouble();
                    System.out.println("\nIs there water in this planet? (true or false)");
                    Scanner water = new Scanner(System.in);
                    boolean s1Water = water.nextBoolean();
                    System.out.println("\nIs there life in this planet? (true or false)");
                    Scanner life = new Scanner(System.in);
                    boolean s1Life = life.nextBoolean();
                    return new Planet(autogenerateId, s1Name, s1Mass, s1Density, s1Diameter, s1Distance, s1Life, s1Water);
            }
            case "sun" -> {
                System.out.println("\nEnter the sun's color: ");
                Scanner color = new Scanner(System.in);
                String s1Color = color.nextLine();
                System.out.println("\nEnter the sun's temperature (oC): ");
                Scanner temperature = new Scanner(System.in);
                double s1Temperature = temperature.nextDouble();
                return new Sun(autogenerateId, s1Name, s1Mass, s1Density, s1Diameter, s1Color, s1Temperature);
            }

            case "star" -> {
                System.out.println("\nEnter the planet's sun distance (kms): ");
                Scanner distance = new Scanner(System.in);
                double s1Distance = distance.nextDouble();
                System.out.println("\nEnter the star's age (years): ");
                Scanner age = new Scanner(System.in);
                int s1Age = age.nextInt();
                return new Star(autogenerateId, s1Name, s1Mass, s1Density, s1Diameter, s1Distance, s1Age);
            }
            case "moon" -> {
                System.out.println("\nEnter the moon's sun distance (kms): ");
                Scanner distance = new Scanner(System.in);
                double s1Distance = distance.nextDouble();
                System.out.println("\nEnter the moon's color: ");
                Scanner color = new Scanner(System.in);
                String s1Color = color.nextLine();
                System.out.println("\nEnter the moon's composition: ");
                Scanner composition = new Scanner(System.in);
                String s1Composition = composition.nextLine();
                return new Moon(autogenerateId, s1Name, s1Mass, s1Density, s1Diameter,s1Distance, s1Color, s1Composition);
            }
            case "asteroid" -> {
                return new Asteroid(autogenerateId, s1Name, s1Mass, s1Density, s1Diameter);
            }
        }
        return null;
    }
}

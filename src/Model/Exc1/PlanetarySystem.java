package Model.Exc1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class PlanetarySystem to contains the solar system's entities
 */
public class PlanetarySystem {
    /**
     * List of all celestial bodies
     */
    ArrayList<AbsCelestialBody> allBodies;

    /**
     * List of all planets
     */
    ArrayList<Planet> planets;

    /**
     * List of all stars
     */
    ArrayList<Star> stars;

    /**
     * List of all asteroids
     */
    ArrayList<Asteroid> asteroids;

    /**
     * List of all suns
     */
    ArrayList<Sun> suns;

    /**
     * List of all moons
     */
    ArrayList<Moon> moons;

    /**
     * Constructor class Planetary system, initialize all lists
     */
    public PlanetarySystem() {
        this.allBodies= new ArrayList<>();
        this.planets= new ArrayList<>();
        this.stars= new ArrayList<>();
        this.asteroids= new ArrayList<>();
        this.suns= new ArrayList<>();
        this.moons= new ArrayList<>();
    }

    /**
     * Gets the current list of all celestial bodies in the planetary system
     * @return returns the list of celestial bodies, type arraylist
     */
    public ArrayList<AbsCelestialBody> getAllBodies() { return allBodies; }

    /**
     * Sets a new celestial body to the all body's list
     * @param body Contains the new celestial body to set, type AbsCelestialBody
     */
    public void setAllBodies(AbsCelestialBody body) { this.allBodies.add(body); }

    /**
     * Gets the current list of all planets in the planetary system
     * @return returns the list of planets, type arraylist
     */
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    /**
     * Sets a new planet to the planet's list
     * @param planet Contains the new planet to set, type Planet
     */
    public void setPlanet(Planet planet) {
        this.planets.add(planet);
    }

    /**
     * Gets the current list of all stars in the planetary system
     * @return returns the list of planets, type arraylist
     */
    public ArrayList<Star> getStars() {
        return stars;
    }

    /**
     * Sets a new star to the star's list
     * @param star Contains the new star to set, type Star
     */
    public void setStar(Star star) {
        this.stars.add(star);
    }

    /**
     * Gets the current list of all asteroids in the planetary system
     * @return returns the list of asteroids, type arraylist
     */
    public ArrayList<Asteroid> getAsteroids() {
        return asteroids;
    }

    /**
     * Sets a new asteroid to the asteroid's list
     * @param asteroid Contains the new asteroid to set, type Asteroid
     */
    public void setAsteroid(Asteroid asteroid) {
        this.asteroids.add(asteroid);
    }

    /**
     * Gets the current list of all suns in the planetary system
     * @return returns the list of suns, type arraylist
     */
    public ArrayList<Sun> getSuns() {
        return suns;
    }

    /**
     * Sets a new sun to the sun's list
     * @param sun Contains the new sun to set, type Sun
     */
    public void setSun(Sun sun) {
        this.suns.add(sun);
    }

    /**
     * Gets the current list of all moons in the planetary system
     * @return returns the list of moons, type arraylist
     */
    public ArrayList<Moon> getMoons() {
        return moons;
    }

    /**
     * Sets a new moon to the moon's list
     * @param moon Contains the new moon to set, type Moon
     */
    public void setMoon(Moon moon) {
        this.moons.add(moon);
    }

    /**
     * Method that initializes the library with preloaded data
     */
    public void preLoadedData(){
        ArrayList<AbsCelestialBody> preloadedAllBodies = new ArrayList<>();
        ArrayList<Planet> preloadedPlanets= new ArrayList<>();
        ArrayList<Star> preloadedStars= new ArrayList<>();
        ArrayList<Asteroid> preloadedAsteroids= new ArrayList<>();
        ArrayList<Sun> preloadedSuns= new ArrayList<>();
        ArrayList<Moon> preloadedMoons= new ArrayList<>();
        preloadedPlanets.add(new Planet(1,"Cybertron",50565,332,22143,21431,false,true));
        preloadedPlanets.add(new Planet(2,"Krypton",6565656,5634,524523,12143,true,true));
        preloadedPlanets.add(new Planet(3,"Abydos",643345,564,32476,2332,true,true));
        preloadedPlanets.add(new Planet(4,"Acheron",55345,3323,87553,45356,false,false));
        preloadedStars.add(new Star(5,"Thidatania",1210381,3323,2212,21431,2929));
        preloadedStars.add(new Star(6,"Xendinda",5676,765,8786,45645,3123));
        preloadedStars.add(new Star(7,"Bao H924",1210,3323,2212,211232,221));
        preloadedAsteroids.add(new Asteroid(8,"Abydos",5463,7676,41231));
        preloadedAsteroids.add(new Asteroid(9,"Arrakis",6564,2525,1432));
        preloadedSuns.add(new Sun(10,"Abydos",54634,767,412311,"Yellow",2000));
        preloadedMoons.add(new Moon(11,"moon",2121,212,2121,1212,"white","cheese"));
        preloadedAllBodies.addAll(preloadedPlanets);
        preloadedAllBodies.addAll(preloadedStars);
        preloadedAllBodies.addAll(preloadedAsteroids);
        preloadedAllBodies.addAll(preloadedSuns);
        preloadedAllBodies.addAll(preloadedMoons);
        allBodies=preloadedAllBodies;
        planets= preloadedPlanets;
        stars= preloadedStars;
        asteroids= preloadedAsteroids;
        suns= preloadedSuns;
        moons=preloadedMoons;
    }

    /**
     * Shows the general celestial body's information formatted
     */
    public void showAllGeneralInfo(){
        for (AbsCelestialBody cb: allBodies) {
            System.out.println("\n++++++++++++++ Id : " + cb.getId() +" ++++++++++++++" + "\n\tName: " + cb.getName() + "\n\tMass: " + cb.getMass() +
                    " Kgs\n\tDensity: " + cb.getDensity()+ " g/cm^3\n\tDiameter: " + cb.getDiameter()+" kms");
            System.out.print("-----------------------------------------\n\n");
        }

    }

    /**
     * Chooses the CelestialBody for ID
     * @return If found a CelestialBody with this ID, return this CelestialBody else returns a value null.
     */
    public AbsCelestialBody chooseCelestialBody(){
        AbsCelestialBody cB;
            if (getAllBodies().size() > 1) {
                System.out.println("\nCurrent Bodies : ");
                showAllGeneralInfo();
                System.out.println("\nEnter Body's ID to select: ");
                Scanner idCB = new Scanner(System.in);
                int idFilter = idCB.nextInt();
                cB = idFilterCB(getAllBodies(), idFilter);
            } else {
                System.out.println("\n\t\nThere's not enough Celestial Bodies, verify your currently DATA!!\n");
                return null;
            }
            return cB;
    }

    /**
     * Method to filter for id
     * @param allBodies List of all celestial bodies, type arrayList
     * @param idCB id celestial body Key for filter, type int
     * @return findCB If found a celestial body with this ID, return this celestial body else returns a value null.
     */
    public AbsCelestialBody idFilterCB(ArrayList<AbsCelestialBody> allBodies, int idCB) {
        AbsCelestialBody findCB;
        for (AbsCelestialBody cb : allBodies) {
            if (cb.getId() == idCB) {
                findCB = cb;
                return findCB;
            }
        }
        return null;
    }

    /**
     * Method to calculate the gravitational force between two bodies
     * @return The gravitational force in newtons, type double
     */
    public double CalculatorGravitationalForce(){
        double G= 6.6474*(Math.pow(10,-11));
        System.out.println("\n>>To calculate the gravitational force, we need some data:");
        System.out.println("\nEnter the mass 1 (kgs): ");
        Scanner m1 = new Scanner(System.in);
        double mass1 = m1.nextInt();
        System.out.println("\nEnter the mass 2 (kgs): ");
        Scanner m2 = new Scanner(System.in);
        double mass2 = m2.nextInt();
        System.out.println("\nEnter the distance (mts) between: 'body 1' and 'body 2'");
        Scanner d1 = new Scanner(System.in);
        double distance = d1.nextInt();
        return G * mass1 * mass2 / Math.pow(distance,2);
    }

    /**
     * Method to calculate the gravitational force between two bodies registered in the planetary system
     * @param CBody1 celestial body one
     * @param CBody2 celestial body two
     * @param distance Distance between the celestial bodies
     * @return The gravitational force between the celestial bodies in newtons, type double
     */
    public double CalculatorGravitationalForce( AbsCelestialBody CBody1, AbsCelestialBody CBody2, double distance){
        double cbMass1= CBody1.getMass();
        double cbMass2= CBody2.getMass();
        double G= 6.6474*(Math.pow(10,-11));
        return G * cbMass1 * cbMass2 / Math.pow(distance,2);
    }

    /**
     * Method to create a celestial body
     * @param celestialBody celestial body empty
     * @param type key for create the celestial body
     * @param separator String to formatted the information
     * @return A celestial body with definite information
     */
    public AbsCelestialBody createCelestialBody(AbsCelestialBody celestialBody, String type, String separator){
        System.out.println("\n\n\t\t\t\t+CREATE " + type.toUpperCase()+ separator);
        celestialBody = celestialBody.requestData(type);
        int autogeneratedID = getAllBodies().size();
        celestialBody.setId(autogeneratedID);
        System.out.println("\n\t>> The "+type+" -" + celestialBody.getId() + "- was created successfully!!\n");
        setAllBodies(celestialBody);
        celestialBody.showInformation();
        return celestialBody;
    }

}

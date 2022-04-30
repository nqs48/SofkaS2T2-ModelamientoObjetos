package Model.Exc1;

import java.util.ArrayList;
import java.util.Scanner;

public class PlanetarySystem {
    ArrayList<AbsCelestialBody> allBodies;
    ArrayList<Planet> planets;
    ArrayList<Star> stars;
    ArrayList<Asteroid> asteroids;
    ArrayList<Sun> suns;
    ArrayList<Moon> moons;

    public PlanetarySystem() {
        this.allBodies= new ArrayList<>();
        this.planets= new ArrayList<>();
        this.stars= new ArrayList<>();
        this.asteroids= new ArrayList<>();
        this.suns= new ArrayList<>();
        this.moons= new ArrayList<>();
    }

    public ArrayList<AbsCelestialBody> getAllBodies() { return allBodies; }

    public void setAllBodies(AbsCelestialBody body) { this.allBodies.add(body); }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanet(Planet planet) {
        this.planets.add(planet);
    }

    public ArrayList<Star> getStars() {
        return stars;
    }

    public void setStar(Star star) {
        this.stars.add(star);
    }

    public ArrayList<Asteroid> getAsteroids() {
        return asteroids;
    }

    public void setAsteroid(Asteroid asteroid) {
        this.asteroids.add(asteroid);
    }

    public ArrayList<Sun> getSuns() {
        return suns;
    }

    public void setSun(Sun sun) {
        this.suns.add(sun);
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public void setMoon(Moon moon) {
        this.moons.add(moon);
    }

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

    public void showAllGeneralInfo(){
        for (AbsCelestialBody cb: allBodies) {
            System.out.println("\n++++++++++++++ Id : " + cb.getId() +" ++++++++++++++" + "\n\tName: " + cb.getName() + "\n\tMass: " + cb.getMass() +
                    " Kgs\n\tDensity: " + cb.getDensity()+ " g/cm^3\n\tDiameter: " + cb.getDiameter()+" kms");
            System.out.print("-----------------------------------------\n\n");
        }

    }

    /**
     * Choose the song for the ID
     * @return If found a song with this ID, return this song else returns a value null.
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

    public double CalculatorGravitationalForce(AbsCelestialBody CBody1, AbsCelestialBody CBody2, double distance){

        double cbMass1= CBody1.getMass();
        double cbMass2= CBody2.getMass();
        double G= 6.6474*(Math.pow(10,-11));
        return G * cbMass1 * cbMass2 / Math.pow(distance,2);
    }

}

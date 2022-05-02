package View;

import Model.Exc1.*;
import Model.Exc2.MenuExc2;
import Model.Exc3.MenuExc3;
import Model.Exc4.*;
import Model.Exc5.*;
import Model.MainMenu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String separator = "\n==================================================";
        PlanetarySystem solarSystem = new PlanetarySystem();
        ControlSystem controlSystem = new ControlSystem();
        ControlSystemBt controlSystemBt = new ControlSystemBt();
        FerryBt ferryBt = new FerryBt();
        Ferry ferry = new Ferry();


        MainMenu menu = new MainMenu();
        MenuExc1 menuExc1 = new MenuExc1();
        MenuExc2 menuExc2 = new MenuExc2();
        MenuExc3 menuExc3 = new MenuExc3();
        MenuExc4 menuExc4 = new MenuExc4();
        MenuExc5 menuExc5 = new MenuExc5();

        int userPreload, userMain, userMainE1, userCreate, userView, userMainE2, userMainE3, userMainE4, userMainE5;
        int autogeneratedID;
        do {
            userPreload = menu.printPreloadMenu(separator);
            switch (userPreload) {
                case 1 -> {
                    System.out.println("\n\t>> Library init with Preloaded data:");
                    solarSystem.preLoadedData();
                    controlSystemBt.preLoadedData(ferryBt);


                }
                case 2 -> System.out.println("\n>> Library init empty");
                default -> System.out.println("\n>> Invalid Selection, try again");
            }
        } while (userPreload != 1 && userPreload != 2);
        do {
            userMain = menu.printMainMenu(separator);
            switch (userMain) {
                case 1 -> {
                    do {
                        userMainE1 = menuExc1.printMainMenuEX1(separator);
                        switch (userMainE1) {
                            case 1 -> {
                                do {
                                    userCreate = menuExc1.createCelestialBody(separator);
                                    switch (userCreate) {
                                        case 1 -> {
                                            Planet planet = new Planet();
                                            System.out.println("\n\n\t\t\t\t+CREATE PLANET" + separator);
                                            try {
                                                planet = (Planet) planet.requestData("planet");
                                                autogeneratedID = solarSystem.getAllBodies().size();
                                                planet.setId(autogeneratedID);
                                                System.out.println("\n\t>> The Planet -" + planet.getName() + "- was created successfully!!\n");
                                                solarSystem.setAllBodies(planet);
                                                solarSystem.setPlanet(planet);
                                                planet.showInformation();
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                        case 2 -> {
                                            Star star = new Star();
                                            System.out.println("\n\n\t\t\t\t+CREATE STAR" + separator);
                                            try {
                                                star = (Star) star.requestData("star");
                                                autogeneratedID = solarSystem.getAllBodies().size();
                                                star.setId(autogeneratedID);
                                                System.out.println("\n\t>> The Star -" + star.getName() + "- was created successfully!!\n");
                                                solarSystem.setAllBodies(star);
                                                solarSystem.setStar(star);
                                                star.showInformation();
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                        case 3 -> {
                                            Asteroid asteroid = new Asteroid();
                                            System.out.println("\n\n\t\t\t\t+CREATE ASTEROID" + separator);
                                            try {
                                                asteroid = (Asteroid) asteroid.requestData("asteroid");
                                                autogeneratedID = solarSystem.getAllBodies().size();
                                                asteroid.setId(autogeneratedID);
                                                System.out.println("\n\t>> The Asteroid -" + asteroid.getName() + "- was created successfully!!\n");
                                                solarSystem.setAllBodies(asteroid);
                                                solarSystem.setAsteroid(asteroid);
                                                asteroid.showInformation();
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                        case 4 -> {
                                            Sun sun = new Sun();
                                            System.out.println("\n\n\t\t\t\t+CREATE SUN" + separator);
                                            try {
                                                sun = (Sun) sun.requestData("sun");
                                                autogeneratedID = solarSystem.getAllBodies().size();
                                                sun.setId(autogeneratedID);
                                                System.out.println("\n\t>> The Sun -" + sun.getName() + "- was created successfully!!\n");
                                                solarSystem.setAllBodies(sun);
                                                solarSystem.setSun(sun);
                                                sun.showInformation();
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                        case 5 -> {
                                            Moon moon = new Moon();
                                            System.out.println("\n\n\t\t\t\t+CREATE MOON" + separator);
                                            try {
                                                moon = (Moon) moon.requestData("moon");
                                                autogeneratedID = solarSystem.getAllBodies().size();
                                                moon.setId(autogeneratedID);
                                                System.out.println("\n\t>> The Moon -" + moon.getName() + "- was created successfully!!\n");
                                                solarSystem.setAllBodies(moon);
                                                moon.showInformation();
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                    }
                                } while (userCreate != 6);
                            }
                            case 2 -> {
                                if (solarSystem.getAllBodies().size() == 0) {
                                    System.out.println("\n\tThere aren't data!!  \n");
                                } else {
                                    do {
                                        userView = menuExc1.viewCelestialBody(separator);
                                        switch (userView) {
                                            case 1 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL PLANETS: " + solarSystem.getPlanets().size() + separator);
                                                    ArrayList<Planet> planets = solarSystem.getPlanets();
                                                    planets.forEach(Planet::showInformation);
                                            }
                                            case 2 -> {
                                                if (solarSystem.getStars().size() == 0) {
                                                    System.out.println("\n\tThere aren't data, Add a new STAR!!  \n");
                                                } else {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL STARS: " + solarSystem.getStars().size() + separator);
                                                    ArrayList<Star> stars = solarSystem.getStars();
                                                    stars.forEach(Star::showInformation);
                                                }
                                            }
                                            case 3 -> {
                                                if (solarSystem.getAsteroids().size() == 0) {
                                                    System.out.println("\n\tThere aren't data, Add a new ASTEROID!!  \n");
                                                } else {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL ASTEROIDS: " + solarSystem.getAsteroids().size() + separator);
                                                    ArrayList<Asteroid> asteroids = solarSystem.getAsteroids();
                                                    asteroids.forEach(Asteroid::showInformation);
                                                }
                                            }
                                            case 4 -> {
                                                if (solarSystem.getSuns().size() == 0) {
                                                    System.out.println("\n\tThere aren't data, Add a new SUN!!  \n");
                                                } else {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL SUNS: " + solarSystem.getSuns().size() + separator);
                                                    ArrayList<Sun> suns = solarSystem.getSuns();
                                                    suns.forEach(Sun::showInformation);
                                                }
                                            }
                                            case 5 -> {
                                                if (solarSystem.getMoons().size() == 0) {
                                                    System.out.println("\n\tThere aren't data, Add a new MOON!!  \n");
                                                } else {
                                                    System.out.println("\n\n\t\t+VIEW ALL MOONS: " + solarSystem.getMoons().size() + separator);
                                                    ArrayList<Moon> moons = solarSystem.getMoons();
                                                    moons.forEach(Moon::showInformation);
                                                }
                                            }
                                            case 6 -> {
                                                if (solarSystem.getAllBodies().size() == 0) {
                                                    System.out.println("\n\tThere aren't data!!  \n");
                                                } else {
                                                    System.out.println("\n\n\t\t+VIEW ALL CELESTIAL BODIES " + solarSystem.getAllBodies().size() + separator);
                                                    solarSystem.showAllGeneralInfo();
                                                }
                                            }
                                        }
                                    } while (userView != 7);
                                }
                            }
                            case 3 -> {
                                System.out.println("\n\n+GRAVITATIONAL FORCE BETWEEN BODIES OMEGA 557" + separator);
                                AbsCelestialBody calculateCB1 = solarSystem.chooseCelestialBody();
                                if (calculateCB1 != null) {
                                    System.out.println("\n>> Gravitational Force: " + calculateCB1.getName() + "  Between  => ");
                                    AbsCelestialBody calculateCB2 = solarSystem.chooseCelestialBody();
                                    if (calculateCB2 != null) {
                                        System.out.println("\nEnter the distance (mts) between: " + calculateCB1.getName() + " and " + calculateCB2.getName());
                                        Scanner dBetween = new Scanner(System.in);
                                        double distanceBetween = dBetween.nextInt();
                                        double forceGrav = solarSystem.CalculatorGravitationalForce(calculateCB1, calculateCB2, distanceBetween);
                                        System.out.println("\n>> Gravitational Force:\n\n" + calculateCB1.getName() + "  Between  => " + calculateCB2.getName() +
                                                "= " + forceGrav + " N");
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.println("\n\n\t\t+CALCULATOR GRAVITATIONAL FORCE" + separator);
                                try {
                                    double forceGrav = solarSystem.CalculatorGravitationalForce();
                                    System.out.println("\n>> Gravitational Force:\n\n body 1    Between  =>    body 2\n\n GF= " + forceGrav + " N");

                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect input data, try again.\n\nError: \n" + e);
                                }
                            }
                        }
                    } while (userMainE1 != 5);
                }
                case 2 -> {
                    do {
                        System.out.println("\n<< Yes, is possible to have the concurrent main classes. >>");
                        userMainE2 = menuExc2.printMainMenuEX2(separator);
                        switch (userMainE2) {
                            case 1 -> {
                                System.out.println("\n\n\t\t\t\t+RUN/DEBUG CONFIGURATION" + separator);
                                try {
                                    System.out.println("\n" +
                                            "When you have more than one class with a main method, you can edit configurations in the window Run/Debug Configuration " +
                                            "on your environment indicating which of these two classes is going to be the entry point.\n\n" +
                                            "For more details, visit the README.MD file that you will find in the Exc2 package.");
                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                            case 2 -> {

                                System.out.println("\n\n\t\t\t\t+CREATE ARTIFACT .JAR" + separator);
                                try {
                                    System.out.println("\nYou can do this by creating a new artifact, selecting the desired main class as the project entry point. After this, a MANIFEST" +
                                            " folder will be created,\n the project artifacts are built, generating a new folder inside the OUT folder with the built" +
                                            " artifacts and a .JAR file, which can be executed from the terminal.\n\n" +
                                            "For more details, visit the README.MD file that you will find in the Exc2 package.");

                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                        }
                    } while (userMainE2 != 3);
                }
                case 3 -> {
                    do {
                        userMainE3 = menuExc3.printMainMenuEX3(separator);
                        switch (userMainE3) {
                            case 1 -> {
                                System.out.println("\n\n\t\t\t\t+BUBBLE SORT" + separator);
                                try {

                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                            case 2 -> {

                                System.out.println("\n\n\t\t\t\t+QUICK SORT" + separator);
                                try {

                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                        }
                    } while (userMainE3 != 3);
                }
                case 4 -> {
                    do {
                        userMainE4 = menuExc4.printMainMenuEX4(separator);
                        switch (userMainE4) {
                            case 1 -> {
                                System.out.println("\n\n\t\t\t\tSTART FERRY" + separator);
                                try {
                                    if (controlSystem.getFerries().size() >= 1) {
                                        System.out.println("\n\t>> There is already a Ferry In!!\n");
                                    } else {
                                        ferry.requestData();
                                        controlSystem.setFerry(ferry);
                                        System.out.println("\n>> The Ferry -" + ferry.getName() + "- started successfully!!\n");
                                        ferry.showInformation();
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                            case 2 -> {
                                System.out.println("\n\n\t\t\t\t+REGISTER VEHICLES" + separator);
                                try {
                                    if (controlSystem.getFerries().size() == 0) {
                                        System.out.println("\n>> There is not Ferry in, Add a new Ferry!!\n");
                                    } else if (ferry.getVehicles().size() >= ferry.getCapacity()) {
                                        System.out.println("\n\t>> The Ferry's capacity is full!!\n");
                                    } else {
                                        int currentCapacity = ferry.getCapacity() - ferry.getVehicles().size();
                                        for (int i = 0; i < currentCapacity; i++) {
                                            Vehicle vehicle = ferry.collectVehicleData();
                                            System.out.println("\n>> The Vehicle -" + vehicle.getId() + "- started successfully!!\n");
                                            vehicle.showInformation();
                                            ferry.setVehicle(vehicle);
                                        }
                                        System.out.println("\n\t>> The Ferry -" + ferry.getName() + "- is complete!!\n");
                                        ferry.showInformation();
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                            case 3 -> {
                                System.out.println("\n\n\t\t\t\t+VERIFY CAPACITY" + separator);
                                if (controlSystem.getFerries().size() == 0) {
                                    System.out.println("\n>> There is not Ferry in, Add a new Ferry!!\n");
                                } else {
                                    System.out.println("\n\n+The ferry's capacity is : " + ferry.getCapacity() + "/" + ferry.getVehicles().size()+ " vehicles");
                                }
                            }
                            case 4 -> {
                                System.out.println("\n\n\t\t\t\t+VIEW REGISTERED VEHICLES" + separator);
                                if (controlSystem.getFerries().size() == 0) {
                                    System.out.println("\n>> There is not Ferry in, Add a new Ferry!!\n");
                                } else if (ferry.getVehicles().size() == 0) {
                                    System.out.println("\n\tThere aren't vehicles!!  \n");
                                } else {
                                    System.out.println(">> Size: " + ferry.getVehicles().size() + separator);
                                    ferry.getVehicles().forEach(Vehicle::showInformation);
                                }
                            }
                        }
                    } while (userMainE4 != 5);
                }
                case 5 -> {
                    do {
                        userMainE5 = menuExc5.printMainMenuEX5(separator);
                        switch (userMainE5) {
                            case 1 -> {
                                System.out.println("\n\n\t\t\t\tSTART FERRY" + separator);
                                try {
                                    if (controlSystemBt.getFerries().size() >= 1) {
                                        System.out.println("\n\t>> There is already a Ferry In!!\n");
                                    } else {
                                        ferryBt.requestData();
                                        controlSystemBt.setFerry(ferryBt);
                                        System.out.println("\n>> The Ferry -" + ferryBt.getName() + "- started successfully!!\n");
                                        ferryBt.showInformation();
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                }
                            }
                            case 2 -> {
                                if (controlSystemBt.getFerries().size() == 0) {
                                    System.out.println("\n>> There is not Ferry in, Add a new Ferry!!\n");
                                } else if (ferryBt.getAllVehicles().size() >= ferryBt.getCapacity()) {
                                    System.out.println("\n\t>> The Ferry's capacity is full!!\n");
                                } else {
                                    do {
                                        if (ferryBt.getAllVehicles().size() >= ferryBt.getCapacity()) {
                                            System.out.println("\n\t>> The Ferry's capacity is full!!\n");
                                            userCreate = 6;
                                        } else {
                                            userCreate = menuExc5.createVehicle(separator);
                                            try {
                                                switch (userCreate) {
                                                    case 1 -> {
                                                        Bicycle b = new Bicycle();
                                                        b= (Bicycle) ferryBt.createVehicle(b, "bicycle", separator);
                                                        ferryBt.setBicycle(b);
                                                    }
                                                    case 2 -> {
                                                        Boat b = new Boat();
                                                        b= (Boat) ferryBt.createVehicle(b, "boat", separator);
                                                        ferryBt.setBoat(b);
                                                    }
                                                    case 3 -> {
                                                        Car c = new Car();
                                                        c =(Car) ferryBt.createVehicle(c, "car", separator);
                                                        ferryBt.setCar(c);
                                                    }
                                                    case 4 -> {
                                                        Motorcycle m = new Motorcycle();
                                                        m=(Motorcycle) ferryBt.createVehicle(m, "motorcycle", separator);
                                                        ferryBt.setMotorcycle(m);
                                                    }
                                                    case 5 -> {
                                                        Truck t = new Truck();
                                                        t= (Truck) ferryBt.createVehicle(t, "truck", separator);
                                                        ferryBt.setTruck(t);
                                                    }
                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
                                            }
                                        }
                                    } while (userCreate != 6);
                                }
                            }
                            case 3 -> {
                                System.out.println("\n\n\t\t\t\t+VERIFY CAPACITY" + separator);
                                if (controlSystemBt.getFerries().size() == 0) {
                                    System.out.println("\n>> There is not Ferry in, Add a new Ferry!!\n");
                                } else {
                                    System.out.println("\n\n+The ferry's capacity is : " + ferryBt.getCapacity() + "/" +  ferryBt.getAllVehicles().size() + " vehicles\n\n");
                                }
                            }
                            case 4 -> {
                                if (ferryBt.getAllVehicles().size() == 0) {
                                    System.out.println("\n\tThere aren't data, Add new vehicles!!  \n");
                                } else {
                                    do {
                                        userView = menuExc5.viewVehicles(separator);
                                        switch (userView) {
                                            case 1 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL BICYCLES: " + ferryBt.getBicycles().size() + separator);
                                                    ArrayList<Bicycle> bicycles = ferryBt.getBicycles();
                                                    bicycles.forEach(Bicycle::showInformation);
                                            }
                                            case 2 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL BOATS: " + ferryBt.getBoats().size() + separator);
                                                    ArrayList<Boat> boats = ferryBt.getBoats();
                                                    boats.forEach(Boat::showInformation);
                                            }
                                            case 3 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL CARS: " + ferryBt.getCars().size() + separator);
                                                    ArrayList<Car> cars = ferryBt.getCars();
                                                    cars.forEach(Car::showInformation);
                                            }
                                            case 4 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL MOTORCYCLES: " + ferryBt.getMotorcycles().size() + separator);
                                                    ArrayList<Motorcycle> motorcycles = ferryBt.getMotorcycles();
                                                    motorcycles.forEach(Motorcycle::showInformation);
                                            }
                                            case 5 -> {
                                                    System.out.println("\n\n\t\t\t\t+VIEW ALL TRUCKS: " + ferryBt.getTrucks().size() + separator);
                                                    ArrayList<Truck> trucks = ferryBt.getTrucks();
                                                    trucks.forEach(Truck::showInformation);
                                            }
                                            case 6 -> {
                                                    System.out.println("\n\n\t\t+VIEW ALL REGISTERED VEHICLES " + ferryBt.getAllVehicles().size() + separator);
                                                    ferryBt.showAllGeneralInfo();
                                            }
                                        }
                                    } while (userView != 7);
                                }
                            }
                        }
                    } while (userMainE5 != 5);
                }
                case 6 -> {
                    System.out.println("Exercise 6 ");
                }
            }
        } while (userMain != 7);


        System.out.println("\nThe program is over");
        System.out.println("\nCreated By:\t< Nestor Quiroga />");




    }



}




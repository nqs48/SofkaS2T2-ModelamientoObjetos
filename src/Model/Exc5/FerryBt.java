package Model.Exc5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class FerryBt to contains the vehicles's list with diferent entities
 */
public class FerryBt {
    /**
     * Ferry's id
     */
    private int id;

    /**
     * Ferry's name
     */
    private String name;

    /**
     * Ferry's capacity
     */
    private int capacity;

    /**
     * Ferry's route
     */
    private String route;

    /**
     * List of all Vehicles
     */
    private ArrayList<AbsVehicle> allVehicles;

    /**
     * List of all trucks
     */
    private ArrayList<Truck> trucks;

    /**
     * List of all bicycles
     */
    private ArrayList<Bicycle> bicycles;

    /**
     * List of all cars
     */
    private ArrayList<Car> cars;

    /**
     * List of all boats
     */
    private ArrayList<Boat> boats;

    /**
     * List of all motorcycles
     */
    private ArrayList<Motorcycle> motorcycles;

    /**
     * Constructor class FerryBt, initialize all lists
     */
    public FerryBt() {
        this.id=1;
        this.allVehicles = new ArrayList<>();
        this.trucks = new ArrayList<>();
        this.bicycles = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.boats = new ArrayList<>();
        this.motorcycles = new ArrayList<>();
    }

    /**
     * Sets a new ferry's name
     * @param name Contains the new name to set, type string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the current ferry's name
     * @return returns the ferry's name type string
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new ferry's id
     * @param id Contains the new id to set, type int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets a new ferry's capacity
     * @param capacity Contains the new capacity to set, type int
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the current ferry's capacity
     * @return returns the ferry's capacity type int
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * Sets a new ferry's route
     * @param route Contains the new route to set, type string
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * Gets the current list of all vehicles in the ferry
     * @return returns the list of vehicles, type arraylist
     */
    public ArrayList<AbsVehicle> getAllVehicles() { return allVehicles; }

    /**
     * Sets a new vehicle to the vehicles list
     * @param vehicle Contains the new vehicle to set, type Vehicle
     */
    public void setVehicle(AbsVehicle vehicle) { this.allVehicles.add(vehicle); }

    /**
     * Sets a new vehicles list to the attribute vehicles
     * @param vehicles Contains the new vehicles list to set, type arraylist
     */
    public void setAllVehicles(ArrayList<AbsVehicle> vehicles) { this.allVehicles=vehicles; }

    /**
     * Gets the current list of all Trucks in the ferry
     * @return returns the list of Trucks, type arraylist
     */
    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    /**
     * Sets a new truck to the truck's list
     * @param truck Contains the new truck to set, type Truck
     */
    public void setTruck(Truck truck) {
        this.trucks.add(truck);
    }

    /**
     * Sets a new trucks list to the attribute trucks
     * @param trucks Contains the new trucks list to set, type arraylist
     */
    public void setAllTrucks(ArrayList<Truck> trucks) { this.trucks=trucks; }

    /**
     * Gets the current list of all bicycles in the ferry
     * @return returns the list of bicycles, type arraylist
     */
    public ArrayList<Bicycle> getBicycles() {
        return bicycles;
    }

    /**
     * Sets a new bicycle to the bicycle's list
     * @param bicycle Contains the new bicycle to set, type Bicycle
     */
    public void setBicycle(Bicycle bicycle) {
        this.bicycles.add(bicycle);
    }

    /**
     * Sets a new bicycles list to the attribute bicycles
     * @param bicycles Contains the new bicycles list to set, type arraylist
     */
    public void setAllBicycles(ArrayList<Bicycle> bicycles) { this.bicycles=bicycles; }

    /**
     * Gets the current list of all cars in the ferry
     * @return returns the list of cars, type arraylist
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * Sets a new car to the car's list
     * @param car Contains the new car to set, type Car
     */
    public void setCar(Car car) {
        this.cars.add(car);
    }

    /**
     * Sets a new cars list to the attribute cars
     * @param cars Contains the new cars list to set, type arraylist
     */
    public void setAllCars(ArrayList<Car> cars) { this.cars=cars; }

    /**
     * Gets the current list of all boats in the ferry
     * @return returns the list of boats, type arraylist
     */
    public ArrayList<Boat> getBoats() {
        return boats;
    }

    /**
     * Sets a new boat to the boat's list
     * @param boat Contains the new boat to set, type Boat
     */
    public void setBoat(Boat boat) {
        this.boats.add(boat);
    }

    /**
     * Sets a new boats list to the attribute boats
     * @param boats Contains the new boats list to set, type arraylist
     */
    public void setAllBoats(ArrayList<Boat> boats) { this.boats=boats; }

    /**
     * Gets the current list of all motorcycles in the ferry
     * @return returns the list of motorcycles, type arraylist
     */
    public ArrayList<Motorcycle> getMotorcycles() { return motorcycles; }

    /**
     * Sets a new motorcycle to the motorcycle's list
     * @param motorcycle Contains the new motorcycle to set, type Motorcycle
     */
    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycles.add(motorcycle);
    }

    /**
     * Sets a new motorcycles list to the attribute motorcycles
     * @param motorcycles Contains the new motorcycles list to set, type arraylist
     */
    public void setAllMotorcycles(ArrayList<Motorcycle> motorcycles) { this.motorcycles=motorcycles; }

    /**
     * Collect data to create a new ferryBt
     */
    public void requestData() {
        System.out.println("\nEnter the Ferry's name: ");
        Scanner name = new Scanner(System.in);
        String s1Name = name.nextLine();
        System.out.println("\nEnter the Ferry's capacity");
        Scanner size = new Scanner(System.in);
        int s1Size = size.nextInt();
        System.out.println("\nEnter the Ferry's route (country -> country ): ");
        Scanner route = new Scanner(System.in);
        String s1Route = route.nextLine();
        setName(s1Name);
        setCapacity(s1Size);
        setRoute(s1Route);
    }

    /**
     * Show the ferry's information formatted
     */
    public void showInformation() {
        System.out.println("\n++++++++++++++ Ferry: " + this.id +" ++++++++++++++" + "\n\tName: " + this.name + "\n\tCapacity: " + capacity +
                " Vehicles\n\tRoute: " + route);
        if(allVehicles.size() > 0){
            System.out.println("\tVehicles: ");
            for (AbsVehicle j: getAllVehicles()) {
                System.out.println("\n\tId Vehicle: " + j.getId() + "\n\t\tType: " + j.getType() +
                        "\n\t\tRegistration Date: " + j.getRegistrationDate().getTime() +
                        "\n\t\tMedium Move: " + j.getMediumMove());
            }
        }else{
            System.out.println("\tVehicles: none");
        }
        System.out.print("-----------------------------------------\n\n");
    }

    /**
     * Shows the general Vehicle's information formatted
     */
    public void showAllGeneralInfo(){
        for (AbsVehicle cb: allVehicles) {
            System.out.println("\n++++++++++++++ Id : " + cb.getId() +" ++++++++++++++" + "\n\tType: " + cb.getType() + "\n\tNumber Passengers: " + cb.getNumberPass() +
                    "\n\tcrew: " + cb.isCrew()+ "\n\tNumber Wheels: " + cb.getNumberWheels() + "\n\tMedium Move: " + cb.getMediumMove()+
                    "\n\tRegistration Date: " + cb.getRegistrationDate().getTime()+"\n");
            System.out.print("-----------------------------------------\n\n");
        }

    }

    /**
     * Method to create a vehicle
     * @param vehicle Vehicle empty
     * @param type key for create the Vehicle type
     * @param separator String to formatted the information
     * @return A Vehicle with definite information
     */
    public AbsVehicle createVehicle(AbsVehicle vehicle, String type, String separator){
        System.out.println("\n\n\t\t\t\t+CREATE " + type.toUpperCase()+ separator);
        vehicle = vehicle.requestData(type);
        int autogeneratedID = getAllVehicles().size();
        vehicle.setId(autogeneratedID);
        System.out.println("\n\t>> The "+type+" -" + vehicle.getId() + "- was created successfully!!\n");
        setVehicle(vehicle);
        vehicle.showInformation();
        return vehicle;
    }

}

package Model.Exc5;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Class ControlSystemBt to contains the ferry's list
 */
public class ControlSystemBt {
    /**
     * List of all ferries
     */
    private ArrayList<FerryBt> ferries;

    /**
     *Constructor class ControlSystemBt, initialize the ferries list
     */
    public ControlSystemBt() {
        this.ferries= new ArrayList<>();
    }

    /**
     * Sets a new ferry to the ferry's list
     * @param ferry Contains the new ferry to set, type FerryBt
     */
    public void setFerry(FerryBt ferry) {
        this.ferries.add(ferry);
    }

    /**
     * Gets the current list of all ferries in the ControlSystemBt
     * @return returns the list of ferries, type arraylist
     */
    public ArrayList<FerryBt> getFerries() {
        return ferries;
    }

    /**
     * Method that initializes the library with preloaded data
     * @param ferryBt Instance of FerryBt to be able to access the methods and attributes
     */
    public void preLoadedData(FerryBt ferryBt){
        ferryBt.setName("Titanic");
        ferryBt.setCapacity(12);
        ferryBt.setRoute("Cartagena -> Alaska");
        ferries.add(ferryBt);
        ArrayList<AbsVehicle> preloadedAllVehicles = new ArrayList<>();
        ArrayList<Truck> preloadedTrucks = new ArrayList<>();
        ArrayList<Bicycle> preloadedBicycles = new ArrayList<>();
        ArrayList<Car> preloadedCars = new ArrayList<>();
        ArrayList<Boat> preloadedBoats = new ArrayList<>();
        ArrayList<Motorcycle> preloadedMotorcycles = new ArrayList<>();
        preloadedTrucks.add(new Truck(1,"Truck",3,true,8,"land",3,2000));
        preloadedTrucks.add(new Truck(2,"Truck",3,true,10,"land",3.5,4000));
        preloadedBicycles.add(new Bicycle(3,"Bicycle",1,true,2,"land","Disc",15));
        preloadedBicycles.add(new Bicycle(4,"Bicycle",2,true,2,"land","Disc",10));
        preloadedCars.add(new Car(5,"Car",4,false,4,"land",5,true));
        preloadedCars.add(new Car(6,"Car",6,true,4,"land",4,false));
        preloadedBoats.add(new Boat(7,"Boat",6,false,0,"water","Wood",true));
        preloadedBoats.add(new Boat(8,"Boat",10,true,0,"water","Steel",false));
        preloadedMotorcycles.add(new Motorcycle(9,"Motorcycle",2,false,2,"land",150,"Off Road"));
        preloadedMotorcycles.add(new Motorcycle(10,"Motorcycle",2,false,4,"land",650,"Off Road"));
        preloadedAllVehicles.addAll(preloadedTrucks);
        preloadedAllVehicles.addAll(preloadedBicycles);
        preloadedAllVehicles.addAll(preloadedCars);
        preloadedAllVehicles.addAll(preloadedBoats);
        preloadedAllVehicles.addAll(preloadedMotorcycles);
        ferryBt.setAllVehicles(preloadedAllVehicles);
        ferryBt.setAllTrucks(preloadedTrucks);
        ferryBt.setAllBoats(preloadedBoats);
        ferryBt.setAllCars(preloadedCars);
        ferryBt.setAllMotorcycles(preloadedMotorcycles);
        ferryBt.setAllBicycles(preloadedBicycles);
    }

}

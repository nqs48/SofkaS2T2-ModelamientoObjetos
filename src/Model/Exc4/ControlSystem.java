package Model.Exc4;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Class ControSystem to contains the ferry's list
 */
public class ControlSystem {
    /**
     * List of all celestial ferries
     */
    private ArrayList<Ferry> ferries;

    /**
     * Constructor class ControlSystem, initialize the list
     */
    public ControlSystem() {
        this.ferries= new ArrayList<>();
    }

    /**
     * Set a new ferry to the ferries list
     * @param ferry Contains the new ferry to set, type Ferry
     */
    public void setFerry(Ferry ferry) {
        this.ferries.add(ferry);
    }

    /**
     * Get the current list of all ferries in the control system
     * @return returns the list of ferries, type arraylist
     */
    public ArrayList<Ferry> getFerries() {
        return ferries;
    }
}

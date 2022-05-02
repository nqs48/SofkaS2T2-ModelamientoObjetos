package Model.Exc4;

import java.util.ArrayList;

public class ControlSystem {
    private ArrayList<Ferry> ferries;

    public ControlSystem() {
        this.ferries= new ArrayList<>();
    }

    public void setFerry(Ferry ferry) {
        this.ferries.add(ferry);
    }

    public ArrayList<Ferry> getFerries() {
        return ferries;
    }
}

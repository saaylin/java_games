package at.aylin.games.test1;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void printVehicles(){
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.getID() + ":" +vehicle.getName());
        }
    }
}

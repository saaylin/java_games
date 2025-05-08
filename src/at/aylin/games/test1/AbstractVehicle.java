package at.aylin.games.test1;

public abstract class AbstractVehicle implements Vehicle {
    private String name;
    private int ID;

    public AbstractVehicle(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }
}

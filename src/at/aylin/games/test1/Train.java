package at.aylin.games.test1;

public class Train extends AbstractVehicle{


    public Train(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void drive() {
        System.out.println("Train is driving");
    }
}

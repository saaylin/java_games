package at.aylin.games.test2;


import at.aylin.games.test2.Phone;
import at.aylin.games.test2.Shoe;
import at.aylin.games.test2.Gui2;
import at.aylin.games.test2.Gui1;
import at.aylin.games.test2.Car;


public class Main {
    // dry - do not repeat yourself
    // open close

    public static void main(String[] args) {
        Gui gui = new Gui2();
        gui.addProduct(new Shoe(null,1,"test"));
        gui.addProduct(new Shoe(null,2,"test2"));
        gui.addProduct(new Phone(1,"superphone"));
        gui.addProduct(new Car());
        gui.start();
    }
}


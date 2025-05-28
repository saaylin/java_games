package at.aylin.games.PraxisTest;

import java.util.Scanner;

public class GUI1 implements GUI {
    private LibraryManager manager;

    public GUI1(LibraryManager manager) {
        this.manager = manager;
    }

    @Override
    public void start() {
        System.out.println("GUI1 gestartet");
    }
}

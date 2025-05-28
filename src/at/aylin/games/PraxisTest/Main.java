package at.aylin.games.PraxisTest;

    public class Main {
        public static void main(String[] args) {
            LibraryManager manager = new LibraryManager();

            GUI gui1 = new GUI1(manager);
            gui1.start();

            GUI gui2 = new GUI2(manager);
            gui2.start();
        }
    }

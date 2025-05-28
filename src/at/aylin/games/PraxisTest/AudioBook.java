package at.aylin.games.PraxisTest;

public class AudioBook extends AbstractMedia{
        public AudioBook(int id, String title, double price, String description) {
            super(id, title, price, description);
        }

        public void playSample() {
            System.out.println("Playing" + getTitle());
        }
    }


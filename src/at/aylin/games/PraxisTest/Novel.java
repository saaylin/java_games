package at.aylin.games.PraxisTest;

    public class Novel extends AbstractMedia {
        private String genre;

        public Novel(int id, String title, double price, String description, String genre) {
            super(id, title, price, description);
            this.genre = genre;
        }

        public String getGenre() { return genre; }

        @Override
        public String toString() {
            return super.toString() + genre;
        }
    }



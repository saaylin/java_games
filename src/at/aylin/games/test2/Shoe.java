package at.aylin.games.test2;

public class Shoe implements Product{
    private Color color;
    private int id;
    private String title;

    public Shoe(Color color, int id, String title) {
        this.color = color;
        this.id = id;
        this.title = title;
    }

    @Override
    public int id() {
        return 0;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }

    public Color getColor() {
        return color;
    }
}

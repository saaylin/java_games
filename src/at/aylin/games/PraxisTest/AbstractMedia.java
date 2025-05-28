package at.aylin.games.PraxisTest;

public abstract class AbstractMedia implements Media {
    private int id;
    private String title;
    private double price;
    private String description;

    public AbstractMedia(int id, String title, double price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}


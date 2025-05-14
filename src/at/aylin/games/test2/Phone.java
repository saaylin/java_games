package at.aylin.games.test2;

public class Phone implements Product{
    private int id;
    private String title;

    public Phone(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int id() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }
}

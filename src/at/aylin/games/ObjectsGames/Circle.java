package at.aylin.games.ObjectsGames;
import org.newdawn.slick.Graphics;

public class Circle implements Actor {
    private float x, y;
    private float speed;
    private float diameter;

    public Circle(int x, int y, float diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, diameter, diameter);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        this.diameter += 0.05f;
        if (this.diameter > 80) {
            this.diameter = 10;
        }
    }
}

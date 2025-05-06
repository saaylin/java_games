package at.aylin.games.ObjectsGames;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {
    private float x, y;
    private float speed;
    private float width, height;

    public Ellipse(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, width, height);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        if (this.x > 600) {
            this.x = -100;
        }
    }
}


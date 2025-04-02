package at.aylin.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private float x;
    private float y;
    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed = 50;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x += (float) delta / this.speed;

        // Falls das Rechteck den Bildschirmrand erreicht, zurücksetzen
        if (this.x > 800) {
            this.x = 0;
            this.y = 0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(x, y, 100, 100);
        graphics.drawString("hello you!", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            throw new RuntimeException(e);
        }
    }
}

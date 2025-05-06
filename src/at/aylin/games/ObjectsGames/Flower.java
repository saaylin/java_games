package at.aylin.games.ObjectsGames;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Flower implements Actor {
    private Image flowerImage;
    private float x, y;

    public Flower(Image flowerImage) throws SlickException {
        Image tep = new Image("testdata/flower.png");
        this.flowerImage = tep.getScaledCopy(50, 50);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        flowerImage.draw(x, y);
    }

    @Override
    public void update(int delta) {
        this.x++;
    }
}


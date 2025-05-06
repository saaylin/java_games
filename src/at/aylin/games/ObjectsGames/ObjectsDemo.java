package at.aylin.games.ObjectsGames;

import org.newdawn.slick.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ObjectsDemo extends BasicGame {
    private List<Actor> actors;

    public ObjectsDemo(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            boolean leftToRight = i % 2 == 0;
            Rechteck rectangle = new Rechteck(
                    leftToRight ? 0 : 800,
                    i * 50,
                    4f + random.nextFloat() * 2f,
                    leftToRight
            );
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(0, i * 50, 10f);
            this.actors.add(circle);
        }

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(
                    -100f, i * 50,
                    30f + random.nextFloat() * 20f,
                    15f + random.nextFloat() * 10f
            );
            this.actors.add(ellipse);
        }

        Image flowerImg = new Image("testdata/flower.png");
        Flower flower = new Flower(flowerImg);
        this.actors.add(flower);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsDemo("ObjectsDemo"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

package at.aylin.games;

import org.newdawn.slick.Graphics;

public class Rectangles {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private int x;
    private int y;
    private float speed;

    public Rectangles(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics){

    }

    public void update(int delta){

    }
}

package sunthonputtasast.kitsakon.lab9;

/**
 * Keeper
 */

import java.awt.geom.Rectangle2D;

public class Keeper extends Rectangle2D.Double {

    private static final long serialVersionUID = -5552690471169379550L;
    public final static int KEEPER_WIDTH = 20;
    public final static int KEEPER_HEIGHT = 50;
    public final static int KEEPER_SPEED = 10;

    public Keeper(int x, int y) {
        super(x, y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }

    public void moveUp() {
        if (y - KEEPER_SPEED >= 150) {
            this.y = y - KEEPER_SPEED;
        }
    }

    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350) {
            this.y = y + KEEPER_SPEED;
        }
    }

}
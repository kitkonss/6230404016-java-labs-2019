package sunthonputtasast.kitsakon.lab9;

import java.awt.geom.Ellipse2D;

/**
 * Ball
 */
public class Ball extends Ellipse2D.Double {

    private static final long serialVersionUID = 3219757564658062159L;

    public final static int BALL_DIAMETER = 30;

    private int xVelocity, yVelocity;

    public Ball(int x, int y) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);
        this.xVelocity = 0;
        this.yVelocity = 0;
    }

    public Ball(int x, int y, int xVelocity, int yVelocity) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public int getXVelocity() {
        return this.xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYVelocity() {
        return this.yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void move() {
        this.x += xVelocity;
        this.y += yVelocity;
    }

}
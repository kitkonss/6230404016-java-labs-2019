/**
 * create class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    private static final long serialVersionUID = 5025005958561917656L;

    protected Thread running;

    public CanvasDrawerV3() {
        super();

        running = new Thread(this);

        // random location of the ball.
        int randomX = ThreadLocalRandom.current().nextInt(-4, 4);
        int randomY = ThreadLocalRandom.current().nextInt(-4, 4);

        int xv = randomX;
        int yv = randomY;

        ball.setXVelocity(xv);
        ball.setYVelocity(yv);

        running.start();

    }

    @Override
    public void run() {
        while (true) {
            // check if ball hit the left or hit the right of wall.
            if (ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                // check if ball hit the part where it will bounce.
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * -1);
                    // check if ball can go through the wall.
                } else {
                }
                // check if ball hit the top or hit the bottom.
            } else if (ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int yVelocity = ball.getYVelocity();
                ball.setYVelocity(yVelocity * -1);
            }
            ball.move();

            repaint();

            // Delay
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

}
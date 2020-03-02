/**
 * Create class CanvasDrawerV5 extends CanvasDrawerV4
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV5 extends CanvasDrawerV4 {

    private static final long serialVersionUID = 5025005958561917656L;

    protected Thread running;

    public CanvasDrawerV5() {
        super();

        running = new Thread(this);

        int randomX = ThreadLocalRandom.current().nextInt(-2, 2);
        int randomY = ThreadLocalRandom.current().nextInt(-2, 2);

        int xv = randomX;
        int yv = randomY;

        ball.setXVelocity(xv);
        ball.setYVelocity(yv);

        running.start();

    }

    @Override
    public void run() {
        while (true) {
            if (ball.x <= 0 || ball.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (ball.y + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.y + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * (-1));
                } else {
                    // check if ball go through the goal reset a ball to midPanel and speed of the
                    // ball.
                    if (ball.x + Ball.BALL_DIAMETER < 0 || ball.x > CANVAS_WIDTH) {
                        resetBall();
                    }
                }
            } else if (ball.y <= 0 || ball.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int yVelocity = ball.getYVelocity();
                ball.setYVelocity(yVelocity * (-1));

            } else if (ball.x + Ball.BALL_DIAMETER >= keeperRight.x
                    && ball.y + (Ball.BALL_DIAMETER / 2) >= keeperRight.y
                    && ball.y + (Ball.BALL_DIAMETER / 2) <= keeperRight.y + Keeper.KEEPER_HEIGHT) {
                int xVelocity = ball.getXVelocity();
                ball.setXVelocity(xVelocity * (-1));
            } else if (ball.x <= keeperLeft.x + Keeper.KEEPER_WIDTH && ball.y + (Ball.BALL_DIAMETER / 2) >= keeperLeft.y
                    && ball.y + (Ball.BALL_DIAMETER / 2) <= keeperLeft.y + Keeper.KEEPER_HEIGHT) {
                int xVelocity = ball.getXVelocity();
                ball.setXVelocity(xVelocity * (-1));
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

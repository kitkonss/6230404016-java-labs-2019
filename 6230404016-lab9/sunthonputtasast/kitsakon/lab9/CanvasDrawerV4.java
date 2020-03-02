/**
 * Create class GraphicsMoverV4 extends GraphicsMoverV3 
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV4 extends CanvasDrawerV3 {

    private static final long serialVersionUID = 5025005958561917656L;

    protected Thread running;

    public CanvasDrawerV4() {
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

    // reset ball to midPanel and speed of the ball.
    protected void resetBall() {

        ball.x = CANVAS_WIDTH / 2 - Ball.BALL_DIAMETER / 2;
        ball.y = CANVAS_HEIGHT / 2 - Ball.BALL_DIAMETER / 2;

        ball.setXVelocity(ThreadLocalRandom.current().nextInt(-2, 2));
        ball.setYVelocity(ThreadLocalRandom.current().nextInt(-2, 2));
    }

    @Override
    public void run() {
        while (true) {
            if (ball.x <= 0 || ball.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (ball.y + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.y + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * (-1));
                } else {

                }
            } else if (ball.y <= 0 || ball.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int yVelocity = ball.getYVelocity();
                ball.setYVelocity(yVelocity * (-1));

                // check if the ball reach x of keeperRight.
            } else if (ball.x + Ball.BALL_DIAMETER >= keeperRight.x
                    && ball.y + (Ball.BALL_DIAMETER / 2) >= keeperRight.y
                    && ball.y + (Ball.BALL_DIAMETER / 2) <= keeperRight.y + Keeper.KEEPER_HEIGHT) {
                int xVelocity = ball.getXVelocity();
                ball.setXVelocity(xVelocity * (-1));
                // check if the ball reach x of keeperLeft.
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
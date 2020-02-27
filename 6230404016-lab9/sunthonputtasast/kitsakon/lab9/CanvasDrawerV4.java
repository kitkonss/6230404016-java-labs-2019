package sunthonputtasast.kitsakon.lab9;

import java.util.concurrent.ThreadLocalRandom;

/**
 * CanvasDrawerV3
 */
public class CanvasDrawerV4 extends CanvasDrawerV3 {

    private static final long serialVersionUID = 5025005958561917656L;

    protected Thread running;

    public CanvasDrawerV4() {
        super();

        running = new Thread(this);

        int randomX = ThreadLocalRandom.current().nextInt(1, 1 + 4);
        int randomY = ThreadLocalRandom.current().nextInt(1, 1 + 4);

        int xv = randomX;
        int yv = randomY;

        ball.setXVelocity(xv);
        ball.setYVelocity(yv);

        running.start();

    }

    @Override
    public void run() {
        while (true) {
            if (ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * -1);
                } else if (ball.getX() > CANVAS_WIDTH || ball.getX() < CANVAS_WIDTH) {
                } else if (ball.getX() + Ball.BALL_DIAMETER / 2 >= keeperRight.getX()
                        && ball.getY() + Ball.BALL_DIAMETER / 2 >= keeperRight.getY()
                        && ball.getY() + Ball.BALL_DIAMETER / 2 <= keeperRight.getY() + Keeper.KEEPER_HEIGHT) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * -1);
                } else if (ball.getX() + Ball.BALL_DIAMETER / 2 <= keeperLeft.getX() + Keeper.KEEPER_WIDTH
                        && ball.getY() + Ball.BALL_DIAMETER / 2 >= keeperLeft.getY()
                        && ball.getY() + Ball.BALL_DIAMETER / 2 <= keeperLeft.getY() + Keeper.KEEPER_HEIGHT) {
                    int xVelocity = ball.getXVelocity();
                    ball.setXVelocity(xVelocity * -1);
                }
            } else if (ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int yVelocity = ball.getYVelocity();
                ball.setYVelocity(yVelocity * -1);
                // } else if (ball.getX() + Ball.BALL_DIAMETER >= keeperRight.getX()
                // || ball.getY() + (Ball.BALL_DIAMETER / 2) > keeperRight.getY()
                // || ball.getY() + Ball.BALL_DIAMETER / 2 < keeperRight.getY() +
                // keeperRight.KEEPER_HEIGHT) {
                // int xVelocity = ball.getXVelocity();
                // ball.setXVelocity(xVelocity * -1);
                // } else if (ball.getX() + Ball.BALL_DIAMETER <= keeperLeft.getX() +
                // Keeper.KEEPER_WIDTH
                // || ball.getY() + Ball.BALL_DIAMETER / 2 >= keeperLeft.getY()
                // || ball.getY() + Ball.BALL_DIAMETER / 2 <= keeperLeft.getY() +
                // Keeper.KEEPER_HEIGHT) {
                // int xVelocity = ball.getXVelocity();
                // ball.setXVelocity(xVelocity * -1);
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
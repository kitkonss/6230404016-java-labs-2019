package sunthonputtasast.kitsakon.lab9;

import java.util.concurrent.ThreadLocalRandom;

/**
 * CanvasDrawerV3
 */
public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    private static final long serialVersionUID = 5025005958561917656L;

    protected Thread running;

    public CanvasDrawerV3() {
        super();

        running = new Thread(this);

        int randomX = ThreadLocalRandom.current().nextInt(1, 2);
        int randomY = ThreadLocalRandom.current().nextInt(1, 2);

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
                } else {
                }
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
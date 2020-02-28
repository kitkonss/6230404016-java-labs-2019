/**
 * create class CanvasDrawerV2 extend CanvasDrawer1
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import java.awt.*;
import sunthonputtasast.kitsakon.lab7.*;

class CanvasDrawerV2 extends CanvasDrawerV1 {
    private static final long serialVersionUID = -3459301271496810564L;

    // costant variables.
    protected Ball ball;
    protected Keeper keeperLeft, keeperRight;

    public CanvasDrawerV2() {
        super();

        // create ball in the middlePanel.
        this.ball = new Ball(CANVAS_WIDTH / 2 - Ball.BALL_DIAMETER / 2, CANVAS_HEIGHT / 2 - Ball.BALL_DIAMETER / 2);

        // create keeperLeft and keeperRight.
        this.keeperLeft = new Keeper(0, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);
        this.keeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);

    }

    // method for paint
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        // set orange color and draw a ball.
        g2D.setColor(Color.ORANGE);
        g2D.draw(this.ball);
        g2D.fill(this.ball);

        // set blue color and draw left keeper.
        g2D.setColor(Color.BLUE);
        g2D.fill(this.keeperLeft);

        // set red color and draw right keeper.
        g2D.setColor(Color.RED);
        g2D.fill(this.keeperRight);

    }

}
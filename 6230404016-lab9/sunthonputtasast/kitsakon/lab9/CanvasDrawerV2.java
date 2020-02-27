/**
 * create class CanvasDrawerV1 extend Jpanel
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 7, 2020
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

        this.ball = new Ball(CANVAS_WIDTH / 2 - Ball.BALL_DIAMETER / 2, CANVAS_HEIGHT / 2 - Ball.BALL_DIAMETER / 2);

        this.keeperLeft = new Keeper(0, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);
        this.keeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);

    }

    // method for paint
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.ORANGE);
        g2D.draw(this.ball);
        g2D.fill(this.ball);

        g2D.setColor(Color.BLUE);
        g2D.fill(this.keeperLeft);

        g2D.setColor(Color.RED);
        g2D.fill(this.keeperRight);

    }

}
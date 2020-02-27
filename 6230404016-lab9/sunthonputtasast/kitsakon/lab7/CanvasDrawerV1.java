/**
 * create class CanvasDrawerV1 extend Jpanel
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 7, 2020
 */
package sunthonputtasast.kitsakon.lab7;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;

public class CanvasDrawerV1 extends JPanel {
    private static final long serialVersionUID = -3459301271496810564L;

    // costant variables.
    protected static final Color CANVAS_BACKGROUND = Color.GREEN;
    protected static final int CANVAS_WIDTH = 800;
    protected static final int CANVAS_HEIGHT = 500;
    protected static final int LINE_WIDTH = 4;
    protected static final int DOT_CIRCLE_RADIUS = 5;
    protected static final int CIRCLE_RADIUS = 50;

    public CanvasDrawerV1() {
        super();
        // set size of canvas.
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        // set background of canvas.
        setBackground(CANVAS_BACKGROUND);

    }

    // method for paint
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        // set stroke to LINE_WIDTH.
        g2D.setStroke(new BasicStroke(LINE_WIDTH));
        // set color to black.
        g2D.setColor(Color.BLACK);

        // draw center line.
        g2D.draw(new Line2D.Double(CANVAS_WIDTH / 2, 0, CANVAS_WIDTH / 2, CANVAS_HEIGHT));

        // Draw a left inner rectangle.
        g2D.draw(new Rectangle2D.Double(0, 150, 60, 200));
        // Draw a right inner rectangle.
        g2D.draw(new Rectangle2D.Double(CANVAS_WIDTH - 60, 150, 60, 200));

        // Draw a left outer rectangle.
        g2D.draw(new Rectangle2D.Double(0, 80, 150, CANVAS_HEIGHT - (80 * 2)));
        // Draw a right outer rectangle.
        g2D.draw(new Rectangle2D.Double(CANVAS_WIDTH - 150, 80, 150, CANVAS_HEIGHT - (80 * 2)));

        // Draw a filled circle(left).
        g2D.draw(new Ellipse2D.Double(105, CANVAS_HEIGHT / 2, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS));
        // Draw a filled circle(right).
        g2D.draw(new Ellipse2D.Double(CANVAS_WIDTH - 105, CANVAS_HEIGHT / 2, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS));

        // change color to white.
        g2D.setColor(Color.WHITE);
        // draw circle in center of canvas.
        g2D.drawOval(CANVAS_WIDTH / 2 - CIRCLE_RADIUS, CANVAS_HEIGHT / 2 - CIRCLE_RADIUS, CIRCLE_RADIUS * 2,
                CIRCLE_RADIUS * 2);

    }
}
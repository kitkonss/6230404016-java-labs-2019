package sunthonputtasast.kitsakon.lab7;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;

class CanvasDrawerV1 extends JPanel {
    private static final long serialVersionUID = -3459301271496810564L;

    protected static final Color CANVAS_BACKGROUND = Color.GREEN;
    protected static final int CANVAS_WIDTH = 800;
    protected static final int CANVAS_HEIGHT = 500;
    protected static final int LINE_WIDTH = 4;
    protected static final int DOT_CIRCLE_RADIUS = 5;
    protected static final int CIRCLE_RADIUS = 50;

    public CanvasDrawerV1() {
        super();
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setBackground(CANVAS_BACKGROUND);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(LINE_WIDTH));
        g2D.setColor(Color.BLACK);

        g2D.draw(new Line2D.Double(CANVAS_WIDTH / 2, 0, CANVAS_WIDTH / 2, CANVAS_HEIGHT));

        g2D.draw(new Rectangle2D.Double(0, 150, 60, 200));
        g2D.draw(new Rectangle2D.Double(CANVAS_WIDTH - 60, 150, 60, 200));

        g2D.draw(new Rectangle2D.Double(0, 80, 150, CANVAS_HEIGHT - (80 * 2)));
        g2D.draw(new Rectangle2D.Double(CANVAS_WIDTH - 150, 80, 150, CANVAS_HEIGHT - (80 * 2)));

        g2D.draw(new Ellipse2D.Double(105, CANVAS_HEIGHT / 2, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS));
        g2D.draw(new Ellipse2D.Double(CANVAS_WIDTH - 105, CANVAS_HEIGHT / 2, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS));

        g2D.setColor(Color.WHITE);
        g2D.drawOval(CANVAS_WIDTH / 2 - CIRCLE_RADIUS, CANVAS_HEIGHT / 2 - CIRCLE_RADIUS, CIRCLE_RADIUS * 2,
                CIRCLE_RADIUS * 2);

    }
}
/**
 * Create class DrawableCircle extends from Circle and implements form Moveable, drawable.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 13, 2020
 */

package sunthonputtasast.kitsakon.lab5;

public class DrawableCircle extends Circle implements Moveable, Drawable {
    private double x;
    private double y;

    // Constructor without parameter.
    public DrawableCircle() {
        super();
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with 2 parameters: x and y.
    public DrawableCircle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    // Constructor with 5 parameters: x, y, radius, color, filled.
    public DrawableCircle(double x, double y, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.x = x;
        this.y = y;
    }

    // Getter for X.
    public double getX() {
        return this.x;

    }

    // Setter for x.
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y.
    public double getY() {
        return this.y;
    }

    // Setter for y.
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp(int value) {
        this.y += value;

    }

    @Override
    public void moveDown(int value) {
        this.y -= value;

    }

    @Override
    public void moveLeft(int value) {
        this.x -= value;

    }

    @Override
    public void moveRight(int value) {
        this.x += value;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String draw() {
        return String.format("draw a circle with the center at (%.1f,%.1f) with radius=%.1f  ", this.x, this.y,
                this.radius);
    }
}
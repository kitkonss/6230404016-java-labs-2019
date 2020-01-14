/**
 * Create class DrawableRectangle extends from Rectangle and implements form Moveable, drawable.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 13, 2020
 */

package sunthonputtasast.kitsakon.lab5;

public class DrawableRectangle extends Rectangle implements Drawable, Moveable {
    private double x;
    private double y;

    // Constructor without parameter.
    public DrawableRectangle() {
        super();
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with 2 parameters: x and y.
    public DrawableRectangle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    // Constructor with 6 patameters: x, y, width, length, color and filled.
    public DrawableRectangle(double x, double y, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.x = x;
        this.y = y;
    }

    // Getter for x.
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
        return String.format("draw a rectangle with top left corner at (%.1f,%.1f) with width=%.1f length=%.1f ",
                this.x, this.y, width, length);
    }

}
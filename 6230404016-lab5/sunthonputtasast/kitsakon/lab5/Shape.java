/**
 * Create class Shape.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 13, 2020
 */

package sunthonputtasast.kitsakon.lab5;

abstract class Shape {
    protected String color;
    protected boolean filled;

    // Constructor without patameter.
    public Shape() {
        this.color = "White";
        this.filled = false;
    }

    // Constructor with 2 patameters: color and filled.
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter for color.
    public String getColor() {
        return this.color;
    }

    // Setter for color.
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled.
    public boolean isFilled() {
        return this.filled;
    }

    // Setter for filled.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Create abstract methods getArea.
    abstract double getArea();

    // Create abstract methods getPerimeter.
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled;
    }

}
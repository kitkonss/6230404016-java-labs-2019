package sunthonputtasast.kitsakon.lab5;

/**
 * Shape
 */
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "White";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // get object's color.
    public String getColor() {
        return this.color;
    }

    // set object's color.
    public void setColor(String color) {
        this.color = color;
    }

    // get object's filled.
    public boolean isFilled() {
        return this.filled;
    }

    // set object's filled.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled;
    }

}
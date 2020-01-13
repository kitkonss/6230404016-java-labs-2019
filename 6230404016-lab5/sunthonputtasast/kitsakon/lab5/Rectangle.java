package sunthonputtasast.kitsakon.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Rectangle
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0f;
        this.length = 2.0f;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLegnth(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = this.width * this.length;

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // Calculated perimeter of circle.
    @Override
    public double getPerimeter() {
        double per = 2 * (this.length + this.width);

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(per);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + ", width:" + width + ", length:" + length;
    }

}
/**
 * Create class Rectangle extends from class Shape.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 13, 2020
 */

package sunthonputtasast.kitsakon.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    // Constructor without patameter.
    public Rectangle() {
        super();
        this.width = 1.0f;
        this.length = 2.0f;
    }

    // Constructor with 2 patameters: width and length.
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor with 4 patameters: width, length, color and filled.
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter for width.
    public double getWidth() {
        return this.width;
    }

    // Setter for width.
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length.
    public double getLength() {
        return this.length;
    }

    // Setter for length.
    public void setLegnth(double length) {
        this.length = length;
    }

    // Calculated area of Rectangle.
    @Override
    public double getArea() {
        double area = this.width * this.length;

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // Calculated perimeter of Rectangle.
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
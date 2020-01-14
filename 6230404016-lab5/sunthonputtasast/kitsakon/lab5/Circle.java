/**
 * Create class Circle and extends class Shape. 
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 13, 2020
 */

package sunthonputtasast.kitsakon.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
    protected double radius;

    // Constructor without parameter.
    public Circle() {
        super();
        this.radius = 1.0f;
    }

    // Constructor with 1 parameter: radius.
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with 3 parameters: radius, color, filled.
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter for radius.
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculated area of circle.
    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // Calculated perimeter of circle.
    @Override
    public double getPerimeter() {
        double per = this.radius * Math.PI * 2;

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(per);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + ", radius:" + radius;
    }

}
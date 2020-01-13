package sunthonputtasast.kitsakon.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Circle
 */
public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
        this.radius = 1.0f;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);

        // Codes from stackoverflow.
        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

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
        return super.toString() + ", radius" + radius;
    }

}
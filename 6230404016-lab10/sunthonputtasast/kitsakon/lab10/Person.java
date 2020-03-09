package sunthonputtasast.kitsakon.lab10;

import java.time.LocalDate;
import java.time.Period;

/**
 * Person
 */
public class Person {

    protected String name;
    protected double weight;
    protected double height;
    protected LocalDate dob;

    public Person() {
        this.name = "";
        this.weight = 0;
        this.height = 0;
        this.dob = null;
    }

    public Person(String name, double weight, double height, LocalDate dob) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getweight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        Period age = Period.between(dob, LocalDate.now());
        return getName() + " is " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays()
                + " days, has weight as " + weight + " kg., and height as " + height + " cm.\n";
    }

}
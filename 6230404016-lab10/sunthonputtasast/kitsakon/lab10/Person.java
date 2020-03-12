/**
 * Create class Person
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: March 9, 2020
 */
package sunthonputtasast.kitsakon.lab10;

import java.time.LocalDate;
import java.time.Period;

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

    // constructor with 4 parameters.
    public Person(String name, double weight, double height, LocalDate dob) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    // getter and setter -----------
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
    // -----------------------------

    // method for show information.
    @Override
    public String toString() {
        Period age = Period.between(dob, LocalDate.now());
        return getName() + " is " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays()
                + " days, has weight as " + weight + " kg., and height as " + height + " cm.\n";
    }

}
package sunthonputtasast.kitsakon.lab4;

/**
 * Created class name "Person" 
 * Author: Kitsakon Sunthonputtasast ID: 623040401-6
 * Sec: 1 Date: January 6, 2019
 */

public class Person {
    private String name;
    private double height; // unit is kg.
    private double weight; // unit is metre.
    private static int numberOfPerson = 0;

    // Created constructor.
    public Person() {
        this.name = "unknow";
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    public Person(String newName) {
        this.name = newName;
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    public Person(String newName, double newHeight, double newWeight) {
        this.name = newName;
        this.height = newHeight;
        this.weight = newWeight;
        numberOfPerson++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    @Override
    public String toString() {
        return "name=" + name + ',' + " height=" + height + "cm." + " weight=" + weight + "kg.";
    }

    // Return sum of numberOfPerson.
    public static int getNumberOfPerson() {
        return numberOfPerson;
    }

    // Calculated Body Mass Index(BMI).
    public String getBMI() {
        double height = this.height / 100; // cm to metres
        double weight = this.weight;
        return String.format("%.2f", weight / (height * height));
    }

}
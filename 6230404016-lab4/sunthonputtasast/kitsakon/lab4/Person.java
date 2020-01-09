package sunthonputtasast.kitsakon.lab4;

/**
 * Created class name "Person" 
 * Author: Kitsakon Sunthonputtasast ID: 623040401-6
 * Sec: 1 Date: January 6, 2019
 */

public class Person {
    // Create object's variables.
    private String name;
    private double height; // unit is kg.
    private double weight; // unit is metre.
    // Create class's variable.
    private static int numberOfPerson = 0;

    // Create constructor with no parameter.
    public Person() {
        this.name = "unknow";
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    // Create constructor with a parameter: 
    public Person(String newName) {
        this.name = newName;
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    // / Constructor with 3 parameters: name, height, weight
    public Person(String newName, double newHeight, double newWeight) {
        this.name = newName;
        this.height = newHeight;
        this.weight = newWeight;
        numberOfPerson++;
    }
    
    // get object's name.
    public String getName() {
        return this.name;
    }

    // set object's name.
    public void setName(String newName) {
        this.name = newName;
    }

    // get object's height.
    public double getHeight() {
        return this.height;
    }

    // set object's height.
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    // get object's weight.
    public double getWeight() {
        return this.weight;
    }

    // set object's weight.
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    // Show informations of the object.
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
package sunthonputtasast.kitsakon.lab4;

/**
 * Student
 */
public class Student extends PersonV2 {
    private String major;
    private double GPA;

    public Student(String newName, double newHeight, double newWeight, String newDob, String newMajor, double newGPA) {

        super(newName, newHeight, newWeight, newDob);
        this.major = newMajor;
        this.GPA = newGPA;

    }

    public String getMejor() {
        return this.major;
    }

    public void setMejor(String newMajor) {
        this.major = newMajor;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double newGPA) {
        this.GPA = newGPA;
    }

    @Override
    public String toString(){
        super.toString();
        return super.toString() + ", major=" + major + ", GPA=" + GPA;
    }

}
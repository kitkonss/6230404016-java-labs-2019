package sunthonputtasast.kitsakon.lab4;

/**
 * Student
 */
public class Student extends PersonV2 {
    // Created 2 variables: major and GPA.
    private String major;
    private double GPA;

    // Created constructor with 6 parameters.
    public Student(String newName, double newHeight, double newWeight, String newDob, String newMajor, double newGPA) {

        super(newName, newHeight, newWeight, newDob);
        this.major = newMajor;
        this.GPA = newGPA;

    }

    // get object's major.
    public String getMajor() {
        return this.major;
    }

    // set object's major.
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    // get object's GPA.
    public double getGPA() {
        return this.GPA;
    }

    // set object's GPA.
    public void setGPA(double newGPA) {
        this.GPA = newGPA;
    }

    @Override
    public String toString() {
        // get toString() from PersonV2
        super.toString();
        return super.toString() + ", major=" + major + ", GPA=" + GPA;
    }

}
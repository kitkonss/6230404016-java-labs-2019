package sunthonputtasast.kitsakon.lab4;

/**
 * Teacher
 */
public class Teacher extends PersonV2 {
    // Created 2 variables: teachingsubject and salary.
    private String teachingSubject;
    private int salary;

    // Created constructor with 6 parameters.
    public Teacher(String newName, double newHeight, double newWeight, String newDob, String newTeachingSubject,
            int newSalary) {

        super(newName, newHeight, newWeight, newDob);
        this.teachingSubject = newTeachingSubject;
        this.salary = newSalary;

    }

     // get object's teachingSubject.
    public String getTeachingSubject() {
        return this.teachingSubject;
    }

    // set object's teachingSubject.
    public void setTeachingSubject(String newTeachingSubject) {
        this.teachingSubject = newTeachingSubject;
    }

    // get object's Salary.
    public int getSalary() {
        return this.salary;
    }

    // set object's Salary.
    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        // get toString() from PersonV2
        super.toString();
        return super.toString() + ", teachingSubject=" + teachingSubject + ", salary=" + salary;
    }

}

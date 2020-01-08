package sunthonputtasast.kitsakon.lab4;

/**
 * Teacher
 */
public class Teacher extends PersonV2 {

    private String teachingSubject;
    private int salary;

    public Teacher(String newName, double newHeight, double newWeight, String newDob, String newTeachingSubject,
            int newSalary) {

        super(newName, newHeight, newWeight, newDob);
        this.teachingSubject = newTeachingSubject;
        this.salary = newSalary;

    }

    public String getTeachingSubject() {
        return this.teachingSubject;
    }

    public void setTeachingSubject(String newTeachingSubject) {
        this.teachingSubject = newTeachingSubject;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString() + ", teachingSubject=" + teachingSubject + ", salary=" + salary;
    }

}

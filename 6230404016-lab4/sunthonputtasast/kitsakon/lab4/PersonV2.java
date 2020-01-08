package sunthonputtasast.kitsakon.lab4;

import java.time.LocalDate;
import java.time.Period;

/**
 * PersonV2
 */
public class PersonV2 extends Person {
    private LocalDate dob;

    public PersonV2(String name, double height, double weight, String newDob) {

        // inheritance name hight and weight from class Person
        super(name, height, weight);

        // To initialize the value of dob
        this.dob = LocalDate.parse(newDob);
    }

    public LocalDate getDOB() {
        return this.dob;
    }

    public void setDOB(LocalDate newDob) {
        this.dob = newDob;
    }

    public void isBirthday() {
        LocalDate presentDate = LocalDate.now();

        int birthDay = this.dob.getDayOfMonth();
        int birthMonth = this.dob.getMonthValue();
        int presentDay = presentDate.getDayOfMonth();
        int presentMonth = presentDate.getMonthValue();

        if (birthDay == presentDay && birthMonth == presentMonth) {
            System.out.println("Today is " + getName());
        } else {
            System.out.println("Today is NOT " + getName() + "'s Birthday.");
        }

    }

    public void howOld() {
        LocalDate dayOfBirth = this.dob;
        LocalDate presentDay = LocalDate.now();

        Period person = Period.between(dayOfBirth, presentDay.minusDays(1));

        int getYear = person.getYears();
        int getMonth = person.getMonths();
        int getDay = person.getDays();

        System.out
                .println(getName() + " is " + getYear + " years " + getMonth + " months and " + getDay + " day olds.");

    }

    public void compareAge(PersonV2 other) {

        String thisName = this.getName();
        String otherName = other.getName();

        LocalDate dayOfBirth = this.dob;
        LocalDate otherDayOfBirth = other.getDOB();

        // Compare age of each charecter.
        int compare = dayOfBirth.compareTo(otherDayOfBirth);

        if (compare == 0) {
            System.out.println(getName() + "same age as" + otherName);
        } else if (compare < 0) {
            Period person = Period.between(dayOfBirth, otherDayOfBirth);

            int getYear = person.getYears();
            int getMonth = person.getMonths();
            int getDay = person.getDays();

            System.out.println(thisName + " is " + getYear + " years " + getMonth + " months and " + getDay
                    + " older than " + otherName);

        } else {
            Period person = Period.between(otherDayOfBirth, dayOfBirth);

            int getYear = person.getYears();
            int getMonth = person.getMonths();
            int getDay = person.getDays();

            System.out.println(otherName + " is " + getYear + " years " + getMonth + " months and " + getDay
                    + " older than " + thisName);
        }

    }

    @Override
    public String toString() {
        super.toString();
        return super.toString() + ", Birthday=" + dob;
    }
}
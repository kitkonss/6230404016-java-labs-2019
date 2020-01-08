package sunthonputtasast.kitsakon.lab4;

/**
 * TestPersonV3
 */
public class TestPersonV3 {

    public static void main(String[] args) {
        Teacher Onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "Social study", 15000);
        Student Zuckerberg = new Student("Zuckerberg", 180, 25, "1984-05-14", "Computer Engineering", 4);
        System.out.println(Onizuka);
        System.out.println(Zuckerberg);
        Onizuka.howOld();
        Zuckerberg.howOld();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        PersonV2 MickeyMouse = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        Student Mickey_Mouse = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3);
        System.out.println(MickeyMouse);
        System.out.println(Mickey_Mouse);
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}
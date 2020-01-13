package sunthonputtasast.kitsakon.lab4;

/**
 * Created class name "TestPersonV3" 
 * Author: Kitsakon Sunthonputtasast ID: 623040401-6
 * Sec: 1 Date: January 6, 2019
 */
public class TestPersonV3 {

    public static void main(String[] args) {
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "Social study", 15000);
        Student zuckerberg = new Student("Zuckerberg", 180, 25, "1984-05-14", "Computer Engineering", 4);
        System.out.println(onizuka);
        System.out.println(zuckerberg);
        onizuka.howOld();
        zuckerberg.howOld();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        PersonV2 mickeyMouse = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        Student mickey_mouse = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3);
        System.out.println(mickeyMouse);
        System.out.println(mickey_mouse);
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}
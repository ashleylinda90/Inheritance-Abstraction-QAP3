package Inheritance;

public class Demo {

    public static void main(String[] args) {

        // print space
        System.out.println("\n");

        // new Person
        Person jen = new Person("Jen Pine", 29, "F");
        System.out.println(jen); // print Person

        System.out.println("\n");

        // new Student
        Student ash = new Student("Ash Greene", 32, "F", "AG123", 3.9);
        System.out.println(ash); // print Student

        System.out.println("\n");

        // new Teacher
        Teacher elliot = new Teacher("George Elliot", 25, "M", "Advanced Programming", 53000);
        System.out.println(elliot); // print Teacher

        System.out.println("\n");

        // new CollegeStudent
        CollegeStudent soph = new CollegeStudent("Soph Browne", 19, "M", "S0982", 3.0, "Biology", 3);
        System.out.println(soph); // print CollegeStudent

        System.out.println("\n");

    }
}

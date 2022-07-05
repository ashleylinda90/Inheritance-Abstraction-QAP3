package Inheritance;

public class Person {

    private String myName; // name of person
    private int myAge; // age of person
    private String myGender; // 'M'for male, 'F' for female

    // Constructor with name, age, gender
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // GETTERS

    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // SETTERS

    public void setName(String name) {
        this.myName = name;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    // toString method
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}

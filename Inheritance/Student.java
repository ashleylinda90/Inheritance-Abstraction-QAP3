package Inheritance;

public class Student extends Person {

    private String myIdNum; // student ID number
    private double myGPA; // grade point average

    // Constructor with super class constructor, plus id and gpa
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // GETTERS

    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // SETTERS

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

}

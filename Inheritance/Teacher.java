package Inheritance;

public class Teacher extends Person {

    private String mySubject; // school subject
    private double mySalary; // annual salary

    // Constructor with all parameters
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }

    // GETTERS

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // SETTERS

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Annual Salary: " + mySalary;
    }
}

package Inheritance;

public class CollegeStudent extends Student {

    private String myMajor; // type of major
    private int myYear; // student year

    // Constructor with all parameters
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.myMajor = major;
        this.myYear = year;
    }

    // GETTERS

    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    // SETTERS

    public void setMajor(String major) {
        this.myMajor = major;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}

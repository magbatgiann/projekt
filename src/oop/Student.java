package oop;

public class Student extends Person {

    private String grade = "";

    public Student(String name, String phone) {
        super(name, phone);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

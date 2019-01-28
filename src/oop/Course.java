package oop;

import java.util.ArrayList;

public class Course {
    private int students;
    private int hours;
    private Teacher teacher;
    private Adress adress;
    private String courseName;
    private ArrayList<Student> studentsList;

    //default constructor
    public Course (int students, int hours, Teacher teacher,Adress adress, String courseName) {
        this.students = students;
        this.hours = hours;
        this.teacher = teacher;
        this.adress = adress;
        this.courseName = courseName;
        studentsList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentsList.add(student);
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        String s = courseName + "\n" + teacher + "\n" + adress + "\n";
        StringBuilder stringBuilder = new StringBuilder();
        int size = studentsList.size();
        for (int i = 0; i < size; i++) {
             stringBuilder.append(studentsList.get(i) + "\n");
        }
        return s + stringBuilder.toString();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAllStudentGrades(String g) {
//        for (int i = 0; i < studentsList.size(); i++) {
//            studentsList.get(i).setGrade(g);
        //for each
        for(Student s : studentsList){
            s.setGrade(g);
        }
        //with lambda expression
        //studentsList.forEach(student -> student.setGrade(g));
    }
}

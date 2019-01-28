package oop;

import java.awt.*;
import java.sql.SQLOutput;


public class Main {

    public static void main(String[]args){
//        Rectangle rect = new Rectangle();
//        Rectangle rect2 = new Rectangle();
//
//        rect.setHeight(10);
//        rect2.setHeight(20);
//
//        int i = rect.getHeight();
//
//        System.out.println(i);
//        System.out.println(rect2.getHeight());
//
//        System.out.println( rect.getWidth() );
//        int a = rect.getArea();
//
//        Vehicle sportcar = new Vehicle();
//
//        sportcar.setFuelcap(70);
//        sportcar.setMpg(2);
//        sportcar.setPassangers(2);
//        sportcar.setWorking(true);
//
//        System.out.println(sportcar.getRange());
//
//        Vehicle minivan = new Vehicle();
//
//        minivan.setFuelcap(50);
//        minivan.setMpg(2);
//        minivan.setPassangers(4);
//        minivan.setWorking(true);
//
//        System.out.println(minivan.getRange());
//
//        Vehicle tir = new Vehicle(2,40,7, false);
//
//        System.out.println(tir.getRange());

        Teacher teacher = new Teacher("Blomberg","111-123123");
        Course course = new Course(12,90, teacher,new Adress("Göteborg","Maskingatan",5),
        "Java");
        course.addStudent(new Student("Jonas","555-454545"));
        course.addStudent(new Student("Kalle","555-565656"));
        course.addStudent(new Student("Martin","555-232323"));

        course.setAllStudentGrades("G");

//        System.out.println(course.getTeacher().getName());
//
        System.out.println( course);

//   Point point1 = new Point(0.0,0.0);
//   Point point2 = new Point(3.0,0.0);
//
//   Point point3 = new Point(point2);
//   point3.setX(4.0);
//
//        System.out.println(point2);
//        System.out.println(point3);
//   double d = point1.distanceTo(point2);
//
//        System.out.println( d );




    }

}

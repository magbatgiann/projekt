package oop;

public class Point {
    private double x;
    private double y;

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    // Copy construktor
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " + x + "," + y;
    }
    public double distanceTo(Point other){
        Point p1 = this;
        Point p2 = other;

        double a = p2.x - p1.x;
        double b = p2.y - p1.x;

        double c = Math.sqrt( a*a + b*b );

        return c;
    }
}


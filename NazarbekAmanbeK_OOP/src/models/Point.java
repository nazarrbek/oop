package models;

public class Point {
    private double x;
    private double y;

    public void setValues(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

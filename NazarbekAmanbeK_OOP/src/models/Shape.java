package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;

        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            Point p2 = points.get((i + 1) % points.size()) ;
            perimeter += p.distance(p2);
        }
        return perimeter;
    }
    public double getAvarageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongest() {
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            Point p2 = points.get((i + 1) % points.size()) ;
            double dist = p.distance(p2);
            if (dist > longestSide) {
                longestSide = dist;
            }
        }
        return longestSide;
    }
}

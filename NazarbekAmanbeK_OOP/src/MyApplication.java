import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nazarbek\\IdeaProjects\\javaproject\\src\\Source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point();
            point.setValues(x, y);
            shape.addPoint(point);
        }
        System.out.println("Perimeter = " + shape.calculatePerimeter());
        System.out.println("Longest side = " + shape.getLongest());
        System.out.println("Avarage side = " + shape.getAvarageSide());

    }
}

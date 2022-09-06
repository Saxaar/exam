package Tasks.task1;

import java.util.Scanner;

public class task1 {

    public static class Point{
        double x;
        double y;
    }

    public static void main(String[] args) {

        Point a = new Point();
        a.x = 0.0;
        a.y = 0.0;

        Point b = new Point();
        b.x = 0.0;
        b.y = 0.0;

        Point c = new Point();
        c.x = 0.0;
        c.y = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("input x of first point");
        a.x = scanner.nextDouble();
        System.out.println("input y of first point");
        a.y = scanner.nextDouble();

        System.out.println("input x of second point");
        b.x = scanner.nextDouble();
        System.out.println("input y of second point");
        b.y = scanner.nextDouble();

        System.out.println("input x of third point");
        c.x = scanner.nextDouble();
        System.out.println("input y of third point");
        c.y = scanner.nextDouble();

        double s = 0.5 * Math.abs(((b.x - a.x)*(c.y - a.y)) - ((c.x - a.x)-(b.y - a.y)));
        System.out.println("new value of S - " + s);
        double s1 = 0.5*Math.abs(a.x*(b.y - c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y));
        System.out.println("old value of S -" + s1 );

    }
}

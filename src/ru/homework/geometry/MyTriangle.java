package ru.homework.geometry;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        String res = "";
        double c = v1.distance(v2);
        double b = v1.distance(v3);
        double a = v2.distance(v3);
        if (a > b) {
            double tmp = a;
            tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            double tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b) {
            double tmp = a;
            tmp = a;
            a = b;
            b = tmp;
        }

        if (a == b && b == c) res = "Equilateral";

        if ((a == b && b != c) || (a == c && b != c) || (c == b && a != c)) res = "Isosceles";

        if (a != b && b != c && a != c) res = "Scalene";

        return res;
    }
}

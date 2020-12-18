package ru.homework;

public class Container {

    int x1;
    int y1;
    int x2;
    int y2;

    public Container(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getHeight() {
        return Math.abs(y1-y2);
    }

    public int getWidth() {
        return Math.abs(x1-x2);
    }

    public boolean collides(Ball ball) {
        boolean res = false;
        if (ball.getX() - ball.getRadius() < x1 && x1 < ball.getX() + ball.getRadius()) res = true;
        if (ball.getX() - ball.getRadius() < x2 && x2 < ball.getX() + ball.getRadius()) res = true;
        if (ball.getY() - ball.getRadius() < y1 && y1 < ball.getY() + ball.getRadius()) res = true;
        if (ball.getY() - ball.getRadius() < y2 && y2 < ball.getY() + ball.getRadius()) res = true;
        return res;
    }

    @Override
    public String toString() {
        return "Container[(" +
                x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")]";
    }
}

package ru.homework;

public class Ball {

    private float x;
    private float y;
    private float deltaX;
    private float deltaY;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.deltaX = (float)speed * (float)Math.cos(direction);
        this.deltaY = - (float)speed * (float)Math.sin(direction);
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move() {
        x+= deltaX;
        y+= deltaY;
    }

    public void reflectHorizontal() {
        deltaX = -deltaX;
    }

    public void reflectVertical() {
        deltaY = -deltaY;
    }

    @Override
    public String toString() {
        return "Ball[(" + x +
                ", " + y +
                "), speed = (" + deltaX +
                ", " + deltaY +
                "), radius = " + radius +
                "]";
    }
}

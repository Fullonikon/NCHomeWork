package ru.homework.math;

import ru.homework.geometry.MyTriangle;

public class MyComplex {

    double re, im;

    public MyComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setValue(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "(" + re +
                " + " + im +
                "i)";
    }

    public Boolean isReal() {
        return im == 0;
    }

    public Boolean isImaginary() {
        return re == 0;
    }

    public Boolean equals(double re, double im) {
        return this.re == re && this.im == im;
    }

    public Boolean equals(MyComplex a) {
        return this.re == a.getRe() && this.im == a.getIm();
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public MyComplex add(MyComplex right) {
        re += right.getRe();
        im += right.getIm();
        return this;
    }

    public MyComplex addNew(MyComplex right) {

        double nre = re + right.getRe();
        double nim = im + right.getIm();

        return new MyComplex(nre, nim);
    }

    public MyComplex subtract(MyComplex right) {
        re -= right.getRe();
        im -= right.getIm();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {

        double nre = re - right.getRe();
        double nim = im - right.getIm();

        return new MyComplex(nre, nim);
    }

    public MyComplex multiply(MyComplex right) {
        double tr = re * right.getRe() - im * right.getIm();
        double ti = im * right.getRe() + re * right.getIm();
        re = tr;
        im = ti;
        return this;
    }

    public MyComplex reciprocal() {
        double scale = re * re + im * im;
        return new MyComplex(re / scale, -im / scale);
    }

    public MyComplex divide(MyComplex that) {
        return this.multiply(that.reciprocal());
    }

    public MyComplex conjugate() {
        return new MyComplex(re, -im);
    }
}

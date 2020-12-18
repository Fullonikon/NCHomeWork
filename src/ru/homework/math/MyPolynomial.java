package ru.homework.math;

import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        if (coeffs == null) return 0;
        return coeffs.length-1;
    }

    double[] getCoeffs() {
        return coeffs;
    }

    @Override
    public String toString() {
        if (coeffs == null) return "";
        StringBuilder res = new StringBuilder();
        res.append(coeffs[0]);
        if (coeffs.length > 1) res.append(" + ").append(coeffs[1]).append("X");
        for (int n = 2; n < coeffs.length; n++) {
            res.append(" + ").append(coeffs[n]).append("X^").append(coeffs.length);
        }
        return res.toString();
    }

    public double evaluate(double x) {
        if (coeffs == null) return 0;
        double res = 0;

        for (int i = 0; i < coeffs.length; i++) {
            res+= coeffs[i] * Math.pow(x, i);
        }

        return res;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] rescoeffs = new double[Math.max(right.getDegree() + 1, coeffs.length)];
        for (int i = 0; i < coeffs.length; i++) {
            rescoeffs[i] += coeffs[i];
        }
        double[] tmp = right.getCoeffs();
        for (int i = 0; i < tmp.length; i++) {
            rescoeffs[i] += tmp[i];
        }
        return new MyPolynomial(rescoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] res = new double[coeffs.length + right.getDegree()];

        // Multiply two polynomials term by term
        // Take ever term of first polynomial
        for (int i = 0; i < coeffs.length; i++)
        {
            // Multiply the current term of first polynomial
            // with every term of second polynomial.
            for (int j = 0; j < right.getDegree()+1; j++)
            {
                res[i + j] += coeffs[i] * right.getCoeffs()[j];
            }
        }

        return new MyPolynomial(res);
    }
}

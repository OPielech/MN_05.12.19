package edu.ib;

public class RelativeErrorSolver implements RelativeError {

    @Override
    public double solver(double x, double trueValue) {
        return (trueValue-x)/trueValue*100;
    }
}

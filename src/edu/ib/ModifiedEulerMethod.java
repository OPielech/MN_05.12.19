package edu.ib;

public class ModifiedEulerMethod implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double hHalf = h / 2;

        double xHalf = x + ode.function(t, x) * hHalf;

        return x + ode.function(t + hHalf, xHalf) * h;
    }
}

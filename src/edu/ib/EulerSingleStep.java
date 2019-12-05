package edu.ib;

public class EulerSingleStep implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        return x+ode.function(t,x)*h;
    }
}

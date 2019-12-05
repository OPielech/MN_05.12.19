package edu.ib;

public class ModifiedEulerMethod implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double xHalf=x+ode.function(t,x)*(h/2);
        double tHalf=t/2;
        return x+ode.function(tHalf,xHalf)*h;
    }
}

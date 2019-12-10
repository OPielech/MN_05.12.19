package edu.ib;

public class RungeKuttaMethod implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double hHalf=h/2;
        double k1 = ode.function(t,x);

        double xHalf1 = x+k1*hHalf;
        double k2 = ode.function(h+hHalf,xHalf1);

        double xHalf2 = x+k2*hHalf;
        double k3 = ode.function(t+hHalf,xHalf2);

        double xEnd=x+k3*h;
        double k4 = ode.function(t+h,xEnd);

        double phi=(1.0/6.0)*(k1+2*k2+2*k3+k4);

        return x+h*phi;

    }
}

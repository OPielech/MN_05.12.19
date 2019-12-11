package edu.ib;

public class Main {
    public static void main(String[] args) {

        //Values for h=0.25 with Euler method:
        FirstOrderODESolver solver = new FirstOrderODESolver((new EulerSingleStep()));
        SaveAllStepHandler saveAllStepHandler = new SaveAllStepHandler();
        solver.addStepHandler(saveAllStepHandler);
        double xStop = solver.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 16);
        System.out.println("\nValues for h=0.25 with Euler method:");
        for (int i = 0; i < saveAllStepHandler.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler.tValues.get(i), saveAllStepHandler.xValues.get(i));
        }
        RelativeErrorSolver relativeError = new RelativeErrorSolver();
        double error = relativeError.solver(xStop, 75.33896);
        System.out.printf("Relative error = %.2f%s\n", error, "%");


        //Values for h=0.25 with modified Euler method:
        FirstOrderODESolver solver1 = new FirstOrderODESolver((new ModifiedEulerMethod()));
        SaveAllStepHandler saveAllStepHandler1 = new SaveAllStepHandler();
        solver1.addStepHandler(saveAllStepHandler1);
        double xStop1 = solver1.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 16);
        System.out.println("\nValues for h=0.25 with modified Euler method:");
        for (int i = 0; i < saveAllStepHandler1.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler1.tValues.get(i), saveAllStepHandler1.xValues.get(i));
        }
        RelativeErrorSolver relativeError1 = new RelativeErrorSolver();
        double error1 = relativeError1.solver(xStop1, 75.33896);
        System.out.printf("Relative error = %.3f%s\n", error1, "%");


        //Values for h=0.25 with Runge-Kutta method:
        FirstOrderODESolver solver2 = new FirstOrderODESolver((new RungeKuttaMethod()));
        SaveAllStepHandler saveAllStepHandler2 = new SaveAllStepHandler();
        solver2.addStepHandler(saveAllStepHandler2);
        double xStop2 = solver2.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 16);
        System.out.println("\nValues for h=0.25 with Runge-Kutta method:");
        for (int i = 0; i < saveAllStepHandler2.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler2.tValues.get(i), saveAllStepHandler2.xValues.get(i));
        }
        RelativeErrorSolver relativeError2 = new RelativeErrorSolver();
        double error2 = relativeError2.solver(xStop2, 75.33896);
        System.out.printf("Relative error = %.5f%s\n", error2, "%");


        //Values for h=0.5 with Euler method:
        FirstOrderODESolver solver3 = new FirstOrderODESolver((new EulerSingleStep()));
        SaveAllStepHandler saveAllStepHandler3 = new SaveAllStepHandler();
        solver3.addStepHandler(saveAllStepHandler3);
        double xStop3 = solver3.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 8);
        System.out.println("\nValues for h=0.5 with Euler method:");
        for (int i = 0; i < saveAllStepHandler3.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler3.tValues.get(i), saveAllStepHandler3.xValues.get(i));
        }
        RelativeErrorSolver relativeError3 = new RelativeErrorSolver();
        double error3 = relativeError3.solver(xStop3, 75.33896);
        System.out.printf("Relative error = %.2f%s\n", error3, "%");


        //Values for h=0.5 with modified Euler method:
        FirstOrderODESolver solver4 = new FirstOrderODESolver((new ModifiedEulerMethod()));
        SaveAllStepHandler saveAllStepHandler4 = new SaveAllStepHandler();
        solver4.addStepHandler(saveAllStepHandler4);
        double xStop4 = solver4.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 8);
        System.out.println("\nValues for h=0.5 with modified Euler method:");
        for (int i = 0; i < saveAllStepHandler4.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler4.tValues.get(i), saveAllStepHandler4.xValues.get(i));
        }
        RelativeErrorSolver relativeError4 = new RelativeErrorSolver();
        double error4 = relativeError4.solver(xStop4, 75.33896);
        System.out.printf("Relative error = %.2f%s\n", error4, "%");


        //Values for h=0.5 with Runge-Kutta method:
        FirstOrderODESolver solver5 = new FirstOrderODESolver(new RungeKuttaMethod());
        SaveAllStepHandler saveAllStepHandler5 = new SaveAllStepHandler();
        solver5.addStepHandler(saveAllStepHandler5);
        double xStop5 = solver5.integrate((t, x) -> 4 * Math.exp(0.8 * t) - 0.5 * x, 0, 2, 4, 8);
        System.out.println("\nValues for h=0.5 with Runge-Kutta method:");
        for (int i = 0; i < saveAllStepHandler5.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler5.tValues.get(i), saveAllStepHandler5.xValues.get(i));
        }
        RelativeErrorSolver relativeError5 = new RelativeErrorSolver();
        double error5 = relativeError5.solver(xStop5, 75.33896);
        System.out.printf("Relative error = %.4f%s\n", error5, "%");
    }//end of main
}//end of class

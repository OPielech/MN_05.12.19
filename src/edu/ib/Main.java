package edu.ib;

public class Main {
    public static void main(String[] args) {

        //For h=0.5
        FirstOrderODESolver solver=new FirstOrderODESolver((new EulerSingleStep()));
        SaveAllStepHandler saveAllStepHandler=new SaveAllStepHandler();
        solver.addStepHandler(saveAllStepHandler);
        double xStop = solver.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,9, 10);
        System.out.println(saveAllStepHandler.xValues);
        RelativeErrorSolver relativeError=new RelativeErrorSolver();
        double error=relativeError.solver(xStop,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error,"%");

        FirstOrderODESolver solver1=new FirstOrderODESolver((new ModifiedEulerMethod()));
        SaveAllStepHandler saveAllStepHandler1=new SaveAllStepHandler();
        solver1.addStepHandler(saveAllStepHandler1);
        double xStop1=solver1.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,9, 10);
        System.out.println(saveAllStepHandler1.xValues);
        RelativeErrorSolver relativeError1=new RelativeErrorSolver();
        double error1=relativeError1.solver(xStop1,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error1,"%");


        FirstOrderODESolver solver2=new FirstOrderODESolver((new RungeKuttaMethod()));
        SaveAllStepHandler saveAllStepHandler2=new SaveAllStepHandler();
        solver2.addStepHandler(saveAllStepHandler2);
        double xStop2=solver2.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,9, 10);
        System.out.println(saveAllStepHandler2.xValues);
        RelativeErrorSolver relativeError2=new RelativeErrorSolver();
        double error2=relativeError2.solver(xStop2,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error2,"%");


        System.out.println();
        //For h=1
        FirstOrderODESolver solver3=new FirstOrderODESolver((new EulerSingleStep()));
        SaveAllStepHandler saveAllStepHandler3=new SaveAllStepHandler();
        solver3.addStepHandler(saveAllStepHandler3);
        double xStop3 = solver3.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,14, 10);
        System.out.println(saveAllStepHandler3.xValues);
        RelativeErrorSolver relativeError3=new RelativeErrorSolver();
        double error3=relativeError3.solver(xStop3,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error3,"%");

        FirstOrderODESolver solver4=new FirstOrderODESolver((new ModifiedEulerMethod()));
        SaveAllStepHandler saveAllStepHandler4=new SaveAllStepHandler();
        solver4.addStepHandler(saveAllStepHandler4);
        double xStop4=solver4.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,14, 10);
        System.out.println(saveAllStepHandler4.xValues);
        RelativeErrorSolver relativeError4=new RelativeErrorSolver();
        double error4=relativeError4.solver(xStop4,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error4,"%");


        FirstOrderODESolver solver5=new FirstOrderODESolver((new RungeKuttaMethod()));
        SaveAllStepHandler saveAllStepHandler5=new SaveAllStepHandler();
        solver5.addStepHandler(saveAllStepHandler5);
        double xStop5=solver5.integrate((t, x)->4*Math.exp(0.8*t)-0.5*x,4,1,14, 10);
        System.out.println(saveAllStepHandler5.xValues);
        RelativeErrorSolver relativeError5=new RelativeErrorSolver();
        double error5=relativeError5.solver(xStop2,75.33896);
        System.out.printf("Relative error = %.2f%s\n", error5,"%");
    }//end of main
}

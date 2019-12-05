package edu.ib;

public class Main {
    public static void main(String[] args) {
        FirstOrderODESolver solver=new FirstOrderODESolver((new EulerSingleStep()));
        SaveAllStepHandler saveAllStepHandler=new SaveAllStepHandler();
        solver.addStepHandler(saveAllStepHandler);
        double xStop = solver.integrate((t, x)->-x,0,1,1, 10);
        System.out.println(saveAllStepHandler.xValues);
//        System.out.println(xStop);

        FirstOrderODESolver solver1=new FirstOrderODESolver((new ModifiedEulerMethod()));
        double xStop1=solver1.integrate((t, x)->-x,0,1,1, 10);
//        System.out.println(xStop1);
    }//end of main
}

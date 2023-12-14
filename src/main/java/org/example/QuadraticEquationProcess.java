package org.example;

import java.util.List;

public class QuadraticEquationProcess {
    private QuadraticEquation polinom;

    public QuadraticEquationProcess(QuadraticEquation polinom) {
        this.polinom = polinom;
    }

    public double getMaxRoot() {
        List<Double> root = polinom.solveEquation();
        if (root == null) {
            throw new IndexOutOfBoundsException("Нет корней");
        }
        double maxRoot = root.get(0);
        for (int i = 1; i < root.size(); i++) {
            if (maxRoot < root.get(i)) {
                maxRoot = root.get(i);
            }
        }
        return maxRoot;
    }

}
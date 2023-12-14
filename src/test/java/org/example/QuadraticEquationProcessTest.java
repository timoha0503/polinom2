package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationProcessTest {

    @Test
    void getMaxRoot() {
        QuadraticEquationProcess y1 = new QuadraticEquationProcess(new QuadraticEquation(1, 2, 1));
        assertEquals(-1, y1.getMaxRoot());
        QuadraticEquationProcess y2 = new QuadraticEquationProcess(new QuadraticEquation(1, -5, 6));
        assertEquals(3, y2.getMaxRoot());
        QuadraticEquationProcess y3 = new QuadraticEquationProcess(new QuadraticEquation(0, 1, 4));
        assertEquals(-4, y3.getMaxRoot());
        QuadraticEquationProcess y4 = new QuadraticEquationProcess(new QuadraticEquation(1, 1, 1));
        assertThrows(
                IndexOutOfBoundsException.class,
                y4::getMaxRoot
        );

    }
}
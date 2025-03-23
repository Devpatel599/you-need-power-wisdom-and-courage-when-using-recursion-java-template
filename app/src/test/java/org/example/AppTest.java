package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testValue() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(1, calculator.value(1), "T1 should be 1");
        assertEquals(3, calculator.value(2), "T2 should be 3");
        assertEquals(6, calculator.value(3), "T3 should be 6");
        assertEquals(10, calculator.value(4), "T4 should be 10");
    }

    @Test
    void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(2, calculator.add(1, 1), "T1 + T1 should be 2");
        assertEquals(9, calculator.add(2, 3), "T2 + T3 should be 9");
        assertEquals(13, calculator.add(4, 2), "T4 + T2 should be 13");
    }

    @Test
    void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(0, calculator.subtract(1, 1), "T1 - T1 should be 0");
        assertEquals(-3, calculator.subtract(2, 3), "T2 - T3 should be -3");
        assertEquals(7, calculator.subtract(4, 2), "T4 - T2 should be 7");
    }
}

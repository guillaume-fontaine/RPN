package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RpnAppTest {
    @Test
    void testAddition() {
        RpnApp calc = new RpnApp();
        assertEquals(5, calc.evaluate("2 3 +"));
    }

    @Test
    void testSubtraction() {
        RpnCalculator calc = new RpnCalculator();
        assertEquals(1, calc.evaluate("3 2 -"));
    }

    @Test
    void testMultiplication() {
        RpnCalculator calc = new RpnCalculator();
        assertEquals(6, calc.evaluate("2 3 *"));
    }
}


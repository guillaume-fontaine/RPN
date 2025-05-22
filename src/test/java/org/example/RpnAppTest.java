package org.example;

import static org.example.RpnApp.evaluate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RpnAppTest {
    @Test
    void testAddition() {
        assertEquals(5, evaluate("2 3 +"));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, evaluate("3 2 -"));
    }
}

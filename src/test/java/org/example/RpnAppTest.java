package org.example;

import static org.example.RpnApp.evaluate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class RpnAppTest {
    @Test
    @DisplayName("Addition simple : 2 3 + = 5")
    void testAddition() {
        assertEquals(5, evaluate("2 3 +"));
    }

    @Test
    @DisplayName("Soustraction simple : 3 2 - = 1")
    void testSubtraction() {
        assertEquals(1, evaluate("3 2 -"));
    }

    @Test
    @DisplayName("Multiplication simple : 2 3 * = 6")
    @Disabled
    void testMultiplication() {
        assertEquals(6, evaluate("2 3 *"));
    }

    @Test
    @DisplayName("Addition et multiplication : 2 3 + 4 * = 20")
    @Disabled
    void testAdditionThenMultiplication() {
        assertEquals(20, evaluate("2 3 + 4 *"));
    }

    @Test
    @DisplayName("Multiplication imbriquée : 2 3 4 * + = 14")
    @Disabled
    void testMultiplicationNested() {
        assertEquals(14, evaluate("2 3 4 * +"));
    }

    @Test
    @DisplayName("Multiplication et addition en chaîne : 5 1 2 + 4 * + 3 + = 20")
    @Disabled
    void testComplexExpression() {
        assertEquals(20, evaluate("5 1 2 + 4 * + 3 +"));
    }

    @Test
    @DisplayName("Addition et soustraction : 4 2 + 3 - = 3")
    void testAdditionAndSubtraction() {
        assertEquals(3, evaluate("4 2 + 3 -"));
    }

    @Test
    @DisplayName("Expression complexe : 3 5 8 * 7 + * = 141")
    @Disabled
    void testComplexDojoExample() {
        assertEquals(141, evaluate("3 5 8 * 7 + *"));
    }
}

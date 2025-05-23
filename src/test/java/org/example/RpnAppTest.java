package org.example;

import static org.example.RpnApp.evaluate;
import static org.junit.jupiter.api.Assertions.*;

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
    void testMultiplication() {
        assertEquals(6, evaluate("2 3 *"));
    }

    @Test
    @DisplayName("Addition et multiplication : 2 3 + 4 * = 20")
    void testAdditionThenMultiplication() {
        assertEquals(20, evaluate("2 3 + 4 *"));
    }

    @Test
    @DisplayName("Multiplication imbriquée : 2 3 4 * + = 14")
    void testMultiplicationNested() {
        assertEquals(14, evaluate("2 3 4 * +"));
    }

    @Test
    @DisplayName("Multiplication et addition en chaîne : 5 1 2 + 4 * + 3 + = 20")
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
    void testComplexDojoExample() {
        assertEquals(141, evaluate("3 5 8 * 7 + *"));
    }

    @Test
    @DisplayName("Division non supportée : 20 5 / = 4")
    void testDivision() {
        assertThrows(UnsupportedOperationException.class, () -> evaluate("20 5 /"));
    }

    @Test
    @DisplayName("Racine carrée non supportée : 9 SQRT")
    void testSqrtNotSupported() {
        assertThrows(UnsupportedOperationException.class, () -> evaluate("9 SQRT"));
    }

    @Test
    @DisplayName("MAX non supporté : 2 3 MAX")
    void testMaxNotSupported() {
        assertThrows(UnsupportedOperationException.class, () -> evaluate("2 3 MAX"));
    }

    @Test
    @DisplayName("Format de nombre invalide : 2 a +")
    void testInvalidNumberFormat() {
        assertThrows(NumberFormatException.class, () -> evaluate("2 a +"));
    }
}

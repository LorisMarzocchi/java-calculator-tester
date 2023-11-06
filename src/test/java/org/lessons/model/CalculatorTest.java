package org.lessons.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Creo un'istanza della classe Calculator da testare.
//    private final Calculator calculator = new Calculator();


    @Test
    @DisplayName("somma corretta di due float")
    void add() {
        assertEquals(5.0f, Calculator.add(2.0f, 3.0f), "somma due numeri");
    }
//    @Test
//    @DisplayName("controllo somma")
//    void add(){
//        float result  = Calculator.add(10, 1);
//        assertEquals(11, result ,"addizione corretta");
////        assertNotEquals(12, x, "addizione non corretta");
//    }

    @Test
    @DisplayName("controllo sottrazione")
    void subtract() {
        assertEquals(1.0f, Calculator.subtract(3.0f, 2.0f), "Sottrazione errata");
    }

    @Test
    @DisplayName("controllo moltiplicazione")
    void multiply() {
        assertEquals(6.0f, Calculator.multiply(3.0f, 2.0f), "moltiplicazione errata");
    }

    @Test
//    @DisplayName("throws IllegalArgumentException quando chiede di dividere per 0")
    @DisplayName("controllo divisione, eccezione ArithmeticException quando chiede di dividere per 0")
    void divide() {
        assertEquals(10.0f, Calculator.divide(20f, 2f), "divisione corretta");
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10.0f, 0.0f), "impossibile dividere per 0");

    }
}
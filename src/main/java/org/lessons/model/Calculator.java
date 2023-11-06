package org.lessons.model;



public interface Calculator {

    static float add(float num1, float num2) {
        return num1 + num2;
    }

    static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    static float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("impossibile dividere per 0");
        }
        return num1 / num2;
    }

}






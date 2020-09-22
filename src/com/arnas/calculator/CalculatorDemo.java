package com.arnas.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        // Static calculation
        System.out.println("... Static calculation:\n");
        System.out.println(StaticCalculator.add(16,4)); // returns 20
        System.out.println(StaticCalculator.subtract(16,4)); // returns 12
        System.out.println(StaticCalculator.multiply(16,4)); // returns 64
        System.out.println(StaticCalculator.divide(16,4)); // returns 4

        // Non-Static calculation
        System.out.println("... Non-Static calculation:\n");
        System.out.println((new NonstaticCalculator()).add(16,4)); // returns 20
        System.out.println((new NonstaticCalculator()).subtract(16,4)); // returns 12
        System.out.println((new NonstaticCalculator()).multiply(16,4)); // returns 64
        System.out.println((new NonstaticCalculator()).divide(16,4)); // returns 4
    }
}

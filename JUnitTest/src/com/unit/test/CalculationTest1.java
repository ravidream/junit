package com.unit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unit.work.Calculation;

public class CalculationTest1 {
	@Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Calculation calculation = new Calculation(); 
        assertEquals(4, calculation.calculate(4, 2));

    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VulnerableClassTest {
    @Test
    public void TestingVulnerableClassFunctions_add() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(5, VulnerableClassInstance.add(1,4));
    }

    @Test
    public void TestingVulnerableClassFunctions_subtract() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(5, VulnerableClassInstance.subtract(6,1));
    }

    @Test
    public void TestingVulnerableClassFunctions_multiply() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(5, VulnerableClassInstance.multiply(5,1));
    }

    @Test
    public void TestingVulnerableClassFunctions_factorial() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(1, VulnerableClassInstance.factorial(1));
        assertEquals(720, VulnerableClassInstance.factorial(6));
    }

    @Test
    public void TestingVulnerableClassFunctions_squareRoot() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(4, VulnerableClassInstance.squareRoot(16));
    }
}
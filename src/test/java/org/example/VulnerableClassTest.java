package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VulnerableClassTest {
    @Test
    public void TestingVulnerableClassFunctions_reverse() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals("1tseT", VulnerableClassInstance.reverse("Test1"));
    }

    @Test
    public void TestingVulnerableClassFunctions_isPalindrome() {
        var VulnerableClassInstance = new VulnerableClass();
        boolean result = VulnerableClassInstance.isPalindrome("lalalal");
        assertTrue(result);
    }

    @Test
    public void TestingVulnerableClassFunctions_VDQ() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals("done", VulnerableClassInstance.vulnerableDatabaseQuery(1));
    }

    @Test
    public void TestingVulnerableClassFunctions_factorial() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(1, VulnerableClassInstance.factorial(1));
        assertEquals(720, VulnerableClassInstance.factorial(6));
    }

    @Test
    public void TestingVulnerableClassFunctions_fibonacci() {
        var VulnerableClassInstance = new VulnerableClass();
        assertEquals(2, VulnerableClassInstance.fibonacci(3));
    }
}
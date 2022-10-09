package dk.test.stringtestass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    @Test
    void stringUtilityShouldReverseString() {
        String testString = "Test";
        String expected = "tseT";
        String actual = StringUtility.reverseString(testString);
        assertEquals(expected, actual);
    }

    @Test
    void stringUtilityShouldCapitalizeString() {
        String testString = "Test";
        String expected = "TEST";
        String actual = StringUtility.capitalizeString(testString);
        assertEquals(expected, actual);
    }

    @Test
    void stringUtilityShouldLowercaseString() {
        String testString = "Test";
        String expected = "test";
        String actual = StringUtility.lowercaseString(testString);
        assertEquals(expected, actual);
    }
}
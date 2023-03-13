import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("My Test Class")
public class MyTestClass {
    Triangle triangle;
    CountWords countWords;
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        // Code executed before all test methods

    }

    @BeforeEach
    void setUp() throws Exception {
        // Code executed before each test method
        triangle = new Triangle();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        // Code executed after all test methods
    }

    @Test
    void testEquilateral() {
        assertEquals("Equilateral", triangle.getType(4,4,4));
    }
    @Test
    void testIsosceles() {
        assertEquals("Isosceles", triangle.getType(3,4,4));
    }

    @Test
    void testIsosceles2() {
        assertEquals("Isosceles", triangle.getType(4,4,5));
    }

    @Test
    void testScalene() {
        assertEquals("Scalene", triangle.getType(3,4,5));
    }
    @Test
    void testScalene2() {
        assertEquals("Scalene", triangle.getType(5,4,3));
    }

    @Test
    void testZeroLength() {
        assertEquals("Invalid", triangle.getType(0,4,3));
    }
}
package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Fibonacci(){

    int result = Fibonacci.fibonacci(9);
    assertEquals(21, result);
    }
}
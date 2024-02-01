package JavaTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1));
    }

    @Test
    public void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-3, mathUtils.subtract(1, 4));
    }

    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(-4, mathUtils.multiply(-2, 2));
    }

    @Test
    public void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2.5, mathUtils.divide(5, 2));
        assertEquals(-1.0, mathUtils.divide(5, 0));
    }
}


package test.com.recursion;

import com.recursion.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial1(){
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    public void testFactorial2(){
        assertEquals(2, Factorial.calculateFactorial(2));
    }

    @Test
    public void testFactorial3(){
        assertEquals(6, Factorial.calculateFactorial(3));
    }

    @Test
    public void testFactorial4(){
        assertEquals(24, Factorial.calculateFactorial(4));
    }

    @Test
    public void testFactorial5(){
        assertEquals(120, Factorial.calculateFactorial(5));
    }
}

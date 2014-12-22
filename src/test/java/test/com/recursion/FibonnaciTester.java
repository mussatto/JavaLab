package test.com.recursion;

import com.recursion.Fibonnaci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonnaciTester {
    // 1 1 2 3 5 8 13 21 34
    @Test
    public void testNumber5(){
       Integer value = Fibonnaci.getNumberAt(5);
       assertEquals(value, new Integer(5));
    }


    @Test
    public void testNumber8(){
        Integer value = Fibonnaci.getNumberAt(8);
        assertEquals(value, new Integer(21));
    }

    @Test
    public void testNumber1(){
        Integer value = Fibonnaci.getNumberAt(1);
        assertEquals(value, new Integer(1));
    }

    @Test
    public void testNumber2(){
        Integer value = Fibonnaci.getNumberAt(1);
        assertEquals(value, new Integer(1));
    }

}

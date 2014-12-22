package test.com;


import com.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassByValueTest {

    @Test
    public void testPassByValue(){
        Dog dog = new Dog("Max");
        changeDog(dog);

        assertEquals("Max", dog.getName());

    }

    @Test
    public void testPassByReference(){
        Dog dog = new Dog("Max");
        changeDogAttribute(dog);

        assertEquals("fifi", dog.getName());
    }

    @Test
    public void testPassByValuePrimitive(){
        int i = 1;

        sum(i);

        assertEquals(1, i);
    }

    private void changeDog(Dog dog){
        assertEquals("Max", dog.getName());
        dog = new Dog("fifi");
        assertEquals("fifi", dog.getName());

    }

    private void changeDogAttribute(Dog dog){
        dog.setName("fifi");
    }

    private void sum(int i){
        i = i+10;
    }
}

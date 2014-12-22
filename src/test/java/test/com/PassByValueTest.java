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

    private void changeDog(Dog dog){
        assertEquals("Max", dog.getName());
        dog = new Dog("fifi");
        assertEquals("fifi", dog.getName());

    }
}

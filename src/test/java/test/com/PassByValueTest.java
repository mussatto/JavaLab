package test.com;


import com.Dog;
import junit.framework.Assert;
import org.junit.Test;

public class PassByValueTest {

    @Test
    public void testPassByValue(){
        Dog dog = new Dog("Max");
        changeDog(dog);

        Assert.assertEquals("Max", dog.getName());

    }

    private void changeDog(Dog dog){
        Assert.assertEquals("Max", dog.getName());
        dog = new Dog("fifi");
        Assert.assertEquals("fifi", dog.getName());

    }
}

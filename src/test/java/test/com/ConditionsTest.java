package test.com;


import org.junit.Assert;
import org.junit.Test;

public class ConditionsTest {

    @Test
    public void testConditions(){
        boolean someValue=false;
        boolean bValue = (someValue=true);

        Assert.assertEquals(true, bValue);

        if(bValue=false){
            System.out.println("Its true");
        }else{
            System.out.println("Its false");
        }

        if(bValue=true){
            System.out.println("Its true");
        }else{
            System.out.println("Its false");
        }

        int i=0;

        int j = i=0;
    }
}

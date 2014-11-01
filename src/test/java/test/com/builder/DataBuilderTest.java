package test.com.builder;


import com.builder.DataBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DataBuilderTest {

    @Test
    public void testBuild(){
        int size = 1000;
        Long[] array = DataBuilder.buildVector(size);

        assertEquals("Array length should be 1000", size, array.length);

        for(Long item : array){
            if(item==null || item > DataBuilder.UPPER_RANGE || item< DataBuilder.LOWER_RANGE){
                fail("Should not be null, greater than upper range or lower than lower range");
            }
        }
    }
}

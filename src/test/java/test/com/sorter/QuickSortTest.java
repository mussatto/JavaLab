package test.com.sorter;

import com.builder.DataBuilder;
import com.sorter.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class QuickSortTest {

    @Test
    public void sortTest(){
        int size = 10;
        Long[] array = DataBuilder.buildVector(size);

        assertEquals("Array length should be 1000", size, array.length);

        for(Long item : array){
            if(item==null || item > DataBuilder.UPPER_RANGE || item< DataBuilder.LOWER_RANGE){
                fail("Should not be null, greater than upper range or lower than lower range");
            }
        }

        array = QuickSort.sort(array);
        for(Long item : array){
            System.out.println(item);
        }


    }
}

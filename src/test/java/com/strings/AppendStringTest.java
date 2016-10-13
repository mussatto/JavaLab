package com.strings;

import org.junit.Test;

import java.util.Date;

/**
 * Created by mussatto on 06/10/16.
 */
public class AppendStringTest {

    @Test
    public void TestConcatenateRightWrong() {
        AppendString appendString = new AppendString();
        Runtime runtime = Runtime.getRuntime();

        long starting = runtime.totalMemory();

        Date start = new Date();
        System.out.println("appendString.appendWrong()");
        appendString.appendWrong();
        Date end = new Date();
        long diff = end.getTime() - start.getTime();
        System.out.println("Delay wrong is " + diff);
        long current = runtime.totalMemory();
        System.out.println("Used memory "+ (starting - current));
        starting = runtime.totalMemory();

        start = new Date();
        System.out.println("appendString.appendRight()");
        appendString.appendRight();
        end = new Date();
        diff = end.getTime() - start.getTime();
        System.out.println("Delay right is " + diff);
        current = runtime.totalMemory();
        System.out.println("Used memory "+ (starting - current));
        starting = runtime.totalMemory();

        start = new Date();
        System.out.println("appendString.appendRightSync()");
        appendString.appendRightSync();
        end = new Date();
        diff = end.getTime() - start.getTime();
        System.out.println("Delay rightSync is " + diff);
        current = runtime.totalMemory();
        System.out.println("Used memory "+ (starting - current));
    }

    private void printMemoryStats(){
        System.out.println("-------------------------------------");
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Current memory stats: ");
        System.out.println("maxMemory -"+maxMemory);
        System.out.println("allocatedMemory -"+allocatedMemory);
        System.out.println("freeMemory -"+freeMemory);
    }
}

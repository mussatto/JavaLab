package com.executors;

import org.junit.Test;

import static junit.framework.TestCase.fail;

public class ExecutorsThreadTest {

    @Test
    public void TestRunSample() {
        ExecutorsThread thread = new ExecutorsThread();
        try {
            thread.runSample();
        } catch (InterruptedException e) {
            fail();
        }
    }

    @Test
    public void TestRunSample2() {
        ExecutorsThread thread = new ExecutorsThread();
        try {
            thread.runSample2();
        } catch (InterruptedException e) {
            fail();
        }
    }
}

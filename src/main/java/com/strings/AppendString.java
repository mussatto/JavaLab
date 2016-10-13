package com.strings;

/**
 * Created by mussatto on 06/10/16.
 */
public class AppendString {

    private static final int iterations = 100000000;

    public void appendRight(){
        StringBuilder builder = new StringBuilder(10000);
        for(int i = 0; i < iterations; i++){
            builder.append(RandomString.getRandomChar());
        }
    }

    public void appendRightSync(){
        StringBuffer builder = new StringBuffer(10000);
        for(int i = 0; i < iterations; i++){
            builder.append(RandomString.getRandomChar());
        }
    }

    public void appendWrong(){
        String starter = "";
        for(int i=0; i < 10000; i++){
            starter += RandomString.getRandomChar();
        }
    }
}

package com.inter;


import java.util.ArrayList;
import java.util.List;

public class CharSteam {

    private int position=0;

    private static List<String> stringList = new ArrayList<String>();

    public CharSteam(){
        stringList.add("aabbcceedd");
        stringList.add("fgghhiijjkk");
        stringList.add("llmmnnoopp");
        stringList.add("qqrrstsuuv");
        stringList.add("oxvxvxvvxvz");

    }

    public String getNext(){
        if(position<5){
            String value = stringList.get(position);
            position++;
            return value;
        }
        else{
            return null;
        }
    }

    public boolean hasNext(){
        if(position<5)
            return true;
        else
            return false;
    }
}

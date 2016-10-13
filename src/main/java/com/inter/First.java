package com.inter;

import java.util.*;

public class First {

    public static void main(String[] args){
        CharSteam charSteam = new CharSteam();

        List<Character> possible = new LinkedList<Character>();

        HashMap<Character, Integer> appearences = new HashMap<Character, Integer>();
        int it =0;
        while(charSteam.hasNext()){
            //System.out.println("1 iteration at "+it);
            char[] chars = charSteam.getNext().toCharArray();

            for(int i=0; i<chars.length;i++){
                //System.out.print("2 iteration at "+i);
                Integer count = appearences.get(chars[i]);
                if(count==null)
                    count=1;
                else
                    count++;
                appearences.put(chars[i],count);
            }
        }

        for(Map.Entry<Character, Integer> entry :appearences.entrySet()){
            if(entry.getValue()==1){
                System.out.println("===========");
                System.out.println(entry.getKey());
            }
        }
    }
}

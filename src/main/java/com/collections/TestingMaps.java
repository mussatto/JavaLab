package com.collections;

import java.util.HashMap;

class Key{
    private int hashcode;

    public Key(int hashcode){
        this.hashcode = hashcode;
    }

    @Override
    public int hashCode(){
        return hashcode;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Key){
            Key otherKey = (Key) o;
            return otherKey.hashCode() == this.hashcode;
        }
        return false;
    }


}

public class TestingMaps {

    public static void main(String[] args){
        HashMap<Key, String> map = new HashMap<Key, String>();
        Key key = new Key(1);
        map.put(key, "One");

        Key key2 = new Key(2);
        map.put(key2, "Two");

        //Should override now, equals uses hash
        Key key3 = new Key(1);
        map.put(key3,"One Again");

        System.out.println(map.get(key));
    }
}

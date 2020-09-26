package com.Madina;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
    public static void main(String[] argh) {
        MapSum obj = new MapSum();
        obj.insert("apple", 3);
        int param_2 = obj.sum("app");
        obj.insert("app", 2);
        System.out.println(obj.sum("ap"));
    }
}


class MapSum {

    /** Initialize your data structure here. */
    Map<String, Integer> map;
    public MapSum() {
        map = new HashMap();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        Pattern pattern = Pattern.compile(prefix);
        int sum = 0;

        for(Map.Entry mapElement : map.entrySet()){
            String key = (String) mapElement.getKey();
            int val = (int) mapElement.getValue();

            Matcher m = pattern.matcher(key);

            if(m.find())
                sum += val;
        }

        return sum;
    }
}

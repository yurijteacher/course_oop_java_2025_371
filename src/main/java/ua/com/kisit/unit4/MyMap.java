package ua.com.kisit.unit4;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        // Map<Key, String>
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C");
        map.put(4,"C++");
        map.put(5,"C#");
        System.out.println(map);


        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +". "+entry.getValue());
        }

        map.put(5,"JavaScript");
        System.out.println(map.get(5));

        map.remove(5);
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +". "+entry.getValue());
        }
    }


}

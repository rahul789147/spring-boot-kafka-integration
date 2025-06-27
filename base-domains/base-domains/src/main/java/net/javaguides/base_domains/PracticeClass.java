package net.javaguides.base_domains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(11);
        list.add(12);

        String str = "This is a new string";

        List<Integer> newList = list.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
        System.out.println(newList);

        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" +entry.getValue());
        }
    }
}

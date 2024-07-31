package org.example;

import java.util.HashMap;

public class PrintMeMyHashMap {
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("first", "1st");
        hashmap.put("second", "2nd");
        hashmap.put("third", "3rd");

        printKeys(hashmap);
        printKeysWhere(hashmap, "ir");
        printValuesOfKeysWhere(hashmap, "ir");
    }
}

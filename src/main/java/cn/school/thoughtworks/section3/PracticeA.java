package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> ss = object.get("value");
        collectionA.keySet().forEach(s -> {
            if (ss.contains(s)) {
                Integer count = collectionA.get(s) - 1;
                collectionA.put(s, count);
            }
        });
        return collectionA;
    }
}

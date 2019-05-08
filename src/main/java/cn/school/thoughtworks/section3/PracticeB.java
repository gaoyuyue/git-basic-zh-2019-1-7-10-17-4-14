package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> ss = object.get("value");
        collectionA.keySet().forEach(s -> {
            if (ss.contains(s)) {
                Integer count = collectionA.get(s);
                Integer sub = count / 3;
                collectionA.put(s, count - sub);
            }
        });
        return collectionA;
    }
}

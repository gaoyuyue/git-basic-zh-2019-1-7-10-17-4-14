package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = collectionA.stream().reduce(new HashMap<>(), (acc, s) -> {
            updateMap(acc, s);
            return acc;
        }, (acc, item) -> {
            acc.putAll(item);
            return acc;
        });

        List<String> ss = object.get("value");
        collection3.keySet().forEach(s -> {
            if (ss.contains(s)) {
                Integer count = collection3.get(s);
                Integer sub = count / 3;
                collection3.put(s, count - sub);
            }
        });

        return collection3;
    }

    private void updateMap(HashMap<String, Integer> acc, String s) {
        int num = 1;
        if (acc.containsKey(s)) {
            num = acc.get(s) + 1;
        }
        acc.put(s, num);
    }
}

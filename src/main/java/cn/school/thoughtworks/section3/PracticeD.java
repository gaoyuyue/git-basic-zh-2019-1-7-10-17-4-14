package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = collectionA.stream().reduce(new HashMap<>(), (acc, s) -> {
            int count = 1;
            String[] ss = s.split("-");
            if (ss.length == 2) {
                s = ss[0];
                count = Integer.parseInt(ss[1]);
            }
            updateMap(acc, s, count);
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

    private void updateMap(HashMap<String, Integer> acc, String s, int count) {
        if (acc.containsKey(s)) {
            count = acc.get(s) + count;
        }
        acc.put(s, count);
    }
}

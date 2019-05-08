package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        return collection1.stream().reduce(new HashMap<>(), (acc, s) -> {
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
    }

    private void updateMap(HashMap<String, Integer> acc, String s, int count) {
        if (acc.containsKey(s)) {
            count = acc.get(s) + count;
        }
        acc.put(s, count);
    }
}

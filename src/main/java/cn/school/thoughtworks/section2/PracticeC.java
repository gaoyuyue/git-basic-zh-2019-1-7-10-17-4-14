package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Parser parser = new Parser();
        parser.addRule(new HyphenRule());
        parser.addRule(new ColonRule());
        parser.addRule(new BracketRule());
        return collection1.stream().reduce(new HashMap<>(), (acc, s) -> {
            KV kv = parser.parse(s);
            updateMap(acc, kv.getKey(), kv.getValue());
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

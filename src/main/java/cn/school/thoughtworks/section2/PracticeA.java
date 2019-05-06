package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        return collection1.stream().reduce(new HashMap<>(), (acc, s) -> {
            int num = 1;
            if (acc.containsKey(s)) {
                num = acc.get(s) + 1;
            }
            acc.put(s, num);
            return acc;
        }, (acc, item) -> {
            acc.putAll(item);
            return acc;
        });
    }
}

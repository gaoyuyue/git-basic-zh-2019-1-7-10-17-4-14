package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        return collection1.stream().filter(s -> collection2.getOrDefault("value", new ArrayList<>()).contains(s))
                .collect(Collectors.toList());
    }
}

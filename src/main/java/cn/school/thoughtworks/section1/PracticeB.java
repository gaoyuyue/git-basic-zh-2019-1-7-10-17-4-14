package cn.school.thoughtworks.section1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        return collection1.stream().filter(s ->
                collection2.stream().flatMap(Collection::stream)
                        .distinct()
                        .collect(Collectors.toList())
                        .contains(s))
                .collect(Collectors.toList());
    }
}

package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public KV parse(String content) {
        for (Rule rule : rules) {
            KV kv = rule.tryExecute(content);
            if (kv != null) return kv;
        }
        return new KV(content, 1);
    }
}

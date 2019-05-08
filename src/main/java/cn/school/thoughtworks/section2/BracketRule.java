package cn.school.thoughtworks.section2;

public class BracketRule implements Rule {
    @Override
    public KV tryExecute(String content) {
        String[] ss = content.split("\\[");
        if (ss.length == 2) {
            String[] counts = ss[1].split("]");
            if (counts.length != 1) {
                return null;
            }
            int count = Integer.parseInt(counts[0]);
            return new KV(ss[0], count);
        }
        return null;
    }
}

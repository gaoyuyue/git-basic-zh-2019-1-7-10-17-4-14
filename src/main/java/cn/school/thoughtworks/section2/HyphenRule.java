package cn.school.thoughtworks.section2;

public class HyphenRule implements Rule {
    @Override
    public KV tryExecute(String content) {
        String[] ss = content.split("-");
        if (ss.length == 2) {
            int count = Integer.parseInt(ss[1]);
            return new KV(ss[0], count);
        }
        return null;
    }
}

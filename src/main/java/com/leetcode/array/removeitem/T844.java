package com.leetcode.array.removeitem;

public class T844 {

    public boolean backspaceCompare(String s, String t) {
        System.out.println(build(s));
        System.out.println(build(t));
        return build(s).equals(build(t));
    }

    public String build(String s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

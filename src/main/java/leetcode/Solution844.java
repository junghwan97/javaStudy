package leetcode;

import java.util.Stack;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        char[] arr1 = s.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != '#') {
                stack1.push(arr1[i]);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        String str1 = stack1.toString();

        char[] arr2 = t.toCharArray();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != '#') {
                stack2.push(arr2[i]);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        String str2 = stack2.toString();

        if (str1.equals(str2)){
            return true;
        }else
            return false;

//        Stack<String> stack1 = new Stack<>();
//
//        String s1 = stack1.push(s);
//        if (s1.equals("#")) {
//            stack1.pop();
//            stack1.pop();
//        }
//
//        Stack<String> stack2 = new Stack<>();
//        String s2 = stack2.push(t);
//        if (s2.equals("#")) {
//            stack2.pop();
//            stack2.pop();
//        }
//
//        if (s1 == s2) {
//            return true;
//        } else {
//            return true;
//        }
    }
}

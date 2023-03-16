package ch15.lecture.p06stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        //LIFO : (last in first out) ,후입 선출, stack
        // 주요 메서드
        // push : 새 아이템 추가
        // pop : 아이템 꺼내기(삭제)

        Stack<String> stack = new Stack<>();

        stack.push("backho");
        stack.push("chisoo");
        stack.push("taesup");
        stack.push("daeman");
        stack.push("taewoong");

        System.out.println(stack.size());

        String s1 = stack.pop();
        System.out.println(s1);
        System.out.println();

        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}

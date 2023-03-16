package ch15.lecture.p05queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // offer : 새 아이템 삽입
        queue.offer("kang");

        // poll : 기존 아이템 꺼낸 후 삭제 (선입선출)
        String s1 = queue.poll();

        System.out.println(queue.size());
        System.out.println(s1);

        queue.offer("chae");
        queue.offer("song");
        queue.offer("jeong");
        queue.offer("seo");
        System.out.println(queue.size());

        String s2 = queue.poll();
        System.out.println(s2);
        System.out.println(queue.size());

        while(queue.size() > 0){
            System.out.println(queue.poll());
        }
    }
}

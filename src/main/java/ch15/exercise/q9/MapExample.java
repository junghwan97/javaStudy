package ch15.exercise.q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int minScore = 0; // 점수 합계를 저장하는 변수
        int sum = 0;
        int count = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int val = entry.getValue();
            if (maxScore < val) {
                maxScore = val;
                name = entry.getKey();
            }
            sum += val;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println(name);
        System.out.println(maxScore);
        System.out.println(avg);


    }
}

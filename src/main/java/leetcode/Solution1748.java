package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {

        //  여러번 나온 키 n에 value를 1씩 추가
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                int oldValue = map.get(n);
                map.put(n, oldValue + 1);
            } else {
                map.put(n, 1);
            }
//            map.putIfAbsent(n, 0);
//            int oldValue = map.get(n);
//            map.replace(n, oldValue + 1);
        }
        // value가 1인 키들의 합을 구하기
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                int num = entry.getKey();
                sum += num;
            }
        }
        return sum;
    }
}

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // 각 값이 몇개인지 세는 코드
        for (int n : nums) {
            if (map.containsKey(n)) {
                // 키 n의 value를 1 더해서 다시 entry에 넣는다.
                int oldValue = map.get(n);
                map.put(n, oldValue + 1);

            } else {
                map.put(n, 1);
            }
        }

        // value가 홀수인 것이 있으면 return false;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//            int v = entry.getValue();
//            if (v % 2 == 1){
//                return false;
//            }
//        }
//        return true;
        return map.values()
                .stream()
//                .allMatch(e -> (e % 2) == 1);
                .allMatch(this::even);
    }

    private boolean even(int e) {
        return (e % 2) == 0;
    }
}

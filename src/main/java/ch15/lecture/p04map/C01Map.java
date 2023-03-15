package ch15.lecture.p04map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map
        // (key, value) 쌍 entry를 저장
        // key는 중복되지 않음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("kang", "slamdunk");
        map.put("serly", "avatar");
        map.put("maverick", "topgun");

        // entry의 수
        int size = map.size();
        System.out.println(size);

        map.put("kang", "basketball");
        System.out.println(size);

        // key로 value 얻기
        String k1 = map.get("serly");
        String k2 = map.get("kang");
        String k3 = map.get("maverick");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        // entry 지우기
        map.remove("kang");
        System.out.println(map);

        // 전체 탐색
        System.out.println("keySet 사용 $$$$$$$$$$$$$$$$$$$$$");
        Set<String> keys = map.keySet(); // 키 set 얻기
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("foreach 메서드 $$$$$$$$$$$$$$$$$$$$$$$$$$");
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("entrySet 메서드$$$$$$$$$$$$$$$$$$$$$$$$$");
        Set<Map.Entry<String, String>> entries = map.entrySet();
       for (Map.Entry<String, String> entry : entries){
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }

    }
}


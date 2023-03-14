package ch16.lecture.p04type_inference;

import java.util.ArrayList;
import java.util.List;

public class C02TypeInference {
    // 지역변수만 가능
//    var field = 3;


    public static void main(String[] args) {
        // 지역변수 타입 추론
        // var 사용
        // 선언과 동싱에 초기화할 때만 사용 가능

        int a = 3;
        String b = "java";

        var c = 5;
        var d = "hello";

//        var e;
//        e = 9;

        Box<String> box1 = new Box<String>();
        Box<String> b0x2 = new Box<>();
        var box3 = new Box<String>();

        var list1 = new ArrayList<List<String>>();

        // 재할당시 같은 타입만 가능
        var f = 10; // int로 추론
//        f = 3.14;// x


        // var 사용시 읽기 쉬운 코드인지 고민해볼것
        var list2 = new ArrayList<String>();
        // 긴 코드....

        for (String item : list2){
        }

        // 권장하지 않음
        for (var item : list2){

        }

        // var는 키워드가 아님
        int var = 3; // 사용 가능하지만 변수명으로 부적절

    }

}

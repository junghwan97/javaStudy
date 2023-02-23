package codeTest.programmers;

public class Solution120812 {

        public static void main(String[] args){
            // 1. 입력
            int[] data = { 1,3,4,4,1 };
            int mode = 0;  // 최빈값
            int[] index = new int[data.length]; // data의 인덱스 카운터
            int max = Integer.MIN_VALUE; // 최대값을 저장하기위한 변수 : 초기값은 정수형의 최소값 지정
            // 2. process
            for(int i=0;i<data.length;i++){
                index[data[i]]++; // count // 0.2.0.1.2
            }
            for(int i=0;i<index.length;i++){
                if(max<index[i]){
                    max = index[i];
                    mode = i;
                }
            }
            System.out.println("최빈값 : " + mode + " , " + max + "번");
        }
    }


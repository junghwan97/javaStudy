package ch05.lecture.p04string;

public class C03Split {
    public static void main(String[] args) {
        // split method
        //특정 문자패턴으로 문자열을 나누어서 배열로 리턴
        String str1 = "hello,java,world,html,css";
        String[] arr = str1.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr.length);
        System.out.println();
        String str2 = "spring react vue angular jsp sass";
        String[] arr2 = str2.split(" ");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        System.out.println(arr2[5]);
        System.out.println(arr2.length);
        System.out.println();
        String str3 = "I'm ironman.";
        String[] arr3 = str3.split("");
        for (int i = 0; i < str3.length(); i++){
            System.out.println(arr3[i]);
        }
    }
}

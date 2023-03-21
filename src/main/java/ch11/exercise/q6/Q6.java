package ch11.exercise.q6;

public class Q6 {
    public static void main(String[] args) {
    String[] strArr = {"10", "2a"};
    int value = 0;
    for(int i =0; i <= strArr.length; i++){
        try {
            value = Integer.parseInt(strArr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스를 초과했음");
        }catch (NumberFormatException e){
            System.out.println("숫자로 변활할 수 없음");
        }finally {
            System.out.println(value);
        }
    }

    }

}

package ch11.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] strArr = {"100", "1oo"};
        for (int i =0; i <= strArr.length; i++){
            try {
                int value = Integer.parseInt(strArr[i]);
                System.out.println("strArr[" + i + "]: " + value);
            }catch (IndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨 " + e.getMessage());
            }catch (Exception e){
                System.out.println("실행에 문제가 있습니다.");
            }
        }
    }
}

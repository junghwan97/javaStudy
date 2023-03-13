package ch16.sec02.exam02;

//700(lambda) - > 420(anonymous) -> 412(concrete class)
public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(()-> System.out.println("Ok 버튼을 클릭했습니다."));

        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()-> System.out.println("Cancel 버튼을 클릭했습니다."));

        btnCancel.click();
    }
}

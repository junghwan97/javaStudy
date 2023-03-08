package ch07.exercise.q11;

public class MainActivity extends Activity{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }

    public static void main(String[] args) {
        MainActivity o1 = new MainActivity();
        o1.onCreate();
    }
}

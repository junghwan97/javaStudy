package ch13.exercise.q3;



public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job1 = container1.getValue();

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container1.getKey();
        String age = container1.getValue();
    }
}

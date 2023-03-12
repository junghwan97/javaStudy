package ch13.lecture.p02wildcard;

public class C05WildCard {
    public static void main(String[] args) {
        MyClass05<Object> o1 = new MyClass05<>();
        addItem(o1);

        MyClass05<Number> o2 = new MyClass05<>();
        addItem(o2);

        MyClass05<Integer> o3 = new MyClass05<>();
//        addItem(o3);
    }
        public static void addItem(MyClass05<? super Number> param){

        // out
        param.setItem(3);
        param.setItem(3.14);

    }
}

class MyClass05<T> {
    public T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
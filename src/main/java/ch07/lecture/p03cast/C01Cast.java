package ch07.lecture.p03cast;


public class C01Cast {
    public static void main(String[] args) {
        Animal a1 = (Horse)new Horse(); // upCasting
        a1.breath();
        Horse h1 = (Horse)a1; // downCasting
        h1.run();
        System.out.println();
        Animal a2 = new Fish();
        a2.breath();
        Fish f1 = (Fish)a2;
        f1.swim();
    }
}

class Animal {
    public void breath() {
        System.out.println("호흡한다.");
    }
}

    class Horse extends Animal {
        @Override
        public void breath() {
            System.out.println("폐로 호흡한다.");
        }
        public void run(){
            System.out.println("달리다");
        }
    }

    class Fish extends Animal {
        @Override
        public void breath() {
            System.out.println("아가미로 호흡한다.");
        }
        public void swim(){
            System.out.println("헤엄치다.");
        }
    }

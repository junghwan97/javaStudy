package ch08.sec05;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            System.out.println("현재 TV 볼륨 : 0");

        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 TV 볼륨 : " + volume);
    }
}

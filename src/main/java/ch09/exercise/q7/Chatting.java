package ch09.exercise.q7;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage(String message) {
        }
    }

    void startChat(String chatId) {
        String nickName = "nick";
//        nickName = chatId;

        Chat chat = new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" +  nickName + "] " + inputData; // nickName은 중첩 클래스 안에서 사용되기 때문에 final 특성을 갖게 된다.
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}

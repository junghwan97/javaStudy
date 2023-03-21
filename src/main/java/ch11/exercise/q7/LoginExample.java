package ch11.exercise.q7;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String pw) throws NoneExistIDException, WrongPasswordException{
        if (!id.equals("blue")){
//            System.out.println("아이디가 존재하지 않습니다.");
        throw new NoneExistIDException(id + "가 존재하지 않습니다.");
        }
        if (!pw.equals("12345")){
//            System.out.println("패스워드가 틀립니다.");
        throw new WrongPasswordException(pw + "가 틀립니다.");
        }
    }
}

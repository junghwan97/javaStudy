package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
    public static void main(String[] args) {
        // unchecked Exception
        try {
            String a = "java";
            System.out.println(a.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

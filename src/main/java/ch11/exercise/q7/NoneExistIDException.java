package ch11.exercise.q7;

public class NoneExistIDException extends Exception {
    public NoneExistIDException() {}

    public NoneExistIDException(String message){
        super(message);
    }
}

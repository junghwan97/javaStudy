package ch15.exercise.q7;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

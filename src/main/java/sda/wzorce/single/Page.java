package sda.wzorce.single;

import java.util.Objects;

public class Page {

    private int number;
    private String content;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return number == page.number &&
                Objects.equals(content, page.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, content);
    }
}

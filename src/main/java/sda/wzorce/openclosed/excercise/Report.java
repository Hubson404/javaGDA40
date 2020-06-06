package sda.wzorce.openclosed.excercise;

import java.util.Date;

public class Report {

    String author;
    String title;
    Date date;
    String content;

    public Report(String author, String title, Date date, String content) {
        this.author = author;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

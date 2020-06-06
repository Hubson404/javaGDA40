package sda.wzorce.single;

import java.util.Date;
import java.util.List;

class Book {

    private String title;
    private String author;
    private String isbn;
    //Date publishDate;
    private List<Page> pages;

    private BookPrinter bookPrinter;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Page getPageByNumber(int pageNumber) {
        for (Page page : pages) {
            if(page.getNumber() == pageNumber) {
                return  page;
            }
        }
        return null;
    }

}
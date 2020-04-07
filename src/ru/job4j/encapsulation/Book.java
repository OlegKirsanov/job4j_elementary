package ru.job4j.encapsulation;

public class Book {
    private String name;
    private int pageNum;

    public Book(String name, int pageNum) {
        this.name = name;
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}

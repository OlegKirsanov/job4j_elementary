package ru.job4j.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("War And Peace", 1200);
        Book book2 = new Book("Clean Code", 234);
        Book book3 = new Book("East Express", 329);
        Book book4 = new Book("Old Man And The Sea", 35);

        Book[] book = new Book[4];
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;
        book[3] = book4;

        for(int index = 0; index < book.length; index++) {
            System.out.println(book[index].getName() + " – " + book[index].getPageNum());
        }
        Book temp = new Book("", 0);
        temp = book[0];
        book[0] = book[3];
        book[3] = temp;

        for(int index = 0; index < book.length; index++) {
            System.out.println(book[index].getName() + " – " + book[index].getPageNum());
        }

        for(int index = 0; index < book.length; index++) {
            if(book[index].getName().equals("Clean Code")) {
                System.out.println(book[index].getName() + " – " + book[index].getPageNum());
            }
        }
    }
}

package com.carriedo.section01.object;

import com.carriedo.section01.object.book.Book;

public class Application1 {
    public static void main(String[] args) {

        Book book1 = new Book(1,"홍길동전1","허균1",50000);
        Book book2 = new Book(2,"홍길동전2","작가2",30000);
        Book book3 = new Book(3,"홍길동전3","작가3" ,30000);

        System.out.println("book1 = "+book1);
        System.out.println("book2 = "+book2);
        System.out.println("book3 = "+book3);
    }
}

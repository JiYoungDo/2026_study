package com.carriedo.section01;

import com.carriedo.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Aookication3 {
    public static void main(String[] args) {

        Map<Book,String> map = new HashMap<>();
        map.put(new Book(1,"홍길동전1","허균1",50000), "sold");
        System.out.println(map); // toString 오버라이딩 해서 표현 가능

        Book key = new Book(1,"홍길동전1","허균1",50000);
        String value = map.get(key);
        System.out.println("value " +value);

    }
}

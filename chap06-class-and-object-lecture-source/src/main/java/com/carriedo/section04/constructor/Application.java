package com.carriedo.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        User user = new User(); // 객체 생성.
        System.out.println(user.getInfo());

        User user2 = new User("user01","user02");
        System.out.println(user2.getInfo());

        User user3 = new  User("user02","pass02","ppopo",new Date());
        System.out.println(user3.getInfo());

    }
}

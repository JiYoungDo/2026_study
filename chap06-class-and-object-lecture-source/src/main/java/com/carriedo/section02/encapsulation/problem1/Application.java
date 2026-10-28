package com.carriedo.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        Monster m1 = new Monster();
        m1.setName("Doochi");
        m1.setHp(200);
        System.out.println(m1.toString());


        Monster m2 = new Monster();
        m2.setName("Fookoo");
        m2.setHp(-200);
        System.out.println(m2.toString());
    }
}

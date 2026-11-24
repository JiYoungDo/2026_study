package com.carrideo.section01.ocp.example;

import java.util.ArrayList;

public class Application9 {
    public static void main(String[] args) {
        ArrayList<Beverage> beverages = new ArrayList<>();

        beverages.add(new Americano());
        beverages.add(new Latte());
        beverages.add(new GreenTea());

        Cashier cashier = new Cashier();
        for(Beverage b:beverages){
            System.out.println(b.getName()+ "가격 : "+b.getPrice());
        }
        System.out.println("주문 합계 : " + cashier.total(beverages));
    }
}

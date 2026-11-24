package com.carrideo.section01.ocp.example;

import java.util.ArrayList;
import java.util.List;

public class Application8 {



    public static void main(String[] args) {

        List<Beverage> beverageList = new ArrayList<>();
        beverageList.add(new Americano());
        beverageList.add(new Americano());
        beverageList.add(new Americano());
        beverageList.add(new Americano());

        beverageList.add(new Latte());
        beverageList.add(new Latte());
        beverageList.add(new Latte());
        beverageList.add(new Latte());

        Cashier cashier = new Cashier();
        for(Beverage b:beverageList){
            System.out.println(b.getName()+ "가격 : "+b.getPrice());
        }
        System.out.println(cashier.total(beverageList));

    }
}

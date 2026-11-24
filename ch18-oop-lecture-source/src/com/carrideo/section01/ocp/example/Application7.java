package com.carrideo.section01.ocp.example;

public class Application7 {
    public static void main(String[] args) {
        String[] menus = {"아메리카노", "카페라떼", "아메리카노"};

        int total = 0;
        for(String m: menus){
            total = total +priceOf(m);
        }

        System.out.println("주문 합계 " +total);
    }

    private static int priceOf(String m) {
        if(m.equals("아메리카노")){
            return 4500;
        }else if(m.equals("카페라떼")){
            return 5000;
        }
        return 0;
    }

}

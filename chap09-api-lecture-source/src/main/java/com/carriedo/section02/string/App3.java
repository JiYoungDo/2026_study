package com.section02.string;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        String emp1 = "100/홍길동/서울/영업부";
        String[] empArr1 = emp1.split("/");
        System.out.println(Arrays.toString(empArr1));

        String[] empArr2 = emp1.split("/",2);
        System.out.println(Arrays.toString(empArr2));
    }
}

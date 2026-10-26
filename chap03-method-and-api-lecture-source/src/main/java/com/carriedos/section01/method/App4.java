package com.carriedos.section01.method;

public class App4 {
    public static void main(String[] args) {
        // 이름, 나이, 성별 입력 받아서 "당신의 이름은 xx이고, 나이는 xx세 이며, 성별은 xx 입니다
        App4 app = new App4();
        app.testMethod("홍길동", 30, '여');

        String name = "신사임당";
        int age = 50;
        char gender = '여';
        app.testMethod(name,age,gender);
    }

    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은" +name +"이고 나이는" +age+" 이며 성별은"+gender+ "이다");

    }
}

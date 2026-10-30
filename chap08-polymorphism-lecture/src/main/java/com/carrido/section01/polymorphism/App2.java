package com.carrido.section01.polymorphism;

public class App2 {
    public static void main(String[] args) {
        // 다형성을 적용하면 객체배열이 굉장히 풍성해진다.
        // 예로, 이전에는 래빗이면 래빗 카면 카만 됬는데, 이젠 상속받은 애면 다 받을 수 있는거.
        // 시작은 상위 타입으로 해야겠징

        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit(); // 다형성(업캐스팅)
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /**
         * Animal클래스가 가지는 메소드를 오버라이딩한 메소드 호출
         * 동적바인딩을 이용하여 출력**/
        for(int i=0; i<animals.length; i++){
            animals[i].cry();
        }

        for(int i=0; i<animals.length; i++){
            if(animals[i] instanceof Rabbit){
                ((Rabbit)animals[i]).jump();
            }else if(animals[i] instanceof  Tiger){
                ((Tiger)animals[i]).bite();
            }else{
                System.out.println("토끼도 아니구 호랑이도 아니구!");
            }
        }

    }
}

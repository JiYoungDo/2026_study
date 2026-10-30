package com.carrido.section01.polymorphism;

public class App3 {
    public static void main(String[] args) {

        App3 app3 = new App3();

        Animal animal = new Rabbit(); // Animal
        Animal animal1 = new Tiger(); // Animal

        app3.feed(animal); // 동일한 타입이기에
        app3.feed(animal1);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app3.feed(rabbit); //업캐스팅
        app3.feed(tiger);




    }


    //public void feed(Rabbit r){}
    //public void feed(Tiger r){}
    public void feed(Animal animal){
        animal.eat(); // 동적 바인딩
    }
}

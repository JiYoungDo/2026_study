package com.carrido.section01.polymorphism;

public class App4 {
    public static void main(String[] args) {
       App4 app4 = new App4();
       Animal randomAnimal = app4.getRandomAnimal();
       randomAnimal.cry();
    }

    public Animal getRandomAnimal(){
        int random = (int) (Math.random()*2);
        System.out.println("Random Animal: "+random);
        return (random==0)?new Rabbit() :new Tiger();
    }
}

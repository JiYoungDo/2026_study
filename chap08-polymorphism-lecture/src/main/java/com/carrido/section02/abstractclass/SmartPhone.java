package com.carrido.section02.abstractclass;

public class SmartPhone extends Product{
    @Override
    public void abstMethod() {
        System.out.println("Product클래스의 abstMethod 오버라이딩 한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드");
    }
}

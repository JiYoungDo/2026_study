package com.carriedo.section03.abstraction;

public class CarRacer {

    // CarRacer는 Car라는 객체의 존재를 알고있어야 한다. (== 소유하고 있다.) ⭐️Has-a관계(포함관계)
    private final Car car = new Car();
    private String name;
    private String gender;
    private String grade;
    /** ⭐ Car 클래스의 인스턴스를 멤버변수로 소유하고 있다.
     * --> CarRacer는 자동차의 기능을 직접 수행하는 것이 아니라
     * 자신이 소유한 Car객체에 기능을 위임하고 있다.
     * has-a관계(포함관계)
     *
     * fianl 붙은 이유 :  한번 생성된 객체는 다신 건들지 말라는 의미 . 유지보수 관련된 필요성.
     * 개발자도 모르게 car = new Car(); 처럼 변수에 새로운 객체를 덮어씌우는 실수를 방지할 수 있습니다.*/

    public void startUp(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }



}

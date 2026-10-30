package com.carrido.section01.polymorphism;

public class App1 {
    public static void main(String[] args) {
        /**
         * 다형성
         * : 하나의 인스턴스가 여러가지 타입을 가질 수 있다는 것을 의미함.
         */

        System.out.println("====Animal 생성====");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("====Tiger 생성====");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("====Rabbit 생성====");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();



        /**
         * Rabbit 과 Tiger는 Animal 클래스를 상속받았다.
         * Rabiit 은 Rabbit 타입이기도 하면서 Animal 이기도 하다.
         * Tiger은 Tiger타입이기도 하면서 Animal 타입이기도 하다.
         * **/

        /** 부모 타입으로 자식 인스턴스 수조값을 저장*/
        Animal animal1 = new Tiger();
        Animal animal2 = new Rabbit();

        animal1.cry(); // 호랭이거
        animal2.cry(); // 토끼거

        /**대입연산자를 기준으로 타입이 맞아야 하니까.. 다형성?
         * 레퍼런스 자료형이 Animal이기 대문에 사실상 Animal 클래스만 접근 가능하다.
         * 단 Animal을 Tiger로 형변환 다운캐스팅 하면 Tiger에도 접근 가능 */



        /** 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여
         * Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다.
         * class type casting : 클래스 형변환.\
         * ----->>> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         *
         * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
         * up-casting : 상위 타입으로 형변환
         * down-casting : 하위 타입으로 형변환 */
        Animal animal3 = new Rabbit(); // 업캐스팅 (자식이 부모쪽 으로 들어간 상황) - 묵시적 형변환
        Animal animal4 = (Animal) new Rabbit(); // 업캐스팅 (명시적 형변환) - 명시적으로 쓸때는 생략해도 가능하다.

        Rabbit rabbit1 = (Rabbit) animal3; // Animal -> Rabbit 다운캐스팅 , 다운 캐스팅은 묵시적 형변환 안됨!
        // 다운 캐스팅 하면 자식걸 쓸 수 있다.

        /** instance of 연산자 사용
         * 레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는 비교하는 연산자*/
        System.out.println("instanceof 확인 -----------");
        System.out.println("animal1 Tiger 타입인지 : "+ (animal1 instanceof Tiger) );
        System.out.println("animal1 Rabbit 타입인지 : "+ (animal1 instanceof Rabbit) );
        System.out.println("animal1 Animal 타입인지 : "+ (animal1 instanceof Animal) );
        System.out.println("animal1 Object 타입인지 : "+ (animal1 instanceof Object) );



    }
}

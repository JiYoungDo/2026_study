package com.carridos.section01.extend;

public class FireCar extends Car {

    /**
     * Car 클래스의 모든 멤버(필드, 매소드)를 상속 받을 수 있다.
     * 단, 생성자는 상속받지 못한다.
     * **/

    public FireCar(){
        /**
         * 모든 생성자 맨 첫줄에 super()를 컴파일러가 자동으로 추가한다.
         * 부모의 기본생성자를 호출하는 구문으로 명시적, 묵시적으로 사용가능하다.
         * **/
        super(); // 슈퍼생성자. Car로 감.
        System.out.println("FireCar 클래스 기본생성자 호출.");
    }


    // 부모가 준거를 내것처럼 다시 재작성하는 것 오버라이딩.
    /** soundHorn 메소드 재작성 : overriding
     * @Override 어노테이션: 오버라이딩 성립요건을 체크하여 성립되지 않는 경우 컴파일에러 발생.
     * cmd + ins + n **/

    @Override
    public void soundHorn() {
        /**
         * 👻 private 접근제어자가 붙은 필드는 상속은 받지만 자식이 접근할 수 없다.
         * 👻 protexted 로 변경하면 자식이 접근할 수 있다.
         * **/

        if(isRunning()){
            System.out.println("빠아아아아앙아!!!!!!!빠아앙아아!!");
        }else{
            System.out.println("소방차가 앞으로 갈 수 엇습니다. 비키세요. 안 비키면 밀어버립니다.");
        }
    }

    /** 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가 기능도 작성 가능하다.*/
    public void sprayWater(){
        System.out.println("물을 뿌립니다. 💦💦💦");
    }

}

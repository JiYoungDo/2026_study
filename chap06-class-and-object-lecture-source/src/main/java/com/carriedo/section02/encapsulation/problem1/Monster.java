package com.carriedo.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    /** this 는 생성 딱 했을 때 그 객체의 주소값.
     * 인스턴스 변수가 생성 되었을 때 자신의 주소를 저장하는 레퍼런스 주소*/

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this 가 들어가는 이유, 우선순위로 본다면 지역이 먼저기 때문엥
        // 현재메서드(또는 생성자)가 호출된 그 객체 자신을 가리키는 참조 변수이다.
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp>0){
            this.hp = hp;
            System.out.println("양수값 입력으로 몬스터 체력 입력값으로 변경");
        }else{
            this.hp =0;
            System.out.println("음수값 입력으로 몬스터의 체력 0으로 변경");
        }

    }
}

package com.carriedo.section02.encapsulation.problem3;

public class Monster {
    /** 경우에 따른. 직접접근 막기
     * 접근제한자
     * 클래스 혹은 클래스의 멤버(필드, 메서드) 에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
     * public : 프로젝트 전체
     * protected : 같은 패키지 + (상속받은 경우) 다른 패키지의 자식 클래스
     * default : 오직 '같은 패키지' 내부에서만
     * private : 오직 '기존의 그 클래스' 내부에서만
     * 단 클래스 선언시에는 public, default만 사용가능
     * **/

    private String kinds;
    private int hp;


    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

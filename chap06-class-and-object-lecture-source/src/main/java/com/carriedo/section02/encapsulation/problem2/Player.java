package com.carriedo.section02.encapsulation.problem2;

public class Player {
    String name; // 만약 name을 kind로 바꾸면 직접 접근시 에러날것임 그래서 게터세터 쓰는거.(즉 직접접근 금지)
    int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

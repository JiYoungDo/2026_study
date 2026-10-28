package com.carriedo.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        /** 필드에 직접 접근시 발생할 수 있는 문제점 이해 */


        /**
         * 필드에 직접 접근하면 필드의 변경 발생시 사용한 코드를 모두 수정해야 한다.
         * 이는 유지보수적인 측면에서 악영향을 끼친다. */

        Player p1 = new Player();
        p1.setName("doookki");
        p1.setHp(100);

        Player p2 = new Player();
        p2.setName("koki");
        p2.setHp(50);



    }
}

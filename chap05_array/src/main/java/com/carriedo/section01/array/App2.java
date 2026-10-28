package com.carriedo.section01.array;

public class App2 {
    public static void main(String[] args) {

        // 배열의 선언 : stack에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것.
        int[] iarr ;
        double[] darr;

        iarr = new int[5]; // int 값을 5개 관리하기 위한 공간을 만들었다.
        darr = new double[5];

        for(int i:iarr){
            System.out.println(i);
        }
        System.out.println("darr = " + darr); //주소
        System.out.println("iarr = " + iarr); //주소

        // 주소값을 보기 좋게 하는 방법 - hashCode()
        // 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유 정수값을 반환하는 메소드
        // 사용예 (동등/동일) 설명시 활용예정.
        System.out.println("iarr.hashCode() : "+iarr.hashCode());
        System.out.println("darr.hashCode() : "+darr.hashCode());

        for(double i:darr){
            System.out.println(i);
        }

        System.out.println("darr.length = " + darr.length);
        System.out.println("iarr.length = " + iarr.length);

        /*  배열의 특징 중에 한 번 지정한 배열의 길이는 변경할 수 없다.*/
        iarr = new int[100];
        System.out.println("수정된 iarr.hashCode()"+iarr.hashCode());
        System.out.println("수정된 iarr.length"+iarr.length);

        // 레버런스 변수가 아무런 주소를 참조하지 않은 상태를 null 이라고 한다.
        // 기존 배열이 더 이상 참조 되지 않으므로 GC에 의해 제거 된다.
    }

}

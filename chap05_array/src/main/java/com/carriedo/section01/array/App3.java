package com.carriedo.section01.array;

public class App3 {
    public static void main(String[] args){
        /*
         * heap 영역에 할당 될 경우 자료형에 따른 초기값이 설정되어 할당된다.
         * 값을 처음에 지정해주지 않으면 JVM이 자료형에 맞는 기본값으로 자동으로 채운다.
         *
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : \u0000
         * 참조(String, 나중에는 클래스...) : null
         * */
        int[] iarr = new int[3];
        //int iarr[] = new int[10];
        for(int i=0; i<iarr.length;i++) {
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }

        String[] sarr  = new String[3];
        for(int i=0; i<sarr.length;i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }

        char[] carr  = new char[3];
        for(int i=0; i<carr.length;i++) {
            System.out.println("carr[" + i + "] : " + carr[i]);
        }

        boolean[] barr  = new boolean[3];
        for(int i=0; i<barr.length;i++) {
            System.out.println("barr[" + i + "] : " + barr[i]);
        }
        
        // 기본값 외로 초기화 배열 생성
        int[] iarr2 = new int[]{11,22,33,44,55};  // 방크기 5, 값 세팅 (타입으르 인지하지 못하는 경우가 있으면 명시적으로 이렇게 사용
        //int[] iarr2 = {11,22,33,44,55}; //  위랑 같음
        for(int i:iarr2){
            System.out.println("iarr2 i = " + i);
        }

        String[] sarr2 = {"짜장","짬뽕"};
        for(String s:sarr2){
            System.out.println(s);
        }
    }
}

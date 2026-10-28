package com.carriedo.section02.dimensional;

public class App1 {
    public static void main(String[] args) {
        // 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
        int[][] iarr1; // 2차원 배열 선언 예
        int[] iarr2[]; // 2차원 배열 선언 예
        int iarr3[][]; // 2차원 배열 선언 예

        // iarr1 = new int[][]; // []안에 비어있으면 생성 자체가 안됨.
        // iarr1 = new int[][4]; // 가진 방의 개수만 적어도 오류난다. 힙이라는 공간에 값이 없는 상태로 생성 불가. 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 생성 불가
        iarr1 = new int[3][]; //heap 에 생성할 방이 있음. 그 뒤 주소값은 잡을 텐데 null

        System.out.println(iarr1[0]); //null, 여기서 .hashcode나 그런거 쓰면 널포인터익셉션 뜨는거임

        /*주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당 (heap)*/
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];
        System.out.println(iarr1[0]);

        // 한번에 이차원 배열을 선언하고 할당할 수 있다.
        iarr2 = new int[3][5];

        for(int i=0; i<iarr2.length;i++){
            for(int j=0; j<iarr2[i].length;j++){
                System.out.print(iarr2[i][j]+"  ");
            }
            System.out.println();
        }


    }
}

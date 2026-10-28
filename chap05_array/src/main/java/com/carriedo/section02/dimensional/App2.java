package com.carriedo.section02.dimensional;

public class App2 {
    public static void main(String[] args) {
        //  2차원 가별 배열 선언 및 할당
        int[][] iarr = new int[3][];
        System.out.println(iarr); // stack의 레퍼런스 배열 참조 주소값.
        System.out.println(iarr[0]); // heap의 1차원 배열 참조 주소값(현재는 null)
        /**System.out.println(iarr[0][0]); -> 존재하지 않으므로 NullPointerException*/

        iarr[0] = new int[3];
        iarr[1] = new int[2];
        int[] arr = new int[5];
        iarr[2] = arr;

        for(int i=0; i<iarr.length;i++){
            for(int j=0; j<iarr[i].length;j++){
                System.out.print(iarr[i][j]+"  ");
            }
            System.out.println();
        }

        /*정변 배열*/
        int[][] iarr4 = {{1,2,3},{4,5,6},{7,8,9}};
        /*가별 배열

         */




    }
}

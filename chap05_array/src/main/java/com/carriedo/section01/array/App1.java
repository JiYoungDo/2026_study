package com.carriedo.section01.array;

public class App1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        /*ㅎ하나의 이름으로 관리되는 연속된 메모리 공간이며 해당 공간에 접근시에는 인덱스를 사용한다.*/
        arr[0] =1; arr[1] =2; arr[2] =3; arr[3] =4; arr[4] = 5;

        int value =0;

//        for(int i = 0; i<arr.length; i++){
//            arr[i] = value+=10;
//            System.out.println(arr[i]);
//        }

        // 향상된 for 문 : readonly & type 중요
        //단순히 배열의 데이터를 조회(출력, 비교 등)만 할 때는 향상된 for문이 최고.
        //반대로 배열의 요소 값을 직접 수정(변경)해야 하는 작업은 안됨.
        for(int i:arr){
            System.out.println(i);
            i=0;
        }

    }
}

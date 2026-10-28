package com.carriedo.section03.copy;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        /* 원본 배열 */
        int[] origin = {1,2,3,4,5}; // 배열의 선언 및 할당, 주소값이 들어가 있음.

        /* 얕은 복사 : 동일한 주소를 바라봄 */
        int[] copy = origin;

        System.out.println("copy = " + copy.hashCode());
        System.out.println("origin = " + origin.hashCode());

        // toString : 출력 할 때 많이 사용
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[2] = 100; // 두 배열 모두 값이 바뀐다.
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin);
        test(copy);
        Test.test(origin);
        Test.test(copy);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        int[] test = retutnTest();
        System.out.println(Arrays.toString(test));
        System.out.println(test.hashCode());

    }

    public static void test(int[] arr){
        System.out.println("[test] arr hashcode : "+arr.hashCode());
        arr[0] = 100;
    }

    public static int[] retutnTest(){
        return new int[]{1,2,3,4,5};
    }
}

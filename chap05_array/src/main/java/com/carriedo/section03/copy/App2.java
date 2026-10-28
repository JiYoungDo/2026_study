package com.carriedo.section03.copy;

import java.util.Arrays;

public class App2 {


    public static void main(String[] args) {

        /** 깊은 복사 */

        int[] origin = {1,2,3,4,5};

        /**  1. for문  **/
        int[] copy1 = new int[10];
        for(int i=0;i<origin.length; i++){
            copy1[i] = origin[i];
        }
        copy1[1] = 9999;
        printLog(origin,copy1,"1");


        /**  2. object의 clone 메서드
         * ➡️ 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성됨. **/
        int[] copy2 = origin.clone();
        printLog(origin,copy2,"2");


        /**  3. System의 arrayCopy 메서드
         * arrayCopy(원본배열, 복사시작 인덱스, 복사배열, 복사시작인덱스, 복사길이 **/
        int[] copy3  = new int[10];
        System.arraycopy(origin,0,copy3,3,origin.length);
        printLog(origin,copy3,"3");


        /**  4. Arrays의 copyOf 메서드 : 원본의 처음부터만 가능**/
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(origin, 3);

        printLog(origin,copy4,"4");
        printLog(origin,copy5,"5");


    }


    public static void printLog(int[]origin, int[] copy, String s){
        System.out.println();
        System.out.println("============== origin ==============");
        System.out.println("origin hashCode(): "+origin.hashCode() +"  origin : "+ Arrays.toString(origin));

        System.out.println("============== copy"+s+ " ==============");
        System.out.println("copy"+s + "hashCode() : "+ copy.hashCode() +"  copy"+s +"  : "+ Arrays.toString(copy));
    }



}

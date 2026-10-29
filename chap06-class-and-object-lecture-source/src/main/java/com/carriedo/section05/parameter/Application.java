package com.carriedo.section05.parameter;

import java.util.Arrays;

public class Application {
    /*
    * 파라미터로 사용 가능한 자료형
    * 1.기본자료형
    * 2.기본자료형 배열
    * 3.클래스자료형(참조자료형)
    * 4.클래스 자료형 배열(객체배열이지만 다음챕터에서 다룰예정)
    * 5.가변인지
    * */

    public static void main(String[] args) {

        /** 1. 리터럴값(참조 주소값 x)을 전달해서 메소드를 호출시에는 서로 다른 지역변수는 서로 영향 없음 */
        ParameterTest pt = new ParameterTest();
        int num = 20;
        System.out.println("call by value 전 "+num); // 값에 의한 호출
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후 "+num);


        /** 2.기본자료형 배열을 매개변수로 저날받는 메소드 호출 */
        int[] iArr = new int[]{1,2,3,4,5}; //iArr안에는 heap에 생성된 배열의 주소값을 가지고 있다.
        System.out.println("call by reference 전 : "+ Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr);
        System.out.println("call by reference 후 : "+ Arrays.toString(iArr));


        /** 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 */
        Rectangle r = new Rectangle(22,33);
        pt.testClassTypeParameter(r);


        /** 5. 가변인자를 매개변수로 전달받는 메소드 호출 */
        pt.testVariableLengthARrayParameter();
        pt.testVariableLengthARrayParameter("홍길동");
        pt.testVariableLengthARrayParameter("ㅁ","ㅇ","ㅎ","ㅇ");
        pt.testVariableLengthARrayParameter(new String[]{"a","b","c"});



    }

}

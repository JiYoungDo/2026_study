package com.carriedo.section05.parameter;


import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num){
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " +num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr){
        iArr[0]=100;
        System.out.println("매개변수로 전달받은 값 : "+ Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle rectangle){
        rectangle.calArea();
        rectangle.calRound();
    }

    // 가변인자 점 세개
    public void testVariableLengthARrayParameter(String... str){
        System.out.println("str = "+Arrays.toString(str));
    }
//    public void testVariableLengthARrayParameter(String str2, String... str){
//        System.out.println("str = "+Arrays.toString(str));
//    }

}

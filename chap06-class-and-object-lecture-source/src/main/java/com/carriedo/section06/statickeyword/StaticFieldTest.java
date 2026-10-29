package com.carriedo.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount; // 인스턴스 변수(인스턴스 당 1개)
    private static int staticCount; // 클래스 변수(클래스 당 1개)

    public void increaseNonStaticCount(){
        nonStaticCount++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.staticCount++; // 같은 클래스안에 있으니까 StaticFieldTest. 빼도 되구.
    }

    public int getNonStaticCount(){
        return nonStaticCount;
    }

    public static int getStaticCount(){
        /** static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이다.
         * 따라서 내부애서 this 키워드를 사용할 수 없다.*/
        return staticCount; // this.staticCount 안됨. 시점이 다름.
    }


}

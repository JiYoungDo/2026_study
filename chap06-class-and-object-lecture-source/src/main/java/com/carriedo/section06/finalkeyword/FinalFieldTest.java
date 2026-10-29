package com.carriedo.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * final 키워드를 사용할 수 있는 위치는 다양하다
    * 1. 지역변수 - 초기화 이후 값 변경 불가
    * 2. 매개변수 - 호출 시 전달한 값 변경 불가
    * 3. 인스턴스 변수 - 인스턴스 생성 초기화 이후엔 값 변경 불가
    * 4. 클래스 변수 (static) : 프로그램 시작 이후 값 변경 불가
    * 5. non-static method : 메소드 재작성(오버라이딩)불가
    * 6. static method : 메소드 재작성(오버라이딩)_불가
    * 7. 클래스 : 상속불가*/

    public void test(){
        // 1.
        final int i = 0;
    }

    public void user(final char gender){
        //2.
        // gender ='m'; //불가 . 영역 안에서 변경 불가능함.
    }

    // final 을 쓸거면 반드시 초기화를 해야함
    // ⭐️ private final int NON_STATIC_NUM; //안됨.
    private final int NON_STATIC_NUM =1;

    private final String NNN; //필드변수
    public FinalFieldTest(String non){
        this.NNN = non;
    }


    /** static field 에 final 사용할 경우 */
    private static final String STATIC_NAME; // 안됨 생성자로도 안됨. 시점이 달라서. 스태틱 필드는 생성자 초기화로는 불가능.
    // 되는 방법 : static 초기화 블럭을 활용할 수 있다.
    static{
        STATIC_NAME ="홍길동";
    }

    /** final, static 키워드 나열 순서는 문법적으로 상관 없으나 주로 static 먼저쓴다.*/
    public static final int MAX = 100;
    public final static int MIN =1;;

}

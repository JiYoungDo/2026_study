package com.carriedo.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton(); //🔥핵심
    /**이 코드는 클래스 내부에 선언된 정적(static) 멤버 변수입니다.
     자바에서 static 변수는 해당 클래스가 메모리에 로딩되는 순간
     (즉, 프로그램이 시작되거나 클래스가 처음 참조될 때) 가장 먼저 실행됩니다.

     즉, 누군가 "인스턴스 좀 줘!" 하고 getInstance()를 부르기도 전인데,
     클래스가 메모리에 올라오는 그 순간에 벌써 new EagerSingleton()을 실행해서
     객체를 미리 만들어 버리는 것입니다.**/

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }


}

package com.section02.string;

public class Application1 {
    public static void main(String[] args) {

        // length()
        System.out.println("hello".length());

        //charAt
        String st1 = "hel";
        for(int i=0; i<st1.length();i++){
            System.out.println(st1.charAt(i));
        }

        // compareTo : 인자로 전달된 문자열과 사전 순으로 비교를 하며
        // 두 문자열이 같다면 0반환, 인자로 전달된 문자열보다 적으면 음수, 크면 양수 반환.
        // 단 이 메서드는 대소문자를 구분하여 비교한다. (아스키코드비교)
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() :" +str2.compareTo(str3));

        // compareToIgnoreCase()
        System.out.println("compareToIgnoreCase() :" +str2.compareToIgnoreCase(str3));

        // concat() :문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다. 원본 문자열에는 영향을 주지 않는다.
        System.out.println("concat() :" + str2.concat(str3));

        // indexOf() : 문자열에서 특정 문자르ㅏㄹ 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        // 단 일치하는 문자 없는 경우 -1 반환.
        String se8 = "ellly";
        System.out.println(se8.indexOf("l"));

        // 뒤에서부터 찾고싶다?
        // lastIndexOf() : 문자열 탐색을 뒤에서 부터 하고 처음 일치하는 위치 인덱스 반환
        System.out.println(se8.lastIndexOf("l"));

        // trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        String str35 = " java  ";
        System.out.println(str35.trim());

        // toLowerCase() : 모든 문자를 소문자로 변환시킨다
        // toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        String test ="JavaMaroadb";
        System.out.println("toLowerCase() : "+test.toLowerCase());
        System.out.println("toUpperCase() : "+test.toUpperCase());

        //substring
        String javamysql = "javamysql";
        System.out.println(javamysql.substring(3,6)); // 3~5
        System.out.println(javamysql.substring(3)); //3~

        //isEmpty()
        System.out.println("".isEmpty());
        System.out.println("anc".isEmpty());


    }
}

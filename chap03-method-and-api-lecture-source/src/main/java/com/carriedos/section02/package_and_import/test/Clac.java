package com.carriedos.section02.package_and_import.test;

/**
 * 두수를 입력 받아 더하고 빼고, 최대 최소 반환하는 클래스
 */
public class Clac {


    /***
     *
     * @param first
     * @param second
     * @return
     */
    public int plpustTwoNubers(int first, int second){
        return first+second;
    }

    public int subTwoNum(int first, int second){
        return first-second;
    }

    public static int minNumbersOf(int first, int second){
        return(first<second ? first : second);
    }

    public static int maxNumbersOf(int first, int second){
        return(first<second ? second : second);
    }

}

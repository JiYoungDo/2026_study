package com.carriedos.section01.method;

public class App7 {
    public static void main(String[] args) {
      int first = 100;
      int second = 50;

      Clac calc = new Clac();
      int summ = calc.plpustTwoNubers(first,second);

      System.out.println("두수의 합은 ? " + summ);

      System.out.println("두수의 차는? " + calc.subTwoNum(first,second));
      System.out.println("큰값은? " +Clac.maxNumbersOf(first,second));
      System.out.println("작은? " +Clac.minNumbersOf(first,second));

    }

}

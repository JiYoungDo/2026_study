package com.carriedo.section08.object_array;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Car car1 = new Car("페라리",500);
        Car car2 = new Car("산타페",300);
        Car car3 = new Car("코나",150);
        Car car4 = new Car("소나타",200);
        Car car5 = new Car("모닝",50);

        car1.driveMAxSpeed();
        car2.driveMAxSpeed();
        car3.driveMAxSpeed();
        car4.driveMAxSpeed();
        car5.driveMAxSpeed();


        Car[] cars1 = new Car[5];
        System.out.println(Arrays.toString(cars1));

        Car[] cars2 = new Car[]{car1,car2,car3,car4,car5};
        System.out.println(Arrays.toString(cars2));

        for(Car c : cars2){
            c.driveMAxSpeed();
        }



    }


}

package com.carridos.section01.extend;

public class Application {
    public static void main(String[] args) {

        /**   부모클래스 */
        Car car = new Car();
        car.run();
        car.soundHorn();



        /**   자식클래스 -FireCar */
        System.out.println("===============");
        FireCar fireCar = new FireCar();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.sprayWater();

    }
}

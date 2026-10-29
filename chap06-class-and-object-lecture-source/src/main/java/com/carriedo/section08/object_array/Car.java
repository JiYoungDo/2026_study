package com.carriedo.section08.object_array;

public class Car {
    private String modelName;
    private int maxSpped;

    public Car() {
    }

    public Car(String modelName, int maxSpped) {
        this.modelName = modelName;
        this.maxSpped = maxSpped;
    }


    public void driveMAxSpeed() {
        System.out.println("Car{" +
                "modelName='" + modelName + '\'' +
                ", maxSpped=" + maxSpped +
                '}');
    }


}

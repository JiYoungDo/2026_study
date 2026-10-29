package com.carriedo.section03.abstraction;

public class Car {
    private boolean isOn = false; //시작은 시동이 꺼져있는 상태.
    private int speed;

    public void startUp(){
        if(this.isOn){
            System.out.println("이미 시동 걸려있다!");
        }else{
            this.isOn = true;
            System.out.println("부릉부릉 시동걸기 완료 🚗" );
        }
    }

    public void turnOff(){
        if(isOn){
            if(speed >0){
                System.out.println("달리는 중에 시동 끄면 큰일나~");
            }else{
                this.isOn = false;
                System.out.println("시동 끔~");
            }
        }else{
            System.out.println("이미 시동 꺼져있자너~");
        }
    }

    public void go(){
        if(isOn){
            this.speed +=10;
            System.out.println("차 go , speed :: "+speed);
        }else{
            System.out.println("시동부터 거시오!");
        }
    }

    public void stop(){
        if(isOn){
            if(speed >0){
                speed = 0;
                System.out.println("급 브레이크!!!! 차 stop");
            }else{
                System.out.println("이미 멈춰있다(시동켜져있고~)");
            }
        }else{
            System.out.println("시동 안걸려있는데 뭘 멈춰~!");
        }
    }

}

package com.carridedo.section03.sync;

/**
 * 생산자와 소비자가 함꼐 쓰는 공유 자원(상품 한개만 담는 칸)을 버퍼라고 한다.
 * 두 메서드 모두 synchronized라는 키워드를 붙이면
 * 한번에 한 스레드만 들어올 수 있게.
 * wait() 와 notify()는synchronized 안에서만 호출할 수 있어서 밖에서 호출하면 IllefalMonitorStateException 발생함.
 * */
public class Buffer {
    public int data;
    private boolean empty = false; // true면 칸이 비어있고, false면 상품이 들어가 있다.

    // 소비자 스레드가 호출 : 칸이 비어있으면 생산자가 채울 때까지 기다린다.
    public synchronized void getData(){
        if(empty){
            System.out.println("getData wait");
        }

        try{
            wait();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    // 생성자 스레드가 호출 : 칸에 상품이 있으면 소비자가 꺼낼 때까지 기다린다.
    public void setData(int i){
        if(!empty){
            System.out.println("setData wait");
            try{
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }



        this.data = data;
        System.out.println("생산자 : " +data+" 번 상품을 생산하였습니다.");
        empty  = false;

        //
    }

}

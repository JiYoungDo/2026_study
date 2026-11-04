package com.carriedo.section02;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        Map<String,Integer> map =  new HashMap<>();
        map.put("harry",1);
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        // 0번 인덱스로 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0; i<10;i++){
            pq.offer(new int[]{i,i+1});
        }

        for(int i=0; i<10;i++){
            System.out.println(pq.poll()[0]);
        }
    }




}

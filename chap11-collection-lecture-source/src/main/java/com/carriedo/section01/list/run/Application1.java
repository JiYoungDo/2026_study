package com.carriedo.section01.list.run;

import java.util.PriorityQueue;

public class Application1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 우선순위 큐 : 작은 숫자가 먼저 나간다.

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        /** System.out.println(pq.poll());*/

         PriorityQueue<int[]> pq2 = new PriorityQueue<>((a, b) ->Integer.compare(a[1], b[1])); // 아래와 같으나 더 선호됨.
        // PriorityQueue<int[]> pq2 = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        //  즉, 정수 하나가 아니라 배열을 저장한다는 뜻이지.
        pq2.offer(new int[]{1, 50});
        pq2.offer(new int[]{2, 10});
        pq2.offer(new int[]{3, 30});
        // PriorityQueue는 배열을 어떤 기준으로 우선순위를 판단해야 할까? 첫 번째 숫자를 기준으로 할까? 두 번째 숫자를 기준으로 할까?
        //자바는 이걸 자동으로 알 수 없어. ❗️(o1, o2) -> o1[1] - o2[1] 이런 조건을 넣지 않으면 아예 오류가 나는구나!
        int[] result ={};
        result = pq2.poll();
        System.out.println(result[0] + " " + result[1]);

        /**
         * (a, b) -> a[1] - b[1]
         * a : 비교할 첫 번째 배열
         * b : 비교할 두 번째 배열
         * -> : 람다식에서 실행할 내용을 연결하는 기호
         * a[1] : 첫 번째 배열의 1번 인덱스
         * b[1] : 두 번째 배열의 1번 인덱스
         *
         * 예로 아래와 같이 있다고 가정하면
         * a = {1, 50}
         * b = {2, 10}
         * o1[1] - o2[1] = 50-10 = 40
         *
         * 이 결과가 양수인지, 음수인지, 0인지에 따라 정렬 순서가 결정됨.
         * 결과	의미
         * 음수	o1이 o2보다 앞에 와야 함
         * 양수	o2가 o1보다 앞에 와야 함
         * 0	두 값의 우선순위가 같음
         *
         * 즉 위의 경우, 배열의 1번 인덱스 값이 작은 배열이 먼저 나오도록 우선순위 설정한 것.
         * **/

    }
}

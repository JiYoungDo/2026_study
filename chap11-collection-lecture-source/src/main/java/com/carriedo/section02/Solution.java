package com.carriedo.section02;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int main(int[][]maps){
        int n = maps.length;
        int m = maps[0].length;

        int[][] visited = new int[n][m]; // 방문 체크 및 거리 기록 위함.
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        visited[0][0] = 1; // 시작칸 포함 1칸 카운트

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if(x==n-1 && y==m-1){
                return visited[x][y];
            }

            // 4방향 탐색
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(maps[nx][ny] !=1 && visited[nx][ny] ==0){
                        visited[nx][ny] = visited[x][y]+1;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }



        return -1;
    }
}

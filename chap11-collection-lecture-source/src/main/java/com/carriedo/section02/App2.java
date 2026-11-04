package com.carriedo.section02;

public class App2 {

    int answer = 0;
    public int main(int[] args, int target) {
        dfs(args,target,0,0);
        return answer;
    }

    public void dfs(int[] nums, int target, int depth, int sum){
        if(depth==nums.length){
            if(sum==target){
                answer++;
                return;
            }
        }
        dfs(nums,target,depth+1, sum+nums[depth]);
        dfs(nums,target,depth+1, sum-nums[depth]);
    }
}

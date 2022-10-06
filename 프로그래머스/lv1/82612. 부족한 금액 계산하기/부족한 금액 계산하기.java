class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalMoney=0;
        for(int i=1;i<=count;i++){
            totalMoney+=(price*i);
        }
        if(totalMoney-money>0){
            answer=totalMoney-(long)money;
        }else{
            answer=0;
        }
        return answer;
    }
}
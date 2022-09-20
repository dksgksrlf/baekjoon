class Solution {
    public int solution(int[] numbers) {
        int[] totalNums={1,2,3,4,5,6,7,8,9};
        int answer = 45;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                continue;
            }
            int start=0;
            int end = totalNums.length;
            int j=(end-start)/2;
            int count=0;
           
            while(count<4){
                if(numbers[i]==totalNums[j]){
                    answer-=numbers[i];
                    break;
                }else if(numbers[i]>totalNums[j]){
                    start=j;
                    j=start+(end-start)/2;
                    
                }else{
                    end=j;
                    j=start+(end-start)/2;
                }
                count++;
            }
        }
        
        
        return answer;
    }
}
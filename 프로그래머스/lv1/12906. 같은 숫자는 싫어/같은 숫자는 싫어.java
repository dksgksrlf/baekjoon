import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int j=0;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=-1;
        }
        ans[0]=arr[0];
        
        for(int i=0;i<arr.length;i++){
            
            if(ans[j]!=arr[i]){
                j++;
                ans[j]=arr[i];
                
            }
        }
        int[] answer=new int[j+1];
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0;i<=j;i++){
            if(ans[i]!=-1){
                //System.out.print(ans[i]);
                answer[i]=ans[i];
            }
        }
        return answer;
    }
}
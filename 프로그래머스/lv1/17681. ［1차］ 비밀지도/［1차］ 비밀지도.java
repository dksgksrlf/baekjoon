class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] map=new int[n];
        String[] answer=new String[n];
        for(int i=0;i<n;i++){
            map[i]=arr1[i]|arr2[i];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i]!=0){
                
                    if(map[i]%2==1){
                        if(answer[i]==null){
                            answer[i]="#";
                            map[i]/=2;
                            continue;
                        }
                        answer[i]="#"+answer[i];
                        map[i]/=2;
                    }else{
                        if(answer[i]==null){
                            answer[i]=" ";
                            map[i]/=2;
                            continue;
                        }
                        answer[i]=" "+answer[i];
                        map[i]/=2;
                    }
                }else{
                    answer[i]=" "+answer[i];
                }
            }
            
            
        }
        
        return answer;
    }
}
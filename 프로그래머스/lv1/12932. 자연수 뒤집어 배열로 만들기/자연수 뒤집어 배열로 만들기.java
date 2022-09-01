class Solution {
    public int[] solution(long n) { 
        long num=n;
        int[] answer = new int[String.valueOf(n).length()];
        for(int i=0;i<String.valueOf(n).length();i++){
            answer[i]=(int)(num%10);
            num=num/10;
        }
       
        return answer;
    }
}
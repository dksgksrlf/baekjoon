class Solution {
    public int[] solution(int[] answers) {
       
        int[] sufoja1={1,2,3,4,5};
        int[] sufoja2={2,1,2,3,2,4,2,5};
        int[] sufoja3={3,3,1,1,2,2,4,4,5,5};
        int[] sufojaScore={0,0,0};
        int maxidx=0;
        for(int i=0;i<answers.length;i++){
            if(sufoja1[i%5]==answers[i]){
                sufojaScore[0]++;
                if(sufojaScore[maxidx]<sufojaScore[0]){
                    maxidx=0;
                }
            }
            if(sufoja2[i%8]==answers[i]){
                sufojaScore[1]++;
                if(sufojaScore[maxidx]<sufojaScore[1]){
                    maxidx=1;
                }
            }
            if(sufoja3[i%10]==answers[i]){
                sufojaScore[2]++;
                if(sufojaScore[maxidx]<sufojaScore[2]){
                    maxidx=2;
                }
            }
        }
        String answerStr="123";
        for(int i=0;i<3;i++){
            if(sufojaScore[maxidx]>sufojaScore[i]){
                answerStr=answerStr.replace(String.valueOf(i+1),"");
            }
        }
        String[] answerSplit=answerStr.split("");
        int[] answer = new int[answerSplit.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=Integer.parseInt(answerSplit[i]);
        }
        
        return answer;
    }
}
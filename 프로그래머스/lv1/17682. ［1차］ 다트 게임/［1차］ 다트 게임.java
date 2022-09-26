class Solution {
    public int solution(String dartResult) {
        String[] dartResultSplit=dartResult.split("");
        int score=0;
        int preScore=0;
        int answer = 0;
        boolean isNum=false;
        for(String token:dartResultSplit){
            switch(token){
                case "*":
                    answer+=preScore+score;
                    score*=2;
                    isNum=false;
                    break;
                case "#":
                    score*=-1;
                    answer+=score*2;
                    isNum=false;
                    break;
                case "S":
                    answer+=score;
                    isNum=false;
                    break;
                case "D":
                    score*=score;
                    answer+=score;
                    isNum=false;
                    break;
                case "T":
                    score=score*score*score;
                    answer+=score;
                    isNum=false;
                    break;
                default:
                    if(isNum){
                        score=score*10+Integer.parseInt(token);
                        break;
                    }
                    preScore=score;
                    score=Integer.parseInt(token);
                    isNum=true;
                    break;
            }
        }
        
        return answer;
    }
}
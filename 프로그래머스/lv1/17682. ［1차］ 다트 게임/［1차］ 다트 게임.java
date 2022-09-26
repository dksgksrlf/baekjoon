//문자열 배열로 나눈후 단어를 순서대로 받아 바로바로 점수를 계산
class Solution {
    public int solution(String dartResult) {
        String[] dartResultSplit=dartResult.split("");
        int score=0; //얻은점수
        int preScore=0; //이전에 얻은 점수
        int answer = 0; //최종점수
        boolean isNum=false; //숫자가 연속해서 오는 두자리수 이상인지
        for(String token:dartResultSplit){
            switch(token){
                case "*": //스타상
                    answer+=preScore+score;//이전점수와 현재 얻은 점수를 한번더 더한다.
                    score*=2; //현재 얻은 점수가 score*2, 이후 preScore에 저장
                    
                    break;
                case "#": //아차상
                    score*=-1; //현재 점수 만큼 잃게됨 
                    answer+=score*2; //이전 반복때 더했었으므로 더한만큼 빼고 한번더 뺀다.
                    
                    break;
                case "S": //Single
                    answer+=score; //점수를 얻음
                    isNum=false;//다음점수를 받을 준비
                    break;
                case "D": //Double
                    score*=score; //점수가 2제곱
                    answer+=score; //점수를 얻음
                    isNum=false;
                    break;
                case "T": //Triple
                    score=score*score*score; //점수가 세제곱
                    answer+=score;
                    isNum=false;
                    break;
                default: 
                    //숫자가 왔을때 
                    if(isNum){  //이전반복때 숫자였다면
                        score=score*10+Integer.parseInt(token); //얻을 점수 계산
                        break;
                    }
                    preScore=score; //이전에 얻은 점수 저장
                    score=Integer.parseInt(token); //현재 얻은 점수를 받음
                    isNum=true; //다음반복때 숫자인지 확인
                    break;
            }
        }
        
        return answer;
    }
}
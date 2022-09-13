class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keyPad= {{1,4,7,-1},{2,5,8,0},{3,6,9,-1}};
        int[] rightHand={2,3};
        int[] leftHand={0,3};
        for(int token:numbers){
            for(int j=0;j<keyPad[1].length;j++){
                if(token==keyPad[0][j]){
                    leftHand[0]=2;
                    leftHand[1]=j;
                    answer+="L";
                    break;
                }else if(token==keyPad[2][j]){
                    rightHand[0]=0;
                    rightHand[1]=j;
                    answer+="R";
                    break;
                }else if(token==keyPad[1][j]){
                    int distanceRightX=rightHand[0]-1;
                    int distanceRightY=rightHand[1]-j;
                    int distanceRight=((distanceRightX>=0)?distanceRightX:-1*distanceRightX)+((distanceRightY>=0)?distanceRightY:-1*distanceRightY);
                    int distanceLeftX=leftHand[0]-1;
                    int distanceLeftY=leftHand[1]-j;
                    int distanceLeft=((distanceLeftX>=0)?distanceLeftX:-1*distanceLeftX)+((distanceLeftY>=0)?distanceLeftY:-1*distanceLeftY);
                    if(distanceRight<distanceLeft){
                        rightHand[0]=1;
                        rightHand[1]=j;
                        answer+="R";
                        break;
                    }else if(distanceRight>distanceLeft){
                        leftHand[0]=1;
                        leftHand[1]=j;
                        answer+="L";
                        break;
                    }else if(hand.equals("right")){
                        rightHand[0]=1;
                        rightHand[1]=j;
                        answer+="R";
                        break;
                    }else{
                        leftHand[0]=1;
                        leftHand[1]=j;
                        answer+="L";
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
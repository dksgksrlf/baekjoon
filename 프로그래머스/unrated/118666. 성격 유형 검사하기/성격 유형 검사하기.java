class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] result=new int[4]; //양수이면 RCJA
        for(int i=0;i<survey.length;i++){
            char whatFirst=survey[i].charAt(0);//두성격 유형중 첫번째 단어
            switch(whatFirst){
                case 'R':
                    switch(choices[i]){
                        case 1:
                            result[0]+=3;
                            break;
                        case 2:
                            result[0]+=2;
                            break;
                        case 3:
                            result[0]+=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[0]-=1;
                            break;
                        case 6:
                            result[0]-=2;
                            break;
                        case 7:
                            result[0]-=3;
                            break;
                    }
                    break;
                case 'T':
                    switch(choices[i]){
                        case 1:
                            result[0]-=3;
                            break;
                        case 2:
                            result[0]-=2;
                            break;
                        case 3:
                            result[0]-=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[0]+=1;
                            break;
                        case 6:
                            result[0]+=2;
                            break;
                        case 7:
                            result[0]+=3;
                            break;
                    }
                    break;
                case 'C':
                    switch(choices[i]){
                        case 1:
                            result[1]+=3;
                            break;
                        case 2:
                            result[1]+=2;
                            break;
                        case 3:
                            result[1]+=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[1]-=1;
                            break;
                        case 6:
                            result[1]-=2;
                            break;
                        case 7:
                            result[1]-=3;
                            break;
                    }
                    break;
                case 'F':
                    switch(choices[i]){
                        case 1:
                            result[1]-=3;
                            break;
                        case 2:
                            result[1]-=2;
                            break;
                        case 3:
                            result[1]-=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[1]+=1;
                            break;
                        case 6:
                            result[1]+=2;
                            break;
                        case 7:
                            result[1]+=3;
                            break;
                    }
                    break;
                case 'J':
                    switch(choices[i]){
                        case 1:
                            result[2]+=3;
                            break;
                        case 2:
                            result[2]+=2;
                            break;
                        case 3:
                            result[2]+=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[2]-=1;
                            break;
                        case 6:
                            result[2]-=2;
                            break;
                        case 7:
                            result[2]-=3;
                            break;
                    }
                    break;
                case 'M':
                    switch(choices[i]){
                        case 1:
                            result[2]-=3;
                            break;
                        case 2:
                            result[2]-=2;
                            break;
                        case 3:
                            result[2]-=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[2]+=1;
                            break;
                        case 6:
                            result[2]+=2;
                            break;
                        case 7:
                            result[2]+=3;
                            break;
                    }
                    break;
                case 'A':
                    switch(choices[i]){
                        case 1:
                            result[3]+=3;
                            break;
                        case 2:
                            result[3]+=2;
                            break;
                        case 3:
                            result[3]+=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[3]-=1;
                            break;
                        case 6:
                            result[3]-=2;
                            break;
                        case 7:
                            result[3]-=3;
                            break;
                    }
                    break;
                case 'N':
                    switch(choices[i]){
                        case 1:
                            result[3]-=3;
                            break;
                        case 2:
                            result[3]-=2;
                            break;
                        case 3:
                            result[3]-=1;
                            break;
                        case 4:
                            break;
                        case 5:
                            result[3]+=1;
                            break;
                        case 6:
                            result[3]+=2;
                            break;
                        case 7:
                            result[3]+=3;
                            break;
                    }
                    break;
            }
        }
        String answer = ((result[0]>=0)?"R":"T")+((result[1]>=0)?"C":"F")+((result[2]>=0)?"J":"M")+((result[3]>=0)?"A":"N");
        System.out.println(answer);
        return answer;
    }
}
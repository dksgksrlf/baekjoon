class Solution {
    public int solution(String s) {
        String[] str=s.split("");
        int answer = 0;
        for(int i=0;i<str.length;i++){
            switch(str[i].charAt(0)){
                case 'z':
                    str[i]="0";
                    answer=answer*10+Integer.parseInt(str[i]);
                    i+=3;
                    
                    break;
                case 'o':
                    str[i]="1";
                    answer=answer*10+Integer.parseInt(str[i]);
                    i+=2;
                    
                    break;
                case 't':
                    if(str[i+1].equals("w")){
                        str[i]="2";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=2;
                    }else{
                        str[i]="3";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=4;
                    }
                    
                    break;
                case 'f':
                    if(str[i+1].equals("o")){
                        str[i]="4";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=3;
                    }else{
                        str[i]="5";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=3;
                    }
                    
                    break;
                case 's':
                    if(str[i+1].equals("i")){
                        str[i]="6";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=2;
                    }else{
                        str[i]="7";
                        answer=answer*10+Integer.parseInt(str[i]);
                        i+=4;
                    }
                    
                    break;
                case 'e':
                    str[i]="8";
                    answer=answer*10+Integer.parseInt(str[i]);
                    i+=4;
                    
                    break;
                case 'n':
                    str[i]="9";
                    answer=answer*10+Integer.parseInt(str[i]);
                    i+=3;
                    
                    break;
                default :
                    answer=answer*10+Integer.parseInt(str[i]);
            }
        }
        
        
        return answer;
    }
}
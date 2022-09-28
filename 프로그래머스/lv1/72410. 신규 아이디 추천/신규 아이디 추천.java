class Solution {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();
        String[] id=new_id.split("");
        String answer ="";
       
        for(String token:id){
            
            if(token.charAt(0)>='a'&&token.charAt(0)<='z'){
                
            }else if(token.charAt(0)>='0'&&token.charAt(0)<='9'){
                
            }else if(token.compareTo("-")==0){
                
            }else if(token.compareTo("_")==0){
                
            }else if(token.compareTo(".")==0){
                
            }else{
                token="";
            }
            answer+=token;
        }
        while(answer.indexOf("..")!=-1)
            answer=answer.replace("..",".");
        if(answer.charAt(0)=='.'){
            answer=answer.substring(1);
        }
        if(answer.length()!=0&&answer.charAt(answer.length()-1)=='.'){
            answer=answer.substring(0,answer.length()-1);
        }
        if(answer.equals("")){
            answer="a";
        }
        if(answer.length()>=16){
            answer=answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.'){
                answer=answer.substring(0,answer.length()-1);
            }
        }
        while(answer.length()<3){
            answer+=answer.substring(answer.length()-1);
        }
       
        return answer;
    }
}
class Solution {
    public int solution(int[][] sizes) {
        int maxW=0;
        int maxH=0;
        int maxIndex=0;
        for(int i=0;i<sizes.length;i++){
            int larger=(sizes[i][0]>sizes[i][1])?sizes[i][0]:sizes[i][1];
            int smaller=(sizes[i][0]<sizes[i][1])?sizes[i][0]:sizes[i][1];
            if(maxW<=larger){
                maxW=larger;
                maxH=smaller;
                maxIndex=i;
            }
            
        }
        for(int i=0;i<sizes.length;i++){
            if(maxIndex!=i){
                int smaller=(sizes[i][0]<sizes[i][1])?sizes[i][0]:sizes[i][1];
                if(maxH<=smaller){
                    maxH=smaller;
                }
            }
        }
        int answer = maxW*maxH;
        return answer;
    }
}
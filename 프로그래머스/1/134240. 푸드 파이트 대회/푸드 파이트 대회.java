class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i=1; i<food.length; i++) {
            int cnt = food[i]/2;
            
            for (int k=0; k<cnt; k++) {
                answer += ""+i;  
            }
            
            
        }
        
    
        String reverse = new StringBuilder(answer).reverse().toString();
        answer = answer+"0"+reverse;
        
        
        return answer;
    }
}
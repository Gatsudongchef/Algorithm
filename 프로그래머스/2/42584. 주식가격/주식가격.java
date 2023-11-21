class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
          
        
        
        for (int i=0; i<prices.length-1; i++) {
            
            loop:
            for (int k=i+1; k<prices.length; k++) {
                
                if (prices[i] > prices[k]) {
                  answer[i] = k-i;
                    break loop;
                }
                
            }
            
            if (answer[i] == 0 && i != prices.length-1) {
                answer[i] = prices.length - (i+1);
            } 
            
        } 
        
        return answer;
    }
}
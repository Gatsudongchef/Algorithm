import java.util.*;

class Solution {
    public int solution(int n) {
            int answer = 0;
            int i=1;
        
        while (i<=Math.sqrt(n)) {
            if (n%i==0) {
                if ((n/i) != i)
                answer += (n/i)+i;
                
                else {
                    answer +=i;
                }
            }
            i++;
        }
        
        return answer;
            
        }
        
    
}
import java.util.*;

class Solution {
    public int solution(int n) {
        if (n==0) {
            return 0;
        }
        
        else if (n==1) {
            return 1;
        }
        
        else {
        
            int answer = n+1;
            int i=2;
        
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
}
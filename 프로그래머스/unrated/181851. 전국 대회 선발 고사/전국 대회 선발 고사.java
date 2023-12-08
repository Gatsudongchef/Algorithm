import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 1;
        ArrayList<Integer> passed = new ArrayList<>();
        
        
        while (passed.size() < 3) {
            
       
        for (int i=0; i<rank.length; i++) {
            
            if (rank[i] == answer) {
                answer++;
                
                if (attendance[i] == true) {
                    passed.add(i);
                }
                
                else {
                    break;
                }
                
            }
            
        }
            
     }
        
        
        answer = (passed.get(0)*10000) + (passed.get(1)*100) + passed.get(2);
        return answer;
    }
}
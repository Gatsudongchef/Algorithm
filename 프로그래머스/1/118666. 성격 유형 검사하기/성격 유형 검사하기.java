import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("R" , 0);
        map.put("T" , 0);
        map.put("C" , 0);
        map.put("F" , 0);
        map.put("J" , 0);
        map.put("M" , 0);
        map.put("A" , 0);
        map.put("N" , 0);
            
        for (int i=0; i<choices.length; i++) {
            
            String L = survey[i].substring(0,1);
            String R = survey[i].substring(1);
            
            int leftCnt = map.get(L);
            int rightCnt = map.get(R);
            
            switch(choices[i]) {
                case 1: leftCnt += 3;
                    break;
                case 2: leftCnt += 2;
                    break;
                case 3: leftCnt += 1;
                    break;
                case 4: 
                    break;
                case 5: rightCnt += 1;
                    break;
                case 6: rightCnt += 2;
                    break;
                case 7: rightCnt += 3;
                    break;
            }
            
            map.put(L, leftCnt);
            map.put(R, rightCnt);
            
        }
        
        String[] A = {"R", "C", "J", "A"};
        String[] B = {"T", "F", "M", "N"};
        
        for (int i=0; i<A.length; i++) {
            
            int leftCnt = map.get(A[i]);
            int rightCnt = map.get(B[i]);
            
            if (leftCnt == rightCnt) {
                answer.append(A[i]);
            }
        
            else {
                answer.append(leftCnt > rightCnt ? A[i] : B[i]);
            }
            
        }
        
        
        
        return answer.toString();
    }
}
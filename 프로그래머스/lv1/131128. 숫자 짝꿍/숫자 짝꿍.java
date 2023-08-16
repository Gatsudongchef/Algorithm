import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answerBuilder = new StringBuilder();
        
        int[] A = new int[10];
        
        for (int i=0; i<10; i++) {
           int a = X.length();
           int b = Y.length();
           int A1 = a - X.replace(i+"","").length();
           int A2 = b - Y.replace(i+"","").length();
            
            A[i] = (A1 >= A2) ? A2 : A1; 
        }
        
        for (int i=9; i>=0; i--) {
            for (int k=0; k<A[i]; k++) {
                answerBuilder.append(i);
            }
        }
        
        String answer = answerBuilder.toString();
        
        if (answer.equals("")) {
            return "-1";
        }
        
       if (answer.replace("0","").length() == 0) {
           return "0";
       }
        
        return answer;
    }
}
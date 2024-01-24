import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> que1 = new LinkedList<>();
        Queue<String> que2 = new LinkedList<>();
        String answer = "Yes";
        
        for (String i : cards1) {
            que1.add(i);
        }
        
        for (String i : cards2) {
            que2.add(i);
        }
        
        for (int i=0; i<goal.length; i++) {
            
            if (goal[i].equals(que1.peek())) {
                que1.remove();
            }
            
            else if (goal[i].equals(que2.peek())) {
                que2.remove();
            }
            
            else {
                answer = "No";
                break;
            }
        }
        
        
        
        return answer;
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder Str = new StringBuilder();
        
        for (int i=0; i<(n/2); i++) {
            Str.append("수박");
        } 
        
        if (n%2 != 0) {
            Str.append("수");
        }
        
        else if (n==1) {
            return "수";
        }
        
        answer = Str.toString();
        return answer;
    }
}
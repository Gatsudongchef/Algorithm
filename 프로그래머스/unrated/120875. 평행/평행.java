class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
         double ab = ((dots[0][0] - dots[1][0]) / (double)(dots[0][1] - dots[1][1]));
         double cd = ((dots[2][0] - dots[3][0]) / (double)(dots[2][1] - dots[3][1]));
         double ac = ((dots[0][0] - dots[2][0]) / (double)(dots[0][1] - dots[2][1]));
         double bd = ((dots[1][0] - dots[3][0]) / (double)(dots[1][1] - dots[3][1]));   
         double ad = ((dots[0][0] - dots[3][0]) / (double)(dots[0][1] - dots[3][1]));
         double bc = ((dots[1][0] - dots[2][0]) / (double)(dots[1][1] - dots[2][1]));    
               
        if (ab==cd || ac==bd || ad==bc) {
            answer = 1;
        }
        
        return answer;
    }
}
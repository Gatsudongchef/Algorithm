import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] eyes = {a, b, c, d};
        int[] dice = new int[6];
        int cnt = 0;
        int once = 0;
        
        for (int i=0; i<eyes.length; i++) {
            
            if(eyes[i] == dice[eyes[i]-1]) {
                cnt++;
                if (once == 0 || once == eyes[i]) {
                 once = eyes[i];
                }
                else {
                    once = -1;
                }
                
            }
            
            else {
                dice[eyes[i]-1] = eyes[i];
            }
            
        }
        
        dice = Arrays.stream(dice).distinct().toArray();
        
        if (cnt == 3) { // 주사위 숫자가 모두 같은 경우
            answer = 1111*a;
        }
        
        else if ( cnt == 2 && dice.length == 3 && once != -1) { // 주사위 숫자가 3개만 일치하는 경우
            int p = once;
            
            
            for (int i=0; i<eyes.length; i++) {
                if (eyes[i] != p) {
                    int q = eyes[i];
                    answer = (int)Math.pow((10*p+q) , 2);
                }
            }
            
        }
        
        else if ( once == -1) { // 주사위 숫자가 2개씩 같은 값이 나온 경우
            int p=0;
            int q=0;
            for (int i=0; i<dice.length; i++) {
                if (dice[i] != 0 && p==0) {
                    p = dice[i];
                }
                
                else if (dice[i] != 0 && p != 0 && q==0) {
                    q = dice[i];
                }  
            } 
            
            answer = (p+q)*Math.abs(p-q);
        }
        
        else if ( cnt == 1) { // 주사위 숫자가 한번만 일치하는 경우
            int q=0;
            int r=0;
            for (int i=0; i<eyes.length; i++) {
                if (eyes[i] != once && q==0) {
                    q = eyes[i];
                }
                
                else if (eyes[i] != once && q!=0 && r==0) {
                    r = eyes[i];
                }
            }
            
            answer = q*r;
        }
        
        else { // 모두 일치하지 않는 경우
            answer = Math.min(Math.min(a,b),Math.min(c,d)); 
        }
        
        
        return answer;
    }
}
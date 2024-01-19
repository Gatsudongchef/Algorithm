import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int cnt=0;
        int num=0;
        
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        for (int i=0; i<win_nums.length; i++) {
            arrlist.add(win_nums[i]);
        }
        
        for (int i=0; i<lottos.length; i++) { // 0이 몇개 인지 확인
            if (lottos[i] == 0) {
                cnt++;
            }
            
            else {
                if(arrlist.contains(lottos[i])) { // 당첨번호랑 몇개 중복인지 확인
                    num++;
                }
            }
        }
        
        answer[0] = cnt+num;
        answer[1] = num;
        
        for (int i=0; i<answer.length; i++) {
            
            switch(answer[i]) {
                case 6: answer[i] = 1;
                    break;
                case 5: answer[i] = 2;
                    break;
                case 4: answer[i] = 3;
                    break;
                case 3: answer[i] = 4;
                    break;
                case 2: answer[i] = 5;
                    break;
                default: answer[i] = 6;
            }
            
            
        }
        
        
        return answer;
    }
}
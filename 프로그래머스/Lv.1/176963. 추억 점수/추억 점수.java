import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i=0; i<photo.length; i++) {
            
            int cnt=0;
            
            for (int k=0; k<photo[i].length; k++) {
                
                if (map.get(photo[i][k]) != null) {
                cnt = cnt + map.get(photo[i][k]);
                }
                
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}
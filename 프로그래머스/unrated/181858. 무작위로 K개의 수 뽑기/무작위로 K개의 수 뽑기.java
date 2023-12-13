import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        LinkedHashSet<Integer> harr = new LinkedHashSet<Integer>();
        
        for (int i=0; i<arr.length; i++) {
            harr.add(arr[i]);
        }
        
        for (int i=0; i<k; i++) {
            answer[i] = -1;
        }
        
        
        Iterator iter = harr.iterator();
        
        for (int i=0; i<harr.size(); i++) {
            answer[i] = Integer.parseInt(""+iter.next());
            
            if (i == answer.length-1) {
                break;
            }
        }
        
        return answer;
    }
}
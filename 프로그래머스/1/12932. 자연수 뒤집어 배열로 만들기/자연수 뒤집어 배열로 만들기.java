import java.util.*;
class Solution {
    public Integer[] solution(long n) {
        List<Integer> alist = new ArrayList<Integer>();
        
        while (n>0) {
            alist.add((int)(n%10));
            n /= 10;
        }
        
        Integer[] answer = alist.toArray(new Integer[alist.size()]);
        return answer;
    }
}
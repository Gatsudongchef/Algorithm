import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int cnt=0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i : reserve) { // 남는 체육복 배열
            arrlist.add(i);
        }
        
        
        int[] arr = new int[n]; // 학생 수만큼 배열 생성
        
        for (int i=0; i<arr.length; i++) { // 수업을 들을 수 있으면 1로 표현
            arr[i] = 1;
        }
        
        for (int i : lost) {
            if (arrlist.contains(i)) { // 본인이 잃어버렸는데 체육복 있으면 
                arrlist.remove(Integer.valueOf(i));
                continue;
            }
            arr[i-1] = 0; // 잃어버린 애들은 0으로 표현
        }
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                if (arrlist.contains(i)) {
                    arrlist.remove(Integer.valueOf(i));
                }
                
                else if (arrlist.contains(i+2)) {
                    arrlist.remove(Integer.valueOf(i+2));
                }
                
                else {
                    cnt++;
                }
            }
        }
        
        return n-cnt;
}
}
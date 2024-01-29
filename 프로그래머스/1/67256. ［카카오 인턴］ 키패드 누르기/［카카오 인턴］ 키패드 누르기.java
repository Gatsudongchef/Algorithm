import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder strb = new StringBuilder();
        Integer[] LC = {0, 0}; // 왼손 현재위치 *
        Integer[] RC = {0, 2}; // 오른손 현재위치 #
        
        HashMap<Integer, Integer[]> map = new HashMap<>();
        map.put(0, new Integer[]{0, 1});
        map.put(1, new Integer[]{3, 0});
        map.put(2, new Integer[]{3, 1});
        map.put(3, new Integer[]{3, 2});
        map.put(4, new Integer[]{2, 0});
        map.put(5, new Integer[]{2, 1});
        map.put(6, new Integer[]{2, 2});
        map.put(7, new Integer[]{1, 0});
        map.put(8, new Integer[]{1, 1});
        map.put(9, new Integer[]{1, 2});
        // 각 번호에 좌표값을 부여
        
        for (int i=0; i<numbers.length; i++) {
            
            if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                
            
            int leftLength = distance(map.get(numbers[i]), LC);
            int rightLength = distance(map.get(numbers[i]), RC);
            if (leftLength > rightLength) {
                strb.append("R");
                RC = map.get(numbers[i]);
            }
            
            else if (leftLength < rightLength) {
                strb.append("L");
                LC = map.get(numbers[i]);
            }
            
            else {
                switch(hand) {
                    case "right" : strb.append("R");
                                   RC = map.get(numbers[i]);
                                   break;
                    case "left" : strb.append("L");
                                   LC = map.get(numbers[i]);
                                   break;
                }
            }
                
            }
            
            else if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                strb.append("L");
                LC = map.get(numbers[i]);
            }
            
            else {
                strb.append("R");
                RC = map.get(numbers[i]);
            }
            
        }
        
        return strb.toString();
    }
    
    int distance(Integer[] A, Integer[] B) { // 두 좌표 사이의 거리 계산
        int x = Math.abs(A[0] - B[0]);
        int y = Math.abs(A[1] - B[1]);
        return x+y;
    }
    
}
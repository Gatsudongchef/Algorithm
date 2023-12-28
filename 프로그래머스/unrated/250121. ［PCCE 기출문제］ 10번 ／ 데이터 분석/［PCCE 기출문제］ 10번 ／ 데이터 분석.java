import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        
        for (int i=0; i<data.length; i++) {
            if (data[i][number(ext)] < val_ext) { // 분류 기준에 들었다면
                hashmap.put(data[i][number(sort_by)], i); // 해쉬맵에 넣음
                arrlist.add(data[i][number(sort_by)]); // 분류위해서 어레이리스트에 넣음
            }
        }
        
       Collections.sort(arrlist); // 오름차순으로 정렬함
        int[][] answer = new int[arrlist.size()][4];
        
        for (int i=0; i<arrlist.size(); i++) {
            for (int k=0; k<4; k++) {
            answer[i][k] = data[hashmap.get(arrlist.get(i))][k];
            }
            
        }
        
        return answer;
    }
    
    public int number(String str) {
        switch (str) {
            case "code" : return 0;
            case "date" : return 1;
            case "maximum" : return 2;
            case "remain" : return 3;
        }
        return 0;
    }
}
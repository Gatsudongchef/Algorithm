import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        today = today.replace(".", ""); // 날짜 포맷에서 . 제거
        String stringdate = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<terms.length; i++) { // hashmap에 조약이랑 만료기간 넣어둠
            String[] tmp = terms[i].split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        for (int i=0; i<privacies.length; i++) {
            String[] date = privacies[i].substring(0, 10).split("\\."); // 날짜 추출
            
            int add = map.get(""+privacies[i].charAt(privacies[i].length()-1)); // 조약으로 만료기간 추출
            
            
            date[2] = Integer.parseInt(date[2])-1+"";  
            if (date[2].equals("0")) {
                date[1] = Integer.parseInt(date[1]) - 1 + "";
                date[2] = "28";
            }
            
            date[1] = Integer.parseInt(date[1]) + (add%12) + "";
            if (Integer.parseInt(date[1]) > 12) {
                date[0] = Integer.parseInt(date[0])+1+"";
                date[1] = Integer.parseInt(date[1]) - 12 + "";
            }
            
            else if (date[1].equals("0")) { 
                date[0] = Integer.parseInt(date[0]) -1 +"";
                date[1] = "12";
            }
            
            if (add >= 12) { // 연도로 반환 가능하면 연도 더함
               date[0] = Integer.parseInt(date[0]) + (add / 12) + "";
            }
            
            for (int k=0; k<date.length; k++) { // 한자릿수면 0 더해주기
                if (date[k].length() == 1) {
                    date[k] = "0"+date[k];
                }
                
                stringdate += date[k];
                
            }
            
            int A = Integer.parseInt(today);
            int B = Integer.parseInt(stringdate);
            
            if (A > B) {
                arrlist.add(i+1);
            }
            
            stringdate = "";
        }
        
        int[] answer = new int[arrlist.size()];
        
        for (int i=0; i<arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        
        return answer;
    }
}
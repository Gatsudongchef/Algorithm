import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> solution(String[] record) {
        HashMap<String, String> hm = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for (String s : record) {

            if (s.split(" ")[0].equals("Leave")) {
                list.add(s.split(" ")[0] + " " + s.split(" ")[1]);
            } else if (s.split(" ")[0].equals("Enter")) {
                hm.put(s.split(" ")[1], s.split(" ")[2]);
                list.add(s.split(" ")[0] + " " + s.split(" ")[1]);
            } else {
                hm.put(s.split(" ")[1], s.split(" ")[2]);
            }

        }

        for (String s : list) {
            if (s.split(" ")[0].equals("Enter")) {
                answer.add(hm.get(s.split(" ")[1]) + "님이 들어왔습니다.");
                // System.out.println(hm.get(s.split(" ")[1]) + "님이 들어왔습니다.");
            } else {
                answer.add(hm.get(s.split(" ")[1]) + "님이 나갔습니다.");
                // System.out.println(hm.get(s.split(" ")[1]) + "님이 나갔습니다.");
            }
        }
        return answer;
    }
}
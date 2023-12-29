class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int total_press_count = 0;
            
            for (int k = 0; k < targets[i].length(); k++) {
                int compare = -1; // -99 대신 -1로 초기화

                for (int l = 0; l < keymap.length; l++) {
                    int num = keymap[l].indexOf(targets[i].charAt(k) + "");

                    if (num != -1) { // -1이 아니라면, 해당 문자를 찾았을 때만 처리
                        if (compare == -1) {
                            compare = num;
                        } else {
                            compare = Math.min(compare, num);
                        }
                    }
                }

                if (compare == -1) {
                    answer[i] = -1;
                    break; // loop 레이블 대신 break를 사용하여 바깥쪽 반복문을 종료
                }

                answer[i] += compare + 1;
            }
        }

        return answer;
    }
}

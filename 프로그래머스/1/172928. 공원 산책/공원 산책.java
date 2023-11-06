class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] tmp = new int[2];
        
        
        int maxHeight = park.length; // 공원의 세로 값
        int maxWidth = park[0].length(); // 공원의 가로 값 
        
        for (int i=0; i<park.length; i++) { // 시작 위치 찾는 함수
            for (int j=0; j<park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    
                    break;
                }
            }
            
        }
        
        loop :
        for (int i=0; i<routes.length; i++) {
            
           int num = Integer.parseInt(routes[i].substring(2)); // 가야하는 거리
            switch (routes[i].substring(0, 1)) {
                case "E":
                    tmp[0] = answer[0];
                    tmp[1] = answer[1];
                    
                    for (int j=0; j<num; j++) {
                        tmp[1]++;
                        
                        if (tmp[1]>=maxWidth || park[tmp[0]].charAt(tmp[1]) == 'X') {
                           continue loop;
                        }
                    }
                    
                    answer[0] = tmp[0];
                    answer[1] = tmp[1];
                break;
                    
                case "W":
                    tmp[0] = answer[0];
                    tmp[1] = answer[1];
                    
                    for (int j=0; j<num; j++) {
                        tmp[1]--;
                        
                        if (tmp[1]<0 || park[tmp[0]].charAt(tmp[1])=='X') {
                            continue loop;
                        }
                    }
                    
                    answer[0] = tmp[0];
                    answer[1] = tmp[1];
                break;
                    
                case "N":
                    tmp[0] = answer[0];
                    tmp[1] = answer[1];
                    
                    for (int j=0; j<num; j++) {
                        tmp[0]--;
                        
                        if (tmp[0]<0 || park[tmp[0]].charAt(tmp[1])=='X') {
                            continue loop;
                        }
                    }
                    
                    answer[0] = tmp[0];
                    answer[1] = tmp[1];
                break;
                    
                case "S":
                    tmp[0] = answer[0];
                    tmp[1] = answer[1];
                  
                    for (int j=0; j<num; j++) {
                        tmp[0]++;
                        
                        if (tmp[0]>=maxHeight || park[tmp[0]].charAt(tmp[1])=='X') {
                            continue loop;
                        }
                    }
                    
                    answer[0] = tmp[0];
                    answer[1] = tmp[1];
                break;
            }
            
        }
        
        return answer;
    }
    
}
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        
        int cnt=0;
        
        
        for (int i=0; i<picture.length; i++) {
            for (int j=0; j<picture[0].length(); j++) {
                if(picture[i].charAt(j) == '.') {
                    for (int l=0; l<k; l++) {
                        sb.append(".");
                    }
                }
                
                else {
                    for (int l=0; l<k; l++) {
                        sb.append("x");
                    }
                }
                
            }
            
            for (int m=0; m<k; m++) {
                answer[cnt] = sb.toString();
                cnt++;
            }
            sb.setLength(0);
            
            
        }
        
        return answer;
    }
}
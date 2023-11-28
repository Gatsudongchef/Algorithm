class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] array = new int[201];
        
        for (int i=0; i<lines.length; i++) {
            
            if (lines[(i+1)%3][1] > lines[i][0] && lines[i][1] > lines[(i+1)%3][0]) {
                //겹친다면
                int x = Math.max(lines[i][0], lines[(i+1)%3][0]);
                int y = Math.min(lines[i][1], lines[(i+1)%3][1]);

                
                for (int k=x; k<y; k++) {
                    array[k+100] = 1;
                }
                
            }
            
            //else if (lines[])
            
        }
        
        for (int i=0; i<array.length; i++) {
            if (array[i] == 1) {
                answer++;
            }
        } 
        
        
        return answer;
    }
}
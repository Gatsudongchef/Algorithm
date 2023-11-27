class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        String[] Direction = {"Right", "Down", "Left", "Up"};
        int dirnum=0;
        int num=2;
        int x=0;
        int y=0;
        
        answer [0][0] = 1;
        
        while (num <= n*n) {
            
             switch(Direction[dirnum%4]) {
                 case "Right":
                     x++;
                     if(x>=n || answer [y][x] != 0) {
                         x--;
                     }
                     break;
                 case "Down":
                     y++;
                     if(y>=n || answer [y][x] != 0) {
                         y--;
                     }
                     break;
                 case "Left":
                     x--;
                     if(x<0 || answer [y][x] != 0) {
                         x++;
                     }
                     break;
                 case "Up":
                     y--;
                     if(y<0 || answer [y][x] != 0) {
                         y++;
                     }
                     break;
            }
            
            if (answer [y][x] == 0) {
                answer [y][x] = num;
                num++;
            }
            
            else {
                dirnum++;
            }
            
            
        }
        
        return answer;
    }
    
}
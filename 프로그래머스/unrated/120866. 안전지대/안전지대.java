class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i=0; i<board.length; i++) {
            for (int k=0; k<board[0].length; k++) {
                
                if (board[i][k] == 1) {
                    
                    if (i-1 >=0) { // 위
                        board[i-1][k] = (board[i-1][k] != 1) ? 2 : board[i-1][k];
                        if (k-1 >=0) { // 왼쪽 위
                            board[i-1][k-1] = (board[i-1][k-1] != 1) ? 2 : board[i-1][k-1];
                        }
                        
                        if (k+1 <= board[0].length-1) { // 오른쪽 위
                            board[i-1][k+1] = (board[i-1][k+1] != 1) ? 2 : board[i-1][k+1];
                        }
                        
                    }
                    
                    if (k-1 >=0) { // 왼쪽
                        board[i][k-1] = (board[i][k-1] != 1) ? 2 : board[i][k-1];
                    }
                        
                    if (k+1 <= board[0].length-1) { // 오른쪽
                        board[i][k+1] = (board[i][k+1] != 1) ? 2 : board[i][k+1];
                    }
                    
                    if (i+1 <= board.length-1) { // 아래
                        board[i+1][k] = (board[i+1][k] != 1) ? 2 : board[i+1][k];
                        if (k-1 >=0) { // 왼쪽 아래
                            board[i+1][k-1] = (board[i+1][k-1] != 1) ? 2 : board[i+1][k-1];
                        }
                        
                        if (k+1 <= board[0].length-1) { // 오른쪽 아래 
                            board[i+1][k+1] = (board[i+1][k+1] != 1) ? 2 : board[i+1][k+1];
                        }
                        
                    }
                        
                }
                        
              }
            }
        
        for (int i=0; i<board.length; i++) {
            for (int k=0; k<board[0].length; k++) {
                if (board[i][k] == 0) {
                    answer++;
                }
            }
        }
        
        
        
        
        return answer;
    }
}
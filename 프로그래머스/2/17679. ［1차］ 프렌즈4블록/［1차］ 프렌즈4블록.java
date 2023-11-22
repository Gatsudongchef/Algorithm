import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                arr[i][k] = board[i].charAt(k);
            }
        }

        while (true) {
            HashSet<String> delete = new HashSet<>();

            for (int k = 0; k < m - 1; k++) {
                for (int i = 0; i < n - 1; i++) {
                    if (arr[k][i] != '0' && arr[k][i] == arr[k][i + 1] && arr[k][i] == arr[k + 1][i] && arr[k + 1][i] == arr[k + 1][i + 1]) 
                         {
                            delete.add("" + k + " " + i);
                            delete.add("" + k + " " + (i + 1));
                            delete.add("" + (k + 1) + " " + i);
                            delete.add("" + (k + 1) + " " + (i + 1));
                        }
                    
                }
            }

            if (delete.isEmpty()) {
                break;
            }

            answer += delete.size();
            Iterator<String> iter = delete.iterator();

            while (iter.hasNext()) {
                String str = iter.next();
                String[] arrstr = str.split(" ");

               int x = Integer.parseInt(arrstr[0]);
               int y = Integer.parseInt(arrstr[1]);

                arr[x][y] = '0';
            }

            for (int i = m - 1; i >= 0; i--) {
                for (int k = 0; k < n; k++) {
                    if (arr[i][k] == '0') {
                        int idx = i;
                        while (idx > 0 && arr[idx][k] == '0') {
                            idx--;
                        }
                        arr[i][k] = arr[idx][k];
                        arr[idx][k] = '0';
                    }
                }
            }
        }

        return answer;
    }
}

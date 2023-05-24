import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] A = new int[answers.length];
        int[] B = new int[answers.length];
        int[] C = new int[answers.length];
        int[] cnt = new int[3];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i=0; i<answers.length; i++) {
            A[i] = (i%5)+1;
            
            switch (i%8) {
                case 0,2,4,6: B[i] = 2;
                    break;
                case 1: B[i] = 1;
                    break;
                case 3: B[i] = 3;
                    break;
                case 5: B[i] = 4;
                    break;
                case 7: B[i] = 5;
                    break;    
            }

      
            switch(i%10) {
            case 0,1: C[i] = 3;
                     break;
            case 2,3: C[i] = 1;
                     break;
            case 4,5: C[i] = 2;
                     break;
            case 6,7: C[i] = 4;
                     break;
            case 8,9: C[i] = 5;
                     break;        
            }
            
            if (answers[i] == A[i]) {
                cnt[0]++;
            }
            
            if (answers[i] == B[i]) {
                cnt[1]++;
            } 
            
            if (answers[i] == C[i]) {
                cnt[2]++;
            } 
            
            
        }
        
        int tmp = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
        for (int i=0; i<cnt.length; i++) {
            if (tmp == cnt[i]) {
            arrayList.add(i+1);
        } 
        }
        
        
       
        
        return arrayList;
    }
}
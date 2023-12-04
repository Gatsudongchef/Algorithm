import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        for (int i=0; i<query.length; i++) {
            if (i%2 == 0) { // 짝수 인덱스라면
               int[] newarr = new int[query[i]+1];
                
                for (int k=0; k<=query[i]; k++) {
                    newarr[k] = arr[k];
                }
                
                arr = newarr;
            }
            
            else { // 홀수 인덱스라면
                int[] newarr = new int[(arr.length)-query[i]];
                
                for (int k=0; k<(arr.length)-query[i]; k++) {
                    newarr[k] = arr[k+query[i]];
                }
                
                arr = newarr;
            }
        }
        
        return arr;
    }
}
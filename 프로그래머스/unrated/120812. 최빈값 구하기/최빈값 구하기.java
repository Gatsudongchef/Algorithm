class Solution {
    public int solution(int[] array) {
        int[] num = new int[1000];
        int tmp=0;
        int max=0;
        int answer = 0;
        
        for (int i=0; i<array.length; i++) {
            num[array[i]]++;
        }

        for (int i=0; i<num.length; i++) {
            if (tmp < num[i]) {
                tmp = num[i];
                answer = i;
            }
            
            else if (tmp == num[i]) {
                max = tmp;
            }
        }
         
        
        
        return (max != 0 && max == tmp) ? -1 : answer;
    }
}
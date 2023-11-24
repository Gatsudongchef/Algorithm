class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int time=0; // 시간.
        int cnt=0; // 반복문의 사이클
        int bonus=0; // 힐 보너스 스택
        int healthmax = health; // 최대 체력
        
        while(cnt <= attacks[attacks.length-1][0]) {
            
            bonus++;
            
            if (time==attacks[cnt][0]) {
                health -= attacks[cnt][1];
                
                if (health <= 0) {
                    return -1;
                }
                
                if (cnt == (attacks.length-1)) {
                    return health;
                }
                
                cnt++;
                time++;
                bonus = 0;
            }
            
            else {
            
            if ( bonus == bandage[0]) { // 힐 보너스
                bonus = 0;
                health = (health + bandage[2] > healthmax) ? healthmax : health + bandage[2];
            }
            
            health = (health + bandage[1] > healthmax) ? healthmax : health + bandage[1]; // 초당 힐
            
            time++;
         }   
        }
        
        return health;
        
    }
}
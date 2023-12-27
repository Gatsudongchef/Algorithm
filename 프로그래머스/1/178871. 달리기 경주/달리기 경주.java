import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String,Integer> playersrank = new HashMap<>();
        HashMap<Integer,String> rankplayers = new HashMap<>();
        
        for (int i=0; i<players.length; i++) { // HashMap 에 이름이랑 등수 저장
            playersrank.put(players[i], i+1);
            rankplayers.put(i+1, players[i]);
        }
        
       for (int i=0; i<callings.length; i++) {
            int currentRank = playersrank.get(callings[i]);
            String currentPlayer = rankplayers.get(currentRank);
            String frontPlayer = rankplayers.get(currentRank-1);
           
           playersrank.put(currentPlayer, currentRank-1);
           playersrank.put(frontPlayer, currentRank);
           
           rankplayers.put(currentRank-1, currentPlayer);
           rankplayers.put(currentRank, frontPlayer);
        }
        
        for (int i=0; i<players.length; i++) {
            players[i] = rankplayers.get(i+1);
        }
        
        
        return players;
        
    }
    
}
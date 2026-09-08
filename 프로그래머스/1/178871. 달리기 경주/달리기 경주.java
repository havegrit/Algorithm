import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> playerToRank = new HashMap<>();
        Map<Integer, String> rankToPlayer = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerToRank.put(players[i], i + 1);
            rankToPlayer.put(i + 1, players[i]);
        }
        
        for (String call : callings) {
            int rank = playerToRank.remove(call);
            String player = rankToPlayer.remove(rank - 1);
            playerToRank.put(call, rank - 1);
            playerToRank.put(player, rank);
            rankToPlayer.put(rank - 1, call);
            rankToPlayer.put(rank, player);
        }
        
        for (Map.Entry<String, Integer> entry : playerToRank.entrySet()) {
            String player = entry.getKey();
            int rank = entry.getValue();
            
            answer[rank - 1] = player;
        }
        
        return answer;
    }
}
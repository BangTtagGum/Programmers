import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 2023.08.21
 * 달리기 경주
 */
public class _178871 {
    public String[] solution(String[] players, String[] callings) {

        String [] runners = new String[players.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            runners[i]= players[i];
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            Integer rank = map.get(callings[i]);
            map.put(runners[rank], rank - 1);
            map.put(runners[rank - 1], rank);
            String temp = runners[rank];
            runners[rank] = runners[rank - 1];
            runners[rank - 1] = temp;
            for (String runner : runners) {
                System.out.print(runner+ " ");
            }
        }

        return runners;
    }

    public static void main(String[] args) {

    }
}


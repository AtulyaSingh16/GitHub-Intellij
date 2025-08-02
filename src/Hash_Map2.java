//2.counting votes

import java.util.HashMap;

public class Hash_Map2 {
    public static void main(String[] args) {
        HashMap<String,Integer> votes = new HashMap<>();
        String []candidates = {"Alice","Bob","Alice"};
        for(String candidate : candidates)
        {
            votes.put(candidate,votes.getOrDefault(candidate,0)+1);
        }
        System.out.println("Votes : "+votes);
    }
}

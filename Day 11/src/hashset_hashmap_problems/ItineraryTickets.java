package hashset_hashmap_problems;

import java.util.HashMap;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start);
    }

    private static String getStart(HashMap<String, String> tickets) {
        HashMap<String,String> revTic = new HashMap<>();

        // storing value of tickets as key in the revTic and key as the value
        for (String key : tickets.keySet()) {
            revTic.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revTic.containsKey(key)) {
                return key;
            }
        }

        return null;

    }
}

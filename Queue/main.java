
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {

        String filename = "input.txt"; 
        int k = 3;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        HashMap<String, Integer> map = new HashMap<>();

        while ((line = br.readLine()) != null) {

            line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

            String[] words = line.split(" ");

            for (String w : words) {
                if (w.isEmpty()) continue;
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq // maxHeap كذا خليناها
        );

        for (String w : map.keySet()) {
            maxHeap.add(new Pair(w, map.get(w)));
        }

        for (int i = 0; i < k; i++) {
            Pair p = maxHeap.poll();
            System.out.println(p.word + " " + p.freq);
        }
    }
}

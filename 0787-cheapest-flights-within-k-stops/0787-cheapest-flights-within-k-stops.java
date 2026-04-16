import java.util.*;

class Pair {
    int node, cost, stops;

    Pair(int node, int cost, int stops) {
        this.node = node;
        this.cost = cost;
        this.stops = stops;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // Build graph
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] f : flights) {
            adj.get(f[0]).add(new int[]{f[1], f[2]});
        }

        // dist[node][stops] = min cost
        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        // PQ sorted by cost
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        pq.add(new Pair(src, 0, 0));
        dist[src][0] = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            int node = curr.node;
            int cost = curr.cost;
            int stops = curr.stops;

            // ✅ If reached destination → best possible due to PQ
            if (node == dst) return cost;

            // Stop limit check
            if (stops > k) continue;

            for (int[] nei : adj.get(node)) {
                int next = nei[0];
                int price = nei[1];

                if (cost + price < dist[next][stops + 1]) {
                    dist[next][stops + 1] = cost + price;
                    pq.add(new Pair(next, cost + price, stops + 1));
                }
            }
        }

        return -1;
    }
}
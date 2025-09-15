import java.util.*;

class Pair {
    int node, time;
    Pair(int n, int t) {
        node = n;
        time = t;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new Pair(v, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node, time = cur.time;

            for (Pair nei : adj.get(node)) {
                if (time + nei.time < dist[nei.node]) {
                    dist[nei.node] = time + nei.time;
                    pq.add(new Pair(nei.node, dist[nei.node]));
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}

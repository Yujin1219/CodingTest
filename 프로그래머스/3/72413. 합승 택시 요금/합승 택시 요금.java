import java.util.*;

class Solution {
    static List<Node>[] graph;
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 그래프에 간선 추가 (양방향)
        for (int[] fare : fares) {
            graph[fare[0]].add(new Node(fare[1], fare[2]));
            graph[fare[1]].add(new Node(fare[0], fare[2]));
        }

        // 각 지점에서의 최단 거리 계산
        int[] distS = dijkstra(n, s); //s에서 부터 모든 노드까지의 최단거리
        int[] distA = dijkstra(n, a); //a에서 부터 모든 노드까지의 최단거리
        int[] distB = dijkstra(n, b); //b에서 부터 모든 노드까지의 최단거리

        int minCost = distS[a] + distS[b]; // 합승하지 않는 경우

        // 중간 지점에서 부터 s, a, b까지의 각각 거리를 더하고 그 최소값을 구한다
        for (int i = 1; i <= n; i++) {
            int cost = distS[i] + distA[i] + distB[i];
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
    
    static class Node {
        int v;
        int cost;
        Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }
    }
    
    static int[] dijkstra(int n, int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((e1, e2) -> e1.cost - e2.cost);

        int[] dist = new int[n + 1];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int nexts = current.v;
            int currentCost = current.cost;
            
            if (currentCost > dist[nexts]) continue;
            
            for (Node next : graph[nexts]) {
                int v = next.v;
                int weight = next.cost;
                
                if (dist[v] > currentCost + weight) {
                    dist[v] = currentCost + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }
        return dist;
    }
}

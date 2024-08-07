import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= n; i++)
            graph.put(i, new ArrayList<>()); // graph를 저장할 맵을 초기화
        
        for(int[] e : edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 0}); // 시작 노드 1, 초기 거리 0
        visited[1] = true; // 시작 노드 방문 처리
        
        int maxDist = 0, count = 0;
        while(!q.isEmpty()){
            int[] cur = q.remove();
            
            if(maxDist < cur[1]){
                maxDist = cur[1];
                count = 1; // 초기화
            }else if(maxDist == cur[1]) count++;
            
            for(int next : graph.get(cur[0])){
                if(!visited[next]){
                    visited[next] = true;
                    q.add(new int[] { next, cur[1] + 1});
                }else continue;
            }
        }
        return count;
    }
}
import java.util.*;

class Solution {
    int answer;
    public int solution(int n, int[][] wires) {
        answer = n;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for(int i = 1; i <= n; i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] wire : wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        boolean[] visited = new boolean[n + 1];
        
        dfs(n, visited, graph, 1);
        return answer;
    }
    
    int dfs(int n, boolean[] visited, Map<Integer, List<Integer>> graph, int cur){
        int count = 1;
        visited[cur] = true;
        
        for(int next: graph.get(cur)){
            if(!visited[next]){
                visited[next] = true;
                count += dfs(n, visited, graph, next);
            }
        }
        answer = Math.min(answer, Math.abs(n - count * 2));
        return count;
    }
}
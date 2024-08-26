class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(computers, i);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int[][] computers, int i){
        visited[i] = true;
        
        for(int j = 0; j < computers.length; j++){
            if(!visited[j] && computers[i][j] == 1)
                dfs(computers, j);
        }
    }
}
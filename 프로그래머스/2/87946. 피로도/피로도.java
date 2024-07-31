class Solution {
    int answer = 0;
    int n;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        n =  dungeons.length; // 배열의 길이
        visited = new boolean[n];
        backtrack(k, 0, dungeons);
        return answer;
    }
    
    public void backtrack(int k, int cnt, int[][] dungeons){
        
        if(cnt > answer)
            answer = cnt; // answer의 최댓값 갱신
        
        for(int i = 0; i < n; i++){
            if(k >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                backtrack(k - dungeons[i][1], cnt + 1, dungeons);
                visited[i] = false; //백트래킹 기법: 원래 상태로 되돌려놓기 
            }
        }
    }
}
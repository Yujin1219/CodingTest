import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int answer = 0;
        char[][] maze = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        
        for(int i = 0; i < n; i++){
            maze[i] = maps[i].toCharArray();
            
            for(int j = 0; j < m; j++){
                if(maze[i][j] == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
                else if(maze[i][j] == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                }
                else if(maze[i][j] == 'E') {
                    exit[0] = i;
                    exit[1] = j;
                }
            }
        }
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {-1, 0, 1, 0};
        
        // 첫 번째 BFS: start -> lever
        Queue<int[]> q1 = new ArrayDeque<>();
        q1.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        boolean toLever = false;
        while(!q1.isEmpty()){
            int[] cur = q1.remove();
            int r = cur[0], c = cur[1], dist = cur[2];
            
            if(r == lever[0] && c == lever[1]) {
                answer = dist;
                toLever = true;
                break;
            }
            
            for(int d = 0; d < 4; d++){
                int nr = r + dr[d], nc = c + dc[d];
                
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc] && maze[nr][nc] != 'X'){
                    visited[nr][nc] = true;
                    q1.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        if(!toLever) return -1;

        // visited 배열 초기화
        visited = new boolean[n][m];

        // 두 번째 BFS: lever -> exit
        Queue<int[]> q2 = new ArrayDeque<>();
        q2.add(new int[]{lever[0], lever[1], 0});
        visited[lever[0]][lever[1]] = true;
        boolean toExit = false;
        
        while(!q2.isEmpty()){
            int[] cur = q2.remove();
            int r = cur[0], c = cur[1], dist = cur[2];
            
            if(r == exit[0] && c == exit[1]) {
                answer += dist;
                toExit = true;
                break;
            }
            
            for(int d = 0; d < 4; d++){
                int nr = r + dr[d], nc = c + dc[d];
                
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc] && maze[nr][nc] != 'X'){
                    visited[nr][nc] = true;
                    q2.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        if(!toExit) return -1;
        
        return answer;
     }
}

import java.util.*;

public class Main {
    public static int[][] graph;  // 그래프를 나타내는 인접 행렬
    public static boolean[] visit; // 정점의 방문 여부를 저장하는 배열
    public static int count = 0;   // 연결 요소의 개수를 세는 변수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정점의 개수(N)와 간선의 개수(M)를 입력 받음
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 그래프의 크기를 정점의 개수에 맞게 초기화
        // N + 1 이유 : 정점 번호를 1번부터 시작 (인덱스 0 사용 X)
        graph = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        
        // 간선 정보 입력 받아 그래프에 저장
        for(int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x][y] = graph[y][x] = 1;  // 무방향 그래프이므로 양방향으로 연결
        }
        
        // DFS를 통해 연결 요소 개수 구하기
        for(int i = 1; i <= N; i++) {
            // 빙문하지 않았다면 DFS 호출, count++
            if(!visit[i]) {
                DFS(i);
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
    
    // 깊이 우선 탐색 (DFS) 메소드
    public static void DFS(int vertex) {
        visit[vertex] = true;  // 정점 방문 처리
        for(int i = 1; i < graph.length; i++) {
            // 방문하지 않은 정점이고, 현재 정점과 연결되어 있는 경우 DFS 호출
            if(!visit[i] && graph[vertex][i] == 1) {
                DFS(i);
            }
        }
    }
}
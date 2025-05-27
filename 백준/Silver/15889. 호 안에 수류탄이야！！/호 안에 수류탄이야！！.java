import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int[] pos = new int[N];           // 위치 배열
        int[] range = new int[N - 1];     // 사거리 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
        }

        if (N > 1) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N - 1; i++) {
                range[i] = Integer.parseInt(st.nextToken());
            }
        }

        int maxReach = 0; // 현재까지 도달 가능한 가장 먼 위치
        int i = 0;        // 지금 탐색할 사람의 인덱스

        for (; i < N - 1 && pos[i] <= maxReach; i++) {
            int reach = pos[i] + range[i];     // 이 전우가 던질 수 있는 거리
            maxReach = Math.max(maxReach, reach); // 최대 도달 위치 갱신

            // 다음 전우가 pos[]에 정렬되어 있으므로 i만 증가
        }

        // 마지막 전우의 위치가 maxReach 이하라면 도달 가능
        if (pos[N - 1] <= maxReach) {
            System.out.println("권병장님, 중대장님이 찾으십니다");
        } else {
            System.out.println("엄마 나 전역 늦어질 것 같아");
        }
    }
}

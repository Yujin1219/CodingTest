import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static boolean[] visited;
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int N = sc.nextInt();
    static int M = sc.nextInt();

    public static void main(String[] args) {
        arr = new int[M];
        visited = new boolean[N];
        dfs(0, 1);
        System.out.println(sb);
    }

    public static void dfs(int depth, int start){
        if(depth == M){
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start - 1; i < N; i ++){
            arr[depth] = i + 1;
            dfs(depth + 1, start);
            start++;
        }
    }
}

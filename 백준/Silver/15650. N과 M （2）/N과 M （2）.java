import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static boolean[] visited;
    static Scanner sc = new Scanner(System.in);

    static int N = sc.nextInt();
    static int M = sc.nextInt();

    public static void main(String[] args) {
        arr = new int[M];
        visited = new boolean[N];
        dfs(0, 1);
    }

    public static void dfs(int depth, int start){
        if(depth == M){
            for(int val : arr)
                System.out.print(val + " ");
            System.out.println();
            return;
        }

        for(int i = start - 1; i < N; i ++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수 입력
        int[] arr = new int[N]; // 왼쪽에 키 큰 사람 수 정보 저장 배열

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 배열 초기화
        }

        ArrayList<Integer> line = new ArrayList<>(); // 최종 줄 배열

        // 키가 작은 사람부터 (1 ~ N) 넣는다.
        for (int height = N; height >= 1; height--) {
            // arr[height-1] : 이 사람보다 큰 사람이 왼쪽에 몇 명 있었는지
            line.add(arr[height - 1], height);
        }

       for (int person : line) {
            System.out.print(person + " ");
        }
    }
}

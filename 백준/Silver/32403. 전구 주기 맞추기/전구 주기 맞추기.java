import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 전구 개수
        int T = sc.nextInt();   // 목표 시점

        int[] bulbs = new int[N];
        for (int i = 0; i < N; i++) {
            bulbs[i] = sc.nextInt();
        }

        // T의 약수 구하기
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            if (T % i == 0) {
                divisors.add(i);
            }
        }

        // 최소 조작 횟수 구하기
        int result = 0;
        for (int bulb : bulbs) { 
            int minChange = Integer.MAX_VALUE; 
            for (int divisor : divisors) {
                int diff = Math.abs(bulb - divisor); 
                minChange = Math.min(minChange, diff); // 최소값으로 갱신
            }
            result += minChange;
        }

        System.out.println(result);
    }
}

import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_009;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine(); // 차량 번호판 형식

        long result = 1;

        for (int i = 0; i < pattern.length(); i++) {
            char current = pattern.charAt(i);

            // 가능한 경우의 수 계산
            int choices = 0;
            if (current == 'c') {
                choices = 26;
            } else if (current == 'd') {
                choices = 10;
            }

            // 이전 문자와 같으면 중복 제거
            if (i > 0 && pattern.charAt(i) == pattern.charAt(i - 1)) {
                choices -= 1;
            }

            result = (result * choices) % MOD;
        }

        System.out.println(result);
    }
}

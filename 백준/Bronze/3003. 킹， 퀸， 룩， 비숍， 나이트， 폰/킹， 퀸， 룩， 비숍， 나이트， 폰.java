import java.util.Scanner;

// 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d\n", 1 - a, 1 - b, 2 - c, 2 - d, 2 - e, 8 - f);
        }
    }

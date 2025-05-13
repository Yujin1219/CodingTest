import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        while (N != 0) {
            String strN = String.valueOf(N); // 문자열로 변환
            if (strN.contains("1")) { // 1 포함시
                // '1'을 하나 제거
                int index = strN.indexOf('1'); // 가장 맨 앞의 1의 위치를 찾음
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strN.length(); i++) {
                    if (i != index) sb.append(strN.charAt(i)); // 해당 위치 문자열을 빼고 붙임
                }
                String resultStr = sb.toString().replaceFirst("^0+", ""); // 앞쪽 0 제거
                N = resultStr.isEmpty() ? 0 : Integer.parseInt(resultStr);
            } else {
                N--; // '1'이 없으면 -1
            }
            count++;
        }

        System.out.println(count);
    }
}

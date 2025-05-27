import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int totalZero = 0, totalOne = 0;
        for (char c : input.toCharArray()) {
            if (c == '0') totalZero++;
            else totalOne++;
        }

        int removeOne = totalOne / 2;
        int keepZero = totalZero / 2;

        StringBuilder temp = new StringBuilder();

        // 앞에서부터 1 제거
        for (char c : input.toCharArray()) {
            if (c == '1' && removeOne > 0) {
                removeOne--;
            } else {
                temp.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int zeroCount = 0;

        // 앞에서부터 순서대로 0 keepZero개만 남김
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c == '0') {
                if (zeroCount < keepZero) {
                    result.append('0');
                    zeroCount++;
                }
                // 아니라면 생략 (사실상 제거)
            } else {
                result.append('1');
            }
        }

        System.out.println(result.toString());
    }
}

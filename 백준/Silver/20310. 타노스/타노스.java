import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int totalZero = 0;
        int totalOne = 0;

        // 전체 0, 1 개수 세기
        for (char c : input.toCharArray()) {
            if (c == '0') totalZero++;
            else totalOne++;
        }

        int removeOne = totalOne / 2;
        int removeZero = totalZero / 2;

        StringBuilder temp = new StringBuilder();

        // 앞에서부터 1 제거
        for (char c : input.toCharArray()) {
            if (c == '1' && removeOne > 0) {
                removeOne--;
            } else {
                temp.append(c);
            }
        }

        StringBuilder answer = new StringBuilder();

        // 뒤에서부터 0 제거
        for (int i = temp.length() - 1; i >= 0; i--) {
            char c = temp.charAt(i);
            if (c == '0' && removeZero > 0) {
                removeZero--;
            } else {
                answer.append(c);
            }
        }

        // 역순으로 저장했으므로 뒤집어서 출력
        System.out.println(answer.reverse().toString());
    }
}

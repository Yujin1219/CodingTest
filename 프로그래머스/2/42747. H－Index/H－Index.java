//[3, 0, 6, 1, 5] -? [0, 1, 3, 5, 6]
//i = 0 (index 0)-> 0 (1개)
//i = 1 (index 1)-> 0, 1 (2개)
//i = 3 (index 2)-> 0, 1, 3 (3개) **
//i = 5 (index 3)-> 0, 1, 3, 5 (4개)
//i = 6 (index 4)-> 0, 1, 3, 5, 6 (5개)
//index의 값이 citations[i] - 1과 같으면 answer!!
import java.util.*;


class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            // 남은 논문의 수
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}

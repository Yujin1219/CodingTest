// 배열의 크기가 elements 의 2배인 배열 생성 [7,9,1,1,4]	-> [7,9,1,1,4,7,9,1,1,4] 
// 중복제거 -> HashSet 이용(중복된 값은 자동 제거)
// 처음엔 하나씩 넣기, 두번째에는 두개씩 더해서 넣기...elements.length까지...
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] array = new int[n * 2];
        
        //배열을 두번 이어 붙힌다. -> 마지막 원소의 덧셈을 위해서
        for (int i = 0; i < n; i++) {
            array[i] = elements[i];
            array[i + n] = elements[i];
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        // length : 길이가 1인 연속 부분수열, 2인 연속 부분수열...
        // start : 덧셈을 시작하는 원소
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = 0; k < length; k++) {
                    sum += array[start + k];
                }
                set.add(sum);
            }
        }
        
        // 결과는 집합의 크기 (중복되지 않는 합의 개수)
        return set.size();
    }
}

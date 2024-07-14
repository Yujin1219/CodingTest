//array	                 commands	                        return
//[1, 5, 2, 6, 3, 7, 4]	 [[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
// commands의 1번째 원소부터 2번째 원소까지 잘라 저장 -> 정렬
// index = 0, commands의 세번째 원소의 값만큼 더해서 배열[index] 를 뽑아옴, 그 값을 return에 저장
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int K = commands[i][2];
            int[] result = new int[end - start + 1]; 
            
            int index = 0; 
            for(int j = start - 1; j < end; j++){
                result[index++] = array[j];
            }
            
            Arrays.sort(result);
            answer[i] = result[K - 1];
        }
        return answer;
    }
}
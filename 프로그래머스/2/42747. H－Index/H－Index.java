//[3, 0, 6, 1, 5] -? [0, 1, 3, 5, 6]
//int h = citations.length - i  
//i = 0 (h = 5)-> 5번 이상 2편(5번 이상이 5편 이상이여야함) -> 조건 만족 X
//i = 1 (h = 4)-> 4번 이상 2편(4번 이상이 4편 이상이여야함) -> 조건 만족 X
//i = 3 (h = 3)-> 3번 이상 3편(3번 이상이 3편 이상이여야함) -> 조건 만족(최댓값)->H-index
//i = 5 (h = 2)-> 2번 이상 3편(2번 이상이 2편 이상이여야함) -> 조건 만족
//i = 6 (h = 1)-> 1번 이상 4편(1번 이상이 1편 이상이여야함) -> 조건 만족
//

// 초기 answer의 값은 citations의 길이
// citations를 내림차순 정렬해서
// 만약 배열의 값이 answer 보다 작아지면 그때 배열의 값 출력
// [4, 5, 6, 0]
// [6, 5, 4, 0]
// 4   4   4  

import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for(int i = 1; i < citations.length + 1; i++){
            //citations[citations.length - i] : i 번째로 큰 수 
            //i번째로 큰 수가 i 보다 작으면 !!!!!!!!!!!
            if(citations[citations.length - i] < i)
                break;
            answer = i;
        }
        return answer;
}
}
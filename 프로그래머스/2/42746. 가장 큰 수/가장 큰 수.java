import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]); // numbers 배열을 문자열 배열로 변환
        }
        
        // 두 문자열을 합쳐 더 큰 값이 될 수 있도록 하는 순서로 정렬
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // sort 정렬 한 배열의 첫번째 원소가 0 -> 가장 큰수가 0이고 나머지도 다 0 -> 0 return
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        // string으로 합치기
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
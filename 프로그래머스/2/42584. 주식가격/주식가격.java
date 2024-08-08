import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int pop = stack.pop();
            answer[pop] = n - pop - 1;
        }
        
        return answer;
    }
}
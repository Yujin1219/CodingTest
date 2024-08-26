import java.util.*;

class Solution {
    
    Set<Integer> check = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        p(numbers, 0, 0);
        
        int answer = 0;
        for(int num : check)
            if(isPrime(num)) answer++;
            
            return answer;
        
        
    }
    
    void p(String numbers, int cur, int digit){
        if(digit == numbers.length()) return;
        
        for(int i = 0; i < numbers.length(); i++){
            if(visited[i]) continue;
            
            int newValue = cur + (int)((numbers.charAt(i) - '0') * Math.pow(10, digit));
            
            check.add(newValue);
            
            visited[i] = true;
            p(numbers, newValue, digit + 1);
            
            visited[i] = false;
        }
    }
    
    boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        
        return true;
    }
}
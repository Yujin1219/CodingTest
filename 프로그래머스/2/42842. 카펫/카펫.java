class Solution {
    public int[] solution(int brown, int yellow) {
        
        int n = brown + yellow;
        
        int y;
        
        for(int i = 3 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                y = n / i;
                
                if((i-2)*(y-2)== yellow) {
                    return new int[]{y, i};
                }
            }
        }
        
        return new int[]{0,0};
    }
}
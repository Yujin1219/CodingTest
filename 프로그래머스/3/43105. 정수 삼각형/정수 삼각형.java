
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int h = triangle.length;
        int[][] dp = new int[h][h];
        
        // 삼각형의 첫번째 원소를 dp 배열에 초기화
        dp[0][0] = triangle[0][0];
        
        // 삼각형의 가장 왼쪽 원소들을 초기화
        for(int i = 1; i < h; i++)
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
        
        // 나머지 경로에 대한 최댓값 계산
        for(int i = 1; i < h; i++){
            for(int j = 1; j <= i; j++) // 삼각형 형태의 배열 구조로 i까지 반복
                // 바로 위와 그 왼쪽 중 큰 값을 선택하여 현재 위치에 더함
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j];
        }
        
        for(int i = 0; i < h; i++)
            answer = Math.max(dp[h - 1][i], answer);
        
        return answer;
    }
}
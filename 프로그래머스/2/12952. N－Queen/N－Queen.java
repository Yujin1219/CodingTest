class Solution {
    private static int[] board;
    private static int answer;

    public static int solution(int n) {
        // 배열의 값은 해당 행의 queen이 있는 '열(column)'을 의미함
        board = new int[n];
				// 첫번째 행에 퀸을 놓기 시작
        backTracking(0, n);
				// 가능한 배치의 개수를 반환
        return answer;
    }

    // depth는 행을 의미함
    private static void backTracking(int depth, int n) {
        if (depth == n) { // 모든 퀸을 배치
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
						// depth : 현재 행
            board[depth] = i; // 해당 depth(행)과 i(열)에 퀸을 놓을 수 있는지 확인
            if (valid(depth)) {
                backTracking(depth + 1, n);
            }
        }
    }
		// 배치가 유효한지 확인
    private static boolean valid(int i) {
        for (int j = 0; j < i; j++) {
						//현재 행(i)과 이전 행(j)의 퀸 위치를 비교
            if (board[i] == board[j]) return false; // 같은 열에 있는지 확인
            if (Math.abs(i - j) == Math.abs(board[i] - board[j])) return false; // 대각선에 있는지 확인
        }
        return true;
    }
}
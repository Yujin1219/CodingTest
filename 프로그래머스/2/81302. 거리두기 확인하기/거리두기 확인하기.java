import java.util.*;

class Solution {
    static char[][][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public int[] solution(String[][] places) {
        map = new char[5][5][5];
        int[] answer = {1, 1, 1, 1, 1}; // 응시자가 한명도 없는 경우, 거리두기가 지켜진 것
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++)
                    map[i][j][k] = places[i][j].charAt(k);
            }
            answer[i] = check(map[i]);
        }
        return answer;
    }
    
    static int check(char[][] m){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(m[i][j] == 'X') // 파티션(검사할 필요X)
                    continue;
                else if(m[i][j] == 'P'){ // 응시자
                    for(int k = 0; k < 4; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if(nx >= 0 && ny >= 0 && nx < 5 && ny <5){
                            if(m[nx][ny] == 'P') // 상하좌우에 또다른 응시자 존재
                                return 0;
                        }
                    }
                }
                else { // 빈 테이블일 경우
                    int count = 0; // 인접한 응시자(P)의 수를 세기 위한 변수
                    
                    for(int k = 0; k < 4; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if(nx >= 0 && ny >= 0 && nx < 5 && ny <5){
                            if(m[nx][ny] == 'P') // 상하좌우에 또다른 응시자 존재
                                count++;
                        }
                    }
                    // 빈 테이블과 인접한 응시자가 2명 이상이면 거리두기 실패
                    if(count >= 2)
                        return 0; 
                }
            }
        }
        return 1; // 모든 검사를 통과하면 거리두기 성공
    }
}
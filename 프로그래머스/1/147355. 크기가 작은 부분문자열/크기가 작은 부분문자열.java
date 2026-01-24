class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        
        int len = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);

        for(int i = 0; i < len; i++) {
            String sub = t.substring(i, i + p.length());
            long subNum = Long.parseLong(sub);

            if (subNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}

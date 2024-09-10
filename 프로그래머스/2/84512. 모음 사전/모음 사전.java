import java.util.*;

class Solution {
    
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        
        findWord("", word, 0);
        
        for(int i=0; i<list.size(); i++){
            if(word.equals(list.get(i))){
                answer = i;
            }
        }
        
        return answer;
    }
    
    void findWord(String str, String target, int depth){
        list.add(str);
        
        if(depth == 5) return;
        
        for(int i=0; i<vowels.length; i++){
            findWord(str + vowels[i], target, depth+1);
        }
        
    }
}
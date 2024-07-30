import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int totalTime = 0;
        
        // 캐시 크기가 0이면 모든 도시에서 캐시 미스 발생 -> 도시 수 * 5 반환
        if (cacheSize == 0) {
            return cities.length * 5; 
        }

        LinkedList<String> cache = new LinkedList<>(); 
        
        for (String city : cities) { 
            String cityUpper = city.toUpperCase(); // 대소문자 구분하지 않기 위해
            
            if (cache.remove(cityUpper)) { // 캐시 리스트에서 해당 도시 이름 제거 (캐시 히트 시)
                totalTime += 1; // 캐시 히트 시 실행 시간은 1
            } else { // 캐시 리스트에서 해당 도시 이름을 찾지 못한 경우 (캐시 미스 시)
                totalTime += 5; // 캐시 미스 시 실행 시간은 5
                if (cache.size() >= cacheSize) { // 캐시가 가득 찬 경우
                    cache.removeFirst(); // 가장 오래된 항목 제거 (LRU 방식)
                }
            }
            cache.add(cityUpper); // 캐시 리스트에 현재 도시 이름 추가 (히트든 미스든 항상 추가)
        }

        return totalTime; 
    }
}

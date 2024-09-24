import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {

        int listLen = id_list.length; // id_list의 길이
        HashMap<String, Integer> indexMap = new HashMap<>(); // 유저 이름과 인덱스를 저장
        HashMap<String, HashSet<String>> reportMap = new HashMap<>(); // 신고당한 사람과 신고한 사람들 저장
        int[] mailCountArr = new int[listLen]; // 메일 전송 개수를 저장하는 배열

        // 유저별 인덱스 설정
        for (int i = 0; i < listLen; i++) {
            indexMap.put(id_list[i], i); // 유저 이름을 키로 하고 인덱스를 값으로 저장
        }

        // 신고 정보 저장
        for (int i = 0; i < report.length; i++) {
            String a = report[i].split(" ")[0]; // 신고한 사람
            String b = report[i].split(" ")[1]; // 신고당한 사람

            // 신고당한 사람을 key로 하는 HashSet을 가져오거나, 없으면 새로 생성하여 초기화
            reportMap.put(b, reportMap.getOrDefault(b, new HashSet<>())); 
            reportMap.get(b).add(a); // 신고한 사람을 해당 신고당한 사람의 HashSet에 추가, 중복제거
        }

        // 메일 전송 대상 선별
        for (String stopName : reportMap.keySet()) {
            if (reportMap.get(stopName).size() >= k) { // 신고당한 사람이 k번 이상 신고받았을 경우
                for (String name : reportMap.get(stopName)) {
                    mailCountArr[indexMap.get(name)]++; // 신고한 사람의 메일 전송 개수를 증가
                }
            }
        }

        return mailCountArr; 
    }
}

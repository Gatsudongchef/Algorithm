class Solution {
    public String solution(String new_id) {
        
        // 1단계 대문자 -> 소문자
        new_id = new_id.toLowerCase();
        
        // 2단계 알파벳 소문자, 숫자, "-", "_", "." 이외 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계 ..이 두개 이상이면 .으로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계 . 이 처음이나 끝에 있다면 제거
        while (!new_id.isEmpty() && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        while (!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.') {
            new_id = new_id.substring(0, new_id.length()-1);
        }

        // 5단계 빈 문자열이면 a 리턴
        if (new_id.isEmpty()) {
            return "aaa";
        }
        
        // 6단계 16자 이상이면 15개 까지 마지막에 . 있으면 없애기
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            
             while (new_id.charAt(new_id.length()-1) == '.') {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        
        // 7단계 2자 이하이면 마지막 문자 늘려서 3개 만들기
        while (new_id.length() <= 2) {
            new_id = new_id + "" + new_id.charAt(new_id.length()-1);
        }
        
        return new_id;
    }
}
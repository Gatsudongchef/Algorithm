class Solution {
    public int solution(String word) {
		int answer = word.length();
		String str = "AEIOU";
		int[] cal = { 781, 156, 31, 6, 1 };

		int a = 0;

		for (int i = 0; i < word.length(); i++) {
			answer += cal[i] * str.indexOf(word.charAt(i));
		}
        return answer;
    }
}
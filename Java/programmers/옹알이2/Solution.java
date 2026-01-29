package java.programmers.옹알이2;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String prev = "";
            int idx = 0;
            boolean valid = true;

            while (idx < word.length()) {
                boolean matched = false;
                for (String s : canSpeak) {
                    if (word.startsWith(s, idx)) {
                        if (s.equals(prev)) {
                            valid = false;
                            break;
                        }
                        prev = s;
                        idx += s.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched || !valid) {
                    valid = false;
                    break;
                }
            }

            if (valid) answer++;
        }

        return answer;
    }
}

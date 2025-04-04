package Java.programmers.대충만든자판;

class Solution {

    public static int checkN(char targetChar, String[] keymap) {
        int min = Integer.MAX_VALUE;

        for (String key : keymap) {
            int idx = key.indexOf(targetChar);
            if (idx != -1) {
                min = Math.min(min, idx + 1);
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String word = targets[i];
            int sum = 0;
            boolean isValid = true;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                int pressCount = checkN(c, keymap);

                if (pressCount == -1) {
                    isValid = false;
                    break;
                } else {
                    sum += pressCount;
                }
            }
            answer[i] = isValid ? sum : -1;
        }
        
        return answer;
    }
}

package Java.programmers.키패드누르기;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int LN = 10;
        int RN = 12;

        for (int i : numbers) {
            int num = (i == 0) ? 11 : i;

            if (num == 1 || num == 4 || num == 7) {
                LN = num;
                answer += 'L';
            } else if (num == 3 || num == 6 || num == 9) {
                RN = num;
                answer += 'R';
            } else {
                int Ldist = getDistance(LN, num);
                int Rdist = getDistance(RN, num);

                if (Ldist < Rdist) {
                    LN = num;
                    answer += 'L';
                } else if (Ldist > Rdist) {
                    RN = num;
                    answer += 'R';
                } else {
                    if (hand.equals("right")) {
                        RN = num;
                        answer += 'R';
                    } else {
                        LN = num;
                        answer += 'L';
                    }
                }
            }
        }

        return answer;
    }

    private int getDistance(int from, int to) {
        int fromRow = (from - 1) / 3;
        int fromCol = (from - 1) % 3;
        int toRow = (to - 1) / 3;
        int toCol = (to - 1) % 3;
        return Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);
    }
}


import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();

        final int extN = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        final int sortN = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        for (int[] row : data) {
            if (row[extN] < val_ext) {
                answer.add(row);
            }
        }

        answer.sort(Comparator.comparingInt(a -> a[sortN]));

        return answer.toArray(new int[answer.size()][]);
    }
}


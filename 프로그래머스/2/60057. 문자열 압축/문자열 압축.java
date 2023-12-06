import java.util.Map;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int minLength = Integer.MAX_VALUE;

        for (int chunkSize = 1; chunkSize <= s.length() / 2; chunkSize++) {
            Stack<Map.Entry<String, Integer>> stack = new Stack<>();
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < s.length(); j += chunkSize) {
                String currentStr;
                if (j + chunkSize < s.length()) {
                    currentStr = s.substring(j, j + chunkSize);
                } else {
                    currentStr = s.substring(j);
                }

                if (stack.isEmpty()) {
                    stack.push(Map.entry(currentStr, 1));
                    continue;
                }

                Map.Entry<String, Integer> entry = stack.pop();
                if (entry.getKey().equals(currentStr)) {
                    stack.push(Map.entry(currentStr, entry.getValue() + 1));
                } else {
                    str.append(entry.getValue() == 1 ? "" : entry.getValue())
                            .append(entry.getKey());
                    stack.push(Map.entry(currentStr, 1));
                }
            }

            for (Map.Entry<String, Integer> entry : stack) {
                str.append(entry.getValue() == 1 ? "" : entry.getValue())
                        .append(entry.getKey());
            }

            minLength = Math.min(minLength, str.length());
        }

        return minLength;
    }
}
// 방법
// 실제로 압축해봄
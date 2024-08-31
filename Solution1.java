public class Solution1 {
    public int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                if (sum == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}

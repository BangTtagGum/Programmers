/**
 * 2023.08.21
 * 체육복
 */
public class _42862 {
    public static int solution(int n, int[] lost, int[] reserve)     {

        int students[] = new int[n+2];
        for (int i : lost) {
            students[i]--;
        }
        for (int i : reserve) {
            students[i]++;
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] == -1) {
                if (students[i - 1] == 1) {
                    students[i - 1]--;
                    answer++;
                } else if (students[i + 1] == 1) {
                    students[i + 1]--;
                    answer++;
                }
            } else {
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int []lost = {2, 4};
        int[] reverse = {3};
        System.out.println(solution(5, lost, reverse));
    }
}

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2023.08.18
 * 명예의 전당 (1)
 */
public class _138477 {
    public static int[] solution(int k, int[] score) {
        Integer[] result = new Integer[score.length];
        int answer[] = new int[score.length];
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            result[i] = score[i];
            Arrays.sort(result,0,i+1, Comparator.reverseOrder());
            System.out.println();
            if (i < k) {
                answer[idx++] = result[i];
            }else {
                answer[idx++] = result[k - 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = solution(3,arr);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}

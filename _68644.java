
/**
 * 2023.08.18
 * 두 개 뽑아서 더하기
 */
public class _68644 {

    public static int[] solution(int[] numbers) {
        boolean save[] = new boolean[201]; // 200까지의 수 저장
        int cnt = 0; // 중복되지 않는 합의 수
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (!save[numbers[i] + numbers[j]]) {
                    save[numbers[i] + numbers[j]] = true;
                    cnt++;
                }
            }
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for (int i = 0; i < 201; i++) {
            if (save[i]) {
                answer[idx++] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int[] answer = solution(arr);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
